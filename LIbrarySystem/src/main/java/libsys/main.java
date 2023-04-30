/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package libsys;

import javax.swing.JFrame;


public class main {
    
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
