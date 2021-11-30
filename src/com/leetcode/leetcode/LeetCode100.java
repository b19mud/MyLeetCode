package com.leetcode.leetcode;

import com.leetcode.TreeNode;

public class LeetCode100 {
    public static void main(String[] args){

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return test(p,q);
    }

    public static boolean test(TreeNode a, TreeNode b) {
        if(a == null && b == null){
            return true;
        }
        if(a == null || b == null){
            return false;
        }

        if(a.val == b.val) {
            return test(a.left, b.left) && test(a.right, b.right);
        }
        return false;
    }
}
