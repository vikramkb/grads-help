package classes.inheritance.animals;

public class AnimalMain {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Duck dc1 = new Duck();
        Eagle e1 = new Eagle();
        Tiger t1 = new Tiger();

        Animal[] zoo = {c1, d1, dc1, e1, t1};
        for(int i=0; i < zoo.length; i++) {
            zoo[i].makeSound();
        }

        Flyable[] birds = {dc1, e1};
        for(int i=0; i < birds.length; i++) {
            birds[i].fly();
        }
    }
}
