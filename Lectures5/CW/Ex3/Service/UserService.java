package Lectures5.CW.Ex3.Service;

import Lectures5.CW.Ex3.Model.Student;
import Lectures5.CW.Ex3.Model.Teacher;
import Lectures5.CW.Ex3.Model.Type;
import Lectures5.CW.Ex3.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserService implements DataService {

    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surName, String patron, Type type) {
//        UUID qwe = UUID.randomUUID();
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surName, patron, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surName, patron, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId++;
            }
            if (user instanceof Student && isStudent) {
                lastId++;
            }
        }
        return ++lastId;
    }
    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readOnliStudent() {
        List<User> student = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student){
                student.add(user);
            }
        }
        return student;
    }
}

