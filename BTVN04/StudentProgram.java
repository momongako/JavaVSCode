package BTVN04;

public class StudentProgram {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        StudentManager manager = new StudentManager(dao);
        try {
            manager.findStudents("Tom");
        } catch (StudentException ex) {
            ex.printStackTrace();
        }
    }
}
