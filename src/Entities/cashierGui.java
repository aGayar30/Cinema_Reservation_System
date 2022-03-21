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
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;


public class cashierGui extends JFrame implements Serializable {

    private JLabel choose;
    private JLabel usage;
    private JButton addparty;
    private JButton back;
    private Container c;

    public cashierGui() {
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
        choose = new JLabel("Choose your operation");
        choose.setFont(new Font("Arial", Font.BOLD, 28));
        choose.setSize(350, 50);
        choose.setLocation(280, 10);
        choose.setForeground(Color.white);
        addparty = new JButton("Add Party");
        addparty.setSize(200, 50);
        addparty.setLocation(310, 110);
        addparty.setFont(new Font("Arial", Font.BOLD, 17));  
        addparty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Scanner scanner = new Scanner(System.in);
                Party.CreateParty(scanner);
                dispose();
                new MainGUI();
        }
            
        });
        
        //hint to user on how to add party
        usage = new JLabel("(Use command line to add party)");
        usage.setFont(new Font("Arial", Font.BOLD, 18));
        usage.setSize(350, 150);
        usage.setLocation(280, 310);
        usage.setForeground(Color.white);

        back = new JButton("back");
        back.setSize(100, 20);
        back.setLocation(10, 10);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainGUI();
            }
        });
        
       /*editRest.addActionListener(new editRestWatcher());*/
        c.add(choose);
        c.add(addparty);
        c.add(usage);
        c.add(back);
        
        setVisible(true);
    }  
}
