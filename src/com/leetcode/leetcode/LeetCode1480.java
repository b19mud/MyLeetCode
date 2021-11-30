package com.leetcode.leetcode;

public class LeetCode1480 {

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        runningSum(nums);
    }

    public static int[] runningSum(int[] nums) {
        int temp = 0;
        for(int i= 0;i< nums.length;i++){
            temp = temp + nums[i];
            nums[i] = temp;
        }
        System.out.println("11111");
        return nums;
    }
}
