import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertDataExample{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/mysql";
        String user="root";
        String password="root";
        String query="INSERT INTO student1(ID,NAME)VALUES(?,?)";
        try{
            Connection conn=DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt=conn.prepareStatement(query);
            pstmt.setInt(1,1);
            pstmt.setString(2,"John");
            int rowsInserted=pstmt.executeUpdate();
            if(rowsInserted>0){
                System.out.println("Data inserted successfully!");
            }
            pstmt.close();
            pstmt.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}