package com.leetcode.swordOffer;

public class SwordOffer2_001 {

    public static void main(String[] args){

    }

    public static int divide(int a, int b) {
        int res = 0;
        if(a<b){
            return 0;
        }else{
            res = divide(jianfa(a,b),b)+1;
        }
        return res;
    }

    public static int jianfa(int a, int b){
        b = ~b + 1;
        return jiafa(a,b);
    }

    public static int jiafa(int a, int b){
        int carry;
        while (b != 0){
            carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}