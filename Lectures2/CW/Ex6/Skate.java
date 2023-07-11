package Lectures2.CW.Ex6;

public class Skate implements Transport{

    @Override
    public void start() {
        System.out.println("Скейт едет");
    }

    public void stop() {
        System.out.println("Скейт остановился");
    }
}
