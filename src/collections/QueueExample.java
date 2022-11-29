package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<String> tirupathiQueue = new ArrayDeque<>();
        tirupathiQueue.addLast("p1");
        tirupathiQueue.addLast("p2");
        tirupathiQueue.addLast("p3");
        tirupathiQueue.addLast("p4");

        System.out.println(tirupathiQueue.peek());
        System.out.println(tirupathiQueue.peek());
        System.out.println(tirupathiQueue.poll());
        System.out.println(tirupathiQueue.peek());
        tirupathiQueue.addFirst("p5");
        System.out.println(tirupathiQueue.peek());
    }
}
