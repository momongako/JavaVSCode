package BTVN03;

import static java.lang.System.exit;

/**
 * Stack
 */
public class Stack {

    private Node top;

    public Stack() {
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    private class Node {

        int data; // integer data
        Node link; // reference variable Node type
    }

    public void push(int x) {

        Node temp = new Node();
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    int deleteFromFront() {
        if (isEmpty()) {
            return -1;
        }
        int x = top.data;
        top = top.link;
        return x;
    }

    public void display() {
        System.out.println("last data : " + top.data);
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.printf(" " + temp.data);
                temp = temp.link;
            }
        }
    }
}
