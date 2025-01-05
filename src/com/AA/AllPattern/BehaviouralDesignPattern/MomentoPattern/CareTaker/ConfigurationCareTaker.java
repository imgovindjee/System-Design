package com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern.CareTaker;

import com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern.Momento.ConfigurationMomento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMomento> momentoList_history = new ArrayList<>();

    public void addMomento(ConfigurationMomento configurationMomento) {
        momentoList_history.add(configurationMomento);
    }

    public ConfigurationMomento undo() {
        if(!momentoList_history.isEmpty()) {
            int size = momentoList_history.size();
            ConfigurationMomento lastMomento = momentoList_history.get(size-1);
            momentoList_history.remove(size-1);
            return lastMomento;
        }
        return null;
    }
}
