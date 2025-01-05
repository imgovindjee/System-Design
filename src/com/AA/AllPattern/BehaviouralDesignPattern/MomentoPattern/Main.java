package com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern;

import com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern.CareTaker.ConfigurationCareTaker;
import com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern.Momento.ConfigurationMomento;
import com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern.Originator.ConfigurationOriginator;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();

//        initial state of Originator
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(2, 10);
//        System.out.println("Height: "+configurationOriginator.height+" Width: "+configurationOriginator.width);

//        saving it
        ConfigurationMomento configurationMomento = configurationOriginator.createMomento();

//        saving it to the history
        configurationCareTaker.addMomento(configurationMomento);

//        originator changing to new state
        configurationOriginator.setHeight(10);
        configurationOriginator.setWidth(10);
        System.out.println("Height: "+configurationOriginator.getHeight()+" Width: "+configurationOriginator.getWidth());

//        save it
        ConfigurationMomento momento_snapshot = configurationOriginator.createMomento();
//        saving it to the history
        configurationCareTaker.addMomento(momento_snapshot);

//        originator changing to new state
        configurationOriginator.setHeight(110);
        configurationOriginator.setWidth(11);
        System.out.println("Height: "+configurationOriginator.getHeight()+" Width: "+configurationOriginator.getWidth());

//        UNDO
        ConfigurationMomento undo_configurationMomento = configurationCareTaker.undo();
        configurationOriginator.restoreMomento(undo_configurationMomento);

        System.out.println("Height: "+configurationOriginator.getHeight()+" Width: "+configurationOriginator.getWidth());
    }
}
