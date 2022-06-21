package Controller;

import Model.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import Model.Questions;

/**
 *
 * @author Yasiru Ravishan
 */
public class ManageQuestions {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    public int submitQuestion(Questions que) {
        int i = 0;
        try {
            con = DataBase.getConnection();
            String query = "INSERT INTO `questions`(`Que_Title`, `TechTag`, `Questions`, "
                    + "`submit_date`, `publisher_Id`) VALUES (?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, que.queTitle);
            pst.setString(2, que.techTags);
            pst.setString(3, que.question);
            java.sql.Date sqlDate = new java.sql.Date(que.submitDate.getTime());
            pst.setDate(4, sqlDate);
            pst.setString(5, que.Publisher_id);

            i = pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return i;
    }

    public ResultSet showQuestions(String pubId) {
        try {

            con = DataBase.getConnection();
            String query = "SELECT * FROM `questions` WHERE publisher_Id <>?";
            pst = con.prepareStatement(query);
            pst.setString(1, pubId);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;

    }

    public ResultSet showtagsQuestion(String tag, String pubId) {

        try {

            con = DataBase.getConnection();
            String query = "SELECT * FROM `questions` WHERE TechTag = ? AND publisher_Id <>?";
            pst = con.prepareStatement(query);
            pst.setString(1, tag);
            pst.setString(2, pubId);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;

    }

    public ResultSet showMyQuestion(String usId) {

        try {

            con = DataBase.getConnection();
            String query = "SELECT * FROM `questions` WHERE publisher_Id = ?";
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

    public ResultSet loadReplyQustion(String QueId) {

        try {
            con = DataBase.getConnection();
            String query = "SELECT * FROM `questions` WHERE Que_Id = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, QueId);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;
    }

    public ResultSet getQuePublisherID(String que) {

        try {
            con = DataBase.getConnection();
            String query = "SELECT * FROM `questions` WHERE Que_Id = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, que);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;

    }

}
