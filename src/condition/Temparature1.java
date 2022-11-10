package condition;

import java.util.Scanner;

public class Temparature1 {
   /* Write a program to read temperature in centigrade and display a suitable message according to temperature state below
    Temp < 0 then Freezing weather
    Temp 0-10 then Very Cold weather
    Temp 10-20 then Cold weather
    Temp 20-30 then Normal in Temp
    Temp 30-40 then Its Hot
    Temp >=40 then Its Very Hot */

    public static void main(String[] args) {
        System.out.println("Enter Temparature");
        Scanner scanner = new Scanner(System.in);
        int temparature = scanner.nextInt();

        if (temparature < 0) {
            System.out.println("Freezing weather");
        } else if (0 <= temparature && temparature <= 10) {
            System.out.println("Very Cold Weather");
        } else if (11 <= temparature && temparature <= 20){
            System.out.println("Cold Weather");
        } else if (21 <= temparature && temparature <= 30){
            System.out.println("Normal in Temp");
        } else if (31 <= temparature && temparature <= 40){
            System.out.println("Hot weather");
        } else {
            System.out.println("Very Hot");
        }
    }
}
