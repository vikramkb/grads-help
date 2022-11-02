package logic;

public class SumDigits {
    public static void main(String[] args) {
        // print sum of digits 324 -> 3 + 2 + 4 = 9
        int number = 867;
        System.out.println("line 8 : " + number);
        int firstDigit = number % 10;
        number = number/10;
        System.out.println(firstDigit);
        System.out.println("line 12 : " + number);
        int secondDigit = number % 10;
        number = number/10;
        System.out.println(secondDigit);
        System.out.println("line 16 : " + number);
        int thirdDigit = number%10;
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println("Sum of digits  " + sum );

    }
}
