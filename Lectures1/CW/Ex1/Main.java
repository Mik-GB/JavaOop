package Lectures1.CW.Ex1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Maya", "white", 3);
        Cat cat2 = new Cat("Bars", "grey", 5);
        cat1.setAge(-5);

        cat2.animalInfo();
        cat1.jump();
        cat2.voice();
    }
}
