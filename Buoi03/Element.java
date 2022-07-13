package Buoi03;

public class Element {
    int data; //
    Element next;// tham chiếu đến phần tử tiếp theo

    Element(int x) {
        data = x;
        next = null;
    }

    protected Element(int x, Element elNext) {
        data = x;
        next = elNext;
    }
}
