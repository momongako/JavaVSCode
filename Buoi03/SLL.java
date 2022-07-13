package Buoi03;

public class SLL {
    Element head;

    SLL() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertAtFront(int x) {
        if (isEmpty()) {
            head = new Element(x);
        } else {
            head = new Element(x, head);
        }

    }

    void insertAtRear(int x) {
        if (isEmpty()) {
            head = new Element(x);

        } else {
            Element el = head;
            while (el.next != null) {
                el = el.next;

            }
            el.next = new Element(x);
        }
    }

    void printALL() {
        Element el = head;
        if (el != null) {
            System.out.print(el.data);
            el = el.next;
        }
        while (el != null) {
            System.out.print(", " + el.data);
            el = el.next;
        }

    }

    boolean Ktra() {
        Element el = head;
        while (el != null) {
            if (el.data < el.next.data) {
                System.out.println("flase");
                return false;
            }
        }
        return true;

    }

}
