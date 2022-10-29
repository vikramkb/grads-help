import java.util.Scanner;
// 5 6 7 8 9 10
// 6 + 8 + 10 = 24
public class AddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();

        int result = 0;
        if(number % 2 == 0) {
            result = result + number;
        }
        number++;
        if(number % 2 == 0) {
            result = result + number;
        }
        number++;
        if(number % 2 == 0) {
            result = result + number;
        }
        number++;
        if(number % 2 == 0) {
            result = result + number;
        }
        number++;
        if(number % 2 == 0) {
            result = result + number;
        }
        number++;
        if(number % 2 == 0) {
            result = result + number;
        }

        System.out.println(result);
    }
}
