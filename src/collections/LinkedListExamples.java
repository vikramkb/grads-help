package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("gopi");
        names.add("uppi");
        names.add("manju");
        names.add("nani");

        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        for(int i=0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.add(0, "ahalya");
        names.addFirst("vikram");
        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        LinkedList<String> copy = (LinkedList<String>)names.clone();
        copy.addFirst("vamshi");
        print(names);
        print(copy);
    }

    public static void print(LinkedList<String> names) {
        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
