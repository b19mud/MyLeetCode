package com.leetcode.leetcode;

import com.leetcode.TreeNode;

public class LeetCode106 {
    public static void main(String[] args){

    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1,postorder,0, postorder.length-1);
    }

    public static TreeNode helper(int[] inorder, int i_start, int i_end, int[] postorder, int p_start, int p_end){
        if(p_start > p_end || i_end < i_start){
            return null;
        }

        TreeNode root = new TreeNode(postorder[p_end]);

        int flag = 0;
        for(int i = i_start;i<i_end;i++){
            if(postorder[p_end] == inorder[i]){
                flag = i;
                break;
            }
        }
        root.left = helper(inorder, i_start,flag-1,postorder,p_start,p_end-(i_end-flag)-1);
        root.right = helper(inorder,flag+1,i_end,postorder,p_end-i_end+flag,p_end-1);
        return root;
    }
}
