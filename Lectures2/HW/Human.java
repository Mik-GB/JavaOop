package Lectures2.HW;

public class Human implements Go{
    private String name;
    private Integer jumpHeight;
    private Integer maxDistance;

    public Human(String name, Integer jumpHeight, Integer maxDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxDistance = maxDistance;
    }

    public Human() {
    }
    @Override
    public String run(Treadmill distance) {
        if (distance.getDistance()>maxDistance){
            return ("Human: " + name + " not run");
        }else {
            return ("Human: " + name + " run run run!!!");
        }
    }

    @Override
    public String jump(Wall height) {
        if (height.getHeight()>jumpHeight){
            return ("Human: " + name + " not jump");
        }else {
            return ("Human: " + name + " jump jump jump!!!");
        }
    }
}
