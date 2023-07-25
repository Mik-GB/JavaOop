package Lectures5.CW.Ex2;

public abstract class User {
    String name;
    String surName;
    String patron;

    public User(String name, String surName, String patron) {
        this.name = name;
        this.surName = surName;
        this.patron = patron;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setSuName(String patron) {
        this.patron = patron;
    }
}
