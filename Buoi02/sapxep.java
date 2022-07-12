package Buoi02;

import java.util.Hashtable;
import java.util.Queue;
import java.util.Stack;

public class sapxep {
    public static void main(String[] args) {
        // int[] A = { 19, 21, 9, 12, 6, 18, 4, 20, 7, 14 };
        // // int[] Hastable = new int[A.length];
        // Stack<Integer> Stacks = new Stack<Integer>();
        // int top = -1;

        // for (int i = 0; i < A.length; i++) {
        // Stacks.push(A[i]);
        // top++;
        // System.out.println(top);
        // }
        // System.out.println(Stacks.pop());
        // Queue myQ = new Queue();
        // myQ.Enqueue( "The" );
        // myQ.Enqueue( "quick" );
        // myQ.Enqueue( "brown" );
        // myQ.Enqueue( "fox" );
        nganXep N = new nganXep(5);
    }
}

class nganXep {
    int top;
    int[] A;

    nganXep(int size) {
        top = -1;
        A = new int[size];
    }

    void push(int x) {
        if (top > A.length - 1) {
            System.out.println("full");
            return;
        }
        top++;
        A[top] = x;
    }

    int pop() {
        if (top < 0) {
            System.out.println("emty");
            return -1;
        }
        top--;
        return A[top + 1];
    }

    // int peek() {

    // }

}
