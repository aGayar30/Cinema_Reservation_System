/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author HP
 */

import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MainGUI extends JFrame implements ActionListener,Serializable {
    JFrame f=new JFrame();
    private JButton loginAdmin;
    private JButton loginUser;
    private JLabel welcome;
    private JButton back;
    private Container c;

    public MainGUI() {
        super("window");
        this.setLocationRelativeTo(null);
        //background here:
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\Cinema_Reservation_GUI_V4\\images.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.pack();
        // this.setVisible(true);
        setTitle("Cinema");
        setBounds(300, 90, 900, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        welcome = new JLabel("Welcome to CINEMA !");
        welcome.setFont(new Font("Times New Roman", Font.BOLD, 32));
        welcome.setSize(350, 50);
        welcome.setLocation(300, 30);
        welcome.setForeground(Color.white);
        loginAdmin = new JButton("Cashier");    
        loginAdmin.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                {
                    dispose();
                    new cashierGui();
                }
                });
        loginAdmin.setSize(200, 30);
        loginAdmin.setLocation(30, 500);
        
        loginUser = new JButton("User");
        loginUser.setSize(200, 30);
        loginUser.setLocation(657, 500);
        loginUser.addActionListener(new ActionListener()
                {
                     @Override
       public void actionPerformed(ActionEvent e)
        {
            dispose();
            new UserGui();
            
        }
                });
      
        
        c.add(welcome);
        c.add(loginAdmin);
        c.add(loginUser);
        setVisible(true);
        
    }
         @Override
       public void actionPerformed(ActionEvent e)
        {
        
        }
       
       public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        MainGUI mainGUI = new MainGUI();

        
        
    }

}  

