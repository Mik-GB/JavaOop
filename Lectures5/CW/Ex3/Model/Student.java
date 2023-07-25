package Lectures5.CW.Ex3.Model;

public class Student extends User {
    int studentId;


    public Student(String name, String surName, String patron, int studentId) {
        super(name, surName, patron);
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

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", patron='" + patron + '\'' +
                '}';
    }
}
