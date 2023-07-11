package Lectures2.CW.Ex5;

public class Animal {
    protected String name;
    protected static int count;
    protected String type;
    protected int maxRunDistance;
    protected int maxSwimDistance;


    public Animal() {

    }

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.name = name;
        this.type = type;
        if (type.equals("Кот")){
            if (maxRunDistance>200) this.maxRunDistance = 200;
            this.maxSwimDistance = maxSwimDistance;
        }else {
            if (maxRunDistance > 500) this.maxRunDistance = 500;
            if (maxSwimDistance > 10) this.maxSwimDistance = 10 ;
        }
    }

    protected void run(int distance){
        if (distance <= maxRunDistance){
            System.out.println(type + " - " + name + " - пробежало дистанцию: " + distance + "м.");
        }else {
            System.out.println(type + " - " + name + " - НЕ пробежало дистанцию: " + distance + "м.");
        }
    }
    protected void swim(int distance){
        if (distance <= maxSwimDistance){
            System.out.println(type + " - " + name + " - смогло проплыть дистанцию: " + distance + "м.");
        }else {
            System.out.println(type + " - " + name + " - НЕ смогло проплыть дистанцию: " + distance + "м.");
        }
    }
}
