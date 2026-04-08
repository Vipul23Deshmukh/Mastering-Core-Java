/*
Code
Testcase
Test Result
Test Result
1752. Check if Array Is Sorted and Rotated
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.



Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100*/









package Arrays;

public class Check_if_Array_is_Sorted_II {

    public static void main(String[] args) {

        Check_if_Array_is_Sorted_II obj = new Check_if_Array_is_Sorted_II();
        int [] nums1 ={3,4,5,1,2};
        int [] nums2 ={2,1,3,4};
        System.out.println(obj.check(nums1));
        System.out.println(obj.check(nums2));
    }

    public boolean check(int[] nums) {
        int N = nums.length;
        int count = 1;

        for (int i = 1; i < 2 * N; i++) {
            if (nums[(i - 1) % N] <= nums[i % N]) {
                count += 1;
            } else {
                count = 1;
            }

            if (count == N) {
                return true;
            }
        }

        return N == 1;
    }
}
