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

    private int size;

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

    public void display() {
        System.out.println("last dâta" + top.data);
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.printf(" " + temp.data);
                temp = temp.link;
            }
        }
    }
}
