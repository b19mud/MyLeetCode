package com.leetcode.leetcode;

import com.leetcode.Node;

import java.util.*;

public class LeetCode117 {
    public static void main(String[] args) {

    }

    public static Node connect(Node root) {
        Map<Integer, List<Node>> integerListMap = new HashMap<>();
        test(root, integerListMap);
        for(Map.Entry<Integer, List<Node>> entry : integerListMap.entrySet()) {
            for(int i = 0;i<entry.getValue().size()-1;i++){
                entry.getValue().get(i).next = entry.getValue().get(i+1);
            }
        }
        return root;
    }

    public static void test(Node root, Map<Integer, List<Node>> integerListMap) {
        Queue queue = new LinkedList();

        queue.offer(root);
        int flag = 0;
        while (!queue.isEmpty()) {
            flag ++;
            List<Node> nodeList = new ArrayList<>();
            while (!queue.isEmpty()) {
                Node temp = (Node) queue.poll();
                if(temp.left != null){
                    nodeList.add(temp.left);
                }
                if(temp.right != null) {
                    nodeList.add(temp.right);
                }
                if(integerListMap.containsKey(flag)){
                    List<Node> nodeList1 = integerListMap.get(flag);
                    nodeList1.add(temp);
                    integerListMap.put(flag, nodeList1);
                }else{
                    List<Node> nodeList1 = new ArrayList<>();
                    nodeList1.add(temp);
                    integerListMap.put(flag, nodeList1);
                }
            }
            for(Node node : nodeList) {
                queue.offer(node);
            }
        }
    }
}
