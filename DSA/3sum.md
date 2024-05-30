
package DSA_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;  // Skip duplicates for the first element
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Move left pointer to the right to increase the sum
                } else {
                    right--;  // Move right pointer to the left to decrease the sum
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Example input array
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Call the threeSum method and get the result
        List<List<Integer>> triplets = threeSum(nums);

        // Print the result
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
