package employee_ms.view;

import employee_ms.model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Budget_allocation extends javax.swing.JFrame {

    public Budget_allocation(String source) {
        initComponents();
         switch (source) {
            case "FM_dashboard":
                btnCreate.setVisible(true);
                btnUpdate.setVisible(true);
                btnClear.setVisible(true);
                btnView.setVisible(true);
                break;
            default:
                // Handle unexpected cases or set default visibility
                btnCreate.setVisible(false);
                btnUpdate.setVisible(false);
                btnClear.setVisible(false);
                btnView.setVisible(false);
                break;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        dcTransactionDate = new com.toedter.calendar.JDateChooser();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtItemCategory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBudgetId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        budgetTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buget Allocation");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(0, 0, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Update");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 130, -1));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Transaction Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 204));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 0));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, -1));

        btnView.setBackground(new java.awt.Color(0, 0, 204));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 0));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel2.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 130, -1));

        btnClear.setBackground(new java.awt.Color(0, 0, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 120, -1));
        jPanel2.add(dcTransactionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 210, 30));

        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Budget ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtItemCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtItemCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Category");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtBudgetId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtBudgetId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 200, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 40, 920, 240);

        budgetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Budget ID", "ICategory", "Description", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(budgetTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 290, 830, 300);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Budget Allocation");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 1170, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    String budgetId = txtBudgetId.getText();
    String itemCategory = txtItemCategory.getText();
    String description = txtDescription.getText();
    String amountStr = txtAmount.getText();
    java.util.Date utilTransactionDate  =  dcTransactionDate.getDate();      // Get end date from JDateChooser
    

    if (budgetId.isEmpty() || itemCategory.isEmpty() || description.isEmpty() || amountStr.isEmpty() || utilTransactionDate  == null ) {
        JOptionPane.showMessageDialog(this, "All fields are required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Optional: Validate programId
    if (!budgetId.matches("^[a-zA-Z0-9]+$")) {
        JOptionPane.showMessageDialog(this, "Budget ID must be alphanumeric.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Convert basicSalary to double
    double amount = 0.00;
    try {
        amount = Double.parseDouble(amountStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Amount must be a valid numeric value.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Prevent duplicate Program ID in JTable
    DefaultTableModel model = (DefaultTableModel) budgetTable.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        if (model.getValueAt(i, 0).toString().equals(budgetId)) {
            JOptionPane.showMessageDialog(this, "Budget ID already exists in the table.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    // Format the date to exclude time
    java.sql.Date sqlTransactionDate = new java.sql.Date(utilTransactionDate.getTime());

    try (Connection con = DBConnection.getConnection()) {
        String query = "INSERT INTO Budget (budgetId, itemCategory, description,amount, TransactionDate ) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, budgetId);  
            pst.setString(2, itemCategory);
            pst.setString(3, description);
            pst.setDouble(4, amount);  
            pst.setDate(5, sqlTransactionDate );    // Convert formatted date to java.sql.Date
            

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Program record created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Add row to the table
                model.addRow(new Object[]{budgetId, itemCategory, description, amount , sqlTransactionDate});
            } else {
                JOptionPane.showMessageDialog(this, "Failed to create the record.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }                                        {                                          
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
         DefaultTableModel model = (DefaultTableModel) budgetTable.getModel();
    model.setRowCount(0);  // Clear existing rows in the table

    try (Connection con = DBConnection.getConnection()) {
        String query = "SELECT budgetId, itemCategory, description, amount, TransactionDate FROM Budget";
        try (PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String budgetId = rs.getString("budgetId");
                String itemCategory = rs.getString("itemCategory");
                String description = rs.getString("description");
                double amount = rs.getDouble("amount");
                java.sql.Date transactionDate = rs.getDate("TransactionDate");

                // Add the row to the JTable
                model.addRow(new Object[]{budgetId, itemCategory, description, amount, transactionDate});
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No records found.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
           DefaultTableModel model = (DefaultTableModel) budgetTable.getModel();

    // Get the selected row index
    int selectedRowIndex = budgetTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to update.", "Selection Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Get the current details from the selected row
    String budgetId = (String) model.getValueAt(selectedRowIndex, 0); // Assuming programId is in the first column
    String itemCategory = (String) model.getValueAt(selectedRowIndex, 1); // Assuming name is in the second column
    String description = (String) model.getValueAt(selectedRowIndex, 2); // Assuming name is in the third column
    Double amount = (Double) model.getValueAt(selectedRowIndex, 3); // Assuming location is in the fourth column
    String transactionDate = model.getValueAt(selectedRowIndex, 4).toString(); // Assuming startDate is in the fifth column

    // Convert basicSalary to String for display purposes
    String amountStr = amount.toString();
    
    // Prompt the user to update the details
    String newItemCategory = JOptionPane.showInputDialog(this, "Enter new item category:", itemCategory);
    String newDescription = JOptionPane.showInputDialog(this, "Enter new description:", description);
    String newAmountStr = JOptionPane.showInputDialog(this, "Enter new amount:", amountStr);
    String newTransactionDate = JOptionPane.showInputDialog(this, "Enter new transaction date (yyyy-MM-dd):", transactionDate);
    
    // Check if the basic salary is empty
    if (newAmountStr == null || newAmountStr.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Amount cannot be empty.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Validate input
    if (newItemCategory.isEmpty() || newDescription.isEmpty() || newAmountStr.isEmpty() || newTransactionDate == null ) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Convert basicSalary to double
    double newAmount = 0.00;
    try {
        newAmount = Double.parseDouble(newAmountStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Amount must be a valid numeric value.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    try {
        // Parse dates to ensure correct format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parsedTransactionDate = dateFormat.parse(newTransactionDate);

        // Update the database with the new values
        try (Connection con = DBConnection.getConnection()) {
            String query = "UPDATE Budget SET itemCategory = ?, description = ?, amount = ?, transactionDate = ? WHERE budgetId = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, newItemCategory);
                pst.setString(2, newDescription);
                pst.setDouble(3, newAmount);
                pst.setDate(4, new java.sql.Date(parsedTransactionDate.getTime()));   // Convert java.util.Date to java.sql.Date
                pst.setString(5, budgetId);

                int rowsUpdated = pst.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Budget updated successfully.", "Update Success", JOptionPane.INFORMATION_MESSAGE);

                    // Update the table with the new values
                    model.setValueAt(newItemCategory, selectedRowIndex, 1);
                    model.setValueAt(newDescription, selectedRowIndex, 2);
                    model.setValueAt(newAmount, selectedRowIndex, 3);
                    model.setValueAt(parsedTransactionDate, selectedRowIndex, 4);
                } else {
                    JOptionPane.showMessageDialog(this, "Error updating training program.", "Update Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Date Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     txtBudgetId.setText("");
     txtItemCategory.setText("");
     txtDescription.setText("");
     txtAmount.setText("");
     dcTransactionDate.setDate(null);
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
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Budget_allocation("FM_dashboard").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JTable budgetTable;
    private com.toedter.calendar.JDateChooser dcTransactionDate;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBudgetId;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtItemCategory;
    // End of variables declaration//GEN-END:variables
}
