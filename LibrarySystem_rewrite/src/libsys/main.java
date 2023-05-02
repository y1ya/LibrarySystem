
package libsys;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class main extends javax.swing.JFrame{
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel LoginModel = new DefaultTableModel();
    int newUserID, txt_userid, i;
    String newPass, txt_pass, user, pass, u, p, n, ut, temp_user, temp_pass;
    
    public void mainConnect() {
        try {
            String host = "jdbc:derby://localhost:1527/accounts1";
            String uName = "userdb";
            String uPass = "1234";
            
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM USERDB.ACCOUNTS";
            rs = stmt.executeQuery(sql);
        } catch (SQLException err){
            JOptionPane.showMessageDialog(main.this, err.getMessage());
        }
    }
    
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
    public static void sendDisplaySignal(JFrame sig)
    {
        JFrame[] jframe = {new MainWindow(), new ReaderSignIn(), new ReaderSignUp()};
        for (JFrame jframe1 : jframe) {
            if (jframe1.getClass().equals(sig.getClass())) {
                jframe1.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new MainWindow().setVisible(true);    
    }
}
