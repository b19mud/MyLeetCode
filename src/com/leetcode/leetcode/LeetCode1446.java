package com.leetcode.leetcode;

public class LeetCode1446 {
    public static void main(String[] args) {
        String s = "hooraaaaaaaaaaay";
        System.out.println(maxPower(s));
    }

    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        int maxLength = 0;
        while (i < chars.length){
            int result = test(chars, i);
            maxLength = Math.max(maxLength, result);
            if(result == 0) {
                i++;
            }else{
                i+= result;
            }
        }
        if(s.length() != 0 && maxLength == 0){
            return 1;
        }else{
            return maxLength+1;
        }
    }

    public static int test(char[] chars, int index){
        int sum = 0;
        int i = index+1;
        while (i < chars.length &&chars[i] == chars[index]){
            sum++;
            i++;
        }
        return sum;
    }
}
