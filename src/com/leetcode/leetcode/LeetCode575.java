package com.leetcode.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode575 {
    public static void main(String[] args) {

    }
    public static int distributeCandies(int[] candyType) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : candyType) {
            map.put(i, map.getOrDefault(i,0)+ 1);
        }
        return Math.min(map.size(), candyType.length / 2);
    }
}
