package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> bangles = new Stack<>();
        bangles.push("b1");
        bangles.push("b2");
        bangles.push("b3");
        bangles.push("b4");
        bangles.push("b5");
        bangles.push("b6");

        System.out.println(bangles.peek());
        System.out.println(bangles.pop());
        System.out.println(bangles.peek());
        System.out.println(bangles.pop());
        System.out.println(bangles.pop());
        System.out.println(bangles.pop());
        System.out.println(bangles.peek());
    }
}
