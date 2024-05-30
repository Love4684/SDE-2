Next Permutation(https://leetcode.com/problems/next-permutation/description/)
===============

    public class NextPermutation {
        public static void nextPermutation(int[] nums) {
            int n = nums.length;
            if (n <= 1) return;
    
            // Step 1: Find the longest non-increasing suffix
            int i = n - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }
    
            if (i >= 0) {
                // Step 2: Find the pivot (i)
                // Step 3: Find the rightmost element greater than the pivot
                int j = n - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
                // Step 4: Swap the pivot with this element
                swap(nums, i, j);
            }
    
            // Step 5: Reverse the suffix starting at i + 1
            reverse(nums, i + 1, n - 1);
        }
    
        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            nextPermutation(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
            // Output: 1 3 2
        }
    }
