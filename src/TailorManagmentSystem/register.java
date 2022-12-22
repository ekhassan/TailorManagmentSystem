package TailorManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class register extends JFrame implements ActionListener {

    public static Connection connection;
    public String url = "jdbc:ucanaccess://TMS.accdb";

    db database = new db();
    public static String un;
    public static String n;
    public static String em;
    public static String ps;
    public String Cnpass;
    PreparedStatement statement;
    ResultSet rs;
//    Client

    JFrame crf;
    JLabel cre;
    JButton cback;
    JButton clientreg;
    JTextField cuname;
    JTextField cfname;
    JPasswordField cpass;
    JPasswordField ccnpass;
    JTextField cemail;

//    Tailor

    JFrame trf;
    JLabel tre;
    JButton tback;
    JButton tailorreg;
    JTextField tuname;
    JTextField tfname;
    JPasswordField tpass;
    JPasswordField tcnpass;
    JTextField temail;

    register(String cl) {

        crf = new JFrame();

//      Adding Screen

        cre = new JLabel();
        cre.setIcon(new ImageIcon("clientRegister.png"));
        cre.setSize(1200, 700);
        cre.setVisible(true);

//        TextFields

        cuname = new JTextField();
        cuname.setBounds(54, 221, 394, 35);
        cuname.setBackground(new Color(217, 217, 217, 217));
        cuname.setForeground(new Color(246, 80, 88, 255));
        cuname.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        cuname.setBorder(null);

        cfname = new JTextField();
        cfname.setBounds(54, 314, 394, 35);
        cfname.setBackground(new Color(217, 217, 217, 217));
        cfname.setForeground(new Color(246, 80, 88, 255));
        cfname.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        cfname.setBorder(null);

        cemail = new JTextField();
        cemail.setBounds(54, 409, 394, 35);
        cemail.setBackground(new Color(217, 217, 217, 217));
        cemail.setForeground(new Color(246, 80, 88, 255));
        cemail.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        cemail.setBorder(null);


//        Password Fields

        cpass = new JPasswordField();
        cpass.setVisible(true);
        cpass.setEchoChar('\u26ab');
        cpass.setBounds(663, 254, 394, 35);
        cpass.setBackground(new Color(217, 217, 217));
        cpass.setForeground(new Color(246, 80, 88, 255));
        cpass.setBorder(null);

        ccnpass = new JPasswordField();
        ccnpass.setVisible(true);
        ccnpass.setEchoChar('\u26ab');
        ccnpass.setBounds(663, 348, 394, 35);
        ccnpass.setBackground(new Color(217, 217, 217));
        ccnpass.setForeground(new Color(246, 80, 88, 255));
        ccnpass.setBorder(null);

//      Back Button

        clientreg = new JButton("clientregister");
        clientreg.setBounds(610, 528, 162, 40);
        clientreg.setBorder(null);
//        clientreg.setBorderPainted(true);
//        clientreg.setOpaque(false);
//        clientreg.setContentAreaFilled(true);

        cback = new JButton("cback");
        cback.setBounds(370, 528, 162, 40);
        cback.setBorder(null);
//        cback.setBorderPainted(true);
//        cback.setOpaque(false);
//        cback.setContentAreaFilled(true);

//      Setting Size

        this.setSize(1200, 700);

//      Button Adding in frame

        this.add(cback);
        this.add(clientreg);
        this.add(cre);
        this.add(cuname);
        this.add(cfname);
        this.add(cpass);
        this.add(ccnpass);
        this.add(cemail);

//      Add action listener

        cback.addActionListener(this);
//        creg.addActionListener(this);
        clientreg.addActionListener(this);

//      Appearance of Frame

        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    register(int t) {

        trf = new JFrame();

//      Adding Screen

        tre = new JLabel();
        tre.setIcon(new ImageIcon("tailorRegister.png"));
        tre.setSize(1200, 700);
        tre.setVisible(true);

//        TextFields

        tuname = new JTextField();
        tuname.setBounds(54, 221, 394, 35);
        tuname.setBackground(new Color(217, 217, 217, 217));
        tuname.setForeground(new Color(229, 137, 71, 255));
        tuname.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        tuname.setBorder(null);

        tfname = new JTextField();
        tfname.setBounds(54, 314, 394, 35);
        tfname.setBackground(new Color(217, 217, 217, 217));
        tfname.setForeground(new Color(229, 137, 71, 255));
        tfname.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        tfname.setBorder(null);

        temail = new JTextField();
        temail.setBounds(54, 409, 394, 35);
        temail.setBackground(new Color(217, 217, 217, 217));
        temail.setForeground(new Color(229, 137, 71, 255));
        temail.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        temail.setBorder(null);


//        Password Fields

        tpass = new JPasswordField();
        tpass.setVisible(true);
        tpass.setEchoChar('\u26ab');
        tpass.setBounds(663, 254, 394, 35);
        tpass.setBackground(new Color(217, 217, 217));
        tpass.setForeground(new Color(229, 137, 71, 255));
        tpass.setBorder(null);

        tcnpass = new JPasswordField();
        tcnpass.setVisible(true);
        tcnpass.setEchoChar('\u26ab');
        tcnpass.setBounds(663, 348, 394, 35);
        tcnpass.setBackground(new Color(217, 217, 217));
        tcnpass.setForeground(new Color(229, 137, 71, 255));
        tcnpass.setBorder(null);

//      Back Button

        tailorreg = new JButton("tailorregister");
        tailorreg.setBounds(610, 528, 162, 40);
        tailorreg.setBorder(null);
//        tailorreg.setBorderPainted(true);
//        tailorreg.setOpaque(false);
//        tailorreg.setContentAreaFilled(true);

        tback = new JButton("tback");
        tback.setBounds(370, 528, 162, 40);
        tback.setBorder(null);
//        tback.setBorderPainted(true);
//        tback.setOpaque(false);
//        tback.setContentAreaFilled(true);

//      Setting Size

        this.setSize(1200, 700);

//      Button Adding in frame

        this.add(tback);
        this.add(tailorreg);
        this.add(tre);
        this.add(tuname);
        this.add(tfname);
        this.add(tpass);
        this.add(tcnpass);
        this.add(temail);

//      Add action listener

        tback.addActionListener(this);
        tailorreg.addActionListener(this);


//      Appearance of Frame

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
        if(button.equals(clientreg)){
            System.out.println("Saim");
        }
        if(button.equals(tailorreg)){
            System.out.println("Saim");
        }

    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String button = e.getActionCommand();
//
//        if (button.equals(cback)) {
//            this.dispose();
//            login l = new login("cl");
//        } else if (button.equals("tback")) {
//            this.dispose();
//            login l = new login(1);
//        } else if (button.equals(clientreg)) {
//            System.out.println(ccnpass.getText());
//        }
////            if (ccnpass.getText().equals(cpass.getText())) {
//////                JOptionPane.showMessageDialog(null,"Password");
////
//////                try {
//////                    database.client(cuname.getText(), cfname.getText(), cpass.getText());
//////                } catch (Exception ea) {
//////                    ea.printStackTrace();
//////                }
//////                this.dispose();
//////                box b = new box(1);
//////                login l = new login('c');
////            } else if (button.equals(tailorreg)) {
////               if (tcnpass.getText().equals(tpass.getText())) {
////                    String taipass = tcnpass.getText();
////                    String ctpass = tpass.getText();
////                    }
////                    this.dispose();
////                   db d = new db();
////                System.out.println(tuname.getText());
////                   d.tailor(tuname.getText(),tfname.getText(),temail.getText(),tpass.getText());
////                    box b = new box("a");
////                    b.setVisible(true);
////
//////             login l = new login(1);
////
////                }
//            }
        }


//        else if (button.equals("trsignup"))
//        {
//
//        }












