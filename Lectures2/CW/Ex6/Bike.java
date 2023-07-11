package Lectures2.CW.Ex6;

public class Bike implements Transport{
    @Override
    public void start() {
        System.out.println("Велосипед едет");
    }

    public void stop() {
        System.out.println("Велосипед остановислся");
    }
}
