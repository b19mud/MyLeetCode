package com.leetcode.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode138 {
    public static void main(String[] args){

    }
    private static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Map<Node,Integer> indexMap = new HashMap<>();

        Node random = head;
        int r = 0;
        while (random != null) {
            indexMap.put(random,r);
            r++;
            random = random.next;
        }

        List<Node> nodeList = new ArrayList<>();
        int flag = 0;
        Node temp = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (temp != null){
            Node con = new Node(temp.val);
            nodeList.add(con);

            if(temp.random == null){
                map.put(flag,-1);
            }else{
                map.put(flag,indexMap.get(temp.random));
            }
            flag++;
            temp = temp.next;
        }
        for(int i = 0;i<nodeList.size();i++){
            if(i == nodeList.size() -1){
                nodeList.get(i).next = null;
            }else{
                nodeList.get(i).next = nodeList.get(i+1);
            }
            int a = map.get(i);
            if (a ==-1){
                nodeList.get(i).random = null;
            }else{
                nodeList.get(i).random = nodeList.get(map.get(i));
            }
        }
        return nodeList.get(0);
    }


}


