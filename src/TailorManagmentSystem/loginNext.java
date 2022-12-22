package TailorManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginNext extends JFrame implements ActionListener {

//    Tailor
    JFrame tf;
    JLabel tL;
    JButton tback;
    JButton tdetail;
    JTextField ttf;
    JTextField tname;

//    Client

    JFrame cf;
    JLabel cL;
    JButton cback;
    JButton cdetail;
    JButton placeOrder;
    JTextField ctf;
    JTextField cname;

    loginNext(String cl)
    {
        cf = new JFrame("Client Order Details");

//      Adding Screen

        cL= new JLabel();
        cL.setIcon(new ImageIcon("clientloginNext.png"));
        cL.setSize(1200,700);

//        TextFields

        ctf = new JTextField();
        ctf.setBounds(377,280,394,38);
        ctf.setBackground(new Color(217,217,217,217));
        ctf.setForeground(new Color(246, 80, 88, 255));
        ctf.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        ctf.setBorder(null);

        cname = new JTextField();
        cname.setVisible(true);
        cname.setBounds(377,359,394,38);
        cname.setBackground(new Color(217,217,217));
        cname.setForeground(new Color(246, 80, 88, 255));
        cname.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        cname.setBorder(null);

//      Button

        placeOrder = new JButton("PlaceOrder");
        placeOrder.setBounds(377,440,400,40);
        placeOrder.setBorder(null);
//        placeOrder.setBorderPainted(true);
//        placeOrder.setOpaque(false);
//        placeOrder.setContentAreaFilled(true);

        cdetail = new JButton("cdetails");
        cdetail.setBounds(615,512,162,40);
        cdetail.setBorder(null);
//        cdetail.setBorderPainted(true);
//        cdetail.setOpaque(false);
//        cdetail.setContentAreaFilled(true);

        cback = new JButton("cback");
        cback.setBounds(377,512,162,40);
        cback.setBorder(null);
//        cback.setBorderPainted(true);
//        cback.setOpaque(false);
//        cback.setContentAreaFilled(true);

//      Frame Size Setting

        this.setSize(1200,700);

//        Button Adding

        this.add(cL);
        this.add(placeOrder);
        this.add(cdetail);
        this.add(cback);
        this.add(ctf);
        this.add(cname);

//        Adding Action Listener

        cback.addActionListener(this);
        placeOrder.addActionListener(this);
        cdetail.addActionListener(this);

//        Frame Appearance Setting

        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    loginNext(int t)
    {
        tf = new JFrame("Tailor Order Details");

//      Adding Screen

        tL= new JLabel();
        tL.setIcon(new ImageIcon("tailorLoginNext.png"));
        tL.setSize(1200,700);

//        TextFields

        ttf = new JTextField();
        ttf.setBounds(405,293,394,38);
        ttf.setBackground(new Color(217,217,217,217));
        ttf.setForeground(new Color(246, 80, 88, 255));
        ttf.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        ttf.setBorder(null);

        tname = new JTextField();
        tname.setVisible(true);
        tname.setBounds(405,396,394,38);
        tname.setBackground(new Color(217,217,217));
        tname.setForeground(new Color(246, 80, 88, 255));
        tname.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        tname.setBorder(null);

//      Button

        tdetail = new JButton("tdetails");
        tdetail.setBounds(638,499,162,40);
        tdetail.setBorder(null);
//        tdetail.setBorderPainted(true);
//        tdetail.setOpaque(false);
//        tdetail.setContentAreaFilled(true);

        tback = new JButton("tback");
        tback.setBounds(400,499,162,40);
        tback.setBorder(null);
//        tback.setBorderPainted(true);
//        tback.setOpaque(false);
//        tback.setContentAreaFilled(true);

//      Frame Size Setting

        this.setSize(1200,700);

//        Button Adding

        this.add(cL);
        this.add(tdetail);
        this.add(tback);
        this.add(ttf);
        this.add(tname);

//        Adding Action Listener

        tback.addActionListener(this);

//        Frame Appearance Setting

        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("cback"))
        {
            this.dispose();
            login l = new login("cl");
        }
        else if(button.equals("tback"))
        {
            this.dispose();
            login l = new login(1);
        }
        else if (button.equals("cdetail"))
        {
            this.dispose();
            
        }
        else if (button.equals("tdetails"))
        {
            this.dispose();

        }
        else if(button.equals("PlaceOrder"))
        {
            this.dispose();

        }


    }



}
