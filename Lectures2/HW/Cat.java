package Lectures2.HW;

public class Cat implements Go{
    public Cat() {
    }

    private String name;
    private int jumpHeight;
    private int maxDistance;

    public Cat(String name, int jumpHeight, int maxDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public String run(Treadmill distance) {
        if (distance.getDistance()>maxDistance){
            return ("Cat: " + name + " not run");
        }else {
            return ("Cat: " + name + " run run run!!!");
        }
    }

    @Override
    public String jump(Wall height) {
        if (height.getHeight()>jumpHeight){
            return ("Cat: " + name + " not jump");
        }else {
            return ("Cat: " + name + " jump jump jump!!!");
        }
    }
}
