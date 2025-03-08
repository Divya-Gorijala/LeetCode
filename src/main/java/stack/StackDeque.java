package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        System.out.println(stack);
    }
}
