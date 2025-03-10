package com.S.MomentoDesignPattern.Originator;

import com.S.MomentoDesignPattern.Momento.ConfigurationMomento;

public class ConfigurationOriginator {
    int height;
    int width;

//    CONSTRUCTOR
    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    //    GETTER & SETTER METHOD
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


//    MOMENTO CREATION
    public ConfigurationMomento createMomento() {
        return new ConfigurationMomento(this.height, this.width);
    }

//    RESTORE MOMENTO
    public void restoreMomento(ConfigurationMomento configurationMomento) {
        this.height = configurationMomento.getHeight();
        this.width = configurationMomento.getWidth();
    }
}
