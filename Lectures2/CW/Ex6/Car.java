package Lectures2.CW.Ex6;

public class Car implements Transport{
    public void run() {
    }

    @Override
    public void start() {
        System.out.println("Машина едет");
    }

    public void stop() {
        System.out.println("Машина остановилась");
    }
}
