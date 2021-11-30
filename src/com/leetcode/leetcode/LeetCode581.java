package com.leetcode.leetcode;

import java.util.Arrays;

public class LeetCode581 {

    public static void main(String[] args){

    }

    public static int findUnsortedSubarray(int[] nums) {
        int[] my = new int[nums.length];
        System.arraycopy(nums,0,my,0,nums.length);
        Arrays.sort(my);
        int start = 0;
        int end = 0;
        for(int i = 0;i<my.length;i++){
            if(my[i] != nums[i]){
                start = i;
                break;
            }
        }

        for(int j= my.length-1;j>=0 ;j--){
            if(my[j] != nums[j]){
                end = j;
                break;
            }
        }
        if(start == end){
            return 0;
        }
        return end-start+1;
    }
}
