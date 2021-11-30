package com.leetcode.leetcode;

import java.util.Arrays;

public class LeetCode162 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int temp = 0;
        for(int i = 0; i< nums.length; i++) {
            if (nums[i] > temp) {
                temp = i;
            }
        }
        return temp;
    }
}
