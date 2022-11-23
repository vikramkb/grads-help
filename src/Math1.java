public class Math1 {
    public static float add(float number1, float number2) {
        return number1 + number2;
    }
    public static float abs(float number){
        if(number < 0) {
            return -number;
        }
        return number;
    }
    public static float power(int base, int power) {
        int result = 1;
        for(int i=0; i < power; i++) {
            result *= base;
        }
        return result;
    }

}
