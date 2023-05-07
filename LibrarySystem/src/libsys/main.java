package libsys;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class main extends javax.swing.JFrame {

    // init connection to databases
    Connection con;
    Statement stmt;
    ResultSet rs;
    // displaying the database table
    DefaultTableModel LoginModel = new DefaultTableModel();
    // variables for accounts database
    String rsiFullName, rsiPass, rsicPass, rsiUsertype, // ReaderSignIn
           rsuFullName, rsuPass,                        // ReaderSignUp
           asiUserType, asiFullName, 
           asiPass, asicFullName, asicPass, asiUsertype;
    int id;
    // variables for books databases
    String t;
    
    public static String uniFullName;

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
    public void Refresh_RS_STMT(String dbName) {
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
    public static void sendDisplaySignal(JFrame sig) {
        JFrame[] jframe = {
            new MainWindow(), new AdminSignIn(), new ReaderSignIn(),
            new ReaderSignUp(), new AdminBase()
        };
        for (JFrame jframe1 : jframe) {
            if (jframe1.getClass().equals(sig.getClass())) {
                //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  // adapt to machinee's screen size
                //jframe1.setSize(screenSize.width, screenSize.height); // set size to screen size
                jframe1.setVisible(true);
            }
        }
    }
    
    // Deprecated
    // When called, it provides a random number for the unique ID of databases
    public int randNumGen(String dbName, String dbId) {
        Random random = new Random();
        int randNum = random.nextInt(9999); // generates a random integer between 1 and 99999 which is the limit

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT " + dbId.toUpperCase() + " FROM " + dbName.toUpperCase() + " WHERE USERID=" + randNum);
            // check if the generated random number recursively if it already exists in the database
            while (rs.next()) {
                randNum = random.nextInt(9999);
                rs = stmt.executeQuery("SELECT " + dbId.toUpperCase() + " FROM " + dbName.toUpperCase() + " WHERE USERID=" + randNum);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return randNum;
    }

    // Gets called after signing up or signing in
    // Sends the full name of the current user to display name
    public void readerUpInComplete(String currentUser) {
        SearchEngine searchEngine = new SearchEngine(currentUser);
        searchEngine.initialSearch(); // Readying the Search Engine
        searchEngine.setVisible(true); // <--- It goes to
    }

    // The first statement/s to be called
    public static void main(String[] args) {
        sendDisplaySignal(new MainWindow());
    }
}
