package loops.forloop;

public class Numbers {
    public static void main(String[] args) {
        // print numbers from 1 to 10
        for(int i=0; i < 10; i++){
            System.out.print(i+1);
            System.out.print(" ");
        }
        System.out.println("");
        // print numbers from 1 to 10
        for(int i=1; i <= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");

        // print numbers from 10 to 1
        for(int i=10; i >= 1; i--) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");

        //print 625, 125, 25, 5, 1
        for(int i=625; i >= 1; i /= 5) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
