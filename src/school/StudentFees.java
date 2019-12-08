/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashish Shahi
 */
public class StudentFees extends javax.swing.JInternalFrame {
         public static String x;
    /**
     * Creates new form JInternalFrame
     */
    public StudentFees() {
        initComponents();
        SelectStandard();
        x = "x";
        int a = Home.desktopPane.getWidth() - this.getWidth();
        int b = Home.desktopPane.getHeight() - this.getHeight();

        setLocation(a / 2, b / 2);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        section = new javax.swing.JComboBox<>();
        standards = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        student_name = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        enrollment_no = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("STUDENT FEES");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/school/images/favicon.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1186, 655));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel5.setBackground(new java.awt.Color(35, 46, 64));
        jPanel5.setPreferredSize(new java.awt.Dimension(1139, 145));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SECTION  :");

        section.setBackground(new java.awt.Color(35, 46, 64));
        section.setForeground(new java.awt.Color(255, 255, 255));
        section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        section.setToolTipText("");
        section.setBorder(null);
        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionActionPerformed(evt);
            }
        });

        standards.setBackground(new java.awt.Color(35, 46, 64));
        standards.setForeground(new java.awt.Color(255, 255, 255));
        standards.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        standards.setToolTipText("");
        standards.setBorder(null);
        standards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("STANDARD :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("STUDENT NAME :");

        student_name.setBackground(new java.awt.Color(35, 46, 64));
        student_name.setForeground(new java.awt.Color(255, 255, 255));
        student_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        student_name.setToolTipText("");
        student_name.setBorder(null);
        student_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_nameMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ENROLLMENT NO :");

        enrollment_no.setEditable(false);
        enrollment_no.setBackground(new java.awt.Color(35, 46, 64));
        enrollment_no.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        enrollment_no.setForeground(new java.awt.Color(255, 255, 255));
        enrollment_no.setBorder(null);
        enrollment_no.setCaretColor(new java.awt.Color(255, 255, 255));
        enrollment_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrollment_noMouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(35, 46, 64));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(229, 83, 70));
        jLabel14.setText("*");

        jLabel15.setBackground(new java.awt.Color(35, 46, 64));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(229, 83, 70));
        jLabel15.setText("*");

        jLabel16.setBackground(new java.awt.Color(35, 46, 64));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(229, 83, 70));
        jLabel16.setText("*");

        jLabel17.setBackground(new java.awt.Color(35, 46, 64));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(229, 83, 70));
        jLabel17.setText("*");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(standards, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(enrollment_no))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(section, 0, 193, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(414, 414, 414))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standards, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enrollment_no, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addContainerGap(524, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
         x = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        student_name.removeAllItems();
        student_name.addItem("Select Student Name");
        /*String standard = search_standard.getSelectedItem().toString();
        String sections = search_section.getSelectedItem().toString();
        SelectStudent(standard, sections"A");*/
        /*search_studentname.removeAllItems();
        String standard = search_standard.getSelectedItem().toString();
        String sections = search_section.getSelectedItem().toString();
        SelectStudent(standard, sections"A");
        //SelectStudent("ashish", "kumar");*/
    }//GEN-LAST:event_sectionActionPerformed

    private void standardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardsActionPerformed
        section.removeAllItems();
        String standard = standards.getSelectedItem().toString();
        SelectSection(standard);
        //search_studentname.removeAllItems();
        //String standard = search_standard.getSelectedItem().toString();
        //String sections = search_section.getSelectedItem().toString();
        //SelectStudent(standard, sections/*"A"*/);
    }//GEN-LAST:event_standardsActionPerformed

    private void student_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_nameMouseClicked
        student_name.removeAllItems();
        enrollment_no.setText("Click Here For View Enrollment No");
        String standard = standards.getSelectedItem().toString();
        String sections = section.getSelectedItem().toString();
        SelectStudent(standard, sections);
    }//GEN-LAST:event_student_nameMouseClicked

    private void enrollment_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrollment_noMouseClicked
        enrollment_no.setText("");
        String standard = standards.getSelectedItem().toString();
        String sections = section.getSelectedItem().toString();
        String name = student_name.getSelectedItem().toString();
        SelectStudent(standard, sections);
        GettingEnrollment(standard, sections, name);
    }//GEN-LAST:event_enrollment_noMouseClicked
    //Selecting Standard From Database
    public void SelectStandard(){
        try {
             Connection con = (Connection) DriverManager.getConnection(Config.DbUrl,Config.DbUser,Config.DbPass);
           Statement statement = con.createStatement();
           String selectedquery = "select standard from standard";
             ResultSet rs = statement.executeQuery(selectedquery);
             while(rs.next()){
                 standards.addItem(rs.getString("standard"));
                
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //close to Select Standard
//Start Select Section 
    public void SelectSection(String st){
        try {
             Connection con = (Connection) DriverManager.getConnection(Config.DbUrl,Config.DbUser,Config.DbPass);
           Statement statement = con.createStatement();
           String selectedquery = "select section from section where standard = '"+st+"' ";
             ResultSet rs = statement.executeQuery(selectedquery);
             while(rs.next()){
                 section.addItem(rs.getString("section"));
                 section.addItem(rs.getString("section"));
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //Start selecting Students.
    public void SelectStudent(String Standard ,String Section ){
        try {
            Connection con = (Connection) DriverManager.getConnection(Config.DbUrl,Config.DbUser,Config.DbPass);
            Statement statement = con.createStatement();
            String selectedquery = "select name from students where standard = '"+Standard+"' AND section = '"+Section+"' ORDER By name ASC";
//            String selectedquery ="select * from students where standard = '1st' OR section = 'A' ORDER By name ASC";
            ResultSet rs = statement.executeQuery(selectedquery);
            while(rs.next()){
                student_name.addItem(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
 public void GettingEnrollment(String Standard,String Section ,String Name)
    {
        try {
            Connection con = (Connection) DriverManager.getConnection(Config.DbUrl,Config.DbUser,Config.DbPass);
            Statement statement = con.createStatement();
            String selectedquery = "select enrollment_no from students where standard = '"+Standard+"' AND section = '"+Section+"' AND name = '"+Name+"'";
            ResultSet rs = statement.executeQuery(selectedquery);
            while(rs.next()){
                enrollment_no.setText(rs.getString("enrollment_no"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enrollment_no;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> section;
    private javax.swing.JComboBox<String> standards;
    private javax.swing.JComboBox<String> student_name;
    // End of variables declaration//GEN-END:variables
}