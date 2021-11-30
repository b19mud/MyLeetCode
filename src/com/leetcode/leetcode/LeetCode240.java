package com.leetcode.leetcode;

public class LeetCode240 {
    public static void main(String[] args) {

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int[] ints : matrix) {
            int start = 0;
            int end = ints.length-1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (ints[mid] == target) {
                    return true;
                } else if (target < ints[mid]) {
                    end = mid-1;
                } else if(target > ints[mid]){
                    start = mid+1;
                }
            }
        }
        return false;
    }
}
