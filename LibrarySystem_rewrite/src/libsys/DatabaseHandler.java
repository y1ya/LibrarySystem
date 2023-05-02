
package libsys;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DatabaseHandler extends main {
    DefaultTableModel tbModel = new DefaultTableModel();
    int x = 0;
    
    public DatabaseHandler() {
        initComponents();
        mainConnect();
        Select();
    }
    
    public void Select() {
        String[] columnNames = {"FULLNAME", "PASSWORD", "USERID", "USERTYPE"};
        tbModel.setColumnIdentifiers(columnNames);
        try {
            while(rs.next()) {
                n = rs.getString("FULLNAME");
                p = rs.getString("PASSWORD");
                i = rs.getInt("USERID");
                ut = rs.getString("USERTYPE");
                tbModel.addRow(new Object[] {n, p, i, ut});
                x++;
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(DatabaseHandler.this, err.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(tbModel);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
