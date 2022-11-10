package condition;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        // Domestic - 1, Commercial - 2
        System.out.println("Enter consumer type. 1 - Domestic, 2 - Commercial");
        Scanner scanner = new Scanner(System.in);
        int consumerType = scanner.nextInt();

        System.out.println("Enter consumed units");
        int units = scanner.nextInt();
        float amount = 0;
        float unitPerCharge = 0;

        if(consumerType == 1){
            System.out.println("Domestic User");
            if(0 <= units && units <= 199) {
                unitPerCharge = 1.2f;
            }else if(200 <= units && units <= 399) {
                unitPerCharge = 1.5f;
            }else if(400 <= units && units <= 599){
                unitPerCharge = 1.8f;
            }else{
                unitPerCharge = 2.0f;
            }
        }else if(consumerType == 2) {
            System.out.println("Commercial User");
            if(0 <= units && units <= 199) {
                unitPerCharge = 2.1f;
            }else if(200 <= units && units <= 399) {
                unitPerCharge = 3.5f;
            }else if(400 <= units && units <= 599){
                unitPerCharge = 4.2f;
            }else{
                unitPerCharge = 5.0f;
            }
        }else {
            System.out.println("Wrong consumer type");
        }

        amount = units * unitPerCharge;
        System.out.println("Electricity bill = " + amount);
    }
}
