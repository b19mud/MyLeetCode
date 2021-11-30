package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode112 {

    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        List<Boolean> booleans = new ArrayList<>();
        test(root,0,targetSum,booleans);
        return booleans.contains(true);
    }

    public static void test(TreeNode root, Integer tempSum, int target, List<Boolean> result){
        if(root == null) {
            return;
        }
        tempSum += root.val;
        if (tempSum == target && root.left == null && root.right == null){
            result.add(true);
        }
        if(tempSum > target) {
            return;
        }
        if(root.left != null){
            test(root.left,new Integer(tempSum), target,result);
        }
        if(root.right != null) {
            test(root.right, new Integer(tempSum),target,result);
        }
        result.add(false);
    }
}
