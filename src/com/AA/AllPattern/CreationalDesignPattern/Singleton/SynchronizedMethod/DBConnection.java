package com.AA.AllPattern.CreationalDesignPattern.Singleton.SynchronizedMethod;


public class DBConnection {
    private static DBConnection dbConnectionObj;

    private DBConnection(){}

    synchronized public static DBConnection getInstance() {
        if(dbConnectionObj == null) {
            dbConnectionObj = new DBConnection();
        }
        return dbConnectionObj;
    }
}
