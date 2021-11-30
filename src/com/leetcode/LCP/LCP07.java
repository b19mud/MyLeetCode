package com.leetcode.LCP;

import java.util.ArrayList;
import java.util.List;

public class LCP07 {

    static int ways;
    static int n, k;
    static List<List<Integer>> edges;
    public static void main(String[] args){

    }

    public static int numWays(int n, int[][] relation, int k) {
        ways = 0;
        n = n;
        k = k;

        // 建立映射关系
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<Integer>());
        }
        for (int[] edge : relation) {
            int src = edge[0], dst = edge[1];
            edges.get(src).add(dst);
        }
        dfs(0, 0);
        return ways;
    }

    public static void dfs(int index, int steps) {
        if (steps == k) {
            if (index == n - 1) {
                ways++;
            }
            return;
        }
        List<Integer> list = edges.get(index);
        for (int nextIndex : list) {
            dfs(nextIndex, steps + 1);
        }
    }
}
