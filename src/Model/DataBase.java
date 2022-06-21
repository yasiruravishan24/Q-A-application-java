
package Model;
import java.sql.*;
/**
 *
 * @author Yasiru Ravishan
 */
public class DataBase {
    
    public static Connection getConnection() throws SQLException{
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dev_go", "root", "");
       return  con;
    }
    
}
