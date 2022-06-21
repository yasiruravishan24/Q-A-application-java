package Controller;

import java.sql.*;
import Model.DataBase;
import javax.swing.JOptionPane;
import Model.PublishJob;

/**
 *
 * @author Yasiru Ravishan
 */
public class Jobs {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    public ResultSet showJob() {
        try {

            con = DataBase.getConnection();
            String query = "SELECT * FROM `jobs`";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;
    }

    public int addJob(PublishJob publish) {
        int i = 0;
        try {
            con = DataBase.getConnection();
            String query = "INSERT INTO `jobs`(`Job_title`, `Job_type`, `Role`, `Tech`,"
                    + "`TelePhone`, `Publisher_id`) VALUES(?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, publish.jobtitle);
            pst.setString(2, publish.jobtype);
            pst.setString(3, publish.jobrole);
            pst.setString(4, publish.jobTech);
            pst.setString(5, publish.jobtele);
            pst.setString(6, publish.Publisher_id);
            i = pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return i;
    }

    public ResultSet manageJobShow(String PublisherId) {
        try {

            con = DataBase.getConnection();
            String query;
            query = "SELECT * FROM `jobs` WHERE Publisher_id=?";
            pst = con.prepareStatement(query);
            pst.setString(1, PublisherId);
            rs = pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return rs;

    }

    public int deleteJob(String jobid, String publisherId) {
        int i = 0;
        try {
            con = DataBase.getConnection();
            String query = "DELETE FROM `jobs` WHERE Job_id=? and Publisher_id=?";
            pst = con.prepareStatement(query);
            pst.setString(1, jobid);
            pst.setString(2, publisherId);

            i = pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return i;
    }

    public void addRow(String[] JobTableData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
