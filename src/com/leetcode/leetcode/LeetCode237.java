package com.leetcode.leetcode;

import com.leetcode.ListNode;

public class LeetCode237 {
    public static void main(String[] args){

    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
