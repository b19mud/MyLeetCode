package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {
    public static void main(String[] args) {
        System.out.println(combine(1,1));
    }

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = i+1;
        }
        test(k,0,nums);
        return result;
    }

    public static void test(int k, int flag, int[] nums) {
        if(temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        // 添加
        for(int i = flag; i< nums.length; i++) {
            temp.add(nums[i]);
            test(k, i+1, nums);
            temp.remove(temp.size()-1);
        }
    }


}
