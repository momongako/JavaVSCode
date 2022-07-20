package Buoi07.TestAPI;

interface Drawable {
    public void draw();

    // public void test1();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;
        // without lambda, Drawable implementation using anonymous class
        Drawable d = () -> {

            System.out.println("Drawing " + width);

            // public void test1() {
            // System.out.println("test1 " + width);
            // }

        };
        d.draw();
        // d.test1();
    }
}
