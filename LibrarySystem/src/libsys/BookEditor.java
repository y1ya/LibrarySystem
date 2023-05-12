package libsys;
import javax.swing.*;
import javax.imageio.*;
import java.awt.Image;
import java.sql.*;
import java.awt.dnd.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.*;



public class BookEditor extends main {
    ImageInsert imageInsert= new ImageInsert();
    String title,author,genre,date,synopsis, imagesrc, availability,destinationpath;
    
    public BookEditor() {
        initComponents();
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Title_tf = new javax.swing.JTextField();
        Author_tf = new javax.swing.JTextField();
        Year_tf = new javax.swing.JTextField();
        Genre_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Synopsis_ta = new javax.swing.JTextArea();
        Btn_Register = new javax.swing.JButton();
        Btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setText("Enter a Title First");
        ImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageLabelMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Editor");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cover");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Title:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Author:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Year of Publication:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Genre:");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Synopsis/Description:");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Synopsis_ta.setColumns(20);
        Synopsis_ta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Synopsis_ta.setLineWrap(true);
        Synopsis_ta.setRows(5);
        Synopsis_ta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Synopsis_ta);

        Btn_Register.setText("EDIT");
        Btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegisterActionPerformed(evt);
            }
        });

        Btn_back.setText("BACK");
        Btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ImageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(Genre_tf))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(Title_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Author_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Year_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Btn_Register, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(Btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(46, 46, 46)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Title_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(Author_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Year_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genre_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImageLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageLabelMouseExited
        if(imageInsert.ImagePath!=null){
            destinationpath="src/libsys_images/"+Title_tf.getText()+".jpg";
            try{
                Files.delete(Paths.get(imagesrc));
            }catch(IOException err){
                System.out.println(err);
            }  
            
            //Show the image in the current panel
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(imageInsert.ImagePath));
            } catch (IOException ex) {
                Logger.getLogger(BookEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image dimg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
            Image.SCALE_SMOOTH);
        
            ImageIcon icon=new ImageIcon(dimg);
            ImageLabel.setText(null);
            ImageLabel.setIcon(icon);
            
            try {
                CopyImage(destinationpath);
            }catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ImageLabelMouseExited

    private void Btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegisterActionPerformed
        databaseConnect("books");
        try{
            rs=stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = "+currentBookID);
            rs.next();
            rs.updateString("TITLE", Title_tf.getText());
            rs.updateString("AUTHOR", Author_tf.getText());
            rs.updateString("DATE", Year_tf.getText());
            rs.updateString("GENRE", Genre_tf.getText());
            rs.updateString("SYNOPSIS",Synopsis_ta.getText());
            rs.updateString("IMAGE",destinationpath);
            rs.updateRow();
            refreshRsStmt("books");
        } catch(SQLException err){
            System.out.println(err);
        }
        Btn_Register.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Editing is successful!");
        this.dispose();
        sendDisplaySignal(new LibrarianBase());
    }//GEN-LAST:event_Btn_RegisterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       databaseConnect("books");
       new DropTarget(ImageLabel, imageInsert);
        try{
            rs=stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = "+currentBookID);
            while(rs.next()){
                Title_tf.setText(rs.getString("TITLE"));
                Author_tf.setText(rs.getString("AUTHOR"));
                Genre_tf.setText(rs.getString("GENRE"));
                Year_tf.setText(rs.getString("DATE"));
                imagesrc=rs.getString("IMAGE");
                destinationpath=imagesrc;
                Synopsis_ta.setText(rs.getString("SYNOPSIS"));
                
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(imagesrc));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                Image dimg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
                Image.SCALE_SMOOTH);
        
                ImageIcon icon=new ImageIcon(dimg);
                ImageLabel.setText(null);
                ImageLabel.setIcon(icon);
            }
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void Btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_backActionPerformed
        this.dispose();
        sendDisplaySignal(new LibrarianBase());
    }//GEN-LAST:event_Btn_backActionPerformed
  
    private void CopyImage(String destinationpath) throws IOException{
        Path source=Paths.get(imageInsert.ImagePath);
        Path destination=Paths.get(destinationpath);
        Files.copy(source, destination, StandardCopyOption.COPY_ATTRIBUTES);
    }
    
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
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookEditor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author_tf;
    private javax.swing.JButton Btn_Register;
    private javax.swing.JButton Btn_back;
    private javax.swing.JTextField Genre_tf;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextArea Synopsis_ta;
    private javax.swing.JTextField Title_tf;
    private javax.swing.JTextField Year_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
