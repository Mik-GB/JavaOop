package Lectures5.CW.Ex3.Controller;

import Lectures5.CW.Ex3.Model.Student;
import Lectures5.CW.Ex3.Model.Type;
import Lectures5.CW.Ex3.Model.User;
import Lectures5.CW.Ex3.Service.UserService;
import Lectures5.CW.Ex3.View.StudentView;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStident(String name, String surname, String patron){
        service.create(name, surname, patron, Type.STUDENT);
    }
    public void getAllStudent(){
        List<User> studentList = service.readOnliStudent();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}
