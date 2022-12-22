package TailorManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

//   Client Login

    public static String cl;
    public static int t;
    JFrame cf;
    JLabel cL;
    JTextField ctf;
    JPasswordField cpf;
    JButton cLogin;
    JButton cRegister;
    JButton cback;

//   Tailor Login

    JFrame tf;
    JLabel tL;
    JTextField ttf;
    JPasswordField tpf;
    JButton tLogin;
    JButton tRegister;
    JButton tback;



    login(String cl)
    {
        cf = new JFrame("Client_Login");

//      Adding Screen

        cL= new JLabel();
        cL.setIcon(new ImageIcon("clientlogin.png"));
        cL.setSize(1200,700);


//        TextFields

        ctf = new JTextField();
        ctf.setBounds(380,280,394,38);
        ctf.setBackground(new Color(217,217,217,217));
        ctf.setForeground(new Color(246, 80, 88, 255));
        ctf.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        ctf.setBorder(null);


//        Password Fields

        cpf = new JPasswordField();
        cpf.setVisible(true);
        cpf.setEchoChar('\u26ab');
        cpf.setBounds(380,359,394,38);
        cpf.setBackground(new Color(217,217,217));
        cpf.setForeground(new Color(246, 80, 88, 255));
        cpf.setBorder(null);

//      Button

        cLogin = new JButton("clogin");
        cLogin.setBounds(377,440,400,40);
        cLogin.setBorder(null);
        cLogin.setBorderPainted(true);
        cLogin.setOpaque(false);
        cLogin.setContentAreaFilled(true);

        cRegister = new JButton("cRegister");
        cRegister.setBounds(615,512,162,40);
        cRegister.setBorder(null);
        cRegister.setBorderPainted(true);
        cRegister.setOpaque(false);
        cRegister.setContentAreaFilled(true);

        cback = new JButton("back");
        cback.setBounds(377,512,162,40);
        cback.setBorder(null);
        cback.setBorderPainted(true);
        cback.setOpaque(false);
        cback.setContentAreaFilled(true);

//      Frame Size Setting

        this.setSize(1200,700);

//        Button Adding

        this.add(cL);
        this.add(cLogin);
        this.add(cRegister);
        this.add(cback);
        this.add(ctf);
        this.add(cpf);

//        Adding Action Listener

        cback.addActionListener(this);
        cRegister.addActionListener(this);
        cLogin.addActionListener(this);

//        Frame Appearance Setting

        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

//    Tailor Log In

    login(int t)
    {
        tf = new JFrame("Tailor_Login");

//      Adding Screen

        tL= new JLabel();
        tL.setIcon(new ImageIcon("tailorlogin.png"));
        tL.setSize(1200,700);

        //        TextFields

        ttf = new JTextField();
        ttf.setBounds(380,283,394,35);
        ttf.setBackground(new Color(217,217,217,217));
        ttf.setForeground(new Color(229, 137, 71, 255));
        ttf.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        ttf.setBorder(null);


//        Password Fields

        tpf = new JPasswordField();
        tpf.setVisible(true);
        tpf.setEchoChar('\u26ab');
        tpf.setBounds(380,362,394,35);
        tpf.setBackground(new Color(217,217,217));
        tpf.setForeground(new Color(229, 137, 71, 255));
        tpf.setBorder(null);

//      Button

        tLogin = new JButton("tlogin");
        tLogin.setBounds(377,440,400,40);
        tLogin.setBorder(null);
//        tLogin.setBorderPainted(true);
//        tLogin.setOpaque(false);
//        tLogin.setContentAreaFilled(true);

        tRegister = new JButton("tRegister");
        tRegister.setBounds(640,512,162,40);
        tRegister.setBorder(null);
//        tRegister.setBorderPainted(true);
//        tRegister.setOpaque(false);
//        tRegister.setContentAreaFilled(true);

        tback = new JButton("back");
        tback.setBounds(377,512,162,40);
        tback.setBorder(null);
//        tback.setBorderPainted(true);
//        tback.setOpaque(false);
//        tback.setContentAreaFilled(true);

//      Frame Size Setting

        this.setSize(1200,700);

//        Button Adding

        this.add(tL);
        this.add(tLogin);
        this.add(tRegister);
        this.add(tback);
        this.add(ttf);
        this.add(tpf);

//        Adding Action Listener

        tback.addActionListener(this);
        tRegister.addActionListener(this);
        tLogin.addActionListener(this);

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

        if (button.equals("back"))
        {
            this.dispose();
            welcomeScreen ws = new welcomeScreen();
        }
        else if (button.equals("cRegister"))
        {
            register r = new register("cl");
//            String Sql = "insert into client(Username,Name,Email,Password)values(?,?,?,?)";
            this.dispose();
        }
        else if (button.equals("tRegister"))
        {
            register r = new register(1);
            this.dispose();
        }
        else if (e.getSource()==cLogin)
        {
            loginpan lp = new loginpan();
            if(lp.clLogin(ctf.getText(),String.valueOf(cpf.getPassword()))==true){
                db d = new db();
//                db.Clogin(ctf.getText());
                loginNext od = new loginNext("S");
        }
            this.dispose();
            box b = new box(1);
//            loginNext od = new loginNext("S");
        }
        else if(button.equals("tlogin"))
        {
            this.dispose();
            loginNext od = new loginNext(1);
        }

    }
}