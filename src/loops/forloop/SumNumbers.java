package loops.forloop;

public class SumNumbers {
    public static void main(String[] args) {
        //sum of first 10 numbers
        int sum = 0;
        for(int i=1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
