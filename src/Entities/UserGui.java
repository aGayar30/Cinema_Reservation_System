/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;


public class UserGui extends JFrame implements Serializable {
    private JLabel usr;
    private JLabel name;
    private JTextField nam;
    private JLabel age;
    private JTextField ag;
    private JButton cont;
    private JButton back;
    private Container c;
    private String x;
    private String y;

    public UserGui() {
        super("window");
        this.setLocationRelativeTo(null);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\Cinema_Reservation_GUI_V4\\images.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.pack();
        setTitle("Cinema");
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        usr = new JLabel("User Registration");
        usr.setFont(new Font("Arial", Font.BOLD, 28));
        usr.setLocation(320, 10);
        usr.setSize(290, 30);
        usr.setForeground(Color.white);
        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setSize(200, 25);
        name.setLocation(310, 200);
        name.setForeground(Color.white);
        nam = new JTextField();
        nam.setLocation(413, 203);
        nam.setSize(100, 20);
        age = new JLabel("Age:");
        age.setFont(new Font("Arial", Font.BOLD, 20));
        age.setSize(200, 25);
        age.setLocation(310, 230);
        age.setForeground(Color.white);
        ag = new JTextField();
        ag.setLocation(413, 233);
        ag.setSize(100, 20);
        x = nam.getText();
        
       
        cont = new JButton("continue");
        cont.setSize(100, 20);
        cont.setLocation(355, 400);
        cont.addActionListener(new loginWatcher());      
       
        back = new JButton("<<<Back");
        back.setSize(100, 20);
        back.setLocation(10, 10);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainGUI();

            }
        });
        c.add(usr);
        c.add(name);
        c.add(nam);
        c.add(age);
        c.add(ag);
        c.add(cont);
        c.add(back);
        setVisible(true);
    }
    public class loginWatcher implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int numInName=0;
            int ageNotNum=0;
            char[] chars = nam.getText().toCharArray();
            for(char c : chars) {
                if (Character.isDigit(c)) {
                    numInName = -1;
                }
            }
            char[] nums = ag.getText().toCharArray();
            for(char a : nums) {
                if (!Character.isDigit(a)) {
                    ageNotNum = -1;
                }
            }
            if(nam.getText().equals("") || ag.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please fill the quired fields!",null,JOptionPane.WARNING_MESSAGE);
                
            }

            else if(numInName == -1) {
                JOptionPane.showMessageDialog(null, "Name cannot contain numbers!", null, JOptionPane.WARNING_MESSAGE);
            }
            else if(ageNotNum == -1) {
                JOptionPane.showMessageDialog(null, "Age must be a number!", null, JOptionPane.WARNING_MESSAGE);
            }
            else if(Integer.valueOf(ag.getText()) <18)
                JOptionPane.showMessageDialog(null, "You must be 18 years or older!",null,JOptionPane.WARNING_MESSAGE);

            else{
            Customer c = new Customer(nam.getText(),Integer.parseInt(ag.getText()));
            dispose();
            new menuGui().setVisible(true);
            }
                
        }
//            
       }    }

