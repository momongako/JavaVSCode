package BTVN04;

import java.sql.SQLException;

public class DAOException extends Exception {
    public DAOException(String string, SQLException ex) {
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
