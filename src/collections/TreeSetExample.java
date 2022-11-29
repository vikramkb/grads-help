package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> examSelectedList = new TreeSet<>();
        examSelectedList.add("vikram");
        examSelectedList.add("uppi");
        examSelectedList.add("ahalya");
        examSelectedList.add("gopi");
        examSelectedList.add("manju");
        examSelectedList.add("nani");

        System.out.println(examSelectedList.contains("vikram"));
        examSelectedList.remove("vikram");
        System.out.println(examSelectedList.contains("vikram"));
    }
}
