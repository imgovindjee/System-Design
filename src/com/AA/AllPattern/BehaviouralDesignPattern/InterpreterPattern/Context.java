package com.AA.AllPattern.BehaviouralDesignPattern.InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> contextMap = new HashMap<>();

    public void put(String strMessage, int value) {
        contextMap.put(strMessage, value);
    }

    public int get(String strMessage) {
        return contextMap.get(strMessage);
    }
}
