package com.leetcode.leetcode;

import java.util.Arrays;

public class LeetCode881 {
    public static void main(String[] args){
        int[] people = {5,1,4,2};
        System.out.println(numRescueBoats(people,6));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int res = 0;
        int right = people.length - 1;
        int left = 0;
        Arrays.sort(people);
        while (left <= right) {
            if (left == right) {
                res++;      // 只剩下最后一个,直接一个走,结束
                break;
            }
            if (people[left] + people[right] > limit) {
                res++;
                right--;        // 先载最重的, 而且最小的也无法一起载,那么就最重的单独走
            }
            else {
                res++;
                right--;        // 最重的与最轻的一起走
                left++;
            }
        }
        return res;
    }
}
