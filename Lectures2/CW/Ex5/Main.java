package Lectures2.CW.Ex5;

public class Main {
    public static void main(String[] args) {
       Animal[] animals = {
                new HomeCat("barsik", "cat", 100, 23),
                new Dog("rex", "qwe", 1000, 100),
                new Tiger("sherhan", "cat", 500, 24),
                new Cat("maya", "cat", 200, 0)
        };
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(20);
        }
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Cat.count = " + Cat.count);
        System.out.println("Dog.count = " + Dog.count);
        System.out.println("Tiger.count = " + Tiger.count);
        System.out.println("HomeCat.count = " + HomeCat.count);
    }
}
