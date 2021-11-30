package com.leetcode.leetcode;

public class LeetCode541 {
    public static void main(String[] args){
        String a = "abcdefg";
        System.out.println(reverseStr(a,2));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int l = s.length();
        int i = 1;
        if (l <= 2*k){
            if(l < k){
                myrev(stringBuilder,0,l);
            }
            if(l>= k && l <= 2*k){
                myrev(stringBuilder,0,k);
            }
        }else{
            while (i<=l){
                if(i % (2*k) == 0){
                    myrev(stringBuilder,i-2*k,i-k);
                    int j = l-i;
                    if(j < k){
                        myrev(stringBuilder,i,l);
                        break;
                    }else if (j >= k && j < 2 *k){
                        myrev(stringBuilder,i,i+k);
                    }
                }
                i++;
            }
        }
        return stringBuilder.toString();
    }

    public static void myrev(StringBuilder stringBuilder, int start, int end){
        String s = stringBuilder.substring(start,end);
        s = new StringBuilder(s).reverse().toString();
        stringBuilder.replace(start,end,s);
    }
}