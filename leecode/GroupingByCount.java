package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * java8 分组排序
 * @author Administrator
 *
 */
public class GroupingByCount {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        List<String> list = Arrays.asList("apple", "apple", "orange", "orange",
                "orange", "blueberry", "peach", "peach", "peach", "peach");

        Map<String, Long> map = list.stream().collect(
                Collectors.groupingBy(p -> p, Collectors.counting()));

        Map<String, Long> finalMap = new LinkedHashMap<>();
        // 排序
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByValue().reversed())
                .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);
    }

}
