package BTVN03;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(20);
        st.push(30);
        st.push(50);
        st.push(60);
        st.push(80);
        st.display();
        System.out.println(" ");
        int y = st.deleteFromFront();
        System.out.println("delete : " + y);
        st.display();
    }
}
