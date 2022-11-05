package condition;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 100;
        int reminder = number % 2;
        if(reminder == 0) {
            System.out.println(number + " is Even");
        }else{
            System.out.println(number + " is Odd");
        }
    }
}
