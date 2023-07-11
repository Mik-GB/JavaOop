package Lectures2.CW.Ex3;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Maya", "white", 3);
        Cat cat2 = new Cat("Bars", "grey", 5);
        cat1.setAge(-5);

        cat2.animalInfo();
        cat1.jump();
        cat2.voice();
        Animal cat3 = new Cat();
        ((Cat)cat3).klubok();
        Animal[] catAndDog = {
                new Cat("qwe","asd", 21),
                new Dog("rew", "fds", 16)
        };
        for (Animal o : catAndDog) {
            o.voice();
        }
    }
}
