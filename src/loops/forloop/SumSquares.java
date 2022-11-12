package loops.forloop;

public class SumSquares {
    public static void main(String[] args) {
        // 1^2 + 2^2 + 3^2 + ..... + 10^
        int sumSquares = 0;
        for(int i=1; i <= 10; i++) {
            sumSquares = sumSquares + (i*i);
        }
        System.out.println(sumSquares);
    }
}
