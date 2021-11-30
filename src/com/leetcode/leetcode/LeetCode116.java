package com.leetcode.leetcode;

import com.leetcode.Node;

import java.util.*;

public class LeetCode116 {
    public static void main(String[] args) {

    }

    public static Node connect(Node root) {
        Map<Integer, List<Node>> map = new HashMap<>();
        for(Map.Entry<Integer, List<Node>> entry : map.entrySet()) {
            List<Node> nodeList = entry.getValue();
            for(int i = 0;i<nodeList.size()-1;i++) {
                nodeList.get(i).next = nodeList.get(i+1);
            }
        }
        return root;
    }

    public static void test(Map<Integer, List<Node>> flag, Node root) {
        Queue queue = new LinkedList();
        queue.offer(root);
        Integer tmp = 0;
        while (!queue.isEmpty()) {
            tmp++;
            List<Node> nodeList = new ArrayList<>();
            while (!queue.isEmpty()) {
                Node node = (Node) queue.poll();
                if (node.left != null) {
                    nodeList.add(node.left);
                }
                if (node.right != null) {
                    nodeList.add(node.right);
                }
                if (flag.containsKey(tmp)) {
                    flag.get(tmp).add(node);
                } else {
                    List<Node> list = new ArrayList<>();
                    list.add(node);
                    flag.put(tmp, list);
                }
            }
            for (Node node : nodeList) {
                queue.offer(node);
            }
        }
    }
}