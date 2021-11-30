package com.leetcode.interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InterView53_1 {
    public static void main(String[] args){

    }

    public static int search(int[] nums, int target) {
        return (int) Arrays.stream(nums).filter(value -> value == target).count();
    }


}
