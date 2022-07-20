package Buoi07.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Alice", 80));
        student.add(new Student("Jone", 125));
        student.add(new Student("Sam", 135));
        student.add(new Student("Eric", 20));
        student.add(new Student("Athur", 20));
        student.add(new Student("Sam", 90));
        student.add(new Student("Richar", 98));
        student.add(new Student("Ronson", 89));
        student.add(new Student("Jone", 78));
        student.add(new Student("Nick", 25));
        student.add(new Student("Ace", 25));

        // điều kiên >=70 và thay cho vòng for
        List<Student> listStudent = student.stream()
                .filter(e -> e.getScore() >= 70)
                .collect(Collectors.toList());

        // thay cho vòng for
        listStudent.stream().forEach(System.out::println);

        // điểm trung bình

        double average = student.stream()
                .mapToInt(e -> e.getScore())
                .average().getAsDouble();

        System.out.println("điểm trung binh tất cả" + average);

        // sắp xếp
        System.out.println("Tu lon den be");
        student.stream().sorted().forEach(e -> System.out.println(e + "-" + e.getScore()));

    }
}
