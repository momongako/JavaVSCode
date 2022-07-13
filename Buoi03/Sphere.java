package Buoi03;

public class Sphere {
    public static void main(String[] args) {
        Sphere1 sp = new Sphere1(0);
        System.out.println("Hello");
    }
}

class Sphere1 extends SuperCircle {
    protected String name;
    int x;

    public Sphere1(int radius) {
        super(radius);
        name = "Sphere";
    }
}