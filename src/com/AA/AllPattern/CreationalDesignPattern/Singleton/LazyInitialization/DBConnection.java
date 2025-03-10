package com.AA.AllPattern.CreationalDesignPattern.Singleton.LazyInitialization;

public class DBConnection {
    private static DBConnection dbConnectionObj;

    private DBConnection(){}

    public static DBConnection getInstance() {
        if(dbConnectionObj == null) {
            dbConnectionObj = new DBConnection();
        }
        return dbConnectionObj;
    }
}
