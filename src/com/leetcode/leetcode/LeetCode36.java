package com.leetcode.leetcode;

import sun.jvm.hotspot.utilities.IntArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode36 {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Coordinate>> map = new HashMap<>();
        for(int i = 0;i < board[0].length;i++) {
            for(int j = 0; j < board.length;j ++){
                Integer temp = Character.getNumericValue(board[i][j]);
                if(map.containsKey(temp)){
                    List<Coordinate> coordinates = map.get(temp);
                    coordinates.add(new Coordinate(i,j));
                    map.put(temp,coordinates);
                }else{
                    List<Coordinate> coordinates = new ArrayList<>();
                    coordinates.add(new Coordinate(i,j));
                    map.put(temp,coordinates);
                }
            }
        }
        return true;

    }

    static class Coordinate {
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
