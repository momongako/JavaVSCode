package BTVN03.Queue;

public class QNode {
    int key;
    QNode next;

    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

class Queue {
    QNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    public void AddQueue(int key) {

        // Create a new LL node
        QNode temp = new QNode(key);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }

    // Method to remove an key from queue.
    public void DeleteQueue() {
        // Trống trả null
        if (this.front == null)
            return;

        // lưu phía trước và di chuyển lên 1 bậc
        QNode temp = this.front;
        this.front = this.front.next;

        // phía trước là null phía sau cũng null
        if (this.front == null)
            this.rear = null;
    }

    public void display() {
        QNode q = front;
        if (q != null) {
            System.out.print(q.key);
            q = q.next;
        }
        while (q != null) {
            System.out.print(", " + q.key);
            q = q.next;
        }
    }
}
