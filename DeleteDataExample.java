import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "root";
        String query = "DELETE FROM student1 WHERE id = ?";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 1);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("No record found with given ID.");
            }
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}