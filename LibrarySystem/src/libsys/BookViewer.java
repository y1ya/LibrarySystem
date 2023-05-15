package libsys;

import javax.swing.*;
import javax.imageio.*;
import java.awt.Image;
import java.sql.*;
import java.awt.image.*;
import java.io.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookViewer extends main {

    public BookViewer() {
        initComponents();
        lblOneBook.setVisible(false);
        //System.out.println("test");
    }
    String title, author, genre, date, synopsis, imagesrc, availability;
    int borrower;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        Availability_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Synopsis_label = new javax.swing.JTextArea();
        Title_label = new javax.swing.JLabel();
        Author_label = new javax.swing.JLabel();
        Genre_label = new javax.swing.JLabel();
        Date_label = new javax.swing.JLabel();
        lblOneBook = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnBorrow = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setText("Book Cover");
        ImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Availability_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Availability_label.setText("AVAILABLE");

        jLabel4.setText("AUTHOR:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("GENRE:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("TITLE: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("DATE:");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Synopsis_label.setEditable(false);
        Synopsis_label.setColumns(20);
        Synopsis_label.setLineWrap(true);
        Synopsis_label.setRows(5);
        Synopsis_label.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Synopsis_label);

        Title_label.setText("jLabel3");

        Author_label.setText("jLabel3");

        Genre_label.setText("jLabel3");

        Date_label.setText("jLabel3");

        lblOneBook.setText("You can only borrow one book at a time.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Title_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Author_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOneBook)
                                .addGap(25, 25, 25))
                            .addComponent(Genre_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Author_label))
                    .addComponent(lblOneBook, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genre_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date_label))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBorrow.setText("Borrow");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Availability_label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnBorrow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(Availability_label))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.dispose();
        sendDisplaySignal(new BookEditor());
    }//GEN-LAST:event_btnEditActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateView(); 
        databaseConnect("books"); 
        try {
            
            if(alreadyBorrowed()){
                if(!sameID()){
                lblOneBook.setVisible(true);
                btnBorrow.setEnabled(false);
                }
            }
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
            while (rs.next()) {
                title = rs.getString("TITLE");
                author = rs.getString("AUTHOR");
                genre = rs.getString("GENRE");
                date = rs.getString("DATE");
                synopsis = rs.getString("SYNOPSIS");
                imagesrc = rs.getString("IMAGE");
                availability = rs.getString("AVAILABILITY");
                Title_label.setText(title);
                Author_label.setText(author);
                Genre_label.setText(genre);
                Date_label.setText(date);
                Synopsis_label.setText(synopsis);
                Availability_label.setText(availability);

                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(imagesrc));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                Image dimg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
                        Image.SCALE_SMOOTH);

                ImageIcon icon = new ImageIcon(dimg);
                ImageLabel.setText(null);
                ImageLabel.setIcon(icon);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        databaseConnect("books");
        try 
        {
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
            while (rs.next()) 
            {
                availability = rs.getString("AVAILABILITY");
                borrower = rs.getInt("BORROWER");
            }
        }
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
        }

        if (availability.equals("AVAILABLE")) 
        {
           try{                    
                rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
                if (rs.next())
                {                    
                    rs.updateString("AVAILABILITY", "BORROWING");
                    rs.updateInt("BORROWER", currUserID);   
                    LocalDate currentDate = LocalDate.now();
                    LocalDate dueDate = currentDate.plusDays(3);
                    rs.updateDate("DUEDATE", java.sql.Date.valueOf(dueDate));
                    rs.updateRow();
                }
                JOptionPane.showMessageDialog(null, "You successfully borrowed the book.");
                refreshRsStmt("books");
                updateView();
                }
                catch(SQLException err)
                {
                    System.out.println(err);
                }                 
        }
        
        else if ((availability.equals("BORROWED") || availability.equals("BORROWING") || availability.equals("RETURNING")) && borrower != currUserID) 
        {
            JOptionPane.showMessageDialog(null, "Someone is in the process of borrowing this book, please try again later.");
        }
        
        else if (availability.equals("UNAVAILABLE"))
        {
            JOptionPane.showMessageDialog(null, "Sorry, this book is unavailable at this time");
        }

        else if ((availability.equals("BORROWING") || (availability.equals("BORROWED")) && borrower == currUserID)) 
        {
            int option = JOptionPane.showOptionDialog(null, "Do you want to return it?", "Return book", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (option == JOptionPane.YES_OPTION) 
            {
                try 
                {
                    rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
                    if (rs.next())
                    {
                        rs.updateString("AVAILABILITY", "RETURNING");
                        rs.updateRow();            
                    }
                    refreshRsStmt("books");
                    updateView();
                } 
                catch (SQLException err) 
                {
                    System.out.println(err);
                }
            }
        }         
    }//GEN-LAST:event_btnBorrowActionPerformed
    
    public static JButton hideBorrow()
    {
        return btnBorrow;
    }
    
    public static JButton hideEdit()
    {
        return btnEdit;
    }
    
    public void updateView()
    {
        databaseConnect("books");
        try 
        {
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + currBookID);
            while (rs.next()) 
            {
                Availability_label.setText(rs.getString("AVAILABILITY"));
                borrower = rs.getInt("BORROWER");
                availability = rs.getString("AVAILABILITY");

                if (availability.equals("AVAILABLE"))
                {
                    btnBorrow.setText("Borrow");
                }
                else if (availability.equals("UNAVAILABLE") || availability.equals("RETURNING"))
                {
                    btnBorrow.setVisible(false);
                }
                else if ((availability.equals("BORROWING") || (availability.equals("BORROWED")) && borrower == currUserID))
                {
                    btnBorrow.setText("Return");
                } 
            }
            refreshRsStmt("books");
        } 
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }
    
    public boolean alreadyBorrowed() throws SQLException
    {
       rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BORROWER = " + currUserID);
        return rs.next();
    }
    public boolean sameID() throws SQLException
    {
        int bookid = rs.getInt("BOOKID");
        refreshRsStmt("books");
        return bookid == currBookID;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author_label;
    private javax.swing.JLabel Availability_label;
    private javax.swing.JLabel Date_label;
    private javax.swing.JLabel Genre_label;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextArea Synopsis_label;
    private javax.swing.JLabel Title_label;
    private static javax.swing.JButton btnBorrow;
    private static javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOneBook;
    // End of variables declaration//GEN-END:variables
}
