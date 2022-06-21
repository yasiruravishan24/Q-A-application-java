package Controller;

import Model.UserInput;
import java.sql.*;
import Model.DataBase;
import com.sun.xml.internal.ws.policy.AssertionSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasiru Ravishan
 */
public class UserData {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public int i;

    public int insertData(UserInput us) throws SQLException {

        try {
            con = DataBase.getConnection();
            String query = "INSERT INTO `user_acc`(`First_Name`, `Second_Name`, `BOD`, "
                    + "`Email`, `User_Name`, `Password`) VALUES (?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, us.Fname);
            pst.setString(2, us.Sname);
            java.sql.Date sqlDate = new java.sql.Date(us.dob.getTime());
            pst.setDate(3, sqlDate);
            pst.setString(4, us.email);
            pst.setString(5, us.username);
            pst.setString(6, us.Password);
            i = pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return i;
    }

    public int updateuserdata(UserInput us, String UsId) {

        try {
            con = DataBase.getConnection();
            String query = "UPDATE `user_acc` SET `First_Name`=?,`Second_Name`=?,"
                    + "`BOD`=?,`Email`=?,`User_Name`=?,`Password`=? WHERE User_Id =?";
            pst = con.prepareStatement(query);
            pst.setString(1, us.Fname);
            pst.setString(2, us.Sname);
            java.sql.Date sqlDate = new java.sql.Date(us.dob.getTime());
            pst.setDate(3, sqlDate);
            pst.setString(4, us.email);
            pst.setString(5, us.username);
            pst.setString(6, us.Password);
            pst.setString(7, UsId);
            i = pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return i;

    }

    public ResultSet showUser(String usId) {

        try {

            con = DataBase.getConnection();
            String query = "SELECT * FROM `user_acc` WHERE User_id = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, usId);

            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;

    }

    public ResultSet getMaxuserId() {

        try {

            con = DataBase.getConnection();
            String query = "SELECT MAX(User_Id)as Max_id FROM `user_acc`";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;

    }

}
