package View;

import Controller.Jobs;
import Controller.ManageAnswer;
import Controller.ManageProgress;
import Controller.UserData;
import Controller.ManageQuestions;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import Model.PublishJob;
import Model.UserInput;
import Model.Questions;
import Model.Answer;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/**
 *
 * @author Yasiru Ravishan
 */
public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backpanel1 = new javax.swing.JPanel();
        backpanel2 = new javax.swing.JPanel();
        leftpanel = new javax.swing.JPanel();
        btn_ask_que = new javax.swing.JButton();
        btn_que = new javax.swing.JButton();
        btn_tags = new javax.swing.JButton();
        btn_jobs = new javax.swing.JButton();
        btn_logOut = new javax.swing.JButton();
        btn_settings = new javax.swing.JButton();
        btn_progress = new javax.swing.JButton();
        mainPan = new javax.swing.JTabbedPane();
        AskquestionPan = new javax.swing.JTabbedPane();
        askQuePan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_manage_que = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        questionArea = new javax.swing.JTextArea();
        questionTitletxt = new javax.swing.JTextField();
        cmd_questechtag = new javax.swing.JComboBox<>();
        btn_questionSubmit = new javax.swing.JButton();
        btn_question = new javax.swing.JButton();
        askMangeQuesPan = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        manageQueTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        askQueReplyTable = new javax.swing.JTable();
        askQueReplypan = new javax.swing.JPanel();
        AskQueReplylbl = new javax.swing.JLabel();
        AskQueReplyqueLbl = new javax.swing.JLabel();
        askQueReplyAns = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txt_askQueReplyque = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        txt_askQueReplyAnswer = new javax.swing.JTextArea();
        askQueGoBack = new javax.swing.JButton();
        QuestionsPan = new javax.swing.JTabbedPane();
        QuesPan = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        QuesTable = new javax.swing.JTable();
        QueReplyPan = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        queReplyTagLable = new javax.swing.JLabel();
        queReplyQueLbl = new javax.swing.JLabel();
        txtQueReplyTags = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaQueReplyQue = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAreaQueReplyAnser = new javax.swing.JTextArea();
        queRepAnsLbl = new javax.swing.JLabel();
        btn_queReplyBack = new javax.swing.JButton();
        btn_que_Reply_submit = new javax.swing.JButton();
        btn_queReplyClear = new javax.swing.JButton();
        Tagspan = new javax.swing.JTabbedPane();
        TagQuePan = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Tagslabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tagsTable = new javax.swing.JTable();
        cmd_TechTag = new javax.swing.JComboBox<>();
        btn_tags_srch = new javax.swing.JButton();
        TagReplyPan = new javax.swing.JPanel();
        btn_TagsReplyClear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btn_tagsReplyBack = new javax.swing.JButton();
        tagsReplytechTagLbl = new javax.swing.JLabel();
        tagReplyQueLbl = new javax.swing.JLabel();
        tagsReplyAnserLbl = new javax.swing.JLabel();
        txtTagsReplytechTags = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAreaTagReplyQue = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtAreaTagsReplyAnswer = new javax.swing.JTextArea();
        btn_TagsReplySubmit = new javax.swing.JButton();
        Jobspan = new javax.swing.JTabbedPane();
        jobsPanel = new javax.swing.JPanel();
        jobsLable = new javax.swing.JLabel();
        btn_publish = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobsTable = new javax.swing.JTable();
        btn_manage_jobs1 = new javax.swing.JButton();
        publishJobpanel = new javax.swing.JPanel();
        publishJobs = new javax.swing.JLabel();
        jobtitleLbl = new javax.swing.JLabel();
        jobTypeLbl = new javax.swing.JLabel();
        jobRoleLbl = new javax.swing.JLabel();
        techLbl = new javax.swing.JLabel();
        teleLbl = new javax.swing.JLabel();
        job_title = new javax.swing.JTextField();
        job_tele = new javax.swing.JTextField();
        cmd_job_type = new javax.swing.JComboBox<>();
        cmd_role = new javax.swing.JComboBox<>();
        cmd_tec = new javax.swing.JComboBox<>();
        btn_job_submit = new javax.swing.JButton();
        btn_job_clear = new javax.swing.JButton();
        btn_find_jobs2 = new javax.swing.JButton();
        btn_manage2 = new javax.swing.JButton();
        managePublished = new javax.swing.JPanel();
        manageJobLable = new javax.swing.JLabel();
        btn_find_jobs3 = new javax.swing.JButton();
        btn_publishjob3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        deleteJobTable = new javax.swing.JTable();
        deleteJobId_txt = new javax.swing.JTextField();
        job_delete_labal = new javax.swing.JLabel();
        btn_delete_job = new javax.swing.JButton();
        deletepublishedLable = new javax.swing.JLabel();
        ProgressPan = new javax.swing.JPanel();
        progressLable = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        progress_text_area = new javax.swing.JTextArea();
        btn_print = new javax.swing.JButton();
        progressNofQAskLbl = new javax.swing.JLabel();
        ProgressNofAsubLbl = new javax.swing.JLabel();
        ProgressForQaskLbl = new javax.swing.JLabel();
        ProgressPForASubLbl = new javax.swing.JLabel();
        totPointLbl = new javax.swing.JLabel();
        txt_nOFqAsk = new javax.swing.JTextField();
        txt_nOFaSubmit = new javax.swing.JTextField();
        txt_pointForQue = new javax.swing.JTextField();
        txt_pointForAns = new javax.swing.JTextField();
        txt_total_points = new javax.swing.JTextField();
        Settings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        setteingfname = new javax.swing.JLabel();
        settingsSname = new javax.swing.JLabel();
        SettingDob = new javax.swing.JLabel();
        settingsEmail = new javax.swing.JLabel();
        settingusername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUpdateFname = new javax.swing.JTextField();
        TxtUpdateSname = new javax.swing.JTextField();
        txtUpdateEmail = new javax.swing.JTextField();
        txtUpdateUsername = new javax.swing.JTextField();
        btn_setting_update = new javax.swing.JButton();
        btn_settings_clear = new javax.swing.JButton();
        txtupadteConpass = new javax.swing.JPasswordField();
        txtupdatenewpassword = new javax.swing.JPasswordField();
        updatedob_picker = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dev-Go");
        setResizable(false);

        backpanel1.setBackground(new java.awt.Color(204, 153, 0));
        backpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backpanel2.setBackground(new java.awt.Color(255, 255, 255));
        backpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftpanel.setBackground(new java.awt.Color(229, 229, 229));
        leftpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ask_que.setBackground(new java.awt.Color(204, 153, 0));
        btn_ask_que.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ask_que.setText("Ask Questions");
        btn_ask_que.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 153, 0), null));
        btn_ask_que.setFocusPainted(false);
        btn_ask_que.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ask_queActionPerformed(evt);
            }
        });
        leftpanel.add(btn_ask_que, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 52));

        btn_que.setBackground(new java.awt.Color(204, 153, 0));
        btn_que.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_que.setText("Questions");
        btn_que.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 153, 0), null));
        btn_que.setFocusPainted(false);
        btn_que.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_queActionPerformed(evt);
            }
        });
        leftpanel.add(btn_que, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 49));

        btn_tags.setBackground(new java.awt.Color(204, 153, 0));
        btn_tags.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_tags.setText("Tags");
        btn_tags.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 153, 0), null));
        btn_tags.setFocusPainted(false);
        btn_tags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tagsActionPerformed(evt);
            }
        });
        leftpanel.add(btn_tags, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, 49));

        btn_jobs.setBackground(new java.awt.Color(204, 153, 0));
        btn_jobs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_jobs.setText("Jobs");
        btn_jobs.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 153, 0), null));
        btn_jobs.setFocusPainted(false);
        btn_jobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jobsActionPerformed(evt);
            }
        });
        leftpanel.add(btn_jobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 56));

        btn_logOut.setBackground(new java.awt.Color(204, 153, 0));
        btn_logOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_logOut.setText("LOG OUT");
        btn_logOut.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 153, 0), null));
        btn_logOut.setFocusPainted(false);
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });
        leftpanel.add(btn_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 180, 49));

        btn_settings.setBackground(new java.awt.Color(204, 153, 0));
        btn_settings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_settings.setText("Settings");
        btn_settings.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 153, 0), null));
        btn_settings.setFocusPainted(false);
        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });
        leftpanel.add(btn_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 50));

        btn_progress.setBackground(new java.awt.Color(204, 153, 0));
        btn_progress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_progress.setText("Progress");
        btn_progress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_progress.setFocusPainted(false);
        btn_progress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_progressActionPerformed(evt);
            }
        });
        leftpanel.add(btn_progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 50));

        backpanel2.add(leftpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 480));

        mainPan.setBackground(new java.awt.Color(255, 255, 255));
        mainPan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        askQuePan.setBackground(new java.awt.Color(255, 255, 255));
        askQuePan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Ask Question");
        askQuePan.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_manage_que.setBackground(new java.awt.Color(204, 153, 0));
        btn_manage_que.setText("Manage Question");
        btn_manage_que.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_manage_que.setFocusPainted(false);
        btn_manage_que.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_queActionPerformed(evt);
            }
        });
        askQuePan.add(btn_manage_que, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Question Title");
        askQuePan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Question ");
        askQuePan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Technologeis Tags");
        askQuePan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        questionArea.setColumns(20);
        questionArea.setRows(5);
        jScrollPane3.setViewportView(questionArea);

        askQuePan.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 560, 160));
        askQuePan.add(questionTitletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 440, 30));

        cmd_questechtag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Technologeis", "Python", "HTML/CSS", "JSON", "Ruby", "Laravel", "Java", "JavaScript", "Angular", "Arduino", "C#", "Asp.net", "C++", "Object C", "Django", "Jquery", "Kotlin", "Node js", "Php", "React js", "Swift", "Adobe", "Type script", "Go", "Vue js", "SQL", "Wordpress", "R", "Unity" }));
        askQuePan.add(cmd_questechtag, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 300, 30));

        btn_questionSubmit.setBackground(new java.awt.Color(204, 153, 0));
        btn_questionSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_questionSubmit.setText("SUBMIT");
        btn_questionSubmit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_questionSubmit.setFocusPainted(false);
        btn_questionSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_questionSubmitActionPerformed(evt);
            }
        });
        askQuePan.add(btn_questionSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 140, 40));

        btn_question.setBackground(new java.awt.Color(204, 153, 0));
        btn_question.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_question.setText("CLEAR");
        btn_question.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_question.setFocusPainted(false);
        btn_question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_questionActionPerformed(evt);
            }
        });
        askQuePan.add(btn_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 140, 40));

        AskquestionPan.addTab("que", askQuePan);

        askMangeQuesPan.setBackground(new java.awt.Color(255, 255, 255));
        askMangeQuesPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(204, 153, 0));
        jButton2.setText("Ask Question");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        askMangeQuesPan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Manage Questions");
        askMangeQuesPan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 30));

        manageQueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question Title", "Technologeis Tags", "Published Date"
            }
        ));
        jScrollPane6.setViewportView(manageQueTable);

        askMangeQuesPan.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 740, 160));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Reply Answers");
        askMangeQuesPan.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        askQueReplyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Answer Id", "Question Title", "Technologeis Tags ", "Replied Date"
            }
        ));
        askQueReplyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                askQueReplyTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(askQueReplyTable);

        askMangeQuesPan.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 740, 180));

        AskquestionPan.addTab("manage", askMangeQuesPan);

        askQueReplypan.setBackground(new java.awt.Color(255, 255, 255));
        askQueReplypan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AskQueReplylbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AskQueReplylbl.setText("Reply");
        askQueReplypan.add(AskQueReplylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        AskQueReplyqueLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AskQueReplyqueLbl.setText("Questions");
        askQueReplypan.add(AskQueReplyqueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        askQueReplyAns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        askQueReplyAns.setText("Replied Answer");
        askQueReplypan.add(askQueReplyAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txt_askQueReplyque.setColumns(20);
        txt_askQueReplyque.setRows(5);
        jScrollPane12.setViewportView(txt_askQueReplyque);

        askQueReplypan.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 470, 140));

        txt_askQueReplyAnswer.setColumns(20);
        txt_askQueReplyAnswer.setRows(5);
        jScrollPane13.setViewportView(txt_askQueReplyAnswer);

        askQueReplypan.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 470, 200));

        askQueGoBack.setBackground(new java.awt.Color(204, 153, 0));
        askQueGoBack.setText("Go Back");
        askQueGoBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        askQueGoBack.setFocusPainted(false);
        askQueGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askQueGoBackActionPerformed(evt);
            }
        });
        askQueReplypan.add(askQueGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 30));

        AskquestionPan.addTab("replys", askQueReplypan);

        mainPan.addTab("ask", AskquestionPan);

        QuesPan.setBackground(new java.awt.Color(255, 255, 255));
        QuesPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Questions");
        QuesPan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        QuesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question Id", "Question Title", "Technologeis Tags", "Published Date"
            }
        ));
        QuesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuesTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(QuesTable);

        QuesPan.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 730, 410));

        QuestionsPan.addTab("que", QuesPan);

        QueReplyPan.setBackground(new java.awt.Color(255, 255, 255));
        QueReplyPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Reply ");
        QueReplyPan.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        queReplyTagLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        queReplyTagLable.setText("Technologeis Tags");
        QueReplyPan.add(queReplyTagLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        queReplyQueLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        queReplyQueLbl.setText("Question");
        QueReplyPan.add(queReplyQueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        QueReplyPan.add(txtQueReplyTags, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, 30));

        txtAreaQueReplyQue.setColumns(20);
        txtAreaQueReplyQue.setRows(5);
        jScrollPane8.setViewportView(txtAreaQueReplyQue);

        QueReplyPan.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 550, 110));

        txtAreaQueReplyAnser.setColumns(20);
        txtAreaQueReplyAnser.setRows(5);
        jScrollPane9.setViewportView(txtAreaQueReplyAnser);

        QueReplyPan.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 550, 110));

        queRepAnsLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        queRepAnsLbl.setText("Answer");
        QueReplyPan.add(queRepAnsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, -1));

        btn_queReplyBack.setBackground(new java.awt.Color(204, 153, 0));
        btn_queReplyBack.setText("Go Back");
        btn_queReplyBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_queReplyBack.setFocusPainted(false);
        btn_queReplyBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_queReplyBackActionPerformed(evt);
            }
        });
        QueReplyPan.add(btn_queReplyBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        btn_que_Reply_submit.setBackground(new java.awt.Color(204, 153, 0));
        btn_que_Reply_submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_que_Reply_submit.setText("SUBMIT");
        btn_que_Reply_submit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_que_Reply_submit.setFocusPainted(false);
        btn_que_Reply_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_que_Reply_submitActionPerformed(evt);
            }
        });
        QueReplyPan.add(btn_que_Reply_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, 50));

        btn_queReplyClear.setBackground(new java.awt.Color(204, 153, 0));
        btn_queReplyClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_queReplyClear.setText("CLEAR");
        btn_queReplyClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_queReplyClear.setFocusPainted(false);
        btn_queReplyClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_queReplyClearActionPerformed(evt);
            }
        });
        QueReplyPan.add(btn_queReplyClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, 50));

        QuestionsPan.addTab("reply", QueReplyPan);

        mainPan.addTab("question", QuestionsPan);

        TagQuePan.setBackground(new java.awt.Color(255, 255, 255));
        TagQuePan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Tags");
        TagQuePan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, -1, -1));

        Tagslabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tagslabel1.setText("Technologeis Tags");
        TagQuePan.add(Tagslabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        tagsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question Id", "Question Title", "Technologeis Tags", "Published Date"
            }
        ));
        tagsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tagsTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tagsTable);

        TagQuePan.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 750, 340));

        cmd_TechTag.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmd_TechTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Technologeis", "Python", "HTML/CSS", "JSON", "Ruby", "Laravel", "Java", "JavaScript", "Angular", "Arduino", "C#", "Asp.net", "C++", "Object C", "Django", "Jquery", "Kotlin", "Node js", "Php", "React js", "Swift", "Adobe", "Type script", "Go", "Vue js", "SQL", "Wordpress", "R", "Unity" }));
        TagQuePan.add(cmd_TechTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 330, 30));

        btn_tags_srch.setBackground(new java.awt.Color(204, 153, 0));
        btn_tags_srch.setText("SEARCH");
        btn_tags_srch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_tags_srch.setFocusPainted(false);
        btn_tags_srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tags_srchActionPerformed(evt);
            }
        });
        TagQuePan.add(btn_tags_srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 70, 130, 30));

        Tagspan.addTab("tag search", TagQuePan);

        TagReplyPan.setBackground(new java.awt.Color(255, 255, 255));
        TagReplyPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_TagsReplyClear.setBackground(new java.awt.Color(204, 153, 0));
        btn_TagsReplyClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_TagsReplyClear.setText("CLEAR");
        btn_TagsReplyClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_TagsReplyClear.setFocusPainted(false);
        btn_TagsReplyClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TagsReplyClearActionPerformed(evt);
            }
        });
        TagReplyPan.add(btn_TagsReplyClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Reply");
        TagReplyPan.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        btn_tagsReplyBack.setBackground(new java.awt.Color(204, 153, 0));
        btn_tagsReplyBack.setText("Go Back");
        btn_tagsReplyBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_tagsReplyBack.setFocusPainted(false);
        btn_tagsReplyBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tagsReplyBackActionPerformed(evt);
            }
        });
        TagReplyPan.add(btn_tagsReplyBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        tagsReplytechTagLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tagsReplytechTagLbl.setText("Technologeis Tags");
        TagReplyPan.add(tagsReplytechTagLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        tagReplyQueLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tagReplyQueLbl.setText("Question");
        TagReplyPan.add(tagReplyQueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        tagsReplyAnserLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tagsReplyAnserLbl.setText("Answer");
        TagReplyPan.add(tagsReplyAnserLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, -1));
        TagReplyPan.add(txtTagsReplytechTags, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, 30));

        txtAreaTagReplyQue.setColumns(20);
        txtAreaTagReplyQue.setRows(5);
        jScrollPane10.setViewportView(txtAreaTagReplyQue);

        TagReplyPan.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 550, 100));

        txtAreaTagsReplyAnswer.setColumns(20);
        txtAreaTagsReplyAnswer.setRows(5);
        jScrollPane11.setViewportView(txtAreaTagsReplyAnswer);

        TagReplyPan.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 550, 120));

        btn_TagsReplySubmit.setBackground(new java.awt.Color(204, 153, 0));
        btn_TagsReplySubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_TagsReplySubmit.setText("SUBMIT");
        btn_TagsReplySubmit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_TagsReplySubmit.setFocusPainted(false);
        btn_TagsReplySubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TagsReplySubmitActionPerformed(evt);
            }
        });
        TagReplyPan.add(btn_TagsReplySubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, 50));

        Tagspan.addTab("answer", TagReplyPan);

        mainPan.addTab("tags", Tagspan);

        Jobspan.setBackground(new java.awt.Color(255, 255, 255));
        Jobspan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jobsPanel.setBackground(new java.awt.Color(255, 255, 255));
        jobsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jobsLable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jobsLable.setText("Find Jobs");
        jobsPanel.add(jobsLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_publish.setBackground(new java.awt.Color(204, 153, 0));
        btn_publish.setText("Publish Job");
        btn_publish.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_publish.setFocusPainted(false);
        btn_publish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_publishActionPerformed(evt);
            }
        });
        jobsPanel.add(btn_publish, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        jobsTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 153, 0), null));
        jobsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Title", "Job-Type", "Role", "Technologeis", "Contact No"
            }
        ));
        jobsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jobsTable.setGridColor(new java.awt.Color(204, 204, 204));
        jobsTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jobsTable);

        jobsPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 750, 380));

        btn_manage_jobs1.setBackground(new java.awt.Color(204, 153, 0));
        btn_manage_jobs1.setText("Manage Jobs");
        btn_manage_jobs1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_manage_jobs1.setFocusPainted(false);
        btn_manage_jobs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_jobs1ActionPerformed(evt);
            }
        });
        jobsPanel.add(btn_manage_jobs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, 30));

        Jobspan.addTab("FindJ", jobsPanel);

        publishJobpanel.setBackground(new java.awt.Color(255, 255, 255));
        publishJobpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        publishJobs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        publishJobs.setText("Publish Jobs");
        publishJobpanel.add(publishJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jobtitleLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jobtitleLbl.setText("Job Title");
        publishJobpanel.add(jobtitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jobTypeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jobTypeLbl.setText("Job-Type");
        publishJobpanel.add(jobTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jobRoleLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jobRoleLbl.setText("Role");
        publishJobpanel.add(jobRoleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        techLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        techLbl.setText("Technologeis");
        publishJobpanel.add(techLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        teleLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        teleLbl.setText("Telephone");
        publishJobpanel.add(teleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        job_title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publishJobpanel.add(job_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 270, 30));

        job_tele.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        job_tele.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                job_teleKeyTyped(evt);
            }
        });
        publishJobpanel.add(job_tele, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 270, 30));

        cmd_job_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmd_job_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Full Time", "Part Time" }));
        publishJobpanel.add(cmd_job_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 190, 30));

        cmd_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmd_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Frontend", "Backend", "Designer", "Web Developer", "Software  Architecture", "Data Scientist", "Game Developing", "DataBase ", "Ai/Machine", "Business Analyst", "Cloud Engineer", " " }));
        publishJobpanel.add(cmd_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 190, 30));

        cmd_tec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmd_tec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Technologeis", "Python", "HTML/CSS", "JSON", "Ruby", "Laravel", "Java", "JavaScript", "Angular", "Arduino", "C#", "Asp.net", "C++", "Object C", "Django", "Jquery", "Kotlin", "Node js", "Php", "React js", "Swift", "Adobe", "Type script", "Go", "Vue js", "SQL", "Wordpress", "R", "Unity" }));
        publishJobpanel.add(cmd_tec, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 190, 30));

        btn_job_submit.setBackground(new java.awt.Color(204, 153, 0));
        btn_job_submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_job_submit.setText("SUBMIT");
        btn_job_submit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)));
        btn_job_submit.setFocusPainted(false);
        btn_job_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_job_submitActionPerformed(evt);
            }
        });
        publishJobpanel.add(btn_job_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 160, 40));

        btn_job_clear.setBackground(new java.awt.Color(204, 153, 0));
        btn_job_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_job_clear.setText("CLEAR");
        btn_job_clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)));
        btn_job_clear.setFocusPainted(false);
        btn_job_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_job_clearActionPerformed(evt);
            }
        });
        publishJobpanel.add(btn_job_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 160, 40));

        btn_find_jobs2.setBackground(new java.awt.Color(204, 153, 0));
        btn_find_jobs2.setText("Find Jobs");
        btn_find_jobs2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_find_jobs2.setFocusPainted(false);
        btn_find_jobs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find_jobs2ActionPerformed(evt);
            }
        });
        publishJobpanel.add(btn_find_jobs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        btn_manage2.setBackground(new java.awt.Color(204, 153, 0));
        btn_manage2.setText("Manage Jobs");
        btn_manage2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_manage2.setFocusPainted(false);
        btn_manage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage2ActionPerformed(evt);
            }
        });
        publishJobpanel.add(btn_manage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, 30));

        Jobspan.addTab("Publis", publishJobpanel);

        managePublished.setBackground(new java.awt.Color(255, 255, 255));
        managePublished.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageJobLable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        manageJobLable.setText("Manage Jobs");
        managePublished.add(manageJobLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btn_find_jobs3.setBackground(new java.awt.Color(204, 153, 0));
        btn_find_jobs3.setText("Find Jobs");
        btn_find_jobs3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_find_jobs3.setFocusPainted(false);
        btn_find_jobs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find_jobs3ActionPerformed(evt);
            }
        });
        managePublished.add(btn_find_jobs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        btn_publishjob3.setBackground(new java.awt.Color(204, 153, 0));
        btn_publishjob3.setText("Publish Jobs");
        btn_publishjob3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_publishjob3.setFocusPainted(false);
        btn_publishjob3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_publishjob3ActionPerformed(evt);
            }
        });
        managePublished.add(btn_publishjob3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, 30));

        deleteJobTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Id", "Job Title", "Job Type", "Job Role", "Technologeis", "Contact No"
            }
        ));
        jScrollPane2.setViewportView(deleteJobTable);

        managePublished.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 740, 170));

        deleteJobId_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteJobId_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deleteJobId_txtKeyTyped(evt);
            }
        });
        managePublished.add(deleteJobId_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 420, 30));

        job_delete_labal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        job_delete_labal.setText("Job Id");
        managePublished.add(job_delete_labal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, 30));

        btn_delete_job.setBackground(new java.awt.Color(204, 153, 0));
        btn_delete_job.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_delete_job.setText("DELETE ");
        btn_delete_job.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_delete_job.setFocusPainted(false);
        btn_delete_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_jobActionPerformed(evt);
            }
        });
        managePublished.add(btn_delete_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 120, 40));

        deletepublishedLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletepublishedLable.setText("Delete Published Job");
        managePublished.add(deletepublishedLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        Jobspan.addTab("manege", managePublished);

        mainPan.addTab("JOBS", Jobspan);

        ProgressPan.setBackground(new java.awt.Color(255, 255, 255));
        ProgressPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressLable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        progressLable.setText("Dev Go Progress");
        ProgressPan.add(progressLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        progress_text_area.setColumns(20);
        progress_text_area.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        progress_text_area.setRows(5);
        jScrollPane15.setViewportView(progress_text_area);

        ProgressPan.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 410, 450));

        btn_print.setBackground(new java.awt.Color(204, 153, 0));
        btn_print.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_print.setText("PRINT");
        btn_print.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_print.setFocusPainted(false);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        ProgressPan.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 150, 50));

        progressNofQAskLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        progressNofQAskLbl.setText("Number Of Questions Asked");
        ProgressPan.add(progressNofQAskLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        ProgressNofAsubLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProgressNofAsubLbl.setText("Number Of  Answers Submited");
        ProgressPan.add(ProgressNofAsubLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        ProgressForQaskLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProgressForQaskLbl.setText("Points For Questions   Asked");
        ProgressPan.add(ProgressForQaskLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 30));

        ProgressPForASubLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProgressPForASubLbl.setText("Points For Answers Submited");
        ProgressPan.add(ProgressPForASubLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));

        totPointLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totPointLbl.setText("Total Points Earned");
        ProgressPan.add(totPointLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, 30));
        ProgressPan.add(txt_nOFqAsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 90, 30));
        ProgressPan.add(txt_nOFaSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 90, 30));
        ProgressPan.add(txt_pointForQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 90, 30));
        ProgressPan.add(txt_pointForAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 90, 30));
        ProgressPan.add(txt_total_points, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 90, 30));

        mainPan.addTab("progress", ProgressPan);

        Settings.setBackground(new java.awt.Color(255, 255, 255));
        Settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Settings");
        Settings.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Profile Change");
        Settings.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        setteingfname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setteingfname.setText("First name");
        Settings.add(setteingfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        settingsSname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        settingsSname.setText("Second Name");
        Settings.add(settingsSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        SettingDob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SettingDob.setText("Date Of Birth");
        Settings.add(SettingDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        settingsEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        settingsEmail.setText("E-mail");
        Settings.add(settingsEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        settingusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        settingusername.setText("Username");
        Settings.add(settingusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("New password");
        Settings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("New Conform Password");
        Settings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtUpdateFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUpdateFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateFnameKeyTyped(evt);
            }
        });
        Settings.add(txtUpdateFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 330, -1));

        TxtUpdateSname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtUpdateSname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUpdateSnameKeyTyped(evt);
            }
        });
        Settings.add(TxtUpdateSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 330, -1));

        txtUpdateEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUpdateEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateEmailKeyTyped(evt);
            }
        });
        Settings.add(txtUpdateEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 330, -1));

        txtUpdateUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUpdateUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateUsernameKeyTyped(evt);
            }
        });
        Settings.add(txtUpdateUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 330, -1));

        btn_setting_update.setBackground(new java.awt.Color(204, 153, 0));
        btn_setting_update.setText("UPDATE");
        btn_setting_update.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_setting_update.setFocusPainted(false);
        btn_setting_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setting_updateActionPerformed(evt);
            }
        });
        Settings.add(btn_setting_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 140, 40));

        btn_settings_clear.setBackground(new java.awt.Color(204, 153, 0));
        btn_settings_clear.setText("CLEAR");
        btn_settings_clear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_settings_clear.setFocusPainted(false);
        btn_settings_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settings_clearActionPerformed(evt);
            }
        });
        Settings.add(btn_settings_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 140, 40));

        txtupadteConpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtupadteConpassKeyTyped(evt);
            }
        });
        Settings.add(txtupadteConpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 330, 30));

        txtupdatenewpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtupdatenewpasswordKeyTyped(evt);
            }
        });
        Settings.add(txtupdatenewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 330, 30));

        updatedob_picker.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Settings.add(updatedob_picker, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 210, 30));

        mainPan.addTab("setting", Settings);

        backpanel2.add(mainPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -50, 780, 530));

        backpanel1.add(backpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String UsId;

    public void getUserId(String UsId) {
        this.UsId = UsId;
    }
    private void btn_jobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jobsActionPerformed
        mainPan.setSelectedIndex(3);
        Jobspan.setSelectedIndex(0);
        DefaultTableModel brandTable = (DefaultTableModel) jobsTable.getModel();
        brandTable.setRowCount(0);

        try {
            Jobs j1 = new Jobs();
            ResultSet rs = j1.showJob();

            while (rs.next()) {

                String job_title2 = String.valueOf(rs.getString("Job_title"));
                String job_type = String.valueOf(rs.getString("Job_type"));
                String job_role = String.valueOf(rs.getString("Role"));
                String job_tech = String.valueOf(rs.getString("Tech"));
                String job_tele2 = String.valueOf(rs.getInt("TelePhone"));

                String tbData[] = {job_title2, job_type, job_role, job_tech, job_tele2};
                DefaultTableModel tablejobs = (DefaultTableModel) jobsTable.getModel();

                tablejobs.addRow(tbData);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_jobsActionPerformed

    private void btn_publishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_publishActionPerformed
        Jobspan.setSelectedIndex(1);
    }//GEN-LAST:event_btn_publishActionPerformed

    private void btn_find_jobs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find_jobs2ActionPerformed
        Jobspan.setSelectedIndex(0);
        DefaultTableModel brandTable = (DefaultTableModel) jobsTable.getModel();
        brandTable.setRowCount(0);

        try {
            Jobs j1 = new Jobs();
            ResultSet rs = j1.showJob();

            while (rs.next()) {
                String job_title3 = String.valueOf(rs.getString("Job_title"));
                String job_type = String.valueOf(rs.getString("Job_type"));
                String job_role = String.valueOf(rs.getString("Role"));
                String job_tech = String.valueOf(rs.getString("Tech"));
                String job_tele3 = String.valueOf(rs.getInt("TelePhone"));

                String tbData[] = {job_title3, job_type, job_role, job_tech, job_tele3};
                DefaultTableModel tablejobs = (DefaultTableModel) jobsTable.getModel();

                tablejobs.addRow(tbData);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_find_jobs2ActionPerformed

    private void btn_job_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_job_clearActionPerformed

        job_title.setText("");
        cmd_job_type.setSelectedIndex(0);
        cmd_role.setSelectedIndex(0);
        cmd_tec.setSelectedIndex(0);
        job_tele.setText("");
    }//GEN-LAST:event_btn_job_clearActionPerformed

    private void btn_job_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_job_submitActionPerformed
        if (job_title.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Job title can not be Blank", "Warning", JOptionPane.WARNING_MESSAGE);
            job_title.grabFocus();
        } else if (cmd_job_type.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "select job Type", "Warning", JOptionPane.WARNING_MESSAGE);
            cmd_job_type.grabFocus();
        } else if (cmd_role.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "select job Role", "Warning", JOptionPane.WARNING_MESSAGE);
            cmd_role.grabFocus();
        } else if (cmd_tec.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "select Technologeis", "Warning", JOptionPane.WARNING_MESSAGE);
            cmd_tec.grabFocus();
        } else if (job_tele.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Telephone can not be Blank", "Warning", JOptionPane.WARNING_MESSAGE);
            job_tele.grabFocus();
        } else {
            PublishJob jobnew = new PublishJob(job_title.getText(), cmd_job_type.getSelectedItem().toString(), cmd_role.getSelectedItem().toString(), cmd_tec.getSelectedItem().toString(), job_tele.getText(), UsId);
            Jobs j1 = new Jobs();
            int i = j1.addJob(jobnew);

            if (i == 1) {

                JOptionPane.showMessageDialog(this, "Job publish Successful!", "Information", JOptionPane.INFORMATION_MESSAGE);
                job_title.setText("");
                cmd_job_type.setSelectedIndex(0);
                cmd_role.setSelectedIndex(0);
                cmd_tec.setSelectedIndex(0);
                job_tele.setText("");

            } else {

                JOptionPane.showMessageDialog(this, "Something went wrong.job publish Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                job_title.setText("");
                cmd_job_type.setSelectedIndex(0);
                cmd_role.setSelectedIndex(0);
                cmd_tec.setSelectedIndex(0);
                job_tele.setText("");
            }
        }
    }//GEN-LAST:event_btn_job_submitActionPerformed

    private void job_teleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_job_teleKeyTyped
        if (Character.isWhitespace(evt.getKeyChar()) || Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_job_teleKeyTyped

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        mainPan.setSelectedIndex(5);
    }//GEN-LAST:event_btn_settingsActionPerformed

    private void btn_ask_queActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ask_queActionPerformed
        mainPan.setSelectedIndex(0);
        AskquestionPan.setSelectedIndex(0);
    }//GEN-LAST:event_btn_ask_queActionPerformed

    private void btn_queActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_queActionPerformed
        mainPan.setSelectedIndex(1);
        QuestionsPan.setSelectedIndex(0);

        DefaultTableModel brandTable = (DefaultTableModel) QuesTable.getModel();
        brandTable.setRowCount(0);

        try {
            ManageQuestions mq2 = new ManageQuestions();
            ResultSet rs = mq2.showQuestions(UsId);

            while (rs.next()) {

                String que_id;
                que_id = String.valueOf(rs.getString("Que_Id"));
                String que_title = String.valueOf(rs.getString("Que_Title"));
                String que_tag = String.valueOf(rs.getString("TechTag"));
                String que_publish = String.valueOf(rs.getString("submit_date"));

                String tbData[] = {que_id, que_title, que_tag, que_publish};
                DefaultTableModel tableQues = (DefaultTableModel) QuesTable.getModel();

                tableQues.addRow(tbData);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_queActionPerformed

    private void btn_tagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tagsActionPerformed
        mainPan.setSelectedIndex(2);
        Tagspan.setSelectedIndex(0);
    }//GEN-LAST:event_btn_tagsActionPerformed

    private void btn_manage_jobs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_jobs1ActionPerformed
        Jobspan.setSelectedIndex(2);
        DefaultTableModel brandTable = (DefaultTableModel) deleteJobTable.getModel();
        brandTable.setRowCount(0);
        try {
            Jobs j1 = new Jobs();
            ResultSet rs = j1.manageJobShow(UsId);

            while (rs.next()) {

                String job_id = String.valueOf(rs.getString("Job_id"));
                String job_title4 = String.valueOf(rs.getString("Job_title"));
                String job_type = String.valueOf(rs.getString("Job_type"));
                String job_role = String.valueOf(rs.getString("Role"));
                String job_tech = String.valueOf(rs.getString("Tech"));
                String job_tele4 = String.valueOf(rs.getInt("TelePhone"));

                String tbData[] = {job_id, job_title4, job_type, job_role, job_tech, job_tele4};
                DefaultTableModel tablejobs = (DefaultTableModel) deleteJobTable.getModel();

                tablejobs.addRow(tbData);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_manage_jobs1ActionPerformed

    private void btn_manage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage2ActionPerformed
        Jobspan.setSelectedIndex(2);
        DefaultTableModel brandTable = (DefaultTableModel) deleteJobTable.getModel();
        brandTable.setRowCount(0);
        try {
            Jobs j1 = new Jobs();
            ResultSet rs = j1.manageJobShow(UsId);

            while (rs.next()) {

                String job_id = String.valueOf(rs.getString("Job_id"));
                String job_title5 = String.valueOf(rs.getString("Job_title"));
                String job_type = String.valueOf(rs.getString("Job_type"));
                String job_role = String.valueOf(rs.getString("Role"));
                String job_tech = String.valueOf(rs.getString("Tech"));
                String job_tele5 = String.valueOf(rs.getInt("TelePhone"));

                String tbData[] = {job_id, job_title5, job_type, job_role, job_tech, job_tele5};
                DefaultTableModel tablejobs = (DefaultTableModel) deleteJobTable.getModel();

                tablejobs.addRow(tbData);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_manage2ActionPerformed

    private void btn_find_jobs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find_jobs3ActionPerformed
        Jobspan.setSelectedIndex(0);
        DefaultTableModel brandTable = (DefaultTableModel) jobsTable.getModel();
        brandTable.setRowCount(0);

        try {
            Jobs j1 = new Jobs();
            ResultSet rs = j1.showJob();

            while (rs.next()) {

                String job_title6 = String.valueOf(rs.getString("Job_title"));
                String job_type = String.valueOf(rs.getString("Job_type"));
                String job_role = String.valueOf(rs.getString("Role"));
                String job_tech = String.valueOf(rs.getString("Tech"));
                String job_tele6 = String.valueOf(rs.getInt("TelePhone"));

                String tbData[] = {job_title6, job_type, job_role, job_tech, job_tele6};
                DefaultTableModel tablejobs = (DefaultTableModel) jobsTable.getModel();

                tablejobs.addRow(tbData);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_find_jobs3ActionPerformed

    private void btn_publishjob3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_publishjob3ActionPerformed
        Jobspan.setSelectedIndex(1);
    }//GEN-LAST:event_btn_publishjob3ActionPerformed

    private void deleteJobId_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteJobId_txtKeyTyped

        if (Character.isWhitespace(evt.getKeyChar()) || Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_deleteJobId_txtKeyTyped

    private void btn_delete_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_jobActionPerformed
        try {
            if (deleteJobId_txt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Job Id can not be Blank", "Warning", JOptionPane.WARNING_MESSAGE);
                deleteJobId_txt.grabFocus();
            } else {
                Jobs j2 = new Jobs();
                int i = j2.deleteJob(deleteJobId_txt.getText(), UsId);

                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Job Delete Successful!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    deleteJobId_txt.setText("");

                    DefaultTableModel brandTable = (DefaultTableModel) deleteJobTable.getModel();
                    brandTable.setRowCount(0);
                    Jobs j1 = new Jobs();
                    ResultSet rs = j1.showJob();

                    while (rs.next()) {
                        String job_id = String.valueOf(rs.getString("Job_id"));
                        String job_titl = String.valueOf(rs.getString("Job_title"));
                        String job_type = String.valueOf(rs.getString("Job_type"));
                        String job_role = String.valueOf(rs.getString("Role"));
                        String job_tech = String.valueOf(rs.getString("Tech"));
                        String job_tel = String.valueOf(rs.getInt("TelePhone"));

                        String tbData[] = {job_id, job_titl, job_type, job_role, job_tech, job_tel};
                        DefaultTableModel tablejobs = (DefaultTableModel) deleteJobTable.getModel();

                        tablejobs.addRow(tbData);

                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.job Delete Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_delete_jobActionPerformed

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        int opt = JOptionPane.showConfirmDialog(this, "Do you want to log out?", "Log Out", JOptionPane.YES_OPTION);

        if (opt == 0) {
            Userlogin u2 = new Userlogin();
            u2.setVisible(true);
            this.dispose();

        }

    }//GEN-LAST:event_btn_logOutActionPerformed

    private void btn_settings_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settings_clearActionPerformed
        txtUpdateFname.setText("");
        TxtUpdateSname.setText("");
        updatedob_picker.setDate(null);
        txtUpdateEmail.setText("");
        txtUpdateUsername.setText("");
        txtupdatenewpassword.setText("");
        txtupadteConpass.setText("");

    }//GEN-LAST:event_btn_settings_clearActionPerformed

    private void txtUpdateFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateFnameKeyTyped
        if (Character.isWhitespace(evt.getKeyChar()) || Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUpdateFnameKeyTyped

    private void TxtUpdateSnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUpdateSnameKeyTyped
        if (Character.isWhitespace(evt.getKeyChar()) || Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtUpdateSnameKeyTyped

    private void txtUpdateEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateEmailKeyTyped
        if (Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUpdateEmailKeyTyped

    private void txtUpdateUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateUsernameKeyTyped
        if (Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUpdateUsernameKeyTyped

    private void txtupdatenewpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtupdatenewpasswordKeyTyped
        if (Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtupdatenewpasswordKeyTyped

    private void txtupadteConpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtupadteConpassKeyTyped
        if (Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtupadteConpassKeyTyped

    private void btn_setting_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setting_updateActionPerformed
        try {

            if (txtUpdateFname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "First Name Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                txtUpdateFname.grabFocus();
            } else if (TxtUpdateSname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Second Name Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                TxtUpdateSname.grabFocus();
            } else if (updatedob_picker.getDate() == null) {
                JOptionPane.showMessageDialog(this, "select Date of Birth", "Warning", JOptionPane.WARNING_MESSAGE);
                updatedob_picker.grabFocus();
            } else if (txtUpdateEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                txtUpdateEmail.grabFocus();
            } else if (txtUpdateUsername.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                txtUpdateUsername.grabFocus();
            } else if (txtupdatenewpassword.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "New Password Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                txtupdatenewpassword.grabFocus();
            } else if (txtupadteConpass.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "New Conform Password Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                txtupadteConpass.grabFocus();
            } else if (!Arrays.equals(txtupdatenewpassword.getPassword(), txtupadteConpass.getPassword())) {
                JOptionPane.showMessageDialog(this, "Please make sure your passwords match", "Warning", JOptionPane.WARNING_MESSAGE);
                txtupadteConpass.grabFocus();
                txtupdatenewpassword.setText("");
                txtupadteConpass.setText("");
            } else {
                UserInput ui;
                String conpsword = new String(txtupadteConpass.getPassword());
                ui = new UserInput(txtUpdateFname.getText(), TxtUpdateSname.getText(), updatedob_picker.getDate(), txtUpdateEmail.getText(), txtUpdateUsername.getText(), conpsword);
                UserData ud = new UserData();
                int i = ud.updateuserdata(ui, UsId);

                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Profile Update  Successful! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtUpdateFname.setText("");
                    TxtUpdateSname.setText("");
                    updatedob_picker.setDate(null);
                    txtUpdateEmail.setText("");
                    txtUpdateUsername.setText("");
                    txtupdatenewpassword.setText("");
                    txtupadteConpass.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.Profile Update Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtUpdateFname.setText("");
                    TxtUpdateSname.setText("");
                    updatedob_picker.setDate(null);
                    txtUpdateEmail.setText("");
                    txtUpdateUsername.setText("");
                    txtupdatenewpassword.setText("");
                    txtupadteConpass.setText("");
                }

            }

        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_setting_updateActionPerformed

    private void btn_questionSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_questionSubmitActionPerformed
        try {
            if (questionTitletxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Question Title Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                questionTitletxt.grabFocus();
            } else if (cmd_questechtag.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Select Technologeis Tags", "Warning", JOptionPane.WARNING_MESSAGE);
                cmd_questechtag.grabFocus();
            } else if (questionArea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Question Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                questionArea.grabFocus();
            } else {

                Questions que1;
                Date date = new Date();
                que1 = new Questions(questionTitletxt.getText(), cmd_questechtag.getSelectedItem().toString(), questionArea.getText(), date, UsId);
                ManageQuestions mq1 = new ManageQuestions();
                int i = mq1.submitQuestion(que1);

                if (i == 1) {
                    int QueMax = 0;
                    ManageProgress mp1 = new ManageProgress();
                    ResultSet rs4 = mp1.GetProgrss(UsId);

                    while (rs4.next()) {
                        QueMax = rs4.getInt("Num_Of_Que");
                    }
                    int newQue = QueMax + 1;

                    mp1.setQueProgress(UsId, newQue);

                    JOptionPane.showMessageDialog(this, "Question Submit  Successful! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                    questionTitletxt.setText("");
                    cmd_questechtag.setSelectedIndex(0);
                    questionArea.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.Question Submit Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    questionTitletxt.setText("");
                    cmd_questechtag.setSelectedIndex(0);
                    questionArea.setText("");
                }

            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_questionSubmitActionPerformed

    private void btn_questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_questionActionPerformed
        questionTitletxt.setText("");
        cmd_questechtag.setSelectedIndex(0);
        questionArea.setText("");
    }//GEN-LAST:event_btn_questionActionPerformed

    private void btn_tags_srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tags_srchActionPerformed
        if (cmd_TechTag.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Select Technologeis Tags", "Warning", JOptionPane.WARNING_MESSAGE);
            cmd_TechTag.grabFocus();

        } else {
            DefaultTableModel brandTable = (DefaultTableModel) tagsTable.getModel();
            brandTable.setRowCount(0);

            try {
                ManageQuestions mq3 = new ManageQuestions();
                ResultSet rs = mq3.showtagsQuestion(cmd_TechTag.getSelectedItem().toString(), UsId);

                while (rs.next()) {

                    String que_id;
                    que_id = String.valueOf(rs.getString("Que_Id"));
                    String que_title = String.valueOf(rs.getString("Que_Title"));
                    String que_tag = String.valueOf(rs.getString("TechTag"));
                    String que_publish = String.valueOf(rs.getString("submit_date"));

                    String tbData[] = {que_id, que_title, que_tag, que_publish};
                    DefaultTableModel tableQues = (DefaultTableModel) tagsTable.getModel();

                    tableQues.addRow(tbData);

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_btn_tags_srchActionPerformed

    private void btn_manage_queActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_queActionPerformed
        AskquestionPan.setSelectedIndex(1);

        DefaultTableModel brandTable = (DefaultTableModel) manageQueTable.getModel();
        brandTable.setRowCount(0);
        DefaultTableModel brandTable1 = (DefaultTableModel) askQueReplyTable.getModel();
        brandTable1.setRowCount(0);
        try {
            ManageQuestions mq3 = new ManageQuestions();
            ResultSet rs = mq3.showMyQuestion(UsId);

            while (rs.next()) {

                String que_title = String.valueOf(rs.getString("Que_Title"));
                String que_techTag = String.valueOf(rs.getString("TechTag"));
                String que_pub_date = String.valueOf(rs.getString("submit_date"));

                String tbData[] = {que_title, que_techTag, que_pub_date};
                DefaultTableModel tablejobs = (DefaultTableModel) manageQueTable.getModel();

                tablejobs.addRow(tbData);

            }

            ManageAnswer ma1 = new ManageAnswer();
            ResultSet rs1 = ma1.showAnswer(UsId);

            while (rs1.next()) {

                String ans_Id = String.valueOf(rs1.getString("Answer_Id"));
                String ans_queTitle = String.valueOf(rs1.getString("Que_Title"));
                String answertag = String.valueOf(rs1.getString("TechTag"));
                String repliedDate = String.valueOf(rs1.getString("Publish_Date"));

                String tbData[] = {ans_Id, ans_queTitle, answertag, repliedDate};
                DefaultTableModel tableAns = (DefaultTableModel) askQueReplyTable.getModel();

                tableAns.addRow(tbData);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_manage_queActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AskquestionPan.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_que_Reply_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_que_Reply_submitActionPerformed
        try {
            if (txtAreaQueReplyAnser.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Answer Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                txtAreaQueReplyAnser.grabFocus();
            } else {
                ManageQuestions mq6 = new ManageQuestions();
                ResultSet rs = mq6.getQuePublisherID(selectQueId);
                String quePublisher = null;

                while (rs.next()) {
                    quePublisher = String.valueOf(rs.getString("publisher_Id"));
                }
                Date getDate = new Date();
                Answer A2 = new Answer(selectQueId, txtAreaQueReplyAnser.getText(), getDate, UsId, quePublisher);
                ManageAnswer Ma1 = new ManageAnswer();
                int i = Ma1.SubmitAnswer(A2);

                if (i == 1) {

                    int AnsMax = 0;
                    ManageProgress mp1 = new ManageProgress();
                    ResultSet rs4 = mp1.GetProgrss(UsId);

                    while (rs4.next()) {
                        AnsMax = rs4.getInt("Num_Of_Ans");
                    }
                    int newAns = AnsMax + 1;

                    mp1.setAnswProgress(UsId, newAns);
                    JOptionPane.showMessageDialog(this, "Answer Submit  Successful! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtAreaQueReplyAnser.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.Answer Submit  Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtAreaQueReplyAnser.setText("");
                }
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btn_que_Reply_submitActionPerformed

    private void btn_queReplyClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_queReplyClearActionPerformed
        txtAreaQueReplyAnser.setText("");
    }//GEN-LAST:event_btn_queReplyClearActionPerformed

    private void btn_TagsReplyClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TagsReplyClearActionPerformed
        txtAreaTagsReplyAnswer.setText("");
    }//GEN-LAST:event_btn_TagsReplyClearActionPerformed

    private void btn_TagsReplySubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TagsReplySubmitActionPerformed
        try {
            if (txtAreaTagsReplyAnswer.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Answer Can not be null", "Warning", JOptionPane.WARNING_MESSAGE);
                txtAreaTagsReplyAnswer.grabFocus();
            } else {

                ManageQuestions mq5 = new ManageQuestions();
                ResultSet rs = mq5.getQuePublisherID(selectQueId);
                String quePublisher = null;

                while (rs.next()) {
                    quePublisher = String.valueOf(rs.getString("publisher_Id"));
                }
                Date getDate = new Date();
                Answer A1 = new Answer(selectQueId, txtAreaTagsReplyAnswer.getText(), getDate, UsId, quePublisher);
                ManageAnswer Ma1 = new ManageAnswer();
                int i = Ma1.SubmitAnswer(A1);

                if (i == 1) {
                    int AnsMax = 0;
                    ManageProgress mp1 = new ManageProgress();
                    ResultSet rs4 = mp1.GetProgrss(UsId);

                    while (rs4.next()) {
                        AnsMax = rs4.getInt("Num_Of_Ans");
                    }
                    int newAns = AnsMax + 1;

                    mp1.setAnswProgress(UsId, newAns);

                    JOptionPane.showMessageDialog(this, "Answer Submit  Successful! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtAreaQueReplyAnser.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong.Answer Submit  Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtAreaQueReplyAnser.setText("");
                }
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btn_TagsReplySubmitActionPerformed
    public String selectQueId;

    @SuppressWarnings("empty-statement")
    private void QuesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuesTableMouseClicked

        int selectRow = QuesTable.getSelectedRow();
        TableModel model = QuesTable.getModel();
        QuestionsPan.setSelectedIndex(1);
        selectQueId = model.getValueAt(selectRow, 0).toString();
        txtQueReplyTags.setEditable(false);
        txtAreaQueReplyQue.setEditable(false);

        try {

            ManageQuestions mq4 = new ManageQuestions();
            ResultSet rs = mq4.loadReplyQustion(selectQueId);

            while (rs.next()) {
                String replyTag = String.valueOf(rs.getString("TechTag"));
                String replyQue = String.valueOf(rs.getString("Questions"));

                txtQueReplyTags.setText(replyTag);
                txtAreaQueReplyQue.setText(replyQue);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_QuesTableMouseClicked

    private void btn_queReplyBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_queReplyBackActionPerformed
        QuestionsPan.setSelectedIndex(0);
    }//GEN-LAST:event_btn_queReplyBackActionPerformed

    private void tagsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagsTableMouseClicked
        int selectRow = QuesTable.getSelectedRow();
        TableModel model = QuesTable.getModel();
        Tagspan.setSelectedIndex(1);
        selectQueId = model.getValueAt(selectRow, 0).toString();
        txtTagsReplytechTags.setEditable(false);
        txtAreaTagReplyQue.setEditable(false);

        try {

            ManageQuestions mq4 = new ManageQuestions();
            ResultSet rs = mq4.loadReplyQustion(selectQueId);

            while (rs.next()) {
                String replyTag = String.valueOf(rs.getString("TechTag"));
                String replyQue = String.valueOf(rs.getString("Questions"));

                txtTagsReplytechTags.setText(replyTag);
                txtAreaTagReplyQue.setText(replyQue);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tagsTableMouseClicked

    private void btn_tagsReplyBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tagsReplyBackActionPerformed
        Tagspan.setSelectedIndex(0);
    }//GEN-LAST:event_btn_tagsReplyBackActionPerformed
    public String SelectAnsId;
    private void askQueReplyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_askQueReplyTableMouseClicked

        int selectRow = askQueReplyTable.getSelectedRow();
        TableModel model = askQueReplyTable.getModel();
        AskquestionPan.setSelectedIndex(2);
        
        SelectAnsId = model.getValueAt(selectRow, 0).toString();
        txt_askQueReplyque.setEditable(false);
        txt_askQueReplyAnswer.setEditable(false);

        try {

            ManageAnswer ma5 = new ManageAnswer();
            ResultSet rs2 = ma5.loadAnwers(SelectAnsId);

            while (rs2.next()) {
                String replyQue = String.valueOf(rs2.getString("Questions"));
                String replyAnw;
                replyAnw = String.valueOf(rs2.getString("Answer"));
                
                txt_askQueReplyAnswer.setText(replyAnw);
                txt_askQueReplyque.setText(replyQue);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_askQueReplyTableMouseClicked

    private void askQueGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askQueGoBackActionPerformed
        AskquestionPan.setSelectedIndex(1);
    }//GEN-LAST:event_askQueGoBackActionPerformed

    private void btn_progressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_progressActionPerformed
        mainPan.setSelectedIndex(4);
        txt_nOFqAsk.setEditable(false);
        txt_nOFaSubmit.setEditable(false);
        txt_pointForQue.setEditable(false);
        txt_pointForAns.setEditable(false);
        txt_total_points.setEditable(false);
        progress_text_area.setEditable(false);
        try {
            int nofQue = 0;
            int nofAns = 0;
            ManageProgress mp2 = new ManageProgress();
            ResultSet rs5 = mp2.GetProgrss(UsId);

            while (rs5.next()) {
                nofQue = rs5.getInt("Num_Of_Que");
                nofAns = rs5.getInt("Num_Of_Ans");
            }

            txt_nOFqAsk.setText(String.valueOf(nofQue));
            txt_nOFaSubmit.setText(String.valueOf(nofAns));
            txt_pointForQue.setText(String.valueOf(nofQue * 5));
            txt_pointForAns.setText(String.valueOf(nofAns * 10));
            txt_total_points.setText(String.valueOf((nofQue * 5) + (nofAns * 10)));
            Date getcurrent = new Date();
            java.sql.Date sqlDate = new java.sql.Date(getcurrent.getTime());

            String Fname = null;
            String Sname = null;
            String Email = null;

            UserData mp1 = new UserData();
            ResultSet rs6 = mp1.showUser(UsId);
            while (rs6.next()) {
                Fname = String.valueOf(rs6.getString("First_Name"));
                Sname = String.valueOf(rs6.getString("Second_Name"));
                Email = String.valueOf(rs6.getString("Email"));
            }
            progress_text_area.setText("");
            progress_text_area.append("  \t\t       Dev-Go\n"
                    + "           ===Developers Q & A Platform===\n"
                    + "\n"
                    + "User Details"
                    + "\n\n"
                    + "\tFirst Name: " + Fname + " \n"
                    + "\tSecond Name: " + Sname + " \n"
                    + "\tE-mail: " + Email + " \n"
                    + "\n"
                    + "Dev-Go Progress"
                    + "\n\n"
                    + "\tNumber Of Questions Asked: " + txt_nOFqAsk.getText() + "\n"
                    + "\tNumber Of  Answers Submited: " + txt_nOFaSubmit.getText() + " \n"
                    + "\tPoints For Questions Asked: " + txt_pointForQue.getText() + "\n"
                    + "\tPoints For Answers Submited: " + txt_pointForAns.getText() + "\n"
                    + "\tTotal Points Earned: " + txt_total_points.getText() + "\n"
                    + "\n"
                    + "\n"
                    + "\t\tCertificate by Dev-Go\n"
                    + "\t\t     " + sqlDate.toString() + "\n");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_progressActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try {
            if (progress_text_area.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Progress Documnet Blank.Please Try again later", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                progress_text_area.print();
            }

        } catch (HeadlessException | PrinterException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AskQueReplylbl;
    private javax.swing.JLabel AskQueReplyqueLbl;
    private javax.swing.JTabbedPane AskquestionPan;
    private javax.swing.JTabbedPane Jobspan;
    private javax.swing.JLabel ProgressForQaskLbl;
    private javax.swing.JLabel ProgressNofAsubLbl;
    private javax.swing.JLabel ProgressPForASubLbl;
    private javax.swing.JPanel ProgressPan;
    private javax.swing.JPanel QueReplyPan;
    private javax.swing.JPanel QuesPan;
    private javax.swing.JTable QuesTable;
    private javax.swing.JTabbedPane QuestionsPan;
    private javax.swing.JLabel SettingDob;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel TagQuePan;
    private javax.swing.JPanel TagReplyPan;
    private javax.swing.JLabel Tagslabel1;
    private javax.swing.JTabbedPane Tagspan;
    private javax.swing.JTextField TxtUpdateSname;
    private javax.swing.JPanel askMangeQuesPan;
    private javax.swing.JButton askQueGoBack;
    private javax.swing.JPanel askQuePan;
    private javax.swing.JLabel askQueReplyAns;
    private javax.swing.JTable askQueReplyTable;
    private javax.swing.JPanel askQueReplypan;
    private javax.swing.JPanel backpanel1;
    private javax.swing.JPanel backpanel2;
    private javax.swing.JButton btn_TagsReplyClear;
    private javax.swing.JButton btn_TagsReplySubmit;
    private javax.swing.JButton btn_ask_que;
    private javax.swing.JButton btn_delete_job;
    private javax.swing.JButton btn_find_jobs2;
    private javax.swing.JButton btn_find_jobs3;
    private javax.swing.JButton btn_job_clear;
    private javax.swing.JButton btn_job_submit;
    private javax.swing.JButton btn_jobs;
    private javax.swing.JButton btn_logOut;
    private javax.swing.JButton btn_manage2;
    private javax.swing.JButton btn_manage_jobs1;
    private javax.swing.JButton btn_manage_que;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_progress;
    private javax.swing.JButton btn_publish;
    private javax.swing.JButton btn_publishjob3;
    private javax.swing.JButton btn_que;
    private javax.swing.JButton btn_queReplyBack;
    private javax.swing.JButton btn_queReplyClear;
    private javax.swing.JButton btn_que_Reply_submit;
    private javax.swing.JButton btn_question;
    private javax.swing.JButton btn_questionSubmit;
    private javax.swing.JButton btn_setting_update;
    private javax.swing.JButton btn_settings;
    private javax.swing.JButton btn_settings_clear;
    private javax.swing.JButton btn_tags;
    private javax.swing.JButton btn_tagsReplyBack;
    private javax.swing.JButton btn_tags_srch;
    private javax.swing.JComboBox<String> cmd_TechTag;
    private javax.swing.JComboBox<String> cmd_job_type;
    private javax.swing.JComboBox<String> cmd_questechtag;
    private javax.swing.JComboBox<String> cmd_role;
    private javax.swing.JComboBox<String> cmd_tec;
    private javax.swing.JTextField deleteJobId_txt;
    private javax.swing.JTable deleteJobTable;
    private javax.swing.JLabel deletepublishedLable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel jobRoleLbl;
    private javax.swing.JLabel jobTypeLbl;
    private javax.swing.JLabel job_delete_labal;
    private javax.swing.JTextField job_tele;
    private javax.swing.JTextField job_title;
    private javax.swing.JLabel jobsLable;
    private javax.swing.JPanel jobsPanel;
    private javax.swing.JTable jobsTable;
    private javax.swing.JLabel jobtitleLbl;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JTabbedPane mainPan;
    private javax.swing.JLabel manageJobLable;
    private javax.swing.JPanel managePublished;
    private javax.swing.JTable manageQueTable;
    private javax.swing.JLabel progressLable;
    private javax.swing.JLabel progressNofQAskLbl;
    private javax.swing.JTextArea progress_text_area;
    private javax.swing.JPanel publishJobpanel;
    private javax.swing.JLabel publishJobs;
    private javax.swing.JLabel queRepAnsLbl;
    private javax.swing.JLabel queReplyQueLbl;
    private javax.swing.JLabel queReplyTagLable;
    private javax.swing.JTextArea questionArea;
    private javax.swing.JTextField questionTitletxt;
    private javax.swing.JLabel setteingfname;
    private javax.swing.JLabel settingsEmail;
    private javax.swing.JLabel settingsSname;
    private javax.swing.JLabel settingusername;
    private javax.swing.JLabel tagReplyQueLbl;
    private javax.swing.JLabel tagsReplyAnserLbl;
    private javax.swing.JLabel tagsReplytechTagLbl;
    private javax.swing.JTable tagsTable;
    private javax.swing.JLabel techLbl;
    private javax.swing.JLabel teleLbl;
    private javax.swing.JLabel totPointLbl;
    private javax.swing.JTextArea txtAreaQueReplyAnser;
    private javax.swing.JTextArea txtAreaQueReplyQue;
    private javax.swing.JTextArea txtAreaTagReplyQue;
    private javax.swing.JTextArea txtAreaTagsReplyAnswer;
    private javax.swing.JTextField txtQueReplyTags;
    private javax.swing.JTextField txtTagsReplytechTags;
    private javax.swing.JTextField txtUpdateEmail;
    private javax.swing.JTextField txtUpdateFname;
    private javax.swing.JTextField txtUpdateUsername;
    private javax.swing.JTextArea txt_askQueReplyAnswer;
    private javax.swing.JTextArea txt_askQueReplyque;
    private javax.swing.JTextField txt_nOFaSubmit;
    private javax.swing.JTextField txt_nOFqAsk;
    private javax.swing.JTextField txt_pointForAns;
    private javax.swing.JTextField txt_pointForQue;
    private javax.swing.JTextField txt_total_points;
    private javax.swing.JPasswordField txtupadteConpass;
    private javax.swing.JPasswordField txtupdatenewpassword;
    private com.toedter.calendar.JDateChooser updatedob_picker;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel DefaultTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
