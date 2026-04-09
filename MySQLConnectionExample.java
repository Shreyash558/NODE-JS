import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnectionExample{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/mysql";
        String user="root";
        String password="root";
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(url,user,password);
            System.out.println("Connected to MySQL database successfully!");

        }
        catch(SQLException e){
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        finally
        {
            try{
                if(conn!=null){
                    conn.close();
                    System.out.println("Connection closed");
                }
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}