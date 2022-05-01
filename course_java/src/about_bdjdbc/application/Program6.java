package about_bdjdbc.application;

import about_bdjdbc.connection.DB;
import about_bdjdbc.exception.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program6 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            //int x = 1;
            //if (x < 2) throw new SQLException("Fake error");

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
            conn.commit();

            System.out.println("Rows1 " + rows1);
            System.out.println("Rows2 " + rows2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
