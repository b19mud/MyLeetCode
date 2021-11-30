package com.leetcode.leetcode;

import java.util.*;

public class LeetCode229 {

    public static void main(String[] args) {
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int flag = nums.length/3;
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            if(entry.getValue() > flag){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
