package com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.InBuildUse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()) {
            int value = integerIterator.next();
            System.out.println(value);
        }
    }
}
