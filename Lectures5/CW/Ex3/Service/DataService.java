package Lectures5.CW.Ex3.Service;

import Lectures5.CW.Ex3.Model.Type;
import Lectures5.CW.Ex3.Model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();

    List<User> readOnliStudent();
}
