package condition;

public class MinMax {
    //print mininum and maximum value out of two number
    // 2, 20
    public static void main(String[] args) {
        int number1 = 200;
        int number2 = 20;
        System.out.println("Number 1 = " + number1 + ", Number 2 = " + number2);
        if(number1 < number2) {
            System.out.println("Min = " + number1);
        }else{
            System.out.println("Min = " + number2);
        }

        if(number1 > number2) {
            System.out.println("Max = " + number1);
        }else{
            System.out.println("Max = " + number2);
        }
    }
}
