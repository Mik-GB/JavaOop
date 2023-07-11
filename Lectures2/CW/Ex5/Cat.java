package Lectures2.CW.Ex5;

public class Cat extends  Animal{
    protected static int count;


    public Cat() {
    }

    public Cat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Кот", maxRunDistance, 0);
        count++;
    }
}
