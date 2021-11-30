package com.leetcode.leetcode;

public class LeetCode457 {

    public static void main(String[] args){
        int[] nums = {-1,2};
        System.out.println(circularArrayLoop(nums));
    }

    public static boolean circularArrayLoop(int[] nums) {
        for(int i = 0;i< nums.length-1;i++){
            if(isCircul(i,nums)){
                return true;
            }
        }
        return false;
    }

    public static boolean isCircul(int index, int[] nums){
        boolean flag = false;
        boolean result = false;
        int nextIndex = index;

        while (true){
            nextIndex = nextIndex + nums[nextIndex];
            if(nextIndex > nums.length -1){
                flag = true;
                nextIndex = nextIndex - nums.length;
            }

            if(flag && nextIndex == index){
                result = true;
                break;
            }
            if(flag && nextIndex > index){
                break;
            }
        }

        return result;
    }
}
