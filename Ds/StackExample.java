package Ds;

public class StackExample {
    public static void main(String[] args) {

        StackDataStructure s = new StackDataStructure(5);
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());

    }
}

class StackDataStructure {
    int maxSize;
    int[] stack_arr;
    int top;

    StackDataStructure(int size) {
        this.maxSize = maxSize;
        stack_arr = new int[this.maxSize];
        top = -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack_arr[top];
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack_arr[top--];
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");

        } else {
            stack_arr[++top] = data;
        }
    }
}
