package Problem3Exception;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        try {
            System.out.println("Testing Overflow...");
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40); // Failure
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting null push...");
            stack.push(null);  // Failure
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting underflow on pop...");
            stack.pop(); // 30
            stack.pop(); // 20
            stack.pop(); // 10
            stack.pop(); //empty
        } catch (EmptyStackException e) {
            System.out.println("Caught: stack is empty, cannot pop.");
        }

        try {
            System.out.println("\nTesting underflow on peek...");
            stack.peek();  // Failure
        } catch (EmptyStackException e) {
            System.out.println("Caught: Stack is empty, cannot peek.");
        }
    }
}