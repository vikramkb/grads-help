package condition;

public class LogicalConditions {
    public static void main(String[] args) {
        boolean value1 = (10 % 2 == 0);
        System.out.println(value1);

        boolean value2 = (10 % 3 == 0);
        System.out.println(value2);

        System.out.println(10 % 3 == 0);

        int number = 10;
        if((number % 2 == 0) && (number % 5 == 0)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        number = 9;
        if((number % 2 == 0) || (number % 3 == 0)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        number = 9;
        if((number % 2 == 0) && (number % 3 == 0)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        number = 12;
        if((number % 2 == 0) && (number % 3 == 0) && (number % 4 == 0)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        number = 8;
        if(((number % 2 == 0) && (number % 3 == 0)) || (number % 4 == 0)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
