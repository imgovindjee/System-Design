package com.AA.AllPattern.CreationalDesignPattern.Singleton.DoubleLocking;

public class DBConnection {
    private static DBConnection dbConnectionObj;

    private DBConnection(){}

    public static DBConnection getInstance() {
        if(dbConnectionObj == null) {
            synchronized (DBConnection.class){
                if(dbConnectionObj == null) {
                    dbConnectionObj = new DBConnection();
                }
            }
        }
        return dbConnectionObj;
    }
}
