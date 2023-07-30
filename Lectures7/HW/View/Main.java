package Lectures6.HW.View;

import Lectures6.HW.Controller.Controller;

public class Main {
    //Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
//Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
//Соблюдать принципы SOLID, паттерны проектирования.
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.startCalc();
    }
}

