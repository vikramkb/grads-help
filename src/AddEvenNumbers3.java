import java.util.Scanner;

// 0 -> 20, 1 -> 21, 2 -> 33, 3 -> 10, 4 -> 30, 5 -> 7, 6 -> 40
// number.length -> 7
public class AddEvenNumbers3 {
    public static void main(String[] args) {
        int[] numbers = {20, 21, 33, 10, 30, 7, 40};
//        System.out.println(numbers[4]);
        int result = 0;
        for(int i=0;i < numbers.length; i++){
            if(numbers[i] % 2 == 0) {
                result = result + numbers[i];
            }
        }

        System.out.println(result);
    }
}
