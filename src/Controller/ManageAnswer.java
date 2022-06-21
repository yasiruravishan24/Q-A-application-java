package Controller;

import Model.Answer;
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
public class ManageAnswer {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    public int SubmitAnswer(Answer a1) {
        int i = 0;
        try {
            con = DataBase.getConnection();
            String query = "INSERT INTO `answers`(`Questions_Id`, `Answer`, "
                    + "`Publish_Date`, `AnswPublisher_ID`,`QuesPublisher`) VALUES (?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, a1.QueID);
            pst.setString(2, a1.AnswerPub);
            java.sql.Date sqlDate = new java.sql.Date(a1.AnsPubDate.getTime());
            pst.setDate(3, sqlDate);
            pst.setString(4, a1.AnswPubID);
            pst.setString(5, a1.QuesPubId);

            i = pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        return i;

    }

    public ResultSet showAnswer(String UsId) {

        try {

            con = DataBase.getConnection();
            String query = "SELECT `Answer_Id`,`Questions_Id`,`Answer`,`Publish_Date`,"
                    + "`Publisher_ID`,`QuesPublisher`, `Que_Title`,`TechTag`,`Questions` FROM answers INNER JOIN questions "
                    + "ON answers.Questions_Id = questions.Que_Id WHERE QuesPublisher = ?";
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

    public ResultSet loadAnwers(String Answ_Id) {
        try {
            con = DataBase.getConnection();
            String query = "SELECT  `Answer`,`Questions` FROM answers INNER JOIN questions "
                    + "ON answers.Questions_Id = questions.Que_Id  AND  Answer_Id = ? ";
            pst = con.prepareStatement(query);
             pst.setString(1, Answ_Id);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;

    }

}
