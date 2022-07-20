package Buoi07.TestAPI;

interface Addable {
    int add(int a, int b, int c);

}

public class LambdaExpressionExample6 {
    public static void main(String[] args) {
        Addable ad1 = (a, b, c) -> (a + b - c);
        System.out.println(ad1.add(10, 20, 5));

        Addable ad2 = (int a, int b, int s) -> {
            return (a + b + s);
        };

        System.out.println(ad2.add(100, 200, 500));
    }
}
