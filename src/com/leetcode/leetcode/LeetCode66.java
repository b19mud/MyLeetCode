package com.leetcode.leetcode;

import java.math.BigInteger;

public class LeetCode66 {
    public static void main(String[] args){
        int[] test = {9,8,7,6,5,4,3,2,1,0};
        int[] result = (plusOne(test));
        for (int j : result) {
            System.out.println(j);
        }
    }
    public static int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i : digits){
            stringBuilder.append(i);
        }
        BigInteger a = new BigInteger(stringBuilder.toString(),10);
        BigInteger b = a.add(new BigInteger("1",10));

        String temp = b.toString();
        int[] result = new int[temp.length()];
        for(int i = 0;i<temp.length();i++){
            result[i] = Character.getNumericValue(temp.charAt(i));
        }
        return result;
    }
}
