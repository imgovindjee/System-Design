package com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile;

import java.sql.Timestamp;

public class Connection {

    private User user;
    private Timestamp connectionDate;

    public Connection(User user, Timestamp connectionDate) {
        this.user = user;
        this.connectionDate = connectionDate;
    }

    public User getUser() {
        return user;
    }

    public Timestamp getConnectionDate() {
        return connectionDate;
    }
}
