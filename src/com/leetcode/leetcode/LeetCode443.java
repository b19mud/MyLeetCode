package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode443 {
    public static void main(String[] args){
        char[] chars = {'a','a','b','b','a','a','a'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int anchor  = 0;
        int write = 0;
        for (int read = 0; read < chars.length ; read ++ ){
            if (read + 1 == chars.length || chars[read+1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c:(""+(read-anchor+1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }
}
