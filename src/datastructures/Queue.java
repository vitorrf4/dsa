package datastructures;

public class Queue {
    private final Integer[] items;
    private int front;
    private int rear;

    public Queue(int size) {
        items = new Integer[size];
        front = -1;
        rear = -1;
    }

    public boolean enqueue(int newItem) {
        if (isFull())
            return false;

        items[++rear] = newItem;
        if (rear == 0) front = 0;

        return true;
    }

    public Integer dequeue() {
        if (isEmpty())
            return null;

        if (front >= rear) {
            int item = items[front];
            front = -1;
            rear = -1;
            return item;
        }

        return items[front++];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == items.length - 1;
    }

    public Integer peek() {
        if (isEmpty())
            return null;

        return items[front];
    }
}
