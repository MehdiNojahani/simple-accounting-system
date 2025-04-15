package com.Accounting.packages;

public class User {


    //two attribute for users :
    //id and full name
    private int id;
    private String fullName;

    //class constructor :
    public User() {
    }
    public User(int id, String fullName) {
        setId(id);
        setFullName(fullName);
    }


    // Getter and Setter Method instance variable :
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
