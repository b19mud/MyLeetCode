package com.leetcode.leetcode;

public class LeetCode1646 {
    public static void main(String[] args){
        System.out.println(getMaximumGenerated(3));
    }

    public static int getMaximumGenerated(int n) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n+1;i++){
            max = Math.max(max,test(i));
        }
        return max;
    }

    public static int test(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if (n % 2 == 0){
            return test(n/2);
        }else{
            return test(n/2) + test(n/2+1);
        }
    }
}
