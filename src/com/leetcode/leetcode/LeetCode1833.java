package com.leetcode.leetcode;

import java.util.Arrays;

public class LeetCode1833 {

    public static void main(String[] args){
        int[] cost = {10,6,8,7,7,8};
        int coins =20;
        maxIceCream(cost,coins);
    }

    public static int maxIceCream(int[] costs, int coins){
        Arrays.sort(costs);
        int sum =0;

        for(int i=0;i<costs.length;i++){
            sum = sum + costs[i];
            if(sum > coins){
                return i;
            }else if(sum == coins){
                return i+1;
            }else {
                continue;
            }
        }
        return costs.length;
    }
}
