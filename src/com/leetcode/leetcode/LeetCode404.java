package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode404 {
    public static void main(String[] args){

    }

    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root.left == null && root.right == null){
            return root.val;
        }
        test(root,result,true);
        return result.stream().mapToInt(Integer::valueOf).sum();
    }

    public void test(TreeNode root, List<Integer> result, boolean isLeft){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && isLeft){
            result.add(root.val);
            return;
        }
        test(root.left, result, true);
        test(root.right, result, false);
    }
}
