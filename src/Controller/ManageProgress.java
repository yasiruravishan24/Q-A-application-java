package Controller;

import Model.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasiru Ravishan
 */
public class ManageProgress {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    public void setQueProgress(String UserId, int newQue) {

        try {
            con = DataBase.getConnection();
            String query = "UPDATE `progress` SET `Num_Of_Que`= ? WHERE user_id=?";
            pst = con.prepareStatement(query);
            pst.setInt(1, newQue);
            pst.setString(2, UserId);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void setAnswProgress(String UserId, int newAns) {

        try {
            con = DataBase.getConnection();
            String query = "UPDATE `progress` SET `Num_Of_Ans`=? WHERE user_id=?";
            pst = con.prepareStatement(query);
            pst.setInt(1, newAns);
            pst.setString(2, UserId);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

    public ResultSet GetProgrss(String UsId) {
        try {
            con = DataBase.getConnection();
            String query = "SELECT * FROM `progress` WHERE user_id =?";
            pst = con.prepareStatement(query);
            pst.setString(1, UsId);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;
    }

    public void insertFirstProgress(int UsId, int que, int ans) {
        try {
            con = DataBase.getConnection();
            String query = "INSERT INTO `progress`(`user_id`, `Num_Of_Que`, `Num_Of_Ans`) VALUES (?,?,?)";
            pst = con.prepareStatement(query);
            pst.setInt(1, UsId);
            pst.setInt(2, que);
            pst.setInt(3, ans);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }
}
