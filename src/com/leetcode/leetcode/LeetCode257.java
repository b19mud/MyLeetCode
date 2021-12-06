package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        test(root, result, new StringBuilder());
        return result;
    }

    public void test(TreeNode root, List<String> result, StringBuilder temp) {
        if(root == null){
            return;
        }
        if(temp.length() == 0){
            temp.append(root.val);
        }else{
            temp.append("->").append(root.val);
        }
        if(root.left == null && root.right == null){
            result.add(temp.toString());
        }
        test(root.left, result, new StringBuilder(temp));
        test(root.right, result, new StringBuilder(temp));
    }
}
