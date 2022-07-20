package Buoi07.TestAPI;

interface Sayable {
    void say();

}

public class MethodReference {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void saySomething1() {
        System.out.println("Hello, Ahii this is static method.");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference::saySomething1; // Referring static method
        // Calling interface method
        sayable.say();
    }
}
