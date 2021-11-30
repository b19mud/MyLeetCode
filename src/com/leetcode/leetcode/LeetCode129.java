package com.leetcode.leetcode;

import com.leetcode.TreeNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LeetCode129 {
    public static void main(String[] args) {

    }

    public static int sumNumbers(TreeNode root) {
        List<StringBuilder> list = new ArrayList<>();
        int sum = 0;
        test(root, list, new StringBuilder());
        for(StringBuilder stringBuilder : list){
            sum += Integer.parseInt(stringBuilder.toString());
        }
        return sum;
    }

    public static void test(TreeNode root, List<StringBuilder> result, StringBuilder tmp) {
        if(root == null){
            return;
        }
        tmp.append(root.val);

        if(root.left ==  null && root.right == null){
            result.add(tmp);
        }else{
            test(root.left, result, new StringBuilder(tmp.toString()));
            test(root.right, result, new StringBuilder(tmp.toString()));
        }
    }
}
