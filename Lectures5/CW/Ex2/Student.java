package Lectures5.CW.Ex2;

public class Student extends User{
    int studentId;


    public Student(String name, String surName, String surName1, int studentId) {
        super(name, surName, surName1);
        this.studentId = studentId;
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
