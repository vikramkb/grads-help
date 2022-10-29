public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 30, 40, 7};
        int maxNumber = 0;
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println(maxNumber);
    }
}
