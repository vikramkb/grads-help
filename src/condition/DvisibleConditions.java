package condition;

public class DvisibleConditions {
    public static void main(String[] args) {
        int number = 11;

        if(number % 2 == 0) {
            System.out.println(number + " divisible by 2");
        }else if(number % 3 == 0) {
            System.out.println(number + " divisible by 3");
        }else if(number % 4 == 0) {
            System.out.println(number + " divisible by 4");
        }else if(number % 5 == 0) {
            System.out.println(number + " divisible by 5");
        }else{
            System.out.println(number + " is not divisible first five number");
        }
    }
}
