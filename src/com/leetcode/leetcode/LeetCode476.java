package com.leetcode.leetcode;

public class LeetCode476 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        StringBuilder stringBuilder =  new StringBuilder();
        for(int i = 0 ;i < a.length(); i++) {
            if('1' == a.charAt(i)){
                stringBuilder.append('0');
            }else{
                stringBuilder.append('1');
            }
        }
        return Integer.parseInt(stringBuilder.toString(),2);
    }

}
