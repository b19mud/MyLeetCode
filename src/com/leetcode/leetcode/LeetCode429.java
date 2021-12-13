package com.leetcode.leetcode;

import java.util.*;

public class LeetCode429 {
    public static void main(String[] args){

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return Collections.emptyList();
        }
        Queue queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){

            List<Node> nodeList = new ArrayList<>();
            List<Integer> integers = new ArrayList<>();
            while (!queue.isEmpty()){

                Node temp = (Node) queue.poll();
                integers.add(temp.val);
                nodeList.addAll(temp.children);
            }
            result.add(integers);
            for(Node node : nodeList){
                queue.add(node);
            }
        }
        return result;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
