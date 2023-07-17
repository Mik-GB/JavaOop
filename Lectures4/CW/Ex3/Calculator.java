package Lectures4.CW.Ex3;

import java.util.List;

public class Calculator<T> {
    /**
     * @param numbers массив чисел
     * @return сумма всех элементов массива
     * @apiNote 3)	Написать класс калькулятор, принимающий List целочисленных значений,
     * возвращающий сумму элементов коллекции (метод sum)
     */
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }
    public Double multi(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }
    public Double div(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res /= number.doubleValue();
        }
        return res;
    }
    public Integer binary(T number) {
        String num = String.valueOf(number).replace(".0","");
        Integer quotient = Integer.valueOf(num);
        StringBuilder result = new StringBuilder();
        while (quotient > 0) {
            Integer remainder = quotient % 2;
            result.append(remainder);
            quotient /= 2;
        }
        result = result.reverse();
        return Integer.valueOf(result.toString());
    }
}
