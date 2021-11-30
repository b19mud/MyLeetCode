package com.leetcode.leetcode;

import com.leetcode.TreeNode;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIInlineBinaryData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode671 {
    public static void main(String[] args){

    }

    public static int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return 0;
        }
        List<Integer> integers = new ArrayList<>();
        test(root,integers);
        List<Integer> result = integers.stream().distinct().sorted().collect(Collectors.toList());
        if(result.size() == 1){
            return -1;
        }
        return result.get(1);
    }

    public static void test(TreeNode root, List<Integer> integers){
        if (root == null){
            return;
        }
        integers.add(root.val);
        test(root.left,integers);
        test(root.right,integers);
    }
}
