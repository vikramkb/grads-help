package logic;


// Given temperature in Fahrenheit convert and print in Celsius.
public class Temparature {
    public static void main(String[] args) {
        float celsius = -20;
        float fahrenheit = 0;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
    }
}
