package Lectures5.CW.Ex1;

public class Outer {
    public Outer() {
    }

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    class Inner{
        int innerValue;
        public Inner(int innerValue){
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(outerValue);
            System.out.println(innerValue);
//            innerMethod();
            outerMethod();
        }
    }
    int outerValue;
    public void outerMethod(){
        System.out.println(outerValue);
//        System.out.println(innerValue);
//            innerMethod();
//        outerMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner(10);
    }
}
