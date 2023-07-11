package Lectures2.CW.Ex5;

public class Tiger extends Cat{
    protected static int count;


    public Tiger() {
    }

    public Tiger(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, 0);
        count++;
    }
}
