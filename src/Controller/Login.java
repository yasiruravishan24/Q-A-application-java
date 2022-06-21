package Controller;
import java.sql.*;
import Model.DataBase;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasiru Ravishan
 */
public class Login {
    Connection con;
    PreparedStatement pst;
    ResultSet rs ;
    
    public ResultSet loginToApp(String usname, String password){
        try{
            
        con  = DataBase.getConnection();
        String query = "SELECT * FROM `user_acc` WHERE User_Name=? and Password=?";
        pst = con.prepareStatement(query);
        pst.setString(1, usname);
        pst.setString(2, password);
        rs=pst.executeQuery();
        
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }

        return rs;
    }
}