package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue < String > queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        System.out.println(queue);
        System.out.println(queue.element());        //returns first value BUT--> Element () method throws NoSuchException if not found
        System.out.println(queue.peek());           //returns first value BUT--> Peek () method returns Null if not found

        System.out.println("queue.remove() = " + queue.remove());
        System.out.println(queue);

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);


    }
}
