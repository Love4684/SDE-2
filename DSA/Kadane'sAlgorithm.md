
Maximum Subarray
==============

Given an integer array nums, find the subarray with the largest sum, and return its sum.

        public class MaxSubarraySum {
            public static int maxSubArray(int[] nums) {
                if (nums == null || nums.length == 0) {
                    throw new IllegalArgumentException("Array must contain at least one element");
                }
        
                int maxCurrent = nums[0];
                int maxGlobal = nums[0];
        
                for (int i = 1; i < nums.length; i++) {
                    maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
                    if (maxCurrent > maxGlobal) {
                        maxGlobal = maxCurrent;
                    }
                }
        
                return maxGlobal;
            }
        
            public static void main(String[] args) {
                int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
                int[] nums2 = {-2, -3, -4, -1, -2, -1, -5, -3};
        
                System.out.println("Maximum subarray sum for nums1 is " + maxSubArray(nums1)); // Output: 6
                System.out.println("Maximum subarray sum for nums2 is " + maxSubArray(nums2)); // Output: -1
            }
        }

