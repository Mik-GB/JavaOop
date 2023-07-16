package Lectures3.CW.Ex2;

public class Main {
    public static void main(String[] args) {
        Fruits fruits = Fruits.PEACH;
        switch (fruits) {
            case APPLE -> System.out.println("Apple");
            case ORANGE -> System.out.println("Orange");
            case PEACH -> System.out.println("Peach");
            default -> System.out.println("not fruit");
        }
    }
}
