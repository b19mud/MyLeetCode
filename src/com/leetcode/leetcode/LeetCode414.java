package com.leetcode.leetcode;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class LeetCode414 {
    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        List<Integer> integerList = Arrays.stream(nums).sorted().distinct().boxed().collect(Collectors.toList());
        if(integerList.size() < 3){
            return integerList.get(integerList.size()-1);
        }else{
            return integerList.get(integerList.size()-3);
        }
    }
}
