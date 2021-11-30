package com.leetcode.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode981 {


    static Map<String, Map<Integer,String>> map = new HashMap<>();

    public LeetCode981() {

    }

    public void set(String key, String value, int timestamp) {
        Map<Integer,String> temp = map.getOrDefault(key,new HashMap<>());
        temp.put(timestamp,value);
        map.put(key,temp);
    }

    public String get(String key, int timestamp) {
        Map<Integer,String> temp = map.getOrDefault(key,new HashMap<>());
        if (temp.size() == 0){
            return "";
        }
        if (temp.containsKey(timestamp)){
            return temp.get(timestamp);
        }else{
            int a = Integer.MIN_VALUE;
            for(Map.Entry<Integer,String> entry:temp.entrySet()){
                if(entry.getKey() < timestamp){
                    a = Math.max(entry.getKey(),a);
                }
            }
            return temp.get(a);
        }
    }
}
