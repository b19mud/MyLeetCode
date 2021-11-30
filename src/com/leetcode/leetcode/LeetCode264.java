package com.leetcode.leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LeetCode264 {

    public static void main(String[] args){

    }
    public static int nthUglyNumber(int n) {
        int[] facotrs = {2, 3, 5};
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        set.add(1L);
        priorityQueue.offer(1L);
        int ugly = 0;
        for(int i = 0 ;i<n;i++){
            long curr = priorityQueue.poll();
            ugly = (int) curr;
            for(int f:facotrs){
                long next = f * curr;
                if(set.add(next)){
                    priorityQueue.offer(next);
                }
            }
        }
        return ugly;
    }

}
