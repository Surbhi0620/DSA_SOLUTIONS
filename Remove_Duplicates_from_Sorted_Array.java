// File Name: Remove_Duplicates_from_Sorted_Array.java

/*
Question:
26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element
appears only once.

The relative order of the elements should be kept the same.

Return the number of unique elements.

Example:
Input: nums = [1,1,2]
Output: 2

Explanation:
The first two elements of nums become [1,2].
*/

import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] > nums[i]) {

                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}