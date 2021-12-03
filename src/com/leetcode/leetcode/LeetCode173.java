package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeetCode173 {
    public static void main(String[] args){

    }
}
class BSTIterator {
    static List<Integer> integers = new ArrayList<>();

    static Iterator<Integer> iterator = null;

    public BSTIterator(TreeNode root) {
        test(root);
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    private static void test(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        test2(node, result);
        integers = result;
        iterator = integers.iterator();
    }

    private static void test2(TreeNode treeNode, List<Integer> list){
        if(treeNode == null){
            return;
        }
        test2(treeNode.left, list);
        list.add(treeNode.val);
        test2(treeNode.right, list);
    }
}

