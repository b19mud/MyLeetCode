package com.leetcode.leetcode;

import com.leetcode.TreeNode;

public class LeetCode700 {
    public static void main(String[] args) {

    }

    public static TreeNode searchBST(TreeNode root, int val) {
        return test(root,val);
    }

    public static TreeNode test(TreeNode root, int val){
        if (root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        TreeNode leftTemp = test(root.left,val);
        TreeNode rightTemp = test(root.right,val);
        if(leftTemp != null) {
            return leftTemp;
        }
        return rightTemp;
    }
}
