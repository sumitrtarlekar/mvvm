package com.mvvm.sumit.mvvm.models;

public class User {

    private String name;
    private String mobNo;

    public User(String name, String mobNo) {
        this.name = name;
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
