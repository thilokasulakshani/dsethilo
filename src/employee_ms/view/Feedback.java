package employee_ms.view;


public class Feedback extends javax.swing.JFrame {

    public Feedback(String source) {
        initComponents();
        
        switch (source) {
            case "CM_dashboard":
                btnCreate.setVisible(true);
                btnUpdate.setVisible(true);
                btnView.setVisible(true);
                btnClear.setVisible(true);
                break;
            case "FM_dashboard":
            case "PM_dashboard":
            case "CEO_dashboard":
            case "Admin_dashboard":
                btnCreate.setVisible(false);
                btnUpdate.setVisible(false);
                btnView.setVisible(true);
                btnClear.setVisible(true);
                break;
            default:
                // Handle unexpected cases or set default visibility
                btnCreate.setVisible(false);
                btnUpdate.setVisible(false);
                btnView.setVisible(false);
                btnClear.setVisible(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FeedbackDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtProvider = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbFeedbackType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtFeedbackId = new javax.swing.JTextField();
        txtComments = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Feedback");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Feedback Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 110, 125, 25);
        jPanel1.add(FeedbackDateChooser);
        FeedbackDateChooser.setBounds(210, 110, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Feedback Provider");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 157, 25);

        txtProvider.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtProvider);
        txtProvider.setBounds(210, 160, 210, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Feedback Type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 60, 127, 25);

        cmbFeedbackType.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbFeedbackType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positive", "Constructive" }));
        jPanel1.add(cmbFeedbackType);
        cmbFeedbackType.setBounds(610, 60, 210, 28);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Comments");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 110, 110, 25);

        btnCreate.setBackground(new java.awt.Color(0, 0, 153));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 0));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate);
        btnCreate.setBounds(80, 240, 130, 32);

        btnClear.setBackground(new java.awt.Color(0, 0, 153));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(620, 240, 140, 32);

        btnView.setBackground(new java.awt.Color(0, 0, 153));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 0));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView);
        btnView.setBounds(250, 240, 130, 32);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(420, 240, 140, 32);

        txtFeedbackId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtFeedbackId);
        txtFeedbackId.setBounds(200, 60, 220, 28);

        txtComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentsActionPerformed(evt);
            }
        });
        jPanel1.add(txtComments);
        txtComments.setBounds(610, 110, 220, 60);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Feedback ID");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 60, 104, 25);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Feedback");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 890, 40);

        feedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Feedback ID", "Feedback Date", "Provider", "Type", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(feedbackTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 310, 810, 170);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String source = "Admin_dashboard"; 
        if ("Admin_dashboard".equals(source)) {
            new Feedback("Admin_dashboard").setVisible(true);
        }else if ("CM_dashboard".equals(source)) {
            new Feedback("CM_dashboard").setVisible(true); 
        }else if ("PM_dashboard".equals(source)) {
            new Feedback("PM_dashboard").setVisible(true); 
        }else if ("FM_dashboard".equals(source)) {
            new Feedback("FM_dashboard").setVisible(true); 
        }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FeedbackDateChooser;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbFeedbackType;
    private javax.swing.JTable feedbackTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtFeedbackId;
    private javax.swing.JTextField txtProvider;
    // End of variables declaration//GEN-END:variables
}
