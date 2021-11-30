package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode260 {

    public static void main(String[] args){

    }

    public static int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> temp =  new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                temp.add(entry.getKey());
            }
        }
        return temp.stream().mapToInt(Integer::valueOf).toArray();
    }
}
