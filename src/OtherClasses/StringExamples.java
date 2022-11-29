package OtherClasses;

import java.util.Locale;

public class StringExamples {
    public static void main(String[] args) {
        String name = "vikram";
        String name1 = new String("Upendar");
        String name2 = new String("Gopi");
        String name3 = "Gopi";
        String names = "vikram" + ": gopi : " + name1 + " : "+ name2;
        System.out.println(names);

        System.out.println(name1 == "Upendar"); // never do
        System.out.println(name1.equals("Upendar"));
        String message = "we have completed core java";
        System.out.println(message.substring(4, 8));
        System.out.println(message.toUpperCase());
        System.out.println(message);
        System.out.println(message.indexOf("completed"));
        System.out.println(message.indexOf("core1"));
    }
}
