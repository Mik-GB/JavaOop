package Lectures4.CW.Ex2;

public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Double> boxWithNumber = new BoxWithNumber(1,2,3,4);
        System.out.println("boxWithNumber.avarage() = " + boxWithNumber.avarage());
        BoxWithNumber<Integer> boxWithNumber1 = new BoxWithNumber(1,2,3,5);
        System.out.println("boxWithNumber.avarage() = " + boxWithNumber1.avarage());
        System.out.println("boxWithNumber.compareAvarage(boxWithNumber1) = " + boxWithNumber.compareAvarage(boxWithNumber1));
    }
}
