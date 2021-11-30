package com.leetcode.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode930 {
    public static void main(String[] args){

    }

    public static int test(int[] nums, int goal){
        int sum = 0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        int ret = 0;
        for (int num : nums) {
            cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            sum += num;
            ret += cnt.getOrDefault(sum - goal, 0);
        }
        return ret;
    }
}
