package queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue =new PriorityQueue<>();
        queue.offer("Person Zero");
        queue.offer("Person One");
        queue.offer("Person two");
        queue.offer("Person Three");
        queue.offer("Person Four");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
