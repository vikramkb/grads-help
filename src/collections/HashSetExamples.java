package collections;

import java.util.HashSet;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<String> examSelectedList = new HashSet<>();
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
