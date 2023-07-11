package Lectures2.CW.Ex5;

public class HomeCat extends Cat{
    protected static int count;


    public HomeCat() {
    }

    public HomeCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, 0);
        count++;
    }
}
