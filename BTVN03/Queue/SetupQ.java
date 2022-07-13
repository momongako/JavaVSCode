package BTVN03.Queue;

public class SetupQ {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.AddQueue(10);
        q.AddQueue(20);
        q.AddQueue(50);
        q.AddQueue(5);
        q.display();
        System.out.println("");
        q.DeleteQueue();
        q.display();
    }
}
