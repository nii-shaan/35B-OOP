package Ds;

public class QueueExample {
    public static void main(String[] args) {

    }
}

class QueueDataStructure {
    int capacity;
    int front;
    int rear;
    int currentSize;
    int[] queue_arr;

    QueueDataStructure(int size) {
        this.capacity = size;
        front = 0;
        rear = -1;
        currentSize = 0;
        queue_arr = new int[this.capacity];
    }

    boolean isFull() {
        return this.currentSize == this.capacity;
    }

    boolean isEmpty() {
        return this.currentSize == 0;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue_arr[front];
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            queue_arr[rear] = data;
            currentSize++;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            front++;
            currentSize--;
            if (front == capacity) {
                int ret = queue_arr[front - 1];
                return ret;
            } else {
                return queue_arr[front - 1];
            }
        }
    }
}