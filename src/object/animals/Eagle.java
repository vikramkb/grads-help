package classes.inheritance.animals;

public class Eagle implements Animal, Flyable{
    public void walk() {
        System.out.println("Eagle Walk");
    }
    public void run() {
        System.out.println("Eagle Run");
    }
    public void makeSound() {
        System.out.println("Eagle Sound");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
