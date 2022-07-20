package Buoi07.Collectors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<Person>();
        person.add(new Person("Alex", "json", "alex@gmail.com", Gender.Male, 25));
        person.add(new Person("jame", "json", "jame@gmail.com", Gender.FEMALE, 25));
        person.add(new Person("Ben", "json", "Ben@gmail.com", Gender.FEMALE, 25));
        person.add(new Person("Alex", "json", "kuuhau771998@gmail.com", Gender.FEMALE, 25));
        person.add(new Person("Alex", "json", "kuuhau771998@gmail.com", Gender.FEMALE, 25));

    }
}
