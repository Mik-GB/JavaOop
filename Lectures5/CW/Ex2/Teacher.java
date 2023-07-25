package Lectures5.CW.Ex2;

public class Teacher extends User{
    int teacherId;

    public Teacher(String name, String surName, String surName1, int teacherId) {
        super(name, surName, surName1);
        this.teacherId = teacherId;
    }

    public Teacher(int teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String name, String surName, String surName1) {
        super(name, surName, surName1);
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
