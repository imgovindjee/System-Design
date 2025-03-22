package com.XX.LLD.PRACTICE.DesignStackOverFlow;

public class Tag {

    private int ID;
    private String name;

    public Tag(String name) {
        this.ID = generateID();
        this.name = name;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int generateID(){
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }
}
