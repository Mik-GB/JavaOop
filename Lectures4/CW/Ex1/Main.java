package Lectures4.CW.Ex1;

public class Main {
    public static void main(String[] args) {
//        1)	Создать класс - коробку (SimpleBox), которая может хранить любые объекты. Посмотреть с какими
//        ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        Integer sum = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj());
        System.out.println("sum = " + sum);
        intBox1.setObj("10");
        Integer sum2 = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj());
        System.out.println("sum2 = " + sum2);
    }
}
