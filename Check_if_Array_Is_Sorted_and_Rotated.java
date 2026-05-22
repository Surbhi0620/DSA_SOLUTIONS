// File Name: Check_if_Array_Is_Sorted_and_Rotated.java

/*
Question:
1752. Check if Array Is Sorted and Rotated

An array is considered sorted and rotated if:
- The array was originally sorted in non-decreasing order.
- Then it was rotated some number of positions.

Return true if the given array is sorted and rotated, otherwise return false.

Example:
Input: nums = [3,4,5,1,2]
Output: true
*/

import java.util.*;

public class Check_if_Array_Is_Sorted_and_Rotated {

    public static boolean check(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[(i + 1) % nums.length] < nums[i]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        boolean result = check(nums);

        System.out.println(result);
    }
}