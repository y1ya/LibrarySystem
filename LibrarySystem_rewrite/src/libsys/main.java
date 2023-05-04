package libsys;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;



public class main extends javax.swing.JFrame{
    // nsme variables and their purposes [TO-DO]
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel LoginModel = new DefaultTableModel();
    int i;
    String newPass, newUser, txt_pass, user, pass, cp, u, p, n, ut, temp_user, temp_pass;
    
    // Connects to the accounts database
    public void accountsConnect() {
        try {
            String host = "jdbc:derby://localhost:1527/accounts";
            String uName = "userdb";
            String uPass = "0000";
            
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB.ACCOUNTS";
            rs = stmt.executeQuery(sql);
        } catch (SQLException err){
            JOptionPane.showMessageDialog(main.this, err.getMessage());
        }
    }
   
    // Connects to the books database
    public void booksConnect() {
        try {
            String host = "jdbc:derby://localhost:1527/books";
            String uName = "userdb";
            String uPass = "0000";
            
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB.BOOKS";
            rs = stmt.executeQuery(sql);
        } catch (SQLException err){
            JOptionPane.showMessageDialog(main.this, err.getMessage());
        }
    }
    
        // Connects to the books database
    public void librarianqueueConnect() {
        try {
            String host = "jdbc:derby://localhost:1527/librarianqueue";
            String uName = "userdb";
            String uPass = "0000";
            
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB.BOOKS";
            rs = stmt.executeQuery(sql);
        } catch (SQLException err){
            JOptionPane.showMessageDialog(main.this, err.getMessage());
        }
    }
    
    // Refreshes the database
    public void Refresh_RS_STMT() {
        try {
            stmt.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB.ACCOUNTS";
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Gets called in every end of a JFrame so everything goes through the main
    // rather than being thrown from JFrame to JFrame
    public static void sendDisplaySignal(JFrame sig)
    {
        JFrame[] jframe = {new MainWindow(), new AdminSignIn(), new ReaderSignIn(), new ReaderSignUp()};
        for (JFrame jframe1 : jframe) {
            if (jframe1.getClass().equals(sig.getClass())) {
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  // adapt to machinee's screen size
                jframe1.setSize(screenSize.width, screenSize.height); // set size to screen size
                jframe1.setVisible(true);
            }
        }
    }
    
    // When called, it provides a random number for the unique USERID of databases
    public int randNumGen(){
        Random random = new Random();
        int randNum = random.nextInt(9999); // generates a random integer between 1 and 99999 which is the limit

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT USERID FROM ACCOUNTS WHERE USERID=" + randNum);
            // check if the generated random number recursively if it already exists in the database
            while (rs.next()) {
                randNum = random.nextInt(9999);
                rs = stmt.executeQuery("SELECT USERID FROM ACCOUNTS WHERE USERID=" + randNum);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return randNum;
    }
    
    // The first statement/s to be called
    public static void main(String[] args) {
        sendDisplaySignal(new MainWindow());
    }
}
