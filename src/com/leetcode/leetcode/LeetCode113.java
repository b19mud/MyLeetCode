package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113 {
    public static void main(String[] args){

    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        test(root,new ArrayList<>(),targetSum,result);
        return result;
    }

    public static void test(TreeNode root, List<Integer> temp, int target,List<List<Integer>> result) {
        if(root == null){
            return;
        }
        int sum = temp.stream().mapToInt(Integer::intValue).sum();
        int a = sum + root.val;
        temp.add(root.val);
        if(a == target && root.left == null && root.right == null){
            result.add(temp);
            return;
        }
        if(root.left != null){
            test(root.left,new ArrayList<>(temp),target,result);
        }
        if(root.right != null) {
            test(root.right, new ArrayList<>(temp), target, result);
        }
    }

}
