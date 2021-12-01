package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        test(root, result);
        return result;
    }

    public static void test(TreeNode root, List<Integer> result) {
        if(root == null){
            return;
        }
        result.add(root.val);
        test(root.left, result);
        test(root.right, result);
    }
}
