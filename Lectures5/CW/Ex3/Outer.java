package Lectures5.CW.Ex3;

import Lectures5.CW.Ex3.Controller.Controller;

public class Outer {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStident("qwe", "qewqe","qweqe");
        controller.createStident("qwe", "qewqe","qweqe");
        controller.createStident("qwe", "qewqe","qweqe");
        controller.createStident("qwe", "qewqe","qweqe");
        controller.getAllStudent();
    }
}
