package com.leetcode.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode137 {
    public static void main(String[] args){

    }

    public static int singleNumber(int[] nums) {
        Map<Integer , Integer> map = new LinkedHashMap<>();
        for(Integer num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return 0;
    }
}
