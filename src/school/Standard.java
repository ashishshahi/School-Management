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
public class Standard extends javax.swing.JInternalFrame {
         public static String x;
    /**
     * Creates new form JInternalFrame
     */
    public Standard() {
        initComponents();
         SelectStandard();//set standard in a drop down 
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

        Standard = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sectionsearch = new javax.swing.JButton();
        sectionname = new javax.swing.JComboBox<>();
        standardname = new javax.swing.JComboBox<>();
        standardsearch = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        stdname = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        stddrop = new javax.swing.JComboBox<>();
        secname = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        add2 = new javax.swing.JButton();
        clear3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("STANDARD ");
        setToolTipText("Add  And Search Academic Session");
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

        Standard.setPreferredSize(new java.awt.Dimension(1166, 583));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setForeground(new java.awt.Color(0, 39, 76));
        jTabbedPane4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTabbedPane4.setPreferredSize(new java.awt.Dimension(1146, 201));

        jPanel7.setBackground(new java.awt.Color(35, 46, 64));
        jPanel7.setPreferredSize(new java.awt.Dimension(1139, 145));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Standard Name :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Section Name :");

        sectionsearch.setBackground(new java.awt.Color(0, 177, 176));
        sectionsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sectionsearch.setForeground(new java.awt.Color(255, 255, 255));
        sectionsearch.setText("SEARCH SECTION");

        sectionname.setBackground(new java.awt.Color(35, 46, 64));
        sectionname.setForeground(new java.awt.Color(255, 255, 255));
        sectionname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        sectionname.setToolTipText("");
        sectionname.setBorder(null);

        standardname.setBackground(new java.awt.Color(35, 46, 64));
        standardname.setForeground(new java.awt.Color(255, 255, 255));
        standardname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        standardname.setToolTipText("");
        standardname.setBorder(null);
        standardname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardnameActionPerformed(evt);
            }
        });

        standardsearch.setBackground(new java.awt.Color(0, 177, 176));
        standardsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        standardsearch.setForeground(new java.awt.Color(255, 255, 255));
        standardsearch.setText("SEARCH STANDARD");
        standardsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(standardname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(standardsearch)
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sectionname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(sectionsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standardname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standardsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("SEARCH", jPanel7);

        jPanel8.setBackground(new java.awt.Color(35, 46, 64));
        jPanel8.setPreferredSize(new java.awt.Dimension(1139, 145));

        jPanel9.setBackground(new java.awt.Color(81, 78, 134));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "STANDARDS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Standard Name :");

        stdname.setBackground(new java.awt.Color(81, 78, 134));
        stdname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        stdname.setForeground(new java.awt.Color(255, 255, 255));
        stdname.setBorder(null);
        stdname.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel14.setBackground(new java.awt.Color(35, 46, 64));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(229, 83, 70));
        jLabel14.setText("*");

        add1.setBackground(new java.awt.Color(0, 177, 176));
        add1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        clear2.setBackground(new java.awt.Color(0, 177, 176));
        clear2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clear2.setForeground(new java.awt.Color(255, 255, 255));
        clear2.setText("CLEAR");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(stdname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stdname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(15, 106, 179));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "SECTIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Standard Name :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Section Name :");

        stddrop.setBackground(new java.awt.Color(15, 106, 179));
        stddrop.setForeground(new java.awt.Color(255, 255, 255));
        stddrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        stddrop.setToolTipText("");
        stddrop.setBorder(null);

        secname.setBackground(new java.awt.Color(15, 106, 179));
        secname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        secname.setForeground(new java.awt.Color(255, 255, 255));
        secname.setBorder(null);
        secname.setCaretColor(new java.awt.Color(255, 255, 255));

        add2.setBackground(new java.awt.Color(0, 177, 176));
        add2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add2.setForeground(new java.awt.Color(255, 255, 255));
        add2.setText("ADD");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        clear3.setBackground(new java.awt.Color(0, 177, 176));
        clear3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clear3.setForeground(new java.awt.Color(255, 255, 255));
        clear3.setText("CLEAR");
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3ActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(35, 46, 64));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(229, 83, 70));
        jLabel17.setText("*");

        jLabel18.setBackground(new java.awt.Color(35, 46, 64));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(229, 83, 70));
        jLabel18.setText("*");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6)
                            .addComponent(secname)
                            .addComponent(stddrop, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(clear3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stddrop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(secname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("ADD", jPanel8);

        javax.swing.GroupLayout StandardLayout = new javax.swing.GroupLayout(Standard);
        Standard.setLayout(StandardLayout);
        StandardLayout.setHorizontalGroup(
            StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
            .addGroup(StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE))
        );
        StandardLayout.setVerticalGroup(
            StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StandardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Standard, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Standard, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
         x = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void standardnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardnameActionPerformed
        sectionname.removeAllItems();
        String standard = standardname.getSelectedItem().toString();
        SelectSection(standard);
    }//GEN-LAST:event_standardnameActionPerformed

    private void standardsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardsearchActionPerformed
        //       String standard = standardname.getSelectedItem().toString();
        //        SelectSection(standard);
        //sectionname.removeAllItems();
    }//GEN-LAST:event_standardsearchActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        try {
            Connection con = (Connection) DriverManager.getConnection(Config.DbUrl,Config.DbUser,Config.DbPass);
            if(con != null){
                System.out.println("Connection Sucessfully");
            }
            String sql = "Insert Into standard (standard,status) values (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,stdname.getText().trim());
            pst.setString(2,"enabled");
            int rowsInserted = pst.executeUpdate();
            if(rowsInserted>0){
                JOptionPane.showMessageDialog(null, "Sucessfully Added.");
                stddrop.removeAllItems();
                SelectStandard();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_add1ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        stdname.setText("");
    }//GEN-LAST:event_clear2ActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        try {
            Connection con = (Connection) DriverManager.getConnection(Config.DbUrl,Config.DbUser,Config.DbPass);
            if(con != null){
                System.out.println("Connection Sucessfully");
            }
            String sql = "Insert Into section (standard,section,status) values (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,stddrop.getSelectedItem().toString());
            pst.setString(2, secname.getText().trim());
            pst.setString(3,"enabled");
            int rowsInserted = pst.executeUpdate();
            if(rowsInserted>0){
                JOptionPane.showMessageDialog(null, "Sucessfully Added.");
                stddrop.removeAllItems();
                SelectStandard();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_add2ActionPerformed
    //Selecting Standard From Database
    public void SelectStandard(){
        try {
             Connection con = (Connection) DriverManager.getConnection(Config.DbUrl,Config.DbUser,Config.DbPass);
           Statement statement = con.createStatement();
           String selectedquery = "select standard from standard";
             ResultSet rs = statement.executeQuery(selectedquery);
             while(rs.next()){
                 stddrop.addItem(rs.getString("standard"));
                 standardname.addItem(rs.getString("standard"));
                 /* promo_standard.addItem(rs.getString("standard"));
                 standard_name_search.addItem(rs.getString("standard"));
                 standard_student.addItem(rs.getString("standard"));
                 standard_attendance.addItem(rs.getString("standard"));
                 stnadard_student_search.addItem(rs.getString("standard"));*/
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
                 sectionname.addItem(rs.getString("section"));
                 /*promo_section.addItem(rs.getString("section"));
                 section_name_search.addItem(rs.getString("section"));
                 section_student.addItem(rs.getString("section"));
                 section_name_attendance.addItem(rs.getString("section"));
                 section_student_search.addItem(rs.getString("section"));*/
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void clear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3ActionPerformed
        stddrop.setSelectedIndex(0);
        secname.setText("");
    }//GEN-LAST:event_clear3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Standard;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton clear2;
    private javax.swing.JButton clear3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField secname;
    private javax.swing.JComboBox<String> sectionname;
    private javax.swing.JButton sectionsearch;
    private javax.swing.JComboBox<String> standardname;
    private javax.swing.JButton standardsearch;
    public javax.swing.JComboBox<String> stddrop;
    private javax.swing.JTextField stdname;
    // End of variables declaration//GEN-END:variables
}