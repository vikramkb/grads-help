package condition;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 13;
        int reminder = number % 2;
        if(reminder == 0) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
