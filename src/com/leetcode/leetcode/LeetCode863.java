package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode863 {

    static Map<Integer, TreeNode> map = new HashMap<>();
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args){

    }

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findParent(root);
        findAns(target,null,0,k);
        return list;

    }

    public static void findParent(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null){
            map.put(root.left.val,root);
            findParent(root.left);
        }

        if(root.right != null){
            map.put(root.right.val,root);
            findParent(root.right);
        }

    }

    public static void findAns(TreeNode root, TreeNode from,int depth, int k){
        if(root == null){
            return;
        }
        if(depth == k){
            list.add(root.val);
            return;
        }

        if(root.left != from){
            depth++;
            findAns(root.left,root,depth,k);
        }

        if(root.right != from){
            depth++;
            findAns(root.right,root,depth,k);
        }

        if(map.get(root.val) != from){
            depth++;
            findAns(map.get(root.val),root,depth,k);
        }
    }




}
