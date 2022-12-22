package TailorManagmentSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcomeScreen extends JFrame implements ActionListener {


    //    Main

    JLabel L;
    JButton Close;
    JButton admin;
    JButton client;
    JButton tailor;

    welcomeScreen()
    {

//      Adding Screen

        L= new JLabel();
        L.setIcon(new ImageIcon("MainScreen.png"));
        L.setSize(1200,700);

//        Buttons

        Close= new JButton("close");
        Close.setBounds(1160,0,40,40);
        Close.setBorder(null);
        Close.setBorderPainted(true);
        Close.setOpaque(false);
        Close.setContentAreaFilled(true);


        client = new JButton();
        client.setBounds(365,571,162,50);
        client.setBorder(null);
        client.setBorderPainted(true);
        client.setOpaque(false);
        client.setContentAreaFilled(true);

        tailor = new JButton();
        tailor.setBounds(65,571,162,50);
        tailor.setBorder(null);
        tailor.setBorderPainted(true);
        tailor.setOpaque(false);
        tailor.setContentAreaFilled(true);

//      Frame Size Setting

        this.setSize(1200,700);

//        Button Add in Frame

        this.add(L);
        this.add(Close);
        this.add(client);
        this.add(tailor);

//        Adding Action Listener

        Close.addActionListener(this);
        client.addActionListener(this);
        tailor.addActionListener(this);

//        Frame Appearance Setting

        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String button = e.getActionCommand();

        if (button.equals("close"))
        {
            this.dispose();
        }
        else if (e.getSource() == client) {

            this.dispose();
            login L = new login("s");


        }
        else if (e.getSource() == tailor)
        {
            this.dispose();
            login L = new login(1);

        }
    }

}
