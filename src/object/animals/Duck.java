package classes.inheritance.animals;

public class Duck implements Animal, Flyable{
    public void walk() {
        System.out.println("Duck Walk");
    }
    public void run() {
        System.out.println("Duck Run");
    }
    public void makeSound() {
        System.out.println("Duck Sound");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
