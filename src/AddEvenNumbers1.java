import java.util.Scanner;

// 5 6 7 8 9 10
// 6 + 8 + 10 = 24
public class AddEvenNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();

        int result = 0;
        for(int i=number;i <= number + 5; i++){
            if(i % 2 == 0) {
                result = result + i;
            }
        }

        System.out.println(result);
    }
}
