// ============================================================
// DSA — Lesson 1: Arrays Fundamentals
// ============================================================
// Pattern: Start with brute force, then optimize.
// For each problem: Understand → Brute → Optimal → Code → Complexity

import java.util.*;

public class Arrays01_Basics {

    // ========================================================
    // PROBLEM 1: Two Sum (LeetCode #1) — The Gateway Drug of DSA
    // ========================================================
    // Given an array and a target, return indices of two numbers that add up to target.
    // Input: nums = [2, 7, 11, 15], target = 9
    // Output: [0, 1] (because nums[0] + nums[1] = 9)

    // BRUTE FORCE: O(n²) — check every pair
    static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // OPTIMAL: O(n) — HashMap (complement lookup)
    // Key Insight: If we need a + b = target, then b = target - a
    // Store each number in a map, and for each new number check if its complement exists
    static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();  // value → index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    // Time: O(n), Space: O(n)
    // WHY this works: We trade space for time. HashMap gives O(1) lookup.

    // ========================================================
    // PROBLEM 2: Best Time to Buy and Sell Stock (LeetCode #121)
    // ========================================================
    // Given prices array, find max profit from one buy and one sell.
    // Input: prices = [7, 1, 5, 3, 6, 4]
    // Output: 5 (buy at 1, sell at 6)

    // BRUTE: O(n²) — try every buy-sell pair
    static int maxProfitBrute(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    // OPTIMAL: O(n) — Track minimum price so far
    // Key Insight: At each day, the best profit = today's price - cheapest price before today
    static int maxProfitOptimal(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);           // Track cheapest buy price
            maxProfit = Math.max(maxProfit, price - minPrice); // Best profit if we sell today
        }
        return maxProfit;
    }
    // Time: O(n), Space: O(1)
    // WHY: We only need to remember the minimum price seen so far.

    // ========================================================
    // PROBLEM 3: Contains Duplicate (LeetCode #217)
    // ========================================================
    // Return true if any value appears at least twice.

    // BRUTE: O(n²) — compare every pair
    // SORT: O(n log n) — sort, then check adjacent elements
    // OPTIMAL: O(n) — HashSet
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {  // add() returns false if element already exists
                return true;
            }
        }
        return false;
    }
    // Time: O(n), Space: O(n)
    // TRICK: HashSet.add() returns boolean — clean idiom, use it in interviews.

    // ========================================================
    // PROBLEM 4: Maximum Subarray — Kadane's Algorithm (LeetCode #53)
    // ========================================================
    // Find the contiguous subarray with the largest sum.
    // Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    // Output: 6 (subarray [4, -1, 2, 1])

    // BRUTE: O(n²) — try every subarray
    // OPTIMAL: Kadane's Algorithm O(n)
    // Key Insight: At each position, decide: extend the previous subarray OR start fresh
    static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Either extend previous subarray or start new one from current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    // Time: O(n), Space: O(1)
    // WHY: If currentSum becomes negative, it can only hurt future sums → reset.
    // Alternative way to think: currentSum = Math.max(0, currentSum) + nums[i]
    //   (but this doesn't handle all-negative arrays)

    // ========================================================
    // PROBLEM 5: Product of Array Except Self (LeetCode #238)
    // ========================================================
    // Return array where result[i] = product of all elements except nums[i]
    // Constraint: O(n) time, NO division
    // Input: [1, 2, 3, 4]
    // Output: [24, 12, 8, 6]

    // Key Insight: result[i] = (product of everything LEFT of i) × (product of everything RIGHT of i)
    // Two passes: left prefix product, then right prefix product
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Pass 1: Left prefix products
        // result[i] = product of all elements to the LEFT of i
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Pass 2: Right prefix products (multiply into result)
        // Multiply result[i] by product of all elements to the RIGHT of i
        int rightProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];
            result[i] *= rightProduct;
        }

        return result;
    }
    // Time: O(n), Space: O(1) (output array doesn't count)
    // DRY RUN with [1, 2, 3, 4]:
    // After left pass:  result = [1, 1, 2, 6]
    // After right pass: result = [24, 12, 8, 6] ✓

    // ========================================================
    // TEST ALL SOLUTIONS
    // ========================================================
    public static void main(String[] args) {
        System.out.println("=== Two Sum ===");
        System.out.println(Arrays.toString(twoSumOptimal(new int[]{2, 7, 11, 15}, 9)));
        // Expected: [0, 1]

        System.out.println("\n=== Best Time to Buy and Sell Stock ===");
        System.out.println(maxProfitOptimal(new int[]{7, 1, 5, 3, 6, 4}));
        // Expected: 5

        System.out.println("\n=== Contains Duplicate ===");
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        // Expected: true

        System.out.println("\n=== Maximum Subarray (Kadane's) ===");
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        // Expected: 6

        System.out.println("\n=== Product of Array Except Self ===");
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        // Expected: [24, 12, 8, 6]

        System.out.println("\n=== PATTERNS LEARNED ===");
        System.out.println("1. HashMap for O(1) lookup → Two Sum pattern");
        System.out.println("2. Track min/max so far → Single pass optimization");
        System.out.println("3. HashSet for duplicate detection");
        System.out.println("4. Kadane's: extend vs restart decision at each element");
        System.out.println("5. Prefix products (left + right) → avoid division");
    }
}

// ========================================================
// YOUR TURN — Solve these yourself before checking solutions:
// ========================================================
// 1. Move Zeroes (LeetCode #283) — Move all 0s to end, maintain order
//    Hint: Two pointer — one for next non-zero position
//
// 2. Rotate Array (LeetCode #189) — Rotate array by k steps
//    Hint: Three reversals trick
//
// 3. Set Matrix Zeroes (LeetCode #73) — If element is 0, set row & col to 0
//    Hint: Use first row and first column as markers
// ========================================================
