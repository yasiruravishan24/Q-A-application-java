package View;

/**
 *
 * @author Yasiru Ravishan
 */
public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splachPanel = new javax.swing.JPanel();
        splashLoadTextLbl = new javax.swing.JLabel();
        splashProgressBar = new javax.swing.JProgressBar();
        proNum = new javax.swing.JLabel();
        splashImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        splachPanel.setBackground(new java.awt.Color(204, 153, 0));
        splachPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        splashLoadTextLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        splashLoadTextLbl.setText("Loading...");
        splachPanel.add(splashLoadTextLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        splashProgressBar.setForeground(new java.awt.Color(0, 0, 0));
        splachPanel.add(splashProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 890, -1));

        proNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proNum.setText("0 %");
        splachPanel.add(proNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, -1, -1));

        splashImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/splash.png"))); // NOI18N
        splachPanel.add(splashImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 890, 490));

        getContentPane().add(splachPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 514));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) throws InterruptedException {
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        Userlogin ul = new Userlogin();

        try {
            for (int c = 0; c <= 100; c++) {
                Thread.sleep(70);
                if (c == 10) {
                    sp.splashLoadTextLbl.setText("Turning On Modules...");
                } else if (c == 20) {
                    sp.splashLoadTextLbl.setText("Loading Modules...");
                } else if (c == 50) {
                    sp.splashLoadTextLbl.setText("Connecting to Database...");
                } else if (c == 70) {
                    sp.splashLoadTextLbl.setText("Connecting Succcessful...");
                } else if (c == 80) {
                    sp.splashLoadTextLbl.setText("Launching Application...");
                }

                sp.splashProgressBar.setValue(c);
                sp.proNum.setText(Integer.toString(c) + "%");
                if (c == 100) {
                    sp.dispose();
                    ul.setVisible(true);

                }
            }
        } catch (InterruptedException ex) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel proNum;
    private javax.swing.JPanel splachPanel;
    private javax.swing.JLabel splashImg;
    private javax.swing.JLabel splashLoadTextLbl;
    private javax.swing.JProgressBar splashProgressBar;
    // End of variables declaration//GEN-END:variables
}
