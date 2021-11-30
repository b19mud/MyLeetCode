package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.*;

public class LeetCode107 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<TreeNode> tempNode = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode treeNode = queue.poll();
                temp.add(treeNode.val);
                tempNode.add(treeNode);
            }
            result.add(temp);
            for(TreeNode treeNode : tempNode ){
                if(treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.offer(treeNode.right);
                }
            }
        }
        Collections.reverse(result);
        return result;
    }
}
