package Lectures1.CW.Ex1;

public class Cat extends Animal {

    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("возраст введн не корректно");
        }
    }

    public Cat(String color, Integer age) {
        this.color = color;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("возраст введн не корректно");
        }
    }

    public Cat() {
    }

    @Override
    public void animalInfo() {
        System.out.println("Cat :" + super.getName() + " color: " + getColor() +" age: " + getAge());
    }


//    public Cat(String color, Integer age) {
//        this.color = color;
//        if (age >= 0) {
//            this.age = age;
//        } else {
//            System.out.println("возраст введн не корректно");
//        }
//    }
//
//    public Cat(String name) {
//        super(name);
//    }
//
//    public Cat() {
//    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("возраст введн не корректно");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
