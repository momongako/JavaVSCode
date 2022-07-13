package Buoi03;

public class SinglyLL {
    public static void main(String[] args) {
        SLL sll = new SLL(); // Tạo ra một danh sách rỗng
        sll.printALL();
        sll.insertAtFront(10);
        sll.insertAtFront(5);
        sll.insertAtRear(25);
        sll.printALL();
        sll.Ktra();
        // (1) Hoàn thành method kiểm tra: trả về true nếu SLL giảm dần, người lại thì
        // trả về false
        // (2) Nếu SLL giảm dần thì in danh sách ra màn hình
    }
}
