package datastructures;

public class Stack {
    private final Integer[] items;
    private int top;

    public Stack(int size) {
        items = new Integer[size];
        top = -1;
    }

    public boolean push(int newItem) {
        if (isFull())
            return false;

        items[++top] = newItem;

        return true;
    }

    public Integer pop() {
        if (isEmpty())
            return null;

        int item = items[top];
        items[top--] = null;

        return item;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }

    public Integer peek() {
        if (isEmpty())
            return null;

        return items[top];
    }
}
