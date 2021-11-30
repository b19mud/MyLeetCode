package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode268 {
    public static void main(String[] args){

    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i = 0;i<=n;i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return 0;

    }
}
