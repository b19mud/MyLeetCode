package com.leetcode.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeetCode1418 {

    public static void main(String[] args){

    }

    public static List<List<String>> displayTable(List<List<String>> orders) {

        List<List<String>> result =  new ArrayList<>();
        Set<String> title = new HashSet<>();
        Map<String,Map<String,Integer>> aa = new HashMap<>();
        for(List<String> order: orders){
            title.add(order.get(2));
            Map<String, Integer> temp = aa.getOrDefault(order.get(1), new HashMap<>());
            if(temp.containsKey(order.get(2))){
                temp.put(order.get(2),temp.get(order.get(2))+1);
            }else{
                temp.put(order.get(2),1);
            }
            aa.put(order.get(1),temp);
        }
        List<String> table = new ArrayList<>();
        table.add("Table");
        List<String> xutitle = title.stream().sorted().collect(Collectors.toList());
        table.addAll(xutitle);
        result.add(table);


        List<Map.Entry<String,Map<String,Integer>>> list = new ArrayList<>(aa.entrySet());
        Collections.sort(list, (o1, o2) -> Integer.valueOf(o1.getKey()).compareTo(Integer.valueOf(o2.getKey())));


        for(Map.Entry<String,Map<String,Integer>> entry : list){
            List<String> hang = new ArrayList<>();

            hang.add(entry.getKey());
            result.add(hang);
        }

        for(int i =1 ;i<result.size();i++){
            List<String> strings  = result.get(i);
            for(int j =0;j<xutitle.size();j++){
                Map<String,Integer> map = aa.get(strings.get(0));
                if(map.containsKey(xutitle.get(j))){
                    strings.add(aa.get(strings.get(0)).get(xutitle.get(j)).toString());
                }else{
                    strings.add("0");
                }

            }
        }

        return result;


    }

    public List<List<String>> displayTable1(List<List<String>> orders) {
        List<String> head = orders.stream().map(o -> o.get(2)).distinct().sorted()
                .collect(Collectors.toCollection(() -> Stream.of("Table").collect(Collectors.toList())));
        return orders.stream()
                .collect(Collectors.groupingBy(o -> Integer.parseInt(o.get(1)),
                        Collectors.groupingBy(o -> o.get(2), Collectors.counting())))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> head.stream().skip(1).map(food -> entry.getValue().getOrDefault(food, 0L).toString())
                        .collect(Collectors.toCollection(() -> Stream.of(entry.getKey().toString()).collect(Collectors.toList()))))
                .collect(Collectors.toCollection(() -> Stream.of(head).collect(Collectors.toList())));
    }
}
