package com.U.IntrepreterDesignPattern.EG1.NormalExpression;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> map = new HashMap<>();

    public void put(String str, int value) {
        map.put(str, value);
    }

    public int get(String str){
        return map.get(str);
    }
}
