
import java.sql.*;

public class JDBCtest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Ibad_I","root","");
        Statement s =con.createStatement();
        ResultSet rs=s.executeQuery("select * from info");
        while (rs.next()){
            System.out.println(rs.getString(1));
        }
        con.close();
    }
}
