package libsys;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class main extends javax.swing.JFrame {

    // init connection to databases
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    // displaying the database table
    DefaultTableModel LoginModel = new DefaultTableModel();
    
    // universal variables for accounts database 
    String usiFullName, usiPass, usicPass, usiUsertype, 
           usuFullName, usuPass, usucPass, usuUserType;
    int id, userid;
    boolean matchAcc = false, matchPass = false, matchType = false;
    
    // variables for books databases
    String t;
    public static int currentBookID;
    
    // personalization variables
    public static String currFullName;

    // Connects to the reffered database
    public void databaseConnect(String dbName) {
        try {
            String host = "jdbc:derby://localhost:1527/" + dbName;
            String uName = "userdb";
            String uPass = "0000";

            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB." + dbName.toUpperCase();
            rs = stmt.executeQuery(sql);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(main.this, err.getMessage());
        }
    }

    // Refreshes the reffered database contents
    public void refreshRsStmt(String dbName) {
        try {
            stmt.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB." + dbName.toUpperCase();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Gets called in every end of a JFrame so everything goes through the main
    // rather than being thrown and adjusted from JFrame to JFrame
    public static void sendDisplaySignal(JFrame sig) 
    {
        JFrame[] jframe = {
            new MainWindow(), new AdminSignIn(), new LibrarianSignIn(), 
            new ReaderSignIn(), new ReaderSignUp(), new AdminBase(), 
            new BookRegistry(), new LibrarianBase(), new BookBorrowMan(),
            new BookEditor(), new BookViewer(), new ReaderBase()
        };
        for (JFrame jframe1 : jframe) {
            if (jframe1.getClass().equals(sig.getClass())) {
                jframe1.setSize(new java.awt.Dimension(1280, 720));
                jframe1.setLocationRelativeTo(null);
                //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  // adapt to machinee's screen size
                //jframe1.setSize(screenSize.width, screenSize.height); // set size to screen size
                jframe1.setVisible(true);
            }
        }
    }
    
    // When called, it provides a random number for the unique ID of databases
    public int randNumGen(String dbName, String dbId) {
        Random random = new Random();
        int randNum = random.nextInt(9999); // generates a random integer between 1 and 99999 which is the limit

         try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT " + dbId.toUpperCase() + " FROM " + dbName.toUpperCase() + " WHERE " + dbId.toUpperCase() + "="+randNum);
            // check if the generated random number recursively if it already exists in the database
            while (rs.next()) {
                randNum = random.nextInt(9999);
                rs = stmt.executeQuery("SELECT " + dbId.toUpperCase() + " FROM " + dbName.toUpperCase() + " WHERE " + dbId.toUpperCase() + "="+ randNum);
            }
            refreshRsStmt(dbName);
        } 
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
        }
        return randNum;
    }
    
    public void signUp(String usuFullName, String usuPass, String userType, JTextField txtNewName, 
            JPasswordField txtNewPass, JPasswordField txtNewPassConf, JLabel lblPassNotAligned, int id) 
    {
        try 
        {  
            if (!String.valueOf(txtNewPass.getPassword()).equals(String.valueOf(txtNewPassConf.getPassword())))
                lblPassNotAligned.setVisible(true);
            else
            {
                rs.moveToInsertRow();
                rs.updateString("PASSWORD", usuPass);
                rs.updateString("FULLNAME", usuFullName);
                rs.updateInt("USERID", id); // <--- temporary changes
                rs.updateString("USERTYPE", "READER");
                rs.insertRow();
                refreshRsStmt("accounts");
                
                JOptionPane.showMessageDialog(null, "Registration Complete!");
                JOptionPane.showMessageDialog(null, "User ID: " + id + "\nFullname: " + usuFullName + 
                        "\nPassword: " + usuPass + "\nUser Type: " + userType, "Account Registered Information."
                        , JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                currFullName = usuFullName;
                toUsertypeBases(userType);       
            }
            refreshRsStmt("accounts");
        } 
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }

    public void signIn(String usiFullName, String usiPass, String userType, 
            JTextField txtLogName, JPasswordField txtLogPass) 
    {
        try 
        {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT PASSWORD FROM ACCOUNTS WHERE FULLNAME='" + usiFullName + "'");
            if (rs.next()) 
            {
                usicPass = rs.getString("PASSWORD");
                if (usiPass.equals(usicPass)) 
                {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery("SELECT USERTYPE FROM ACCOUNTS WHERE FULLNAME='" + usiFullName + "'");
                    if (rs.next()) 
                    {
                        usiUsertype = rs.getString("USERTYPE");
                        if (usiUsertype.equals(userType))
                        {
                            matchAcc = true; 
                            matchPass = true;
                            matchType = true;
                        }
                        else
                        {
                            matchAcc = true; 
                            matchPass = true;
                        }
                    }
                }
                else 
                {
                    matchAcc = true;
                }
            } 
            refreshRsStmt("accounts");
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
        
        if (matchAcc && matchPass && matchType)
        {
            JOptionPane.showMessageDialog(null, "Successfully Logged in!");
            this.dispose();
            currFullName = usiFullName;
            toUsertypeBases(userType);
        }
        else if (matchAcc && !matchPass)
        {
            txtLogName.setText(null);
            txtLogPass.setText(null);
            JOptionPane.showMessageDialog(null, "Incorrect Password!");
        }
        else
        {
            txtLogName.setText(null);
            txtLogPass.setText(null);
            JOptionPane.showMessageDialog(null, "Account not found!", "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void toUsertypeBases(String userType)
    {
        switch (userType) 
        {
            case "ADMIN":
                sendDisplaySignal(new AdminBase()); 
                break;
            case "LIBRARIAN":
                sendDisplaySignal(new LibrarianBase()); 
                break;
            case "READER":
                sendDisplaySignal(new ReaderBase());
                break;
        }
    }
        
    public void logOut()
    {
        int logoutoption = JOptionPane.YES_NO_OPTION;
        int logoutresult = JOptionPane.showConfirmDialog(null, "Log Out?", "Log Out Confirmation", logoutoption);
        if(logoutresult == 0)
        {
            this.dispose();
            sendDisplaySignal(new MainWindow());
        }
    }
    
    //Insert Borrow Date(today) and ReturnDate to Database
    public void Dates_to_Database(int add_days){
        databaseConnect("books");
        Date borrowDate = Date.valueOf(LocalDate.now());
        Date returnDate = Date.valueOf(LocalDate.now().plusDays(add_days));
        try{
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT * FROM USERDB.BOOKS");
            rs.moveToInsertRow();
            rs.updateDate("BORROWDATE", borrowDate);
            rs.updateDate("RETURNDATE", returnDate);
            rs.insertRow();
            refreshRsStmt("books");
        }catch(SQLException e){
            System.out.print(e);
        }
    }

    // The first statement/s to be called
    public static void main(String[] args) {
        sendDisplaySignal(new MainWindow());
    }
}
