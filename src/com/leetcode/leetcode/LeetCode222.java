package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode222 {
    public static void main(String[] args){

    }

    public static int countNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        test(root, result);
        return result.size();
    }

    public static void test(TreeNode root, List<Integer> result) {
        if(root == null){
            return;
        }
        result.add(1);
        test(root.left, result);
        test(root.right, result);
    }
}
