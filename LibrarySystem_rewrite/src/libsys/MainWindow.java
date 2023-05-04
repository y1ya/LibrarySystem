
package libsys;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReader = new javax.swing.JButton();
        btnLibrarian = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReader.setText("Reader");
        btnReader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReaderActionPerformed(evt);
            }
        });

        btnLibrarian.setText("Librarian");

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnReader)
                .addGap(31, 31, 31)
                .addComponent(btnLibrarian)
                .addGap(33, 33, 33)
                .addComponent(btnAdmin)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReaderActionPerformed
        this.setVisible(false);
        main.sendDisplaySignal(new ReaderSignIn()); // <--- It goes to
    }//GEN-LAST:event_btnReaderActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        this.setVisible(false);
        main.sendDisplaySignal(new AdminSignIn()); // <--- It goes to
    }//GEN-LAST:event_btnAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnLibrarian;
    private javax.swing.JButton btnReader;
    // End of variables declaration//GEN-END:variables
}
