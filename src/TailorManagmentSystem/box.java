package TailorManagmentSystem;

import netscape.javascript.JSObject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  box extends JFrame implements ActionListener {

    JFrame Sbox;
    JLabel sBox;
    JButton Sok;
    JFrame Fbox;
    JLabel fBox;
    JButton Fok;

    box(String S)
    {
        Sbox = new JFrame("Success box");

        this.setSize(400,200);

        sBox = new JLabel();
        sBox.setIcon(new ImageIcon("SBOX.png"));
        sBox.setSize(400,200);

        Sok = new JButton("SOK");
        Sok.setBounds(119,139,162,40);
        Sok.setBorder(null);
//        Sok.setBorderPainted(true);
//        Sok.setOpaque(false);
//        Sok.setContentAreaFilled(true);

        this.add(sBox);
        this.add(Sok);

        Sok.addActionListener(this);

        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    box(int F)
    {
        Fbox = new JFrame("Failed box");

        this.setSize(400,200);

        fBox = new JLabel();
        fBox.setIcon(new ImageIcon("FBOX.png"));
        fBox.setSize(400,200);

        Fok = new JButton("FOK");
        Fok.setBounds(119,139,162,40);
        Fok.setBorder(null);
//        Fok.setBorderPainted(true);
//        Fok.setOpaque(false);
//        Fok.setContentAreaFilled(true);

        this.add(fBox);
        this.add(Fok);

        Fok.addActionListener(this);

        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String button = e.getActionCommand();

        if(button.equals("SOK"))
        {
            this.dispose();
        }
        else if(button.equals("FOK"))
        {
            this.dispose();
        }


    }
}
