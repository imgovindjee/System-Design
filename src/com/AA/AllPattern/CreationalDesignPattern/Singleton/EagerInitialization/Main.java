package com.AA.AllPattern.CreationalDesignPattern.Singleton.EagerInitialization;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection_OBJ = DBConnection.getInstance();
    }
}
