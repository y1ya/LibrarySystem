package libsys;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

public class ReaderBase extends main {

    public ReaderBase(String currFullName) {
        initComponents();
        setGuiBase();
        setPersonalization();
    }

    private DefaultTableModel bookTableModel;
    private final String[] DEFAULT_COLUMNS = {"TITLE", "AUTHOR", "GENRE", "DATE"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        bgCategories = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblGreetName = new javax.swing.JLabel();
        rbTitle = new javax.swing.JRadioButton();
        rbAuthor = new javax.swing.JRadioButton();
        rbDate = new javax.swing.JRadioButton();
        cbGenre = new javax.swing.JComboBox<>();
        cbAvail = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        cbCending = new javax.swing.JComboBox<>();
        btnLogOut = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        btnSearch.setText("Search!");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblGreetName.setText("Welcome");

        rbTitle.setText("Title");

        rbAuthor.setText("Author");

        rbDate.setText("Publication Date");

        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Genre", " " }));

        cbAvail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unavailable / Available", " " }));

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(mainTable);

        cbCending.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", " " }));

        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchField)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(btnSearch)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                    .addComponent(rbTitle)
                                    .addGap(158, 158, 158)
                                    .addComponent(rbAuthor)
                                    .addGap(145, 145, 145)
                                    .addComponent(rbDate)
                                    .addGap(9, 9, 9)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(cbCending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(cbAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut)
                                .addGap(63, 63, 63))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblGreetName)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(cbAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbAuthor)
                                .addComponent(rbDate)
                                .addComponent(rbTitle))
                            .addComponent(btnSearch))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut)))))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        databaseConnect("books");
        bookFinder();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        logOut();
    }//GEN-LAST:event_btnLogOutActionPerformed

    public void allSetModel() 
    {
        String[] columnNames = {"Title", "Author", "Genre", "Date"};
        bookTableModel = new DefaultTableModel(columnNames, 0);
        bookTableModel.setColumnIdentifiers(DEFAULT_COLUMNS);
        mainTable.setModel(bookTableModel);
    }

    public void allClear() 
    {
        bookTableModel.setRowCount(0);
    }

    public void allAddBook(String[] bookData) throws Exception 
    {
        if (bookTableModel == null) 
        {
            bookTableModel = new DefaultTableModel(DEFAULT_COLUMNS, 0);
            mainTable.setModel(bookTableModel);
        }

        String selectedGenre = (String) cbGenre.getSelectedItem();
        if (!selectedGenre.equals("All Genres") && !selectedGenre.equals(bookData[2])) 
            return;
        

        Vector<String> reorderedData = new Vector<>();
        for (String column : DEFAULT_COLUMNS) {
            switch (column) {
                case "TITLE":
                    reorderedData.add(bookData[0]);
                    break;
                case "AUTHOR":
                    reorderedData.add(bookData[1]);
                    break;
                case "GENRE":
                    reorderedData.add(bookData[2]);
                    break;
                case "DATE":
                    reorderedData.add(bookData[3]);
                    break;
            }
        }
        bookTableModel.addRow(reorderedData);
    }

    public void queryNull(String category) throws SQLException 
    {
        String query = "SELECT * FROM BOOKS";
        PreparedStatement stmt = con.prepareStatement(query);
        rs = stmt.executeQuery();
    }

    public void queryNullAvail(String category) throws SQLException 
    {
        String selectedAvail = (String) cbAvail.getSelectedItem();
        String query = "SELECT * FROM BOOKS WHERE AVAILABILITY ='" + selectedAvail.toUpperCase() + "'";
        PreparedStatement stmt = con.prepareStatement(query);
        rs = stmt.executeQuery();
    }

    public void queryTermAll(String category) throws SQLException 
    {
        String query = "SELECT * FROM BOOKS WHERE " + category + " LIKE ? ";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, searchField.getText().toUpperCase() + "%");
        rs = stmt.executeQuery();
    }

    public void queryTermAvail(String category) throws SQLException 
    {
        String selectedAvail = (String) cbAvail.getSelectedItem();
        String query = "SELECT * FROM BOOKS WHERE AVAILABILITY = ? AND " + category + " LIKE ? ";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, selectedAvail.toUpperCase());
        stmt.setString(2, "%" + searchField.getText().toUpperCase() + "%");
        rs = stmt.executeQuery();
    }

    public void initialSearch() {
        databaseConnect("books");
        rbTitle.setSelected(true);
        cbAvail.setSelectedIndex(0);
        cbGenre.setSelectedIndex(0);
        try {
            allSetModel();
            allClear();
            sortBy(decideCat(), decideAvail());
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bookFinder() {
        try {
            allSetModel();
            allClear();
            sortBy(decideCat(), decideAvail());
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sortBy(String category, String avail) {
        try 
        {
            ArrayList<String[]> tempData = new ArrayList<>();
            if (searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 0)) 
                queryNull(category);
            else if (searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 1 || cbAvail.getSelectedIndex() == 2)) 
                queryNullAvail(category);
            else if (!searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 0)) 
                queryTermAll(category);
            else if (!searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 1 || cbAvail.getSelectedIndex() == 2)) 
                queryTermAvail(category);
      
            if (bookTableModel != null) 
                bookTableModel.setRowCount(0);
            
            while (rs.next()) 
            {
                String[] bookData = null;
                for (String column: DEFAULT_COLUMNS)
                {
                    if (category.equals(column)) 
                    {
                        bookData = new String[]{
                            rs.getString("TITLE"),
                            rs.getString("AUTHOR"),
                            rs.getString("GENRE"),
                            rs.getString("DATE")
                        };
                    } 
                }
                tempData.add(bookData);
            }
            
            int sortColumn = Arrays.asList(DEFAULT_COLUMNS).indexOf(category);
            if (cbCending.getSelectedIndex() == 0)
            {
                Collections.sort(tempData, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[sortColumn].compareTo(o2[sortColumn]);
                }
                });
            }
            else 
                Collections.sort(tempData, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return -1 * o1[sortColumn].compareTo(o2[sortColumn]);
                }
            });
               
            for (String[] bookData : tempData) 
            {
                allAddBook(bookData);
            }
            refreshRsStmt("books");
        } 
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String decideCat() 
    {
        if (rbTitle.isSelected()) 
            return "TITLE";
        if (rbAuthor.isSelected()) 
            return "AUTHOR";
        if (rbDate.isSelected()) 
            return "DATE";
        return "ERROR";
    }

    public String decideAvail() 
    {
        String item = (String) cbAvail.getSelectedItem();;
        return item;
    }

    public void setPersonalization() 
    {
        ReaderBase.currFullName = currFullName;
        lblGreetName.setText("Welcome " + currFullName + "!!!");
    }

    public void setGuiBase() 
    {
        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
                
        cbAvail.removeAllItems();
        cbAvail.addItem("Unavailable/Available");
        cbAvail.addItem("Available");
        cbAvail.addItem("Unavailable");

        cbGenre.removeAllItems();
        cbGenre.addItem("All Genres");
        cbGenre.addItem("Science Fiction");
        cbGenre.addItem("Horror");
        cbGenre.addItem("Fantasy");
        cbGenre.addItem("Dystopian");
        
        cbCending.removeAllItems();
        cbCending.addItem("Ascending");
        cbCending.addItem("Descending");

        bgCategories.add(rbTitle);
        bgCategories.add(rbAuthor);
        bgCategories.add(rbDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCategories;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbAvail;
    private javax.swing.JComboBox<String> cbCending;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblGreetName;
    private javax.swing.JTable mainTable;
    private javax.swing.JRadioButton rbAuthor;
    private javax.swing.JRadioButton rbDate;
    private javax.swing.JRadioButton rbTitle;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
