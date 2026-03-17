package Problem3Exception;

import java.util.EmptyStackException;

public class MyStack {
    private Integer[] data;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.data = new Integer[capacity];
        this.top = -1;
    }

    public void push(Integer item) {
        if (item == null) {
            throw new NullPointerException("Null values are not allowed.");
        }
        if (isFull()) {
            throw new IllegalStateException("stack overflow-> stack is full.");
        }
        top++;
        data[top] = item;
    }

    public Integer pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Integer item = data[top];
        top--;
        return item;
    }

    public Integer peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(data[i]);
            if (i < top) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}