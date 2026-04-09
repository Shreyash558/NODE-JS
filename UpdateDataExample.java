import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "root";
        String query = "UPDATE student1 SET name = ? WHERE id = ?";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "Alice");
             pstmt.setInt(2, 1);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
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