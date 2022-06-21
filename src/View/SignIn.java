package View;

import Model.UserInput;
import Controller.UserData;
import Controller.ManageProgress;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Yasiru Ravishan
 */
public class SignIn extends javax.swing.JFrame {

    public SignIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FNametxt = new javax.swing.JTextField();
        SNametxt = new javax.swing.JTextField();
        userNametxt = new javax.swing.JTextField();
        DobPicker = new com.toedter.calendar.JDateChooser();
        btn_signIn = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        conformPasswordtxt = new javax.swing.JPasswordField();
        emailtxt = new javax.swing.JTextField();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 65, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Second Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 118, -1, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 152, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Date Of Birth");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 172, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 227, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("UserName");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 285, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 339, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Conform Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 389, -1, -1));

        FNametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FNametxtKeyTyped(evt);
            }
        });
        jPanel2.add(FNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 62, 424, -1));

        SNametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SNametxtKeyTyped(evt);
            }
        });
        jPanel2.add(SNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 118, 424, -1));

        userNametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNametxtKeyTyped(evt);
            }
        });
        jPanel2.add(userNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 282, 424, -1));

        DobPicker.setBackground(new java.awt.Color(255, 255, 255));
        DobPicker.setForeground(new java.awt.Color(204, 153, 0));
        DobPicker.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(DobPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 174, 203, 35));

        btn_signIn.setBackground(new java.awt.Color(204, 153, 0));
        btn_signIn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_signIn.setText("SIGN IN");
        btn_signIn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_signIn.setFocusPainted(false);
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });
        jPanel2.add(btn_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 112, 41));

        btn_clear.setBackground(new java.awt.Color(204, 153, 0));
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_clear.setFocusPainted(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 112, 41));

        btn_back.setBackground(new java.awt.Color(204, 153, 0));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_back.setText("BACK");
        btn_back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_back.setFocusPainted(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 112, 41));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Create New Account");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 30));
        jPanel2.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 420, 30));
        jPanel2.add(conformPasswordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 420, 30));

        emailtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 420, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        Userlogin lg = new Userlogin();
        this.dispose();
        lg.setVisible(true);

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        FNametxt.setText("");
        SNametxt.setText("");
        DobPicker.setDate(null);
        emailtxt.setText("");
        userNametxt.setText("");
        passwordTxt.setText("");
        conformPasswordtxt.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed

        try {

            if (FNametxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "First Name Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                FNametxt.grabFocus();
            } else if (SNametxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Second Name Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                SNametxt.grabFocus();
            } else if (DobPicker.getDate() == null) {
                JOptionPane.showMessageDialog(this, "select Date of Birth", "Warning", JOptionPane.WARNING_MESSAGE);
                DobPicker.grabFocus();
            } else if (emailtxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                emailtxt.grabFocus();
            } else if (userNametxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                userNametxt.grabFocus();
            } else if (passwordTxt.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "Password Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                passwordTxt.grabFocus();
            } else if (conformPasswordtxt.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "Conform Password Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                conformPasswordtxt.grabFocus();
            } else if (!Arrays.equals(passwordTxt.getPassword(), conformPasswordtxt.getPassword())) {
                JOptionPane.showMessageDialog(this, "Please make sure your passwords match", "Warning", JOptionPane.WARNING_MESSAGE);
                conformPasswordtxt.grabFocus();
                passwordTxt.setText("");
                conformPasswordtxt.setText("");
            } else {
                UserInput ui;
                String conpsword = new String(conformPasswordtxt.getPassword());
                ui = new UserInput(FNametxt.getText(), SNametxt.getText(), DobPicker.getDate(), emailtxt.getText(), userNametxt.getText(), conpsword);
                UserData ud = new UserData();
                int i = ud.insertData(ui);

                if (i == 1) {
                    UserData ud2 = new UserData();
                    ResultSet rs1 = ud2.getMaxuserId();
                    int maxUs = 0;
                    while(rs1.next()){
                        maxUs = rs1.getInt("Max_id");
                    }
                    ManageProgress mp1 = new ManageProgress();
                    mp1.insertFirstProgress(maxUs,0, 0);
                    
                    
                    JOptionPane.showMessageDialog(this, "User Registration Successful! Please Login", "Information", JOptionPane.INFORMATION_MESSAGE);
                    FNametxt.setText("");
                    SNametxt.setText("");
                    DobPicker.setDate(null);
                    emailtxt.setText("");
                    userNametxt.setText("");
                    passwordTxt.setText("");
                    conformPasswordtxt.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.User Registration Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    FNametxt.setText("");
                    SNametxt.setText("");
                    DobPicker.setDate(null);
                    emailtxt.setText("");
                    userNametxt.setText("");
                    passwordTxt.setText("");
                    conformPasswordtxt.setText("");
                }

            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btn_signInActionPerformed

    private void FNametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FNametxtKeyTyped
        if (Character.isDigit(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_FNametxtKeyTyped

    private void SNametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SNametxtKeyTyped
        if (Character.isWhitespace(evt.getKeyChar()) || Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_SNametxtKeyTyped

    private void userNametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNametxtKeyTyped
        if (Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_userNametxtKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new SignIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DobPicker;
    private javax.swing.JTextField FNametxt;
    private javax.swing.JTextField SNametxt;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_signIn;
    private javax.swing.JPasswordField conformPasswordtxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField userNametxt;
    // End of variables declaration//GEN-END:variables
}
