package BTVN04;

public class StudentManager {
    private StudentDao dao;

    public StudentManager(StudentDao dao) {
        this.dao = dao;
    }

    public void findStudents(String keyword) throws StudentException {
        try {
            dao.list();
        } catch (DAOException ex) {
            throw new StudentException("Error finding students", ex);

        }
    }
}
