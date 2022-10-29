import java.util.Scanner;

// 5 6 7 8 9 10
// 6 + 8 + 10 = 24
public class AddEvenNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();

        int result = 0;
        int i=number;
        while(i <= number + 5) {
            if(i % 2 == 0) {
                result = result + i;
            }
            i++;
        }

        System.out.println(result);
    }
}
