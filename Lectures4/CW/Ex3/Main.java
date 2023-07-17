package Lectures4.CW.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            doubleList.add((double)i);
            integerList.add(i);
        }
        System.out.println("calculator.sum(doubleList) = " + calculator.sum(doubleList));
        System.out.println("calculator.sum(integerList) = " + calculator.sum(integerList));
        System.out.println("calculator.multi(doubleList) = " + calculator.multi(doubleList));
        System.out.println("calculator.div(doubleList) = " + calculator.div(doubleList));

        Double number = 9.00000000000000;
        Float number1 = 5.000000000000f;
        Integer number2 = 3;
        String number3 = "1";
        System.out.println("calculator.binary(number) = " + calculator.binary(number));
        System.out.println("calculator.binary(number1) = " + calculator.binary(number1));
        System.out.println("calculator.binary(number2) = " + calculator.binary(number2));
    }
}
