package libsys;

import java.awt.BorderLayout;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;

public class ReaderBase extends main {
            
    public ReaderBase(String currFullName) {
        initComponents();
        setGuiBase();
        setPersonalization();
    }
    
    DefaultListModel booksTitle = new DefaultListModel();
    DefaultListModel booksAuthor = new DefaultListModel();
    DefaultListModel booksGenre = new DefaultListModel();
    DefaultListModel booksDate = new DefaultListModel();
    
    
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
        chAvail = new javax.swing.JCheckBox();
        cbGenre = new javax.swing.JComboBox<>();
        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        listAuthor = new javax.swing.JList<>();
        listTitle = new javax.swing.JList<>();
        listDate = new javax.swing.JList<>();
        listGenre = new javax.swing.JList<>();

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

        chAvail.setText("Available");

        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Genre", " " }));
        cbGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenreActionPerformed(evt);
            }
        });

        mainScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        mainScrollPane.setViewportBorder(new javax.swing.border.MatteBorder(null));

        listAuthor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        listTitle.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        listDate.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        listGenre.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(listTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listDate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(listDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                            .addComponent(listGenre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(listTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainScrollPane.setViewportView(mainPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(80, 80, 80)
                                .addComponent(rbTitle)
                                .addGap(114, 114, 114)
                                .addComponent(rbAuthor)
                                .addGap(76, 76, 76)
                                .addComponent(rbDate)
                                .addGap(70, 70, 70)
                                .addComponent(chAvail))
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(330, 330, 330))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblGreetName)
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(rbTitle)
                    .addComponent(rbAuthor)
                    .addComponent(rbDate)
                    .addComponent(chAvail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(mainScrollPane)))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        databaseConnect("books");
        
        String searchTerm = searchField.getText().toLowerCase();
        String[] catStrArr = {"TITLE", "AUTHOR", "DATE"};
        JRadioButton[] catRbArr = {rbTitle, rbAuthor, rbDate};
        
        for (int i = 0; i<catStrArr.length; i++)
        {
            if (catRbArr[i].isSelected() && !searchTerm.equals(""))
            {
                try
                {
                    bookFinder(catStrArr[i]);
                }
                catch (Exception ex)
                {
                    Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if ((catRbArr[i].isSelected()))
            {
                try
                {
                    nullBookFinder(catStrArr[i]);
                }
                catch (Exception ex)
                {
                    Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }   
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenreActionPerformed

    public void allClear()
    {
        booksTitle.clear();
        booksAuthor.clear();
        booksGenre.clear();
        booksDate.clear();    
    }
   
    public void allSetModel()
    {
        listTitle.setModel(booksTitle);
        listAuthor.setModel(booksAuthor);
        listGenre.setModel(booksGenre);
        listDate.setModel(booksDate);
    }
    
    public void allAddBook() throws Exception
    {
        booksTitle.addElement(rs.getString("TITLE"));
        booksAuthor.addElement(rs.getString("AUTHOR"));
        booksGenre.addElement(rs.getString("GENRE"));
        booksDate.addElement(rs.getString("DATE"));
    }
    
    public void sortByTerm(String category, String searchTerm) {
        try 
        {
            String query = "SELECT * FROM books WHERE " + category + " LIKE ? ORDER BY " + category + " ASC";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, searchTerm.toUpperCase() + "%");
            rs = pstmt.executeQuery();
        } 
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
        }
    }
    
    public void sortBy(String category) 
    {
        try
        {
        String query = "SELECT * FROM books ORDER BY " + category + " ASC";
        rs = stmt.executeQuery(query);
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
 
    }
    
    public void initialSearch() 
    {
        databaseConnect("books");
        rbTitle.setSelected(true);
      
        try
        {
            sortBy("TITLE");
            while(rs.next())
            {
                allAddBook();
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
        allSetModel();
    }
    
    public void bookFinder(String dbColumn) 
    {
        allClear();
        String searchTerm = searchField.getText().toLowerCase();
        try
        {
            sortByTerm(dbColumn, searchTerm);
            while(rs.next())
            {
                allAddBook();
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
        allSetModel();
    }
    
    public void nullBookFinder(String dbColumn)
    { 
        allClear();
        try
        {
            sortBy(dbColumn);
            while(rs.next())
            {
                allAddBook();
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
        allSetModel();
    }
    
    public void setPersonalization()
    {
        ReaderBase.currFullName = currFullName;
        lblGreetName.setText("Welcome " + currFullName + "!!!");
    }
    
    public void setGuiBase()
    {
        bgCategories.add(rbTitle);
        bgCategories.add(rbAuthor);
        bgCategories.add(rbDate);
        JPanel viewport = new JPanel(new BorderLayout());
        viewport.add(mainPanel, BorderLayout.NORTH);
        mainScrollPane.setViewportView(viewport);
      
        listTitle.setAutoscrolls(false);
        listAuthor.setAutoscrolls(false);
        listGenre.setAutoscrolls(false);
        listDate.setAutoscrolls(false);

        listTitle.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                JScrollBar scrollBar = mainScrollPane.getVerticalScrollBar();
                scrollBar.setValue(scrollBar.getValue() + e.getUnitsToScroll() * scrollBar.getUnitIncrement());
            }
        });

        listAuthor.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                JScrollBar scrollBar = mainScrollPane.getVerticalScrollBar();
                scrollBar.setValue(scrollBar.getValue() + e.getUnitsToScroll() * scrollBar.getUnitIncrement());
            }
        });

        listGenre.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                JScrollBar scrollBar = mainScrollPane.getVerticalScrollBar();
                scrollBar.setValue(scrollBar.getValue() + e.getUnitsToScroll() * scrollBar.getUnitIncrement());
            }
        });

        listDate.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                JScrollBar scrollBar = mainScrollPane.getVerticalScrollBar();
                scrollBar.setValue(scrollBar.getValue() + e.getUnitsToScroll() * scrollBar.getUnitIncrement());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCategories;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JCheckBox chAvail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblGreetName;
    private javax.swing.JList<String> listAuthor;
    private javax.swing.JList<String> listDate;
    private javax.swing.JList<String> listGenre;
    private javax.swing.JList<String> listTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JRadioButton rbAuthor;
    private javax.swing.JRadioButton rbDate;
    private javax.swing.JRadioButton rbTitle;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
