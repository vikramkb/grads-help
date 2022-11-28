package collections;


import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(40);
        marks.add(50);
        marks.add(60);
        marks.add(70);
        marks.add(80);
        marks.add(40);

        System.out.println(marks.get(0));
        System.out.println(marks.get(1));
        System.out.println(marks.get(4));

        marks.add(2, 55);
        System.out.println(marks.get(4));
        marks.remove(2);
        System.out.println(marks.get(4));
        marks.remove((Object)40);

        for(Integer mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        marks.set(4, 100);
        for(int i=0; i < marks.size(); i++) {
            System.out.print(marks.get(i) + " ");
        }
        System.out.println();
        marks.clear();
        for(Integer mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();


    }
}
