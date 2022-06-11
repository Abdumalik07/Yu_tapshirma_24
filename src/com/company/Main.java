package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        symmetricDifference(set1, set2);
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(set3);
        set1.addAll(set2);
        System.out.println(set1);
        return set1;


    }
}

