package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
    public static void main(String[] args){

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        test(root, result);
        return result;
    }

    public void test(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        test(root.left, result);
        test(root.right, result);
        result.add(root.val);
    }
}
