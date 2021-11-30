package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode345 {
    public static void main(String[] args){

    }

    public static String reverseVowels(String s) {
        List<Character> yuanyin = new ArrayList<>();
        yuanyin.add('a');
        yuanyin.add('e');
        yuanyin.add('i');
        yuanyin.add('o');
        yuanyin.add('u');
        yuanyin.add('A');
        yuanyin.add('E');
        yuanyin.add('I');
        yuanyin.add('O');
        yuanyin.add('U');
        List<Character> characters = new ArrayList<>();

        for(int i = 0;i<s.length();i++){
            if (yuanyin.contains(s.charAt(i))){
                characters.add(s.charAt(i));
            }
        }
        int flag = characters.size()-1;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(yuanyin.contains(s.charAt(i))){
                stringBuilder.append(characters.get(flag));
                flag--;
            }else{
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
