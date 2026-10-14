
package com.UseeConfiguration.model;

public class User {

    private int uid;
    private String uname;
    private String email;

    public User() {
    }

    public User(String uname, String email) {
        this.uname = uname;
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
