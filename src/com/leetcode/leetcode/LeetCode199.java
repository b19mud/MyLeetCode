package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode199 {

    public static void main(String [] args){
        TreeNode treeNode = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        treeNode.right = right;
        treeNode.left = null;
        System.out.println(rightSideView(treeNode));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list =  new ArrayList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        myTest(root,0,map);
        for(int i = 0; i< map.size();i++){
            list.add(map.get(i).get(map.get(i).size()-1));
        }
        return list;
    }

    public static void myTest(TreeNode root, int depth, Map<Integer,List<Integer>> map) {
        if (root == null) {
            return;
        }

        List<Integer> temp = map.getOrDefault(depth, new ArrayList<>());
        temp.add(root.val);
        map.put(depth,temp);
        if (root.left != null) {
            myTest(root.left, depth + 1, map);
        }
        if (root.right != null) {
            myTest(root.right, depth + 1, map);
        }
    }
}
