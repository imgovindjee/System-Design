package com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern.Originator;

import com.AA.AllPattern.BehaviouralDesignPattern.MomentoPattern.Momento.ConfigurationMomento;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMomento createMomento() {
        return new ConfigurationMomento(this.height, this.width);
    }

    public void restoreMomento(ConfigurationMomento configurationMomento) {
        this.height = configurationMomento.getHeight();
        this.width = configurationMomento.getWidth();
    }
}
