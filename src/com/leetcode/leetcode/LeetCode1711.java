package com.leetcode.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1711 {
    static Map<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args){
        int[] test = {1,3,5,7,9};
        System.out.println(countPairs(test));
    }

    public static int countPairs(int[] deliciousness) {
        int flag = 0;
        for(int i=0;i<deliciousness.length-1;i++){
            for(int j=i+1;j< deliciousness.length;j++){
                int temp = deliciousness[i] + deliciousness[j];
                if(map.containsKey(temp)){
                    flag++;
                }else if(isEr(temp)){
                    map.put(temp,0);
                    flag++;
                }
            }
        }
        return flag;
    }

    public static boolean isEr(int var){
        double a = Math.log(var);
        double b = Math.log(2);
        double c = a/b;
        if ((int)c == c){
            return true;
        }else {
            return false;
        }
    }
}
