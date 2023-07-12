package Lectures2.HW;

public class Let {
    private Wall height;
    private Treadmill distance;


    public Let(Wall height, Treadmill distance) {
        this.height = height;
        this.distance = distance;
    }

    public Let() {
    }

    public Wall getHeight() {
        return height;
    }

    public Treadmill getDistance() {
        return distance;
    }
}
