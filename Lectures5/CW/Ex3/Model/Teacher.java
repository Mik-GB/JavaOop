package Lectures5.CW.Ex3.Model;

public class Teacher extends User {
    int teacherId;

    public Teacher(String name, String surName, String patron, int teacherId) {
        super(name, surName, patron);
        this.teacherId = teacherId;
    }

    public Teacher(int teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String name, String surName, String patron) {
        super(name, surName, patron);
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public enum Type {
    }
}
