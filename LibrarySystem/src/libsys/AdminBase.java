
package libsys;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminBase extends main {
    DefaultTableModel tblDataAccounts = new DefaultTableModel();
    int x = 0;

    public AdminBase() {
        initComponents();
        databaseConnect("accounts");
        
        btnSave.setVisible(false);
        btnEdit.setVisible(false);
        btnDelete.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        cbUserType = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnClear = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        randomNumber = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("USERS ACCOUNTS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setText("Fullname:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel4.setText("Used ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel5.setText("User Type:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        txtFullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFullnameKeyTyped(evt);
            }
        });
        getContentPane().add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 293, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 293, -1));
        getContentPane().add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 293, -1));

        cbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "READER", "LIBRARIAN", "ADMIN" }));
        cbUserType.setSelectedIndex(-1);
        getContentPane().add(cbUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 293, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 740, 10));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 80, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        mainTable.setModel(tblDataAccounts);
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, 720, 188));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 60, -1));

        randomNumber.setText("Random Number");
        randomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomNumberActionPerformed(evt);
            }
        });
        getContentPane().add(randomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 140, 30));

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtFullname.setText(null);
        txtPassword.setText(null);
        txtUserId.setText(null);
        cbUserType.setSelectedIndex(-1);
        
        btnAdd.setVisible(true);
        btnSave.setVisible(false);
        btnEdit.setVisible(false);
        btnDelete.setVisible(false);
        
        txtFullname.setEditable(true);
        txtPassword.setEditable(true);
        txtUserId.setEditable(true);
        
        cbUserType.setEnabled(true);
        randomNumber.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String[] columnNames = {"User ID", "Fullname", "Password", "User Type"};
        tblDataAccounts.setColumnIdentifiers(columnNames);
        tblDataAccounts.setRowCount(0);
        
        try {
            while(rs.next()) {
                tblDataAccounts.addRow(new Object[] 
                {
                    rs.getInt("USERID"), 
                    rs.getString("FULLNAME"), 
                    rs.getString("PASSWORD"), 
                    rs.getString("USERTYPE")
                });
                x++;
            }
            refreshRsStmt("accounts");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked

        int ids = Integer.parseInt(mainTable.getValueAt(mainTable.getSelectedRow(),0).toString());
        String[] types = {"ADMIN", "LIBRARIAN", "READER"};
        
        btnAdd.setVisible(false);
        btnSave.setVisible(true);
        btnEdit.setVisible(true);
        btnDelete.setVisible(true);
        
        txtFullname.setEditable(false);
        txtPassword.setEditable(false);
        txtUserId.setEditable(false);
        
        cbUserType.setEnabled(false);
        randomNumber.setEnabled(false);
        
        try 
        {
            ResultSet rs = stmt.executeQuery("SELECT * FROM USERDB.ACCOUNTS WHERE USERID = " + ids);
            while (rs.next()) 
            {
                txtFullname.setText(rs.getString("FULLNAME"));
                txtPassword.setText(rs.getString("PASSWORD"));
                txtUserId.setText(rs.getString("USERID"));
                
                if (rs.getString("USERTYPE").equals(types[0])) 
                {
                    cbUserType.setSelectedIndex(2);
                } 
                else if (rs.getString("USERTYPE").equals(types[1])) 
                {
                    cbUserType.setSelectedIndex(1);
                }
                else 
                {
                    cbUserType.setSelectedIndex(0);
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_mainTableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchUserId;
        int newId;
        
        searchUserId = JOptionPane.showInputDialog(null, "Search for User ID:", "Finding the Account", 
                JOptionPane.QUESTION_MESSAGE);
        newId = Integer.parseInt(searchUserId);
        
        txtFullname.setEditable(false);
        txtPassword.setEditable(false);
        txtUserId.setEditable(false);
        cbUserType.setEnabled(false);
        
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNTS WHERE USERID = " 
                    + searchUserId);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User ID: " + userid + "\nFullname: " + rs.getString("FULLNAME") +
                            "\nPassword: " + rs.getString("PASSWORD") + "\nUser Type: " + rs.getString("USERTYPE"), "Account Details", 
                            JOptionPane.INFORMATION_MESSAGE);
                
                txtFullname.setText(rs.getString("FULLNAME"));
                txtPassword.setText(rs.getString("PASSWORD"));
                txtUserId.setText(String.valueOf(userid));
                cbUserType.setSelectedItem(rs.getString("USERTYPE"));
                } else {
                    JOptionPane.showMessageDialog(null, "Account not Found!");
                }
                //break;
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int del, id;
        
        id = Integer.parseInt(txtUserId.getText());
        
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNTS WHERE USERID = " + id);
            if (rs.next()) {
                del = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?", 
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (del == JOptionPane.YES_OPTION) {
                    rs.getRow();
                    rs.deleteRow();
                    refreshRsStmt("accounts");
                    JOptionPane.showMessageDialog(null, "Account has been deleted!");
                    formWindowOpened(null);
                    
                    txtFullname.setText(null);
                    txtPassword.setText(null);
                    txtUserId.setText(null);
                    cbUserType.setSelectedIndex(-1);
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        userid = Integer.parseInt(txtUserId.getText());
        try {
            rs.moveToInsertRow();
            rs.updateInt("USERID", userid);
            rs.updateString("FULLNAME", txtFullname.getText());
            rs.updateString("PASSWORD", txtPassword.getText());
            rs.updateString("USERTYPE", String.valueOf(cbUserType.getSelectedItem()));
            rs.insertRow();
            formWindowOpened(null);
            
            JOptionPane.showMessageDialog(null, "Account has been added!");
            
            txtFullname.setText(null);
            txtPassword.setText(null);
            txtUserId.setText(null);
            cbUserType.setSelectedIndex(-1);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        userid = Integer.parseInt(txtUserId.getText());
   
        int ids = Integer.parseInt(mainTable.getValueAt(mainTable.getSelectedRow(), 
                0).toString());
        
        try {
            boolean b = stmt.execute("UPDATE ACCOUNTS SET FULLNAME = '" + txtFullname.getText() + "', PASSWORD = '" + txtPassword.getText() + "'"
                    + ", USERTYPE = '" + String.valueOf(cbUserType.getSelectedItem()) + "' WHERE USERID = " + ids);
            
            if (!b) {
                JOptionPane.showMessageDialog(null, "The account has been updated!");
                
                txtFullname.setText(null);
                txtPassword.setText(null);
                txtUserId.setText(null);
                cbUserType.setSelectedIndex(-1);
                
                btnAdd.setVisible(true);
                btnSave.setVisible(false);
                btnEdit.setVisible(false);
                btnDelete.setVisible(false);
                
                refreshRsStmt("accounts");
                formWindowOpened(null);
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        txtFullname.setEditable(true);
        txtPassword.setEditable(true);
        txtUserId.setEditable(true);
        
        cbUserType.setEnabled(true);
        btnSave.setEnabled(false);
        
        randomNumber.setEnabled(true);
        refreshRsStmt("accounts");
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtFullnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullnameKeyTyped
        // TODO add your handling code here:
        if (!txtFullname.getText().equals("")) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_txtFullnameKeyTyped

    private void randomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomNumberActionPerformed
        // TODO add your handling code here:
        int ids = randNumGen("accounts", "userid");
        
        txtUserId.setText(String.valueOf(ids));
    }//GEN-LAST:event_randomNumberActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        logOut();
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton randomNumber;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

}