package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1877 {

    public static void main(String[] args){
        int[] nums = {3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }

    public static int minPairSum(int[] nums) {
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i< nums.length/2;i++){
            List<Integer> integers = new ArrayList<>();
            integers.add(nums[i]);
            integers.add(nums[nums.length-i-1]);
            pairs.add(integers);
        }
        int result = 0;
        for(List<Integer> list : pairs){
            result = Math.max(result, list.get(0) + list.get(1));
        }
        return result;
    }

}
