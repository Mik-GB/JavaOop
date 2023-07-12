package Lectures2.HW;

public class Robot implements Go{
    private String name;
    private Integer jumpHeight;
    private Integer maxDistance;

    public Robot(String name, Integer jumpHeight, Integer distance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxDistance = distance;
    }

    public Robot() {
    }
    @Override
    public String run(Treadmill distance) {
        if (distance.getDistance()>maxDistance){
            return ("Robot: " + name + " not run");
        }else {
            return ("Robot: " + name + " run run run!!!");
        }
    }

    @Override
    public String jump(Wall height) {
        if (height.getHeight()>jumpHeight){
            return ("Robot: " + name + " not jump");
        }else {
            return ("Robot: " + name + " jump jump jump!!!");
        }
    }
}
