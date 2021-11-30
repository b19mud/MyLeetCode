package com.leetcode.leetcode;

public class LeetCode275_2 {
    public static void main(String[] args){

    }

    public static int hIndex(int[] citations) {
        if(citations.length == 1){
            return 1;
        }
        int result = Integer.MIN_VALUE;
        for(int i =0;i< citations.length;i++){
            if(citations.length - i >= citations[i]){
                result = Math.max(result,citations[i]);
            }
        }
        if (result == Integer.MIN_VALUE){
            return citations.length;
        }
        return result;
    }
}
