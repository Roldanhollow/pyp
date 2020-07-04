package com.pyp.arrays;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Pareo {
    /**
     * Organizar grupos de 3 sin repeticion entre hombres y mujeres
     */

    static List<String> men = Arrays.asList("M1", "M2", "M3");
    static List<String> women = Arrays.asList("W1", "W2");

    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.addAll(men);
        people.addAll(women);
        HashMap<String, String> map = new HashMap<>();
        addPerson(people, new StringBuilder(), new AtomicInteger(0), map);
        map.values().forEach(System.out::println);
    }

    private static void addPerson(
            List<String> people, final StringBuilder group, AtomicInteger counter, HashMap<String, String> map) {
        if (counter.get() == 3) {
            char[] groupArray = group.toString().toCharArray();
            Arrays.sort(groupArray);
            String key = new String(groupArray);
            if (!map.containsKey(key))
                map.put(key, group.toString());
        }else {
            people.forEach(person -> {
                if (!group.toString().contains(person)) {
                    String groupBase = group.toString();
                    group.append(person + ",");
                    counter.getAndIncrement();
                    addPerson(people, group, counter, map);
                    group.delete(0, group.length());
                    group.append(groupBase);
                    counter.getAndDecrement();
                }
            });
        }
    }
}
