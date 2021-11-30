package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.awt.image.ImageProducer;
import java.util.*;

public class LeetCode103 {
    public static void main(String[] args){

    }
    static Map<Integer, List<Integer>> map = new HashMap<>();

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Collections.emptyList();


        test(false, 0, root);
        List<List<Integer>> result = new ArrayList<>(map.size());
        for(int i = 0; i< map.size();i++){
            result.add(null);
        }
        for(int i = 0;i< map.size();i++){
            result.set(i,map.get(i));
        }
        return result;
    }

    public static void test(boolean flag, int deep, TreeNode root) {
        if (root == null) {
            return;
        }

        // 判断此层是否存在
        if (!map.containsKey(deep)) {
            map.put(deep, new ArrayList<>());
        }

        // 向此层中的数据添加
        List<Integer> temp = map.get(deep);
        temp.add(root.val);

        // 判断流转方向
        if (flag){
            test(false, deep + 1, root.left);
            test(false, deep + 1, root.right);
        }else{
            test(true, deep + 1, root.right);
            test(true, deep + 1, root.left);
        }
    }

    public static void test1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.offer(root);
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
        for(int i = 0; i< result.size();i++) {
            if(i % 2 != 0) {
                Collections.reverse(result.get(i));
            }
        }
    }
}
