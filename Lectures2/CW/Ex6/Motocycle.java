package Lectures2.CW.Ex6;

public class Motocycle implements Transport{

    @Override
    public void start() {
        System.out.println("Мотоцикл едет");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл стоит");
    }
}
