package BTVN04;

import java.sql.SQLException;

public class StudentDao {
    public void list() throws DAOException {
        try {
            DatabaseUtils.executeQuery("SELECT");
        } catch (SQLException ex) {
            throw new DAOException("Error querying students from database", ex);
        }
    }
}
