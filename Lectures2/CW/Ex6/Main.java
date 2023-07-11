package Lectures2.CW.Ex6;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bike bike = new Bike();
        human.stop();
        human.drive(bike);
        human.stop();
        Motocycle motocycle =new Motocycle();
        human.drive(motocycle);
    }
}
