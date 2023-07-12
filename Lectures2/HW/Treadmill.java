package Lectures2.HW;

public class Treadmill {
    protected Integer Distance;

    public Integer getDistance() {
        return Distance;
    }

    public Treadmill(Integer distance) {
        Distance = distance;
    }

    public Treadmill() {
    }

    protected void run(int distance){
        if (distance <= Distance){
            System.out.println();
        }else {

        }

    }

}
