package Buoi07.TestAPI;

interface Sayable {
    public String say(String name, int id);

}

public class LambdaExpressionExample4 {

    public static void main(String[] args) {
        Sayable s1 = (hoten, id) -> { // Lambda expression with single parameter.
            return "Hello " + hoten + id;
        };
        System.out.println(s1.say("sonoo", 1));

        // Sayable s2 = name -> {
        // return "Hello, " + name ;
        // };
        // System.out.println(s2.say("sonoo",1));

        // Sayable s3 = (id) -> {
        // return "Hello, " + id;
        // };
        // System.out.println(s3.say("1"));
    }
}