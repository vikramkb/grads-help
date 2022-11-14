package arrays;

public class SingleDimension {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 50, -5};
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        numbers[2] = 40;
        System.out.println(numbers[2]);
        System.out.println("------------------");
        for(int i=0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }
}
