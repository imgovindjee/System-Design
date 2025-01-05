package com.S.MomentoDesignPattern.CareTaker;

import com.S.MomentoDesignPattern.Momento.ConfigurationMomento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMomento> configurationMomentoList = new ArrayList<>();

//    Adding MOMENTO to the History
    public void addMomento(ConfigurationMomento configurationMomento) {
        configurationMomentoList.add(configurationMomento);
    }

//    UNDO
    public ConfigurationMomento undo() {
        if(!configurationMomentoList.isEmpty()) {
            int cml_size = configurationMomentoList.size();
            ConfigurationMomento lastMomento = configurationMomentoList.get(cml_size-1);
            configurationMomentoList.remove(cml_size-1);
            return lastMomento;
        }
        return null;
    }
}
