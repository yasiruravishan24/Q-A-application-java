package View;
import  Controller.Login;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yasiru Ravishan
 */
public class Userlogin extends javax.swing.JFrame {

    public Userlogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel1 = new javax.swing.JPanel();
        logingPanel2 = new javax.swing.JPanel();
        loginLable = new javax.swing.JLabel();
        userNameLable = new javax.swing.JLabel();
        UserNameText = new javax.swing.JTextField();
        passwordLable = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel1.setBackground(new java.awt.Color(204, 153, 0));
        loginPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logingPanel2.setBackground(new java.awt.Color(255, 255, 255));
        logingPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLable.setFont(new java.awt.Font("Taller  Evolution Rev", 1, 36)); // NOI18N
        loginLable.setText(" LOG IN");
        logingPanel2.add(loginLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        userNameLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameLable.setText("User Name");
        logingPanel2.add(userNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        UserNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserNameTextKeyTyped(evt);
            }
        });
        logingPanel2.add(UserNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 246, 40));

        passwordLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLable.setText("Password");
        logingPanel2.add(passwordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        btn_login.setBackground(new java.awt.Color(204, 153, 0));
        btn_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_login.setText("LOG IN");
        btn_login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_login.setBorderPainted(false);
        btn_login.setFocusPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        logingPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 111, 37));

        btn_signup.setBackground(new java.awt.Color(204, 153, 0));
        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_signup.setText("SIGN IN");
        btn_signup.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_signup.setBorderPainted(false);
        btn_signup.setFocusPainted(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        logingPanel2.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 111, 36));

        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTextKeyTyped(evt);
            }
        });
        logingPanel2.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 246, 40));

        jLabel1.setText("Not a member? Sign in now");
        logingPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        loginPanel1.add(logingPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 290, 460));

        getContentPane().add(loginPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        Userlogin ulog = new Userlogin();
        MainForm mForm = new MainForm();
       
        
        try{
            if(UserNameText.getText().isEmpty()){
                JOptionPane.showMessageDialog(ulog, "User Name Can not be null","Warning",JOptionPane.WARNING_MESSAGE);
                UserNameText.grabFocus();
            
            }
            else if(passwordText.getPassword().length == 0){
                JOptionPane.showMessageDialog(ulog, "Password Can not be null","Warning",JOptionPane.WARNING_MESSAGE);
                passwordText.grabFocus();
            
            }
            else{
                Login lg = new Login();
                String usName = UserNameText.getText();
                String psword = new String(passwordText.getPassword());
                
                ResultSet rs = lg.loginToApp(usName,psword);
                
                if(rs.next()){

                    UserNameText.setText("");
                    passwordText.setText("");
                    String usId  = String.valueOf(rs.getString("User_Id"));
                    mForm.getUserId(usId);
                    this.dispose();
                    mForm.setVisible(true);

                    
                    
                }
                else{
                     JOptionPane.showMessageDialog(this,"check UserName and Password !");
                     UserNameText.setText("");
                     passwordText.setText("");
                }
            }
        }
         catch(HeadlessException ex){
             JOptionPane.showMessageDialog(this,ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        SignIn Sn = new SignIn();
        this.dispose();
        Sn.setVisible(true);
        
    }//GEN-LAST:event_btn_signupActionPerformed

    private void UserNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameTextKeyTyped
            if(Character.isWhitespace(evt.getKeyChar())){
                evt.consume();
            }
    }//GEN-LAST:event_UserNameTextKeyTyped

    private void passwordTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyTyped
            if(Character.isWhitespace(evt.getKeyChar())){
                evt.consume();
            }
    }//GEN-LAST:event_passwordTextKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Userlogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserNameText;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginLable;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JPanel logingPanel2;
    private javax.swing.JLabel passwordLable;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel userNameLable;
    // End of variables declaration//GEN-END:variables
}
