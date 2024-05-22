package datastructures;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
    private final T[] items;
    private int front;
    private int rear;

    public Queue(int size) {
        items = (T[]) new Object[size];
        front = -1;
        rear = -1;
    }

    // Inserts the specified element into this queue
    public boolean enqueue(T newItem) {
        if (isFull())
            throw new IllegalStateException("Queue is full");

        items[++rear] = newItem;
        if (rear == 0) front = 0;

        return true;
    }

    // Retrieves and removes the head of this queue
    public T dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        if (front >= rear) {
            T item = items[front];
            front = -1;
            rear = -1;
            return item;
        }

        return items[front++];
    }

    // Tests if this queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Tests if this queue is full
    public boolean isFull() {
        return rear == items.length - 1;
    }

    // Retrieves, but does not remove, the head of this queue
    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        return items[front];
    }

    // Returns the number of elements in this queue
    public int size() {
        return rear - front + 1;
    }

    // Returns an iterator over elements of type T
    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T> {
        private int current = front;

        @Override
        public boolean hasNext() {
            return current <= rear;
        }

        @Override
        public T next() {
            return items[current++];
        }
    }
}