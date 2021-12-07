package com.leetcode.leetcode;

public class LeetCode1816 {
    public static void main(String[] args) {

    }

    public String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        if(k >= s.length()){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < k; i++){
            stringBuilder.append(strings[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }

}
