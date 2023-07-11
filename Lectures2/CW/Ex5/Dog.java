package Lectures2.CW.Ex5;

public class Dog extends Animal{
    protected static int count;


    public Dog() {
    }

    public Dog(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Пес", maxRunDistance, maxSwimDistance);
        count++;
    }
}
