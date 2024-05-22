package datastructures;

public class Stack<T> {
    private final T[] items;
    private int top;

    public Stack(int size) {
        items = (T[]) new Object[size];
        top = -1;
    }

    // Pushes an item onto the top of this stack
    public boolean push(T newItem) {
        if (isFull())
            throw new IllegalStateException("Stack is full");

        items[++top] = newItem;

        return true;
    }

    // Removes the object at the top of this stack and returns that object
    public T pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");

        T item = items[top];
        items[top--] = null;

        return item;
    }

    // Tests if this stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Tests if this stack is full
    public boolean isFull() {
        return top == items.length - 1;
    }

    // Looks at the object at the top of this stack without removing it from the stack
    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");

        return items[top];
    }

    // Returns the number of elements in this stack
    public int size() {
        return top + 1;
    }
}