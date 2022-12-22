package TailorManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sizing extends JFrame implements ActionListener {

//  Client Kameez Pajama

    JFrame c_sp_f;
    JLabel c_sp_l;
    JButton c_sp_back;
    JTextField c_sp_srtlng;
    JTextField c_sp_chstwdth;
    JTextField c_sp_armlng;
    JTextField c_sp_armwdth;
    JTextField c_sp_colrsize;
    JTextField c_sp_cufsize;
    JTextField c_sp_trouserlngth;
    JTextField c_sp_manancwidth;
    JTextField c_sp_rance;
    JTextField c_sp_legwidth;

// tailor Kameez Pajama
    JFrame t_sp_f;
    JLabel t_sp_l;
    JButton t_sp_back;
    JTextField t_sp_srtlng;
    JTextField t_sp_chstwdth;
    JTextField t_sp_armlng;
    JTextField t_sp_armwdth;
    JTextField t_sp_colrsize;
    JTextField t_sp_cufsize;
    JTextField t_sp_trouserlngth;
    JTextField t_sp_manancwidth;
    JTextField t_sp_rance;
    JTextField t_sp_legwidth;


//  Client Kameez Shalwar

    JFrame c_sk_f;
    JLabel c_sk_l;
    JButton c_sk_back;
    JTextField c_sk_srtlng;
    JTextField c_sk_chstwdth;
    JTextField c_sk_armlng;
    JTextField c_sk_armwdth;
    JTextField c_sk_colrsize;
    JTextField c_sk_cufsize;
    JTextField c_sk_trouserlngth;
    JTextField c_sk_manancwidth;
    JTextField c_sk_rance;
    JTextField c_sk_legwidth;

    //  Tailor Kameez Shalwar

    JFrame t_sk_f;
    JLabel t_sk_l;
    JButton t_sk_back;
    JTextField t_sk_srtlng;
    JTextField t_sk_chstwdth;
    JTextField t_sk_armlng;
    JTextField t_sk_armwdth;
    JTextField t_sk_colrsize;
    JTextField t_sk_cufsize;
    JTextField t_sk_trouserlngth;
    JTextField t_sk_manancwidth;
    JTextField t_sk_rance;
    JTextField t_sk_legwidth;




    sizing(int ckp)
    {
        c_sp_f = new JFrame();
        
        this.setSize(1200,700);
        
        c_sp_l = new JLabel();
        c_sp_l.setIcon(new ImageIcon("CsizeKP.png"));
        c_sp_l.setSize(1200,700);

        c_sp_back = new JButton("C_SP_Back");
        c_sp_back.setFocusable(false);
        c_sp_back.setBounds(960,586,162,40);
        c_sp_back.setBorder(null);
        c_sp_back.setOpaque(false);

        c_sp_srtlng = new JTextField();
        c_sp_srtlng.setBounds(66,240,133,38);
        c_sp_srtlng.setBackground(new Color(217,217,217,217));
        c_sp_srtlng.setForeground(new Color(246, 80, 88, 255));
        c_sp_srtlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_srtlng.setBorder(null);

        c_sp_chstwdth = new JTextField();
        c_sp_chstwdth.setBounds(391,240,133,38);
        c_sp_chstwdth.setBackground(new Color(217,217,217,217));
        c_sp_chstwdth.setForeground(new Color(246, 80, 88, 255));
        c_sp_chstwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_chstwdth.setBorder(null);

        c_sp_armlng = new JTextField();
        c_sp_armlng.setBounds(716,240,133,38);
        c_sp_armlng.setBackground(new Color(217,217,217,217));
        c_sp_armlng.setForeground(new Color(246, 80, 88, 255));
        c_sp_armlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_armlng.setBorder(null);


        c_sp_armwdth = new JTextField();
        c_sp_armwdth.setBounds(66,330,133,38);
        c_sp_armwdth.setBackground(new Color(217,217,217,217));
        c_sp_armwdth.setForeground(new Color(246, 80, 88, 255));
        c_sp_armwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_armwdth.setBorder(null);

        c_sp_colrsize = new JTextField();
        c_sp_colrsize.setBounds(391,330,133,38);
        c_sp_colrsize.setBackground(new Color(217,217,217,217));
        c_sp_colrsize.setForeground(new Color(246, 80, 88, 255));
        c_sp_colrsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_colrsize.setBorder(null);

        c_sp_cufsize = new JTextField();
        c_sp_cufsize.setBounds(716,330,133,38);
        c_sp_cufsize.setBackground(new Color(217,217,217,217));
        c_sp_cufsize.setForeground(new Color(246, 80, 88, 255));
        c_sp_cufsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_cufsize.setBorder(null);

        c_sp_trouserlngth = new JTextField();
        c_sp_trouserlngth.setBounds(66,496,133,38);
        c_sp_trouserlngth.setBackground(new Color(217,217,217,217));
        c_sp_trouserlngth.setForeground(new Color(246, 80, 88, 255));
        c_sp_trouserlngth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_trouserlngth.setBorder(null);


        c_sp_manancwidth = new JTextField();
        c_sp_manancwidth.setBounds(91,496,133,38);
        c_sp_manancwidth.setBackground(new Color(217,217,217,217));
        c_sp_manancwidth.setForeground(new Color(246, 80, 88, 255));
        c_sp_manancwidth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_manancwidth.setBorder(null);



        c_sp_rance = new JTextField();
        c_sp_rance.setBounds(66,586,133,38);
        c_sp_rance.setBackground(new Color(217,217,217,217));
        c_sp_rance.setForeground(new Color(246, 80, 88, 255));
        c_sp_rance.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_rance.setBorder(null);



        c_sp_legwidth = new JTextField();
        c_sp_legwidth.setBounds(391,586,133,38);
        c_sp_legwidth.setBackground(new Color(217,217,217,217));
        c_sp_legwidth.setForeground(new Color(246, 80, 88, 255));
        c_sp_legwidth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sp_legwidth.setBorder(null);

        c_sp_back.addActionListener(this);


        this.add(c_sp_l);
        this.add(c_sp_back);
        this.add(c_sp_srtlng);
        this.add(c_sp_chstwdth);
        this.add(c_sp_armlng);
        this.add(c_sp_cufsize);
        this.add(c_sp_legwidth);
        this.add(c_sp_trouserlngth);
        this.add(c_sp_manancwidth);
        this.add(c_sp_rance);


        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    sizing(String cks)
    {
        c_sk_f = new JFrame();

        this.setSize(1200,700);

        c_sk_l = new JLabel();
        c_sk_l.setIcon(new ImageIcon("CsizeKS.png"));
        c_sk_l.setSize(1200,700);

        c_sk_back = new JButton("C_SP_Back");
        c_sk_back.setFocusable(false);
        c_sk_back.setBounds(960,586,162,40);
        c_sk_back.setBorder(null);
        c_sk_back.setOpaque(false);

        c_sk_srtlng = new JTextField();
        c_sk_srtlng.setBounds(66,240,133,38);
        c_sk_srtlng.setBackground(new Color(217,217,217,217));
        c_sk_srtlng.setForeground(new Color(246, 80, 88, 255));
        c_sk_srtlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_srtlng.setBorder(null);

        c_sk_chstwdth = new JTextField();
        c_sk_chstwdth.setBounds(391,240,133,38);
        c_sk_chstwdth.setBackground(new Color(217,217,217,217));
        c_sk_chstwdth.setForeground(new Color(246, 80, 88, 255));
        c_sk_chstwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_chstwdth.setBorder(null);

        c_sk_armlng = new JTextField();
        c_sk_armlng.setBounds(716,240,133,38);
        c_sk_armlng.setBackground(new Color(217,217,217,217));
        c_sk_armlng.setForeground(new Color(246, 80, 88, 255));
        c_sk_armlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_armlng.setBorder(null);


        c_sk_armwdth = new JTextField();
        c_sk_armwdth.setBounds(66,330,133,38);
        c_sk_armwdth.setBackground(new Color(217,217,217,217));
        c_sk_armwdth.setForeground(new Color(246, 80, 88, 255));
        c_sk_armwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_armwdth.setBorder(null);

        c_sk_colrsize = new JTextField();
        c_sk_colrsize.setBounds(391,330,133,38);
        c_sk_colrsize.setBackground(new Color(217,217,217,217));
        c_sk_colrsize.setForeground(new Color(246, 80, 88, 255));
        c_sk_colrsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_colrsize.setBorder(null);

        c_sk_cufsize = new JTextField();
        c_sk_cufsize.setBounds(716,330,133,38);
        c_sk_cufsize.setBackground(new Color(217,217,217,217));
        c_sk_cufsize.setForeground(new Color(246, 80, 88, 255));
        c_sk_cufsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_cufsize.setBorder(null);

        c_sk_trouserlngth = new JTextField();
        c_sk_trouserlngth.setBounds(66,496,133,38);
        c_sk_trouserlngth.setBackground(new Color(217,217,217,217));
        c_sk_trouserlngth.setForeground(new Color(246, 80, 88, 255));
        c_sk_trouserlngth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_trouserlngth.setBorder(null);


        c_sk_manancwidth = new JTextField();
        c_sk_manancwidth.setBounds(91,496,133,38);
        c_sk_manancwidth.setBackground(new Color(217,217,217,217));
        c_sk_manancwidth.setForeground(new Color(246, 80, 88, 255));
        c_sk_manancwidth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_manancwidth.setBorder(null);



        c_sk_rance = new JTextField();
        c_sk_rance.setBounds(66,586,133,38);
        c_sk_rance.setBackground(new Color(217,217,217,217));
        c_sk_rance.setForeground(new Color(246, 80, 88, 255));
        c_sk_rance.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        c_sk_rance.setBorder(null);

        c_sk_back.addActionListener(this);


        this.add(c_sk_l);
        this.add(c_sk_back);
        this.add(c_sk_srtlng);
        this.add(c_sk_chstwdth);
        this.add(c_sk_armlng);
        this.add(c_sk_cufsize);
        this.add(c_sk_trouserlngth);
        this.add(c_sk_manancwidth);
        this.add(c_sk_rance);


        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    sizing(Float tkp){
        t_sp_f = new JFrame();

        this.setSize(1200,700);

        t_sp_l = new JLabel();
        t_sp_l.setIcon(new ImageIcon("sizeKP.png"));
        t_sp_l.setSize(1200,700);

        t_sp_back = new JButton("C_SP_Back");
        t_sp_back.setFocusable(false);
        t_sp_back.setBounds(960,586,162,40);
        t_sp_back.setBorder(null);
        t_sp_back.setOpaque(false);

        t_sp_srtlng = new JTextField();
        t_sp_srtlng.setBounds(66,240,133,38);
        t_sp_srtlng.setBackground(new Color(217,217,217,217));
        t_sp_srtlng.setForeground(new Color(246, 80, 88, 255));
        t_sp_srtlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_srtlng.setBorder(null);

        t_sp_chstwdth = new JTextField();
        t_sp_chstwdth.setBounds(391,240,133,38);
        t_sp_chstwdth.setBackground(new Color(217,217,217,217));
        t_sp_chstwdth.setForeground(new Color(246, 80, 88, 255));
        t_sp_chstwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_chstwdth.setBorder(null);

        t_sp_armlng = new JTextField();
        t_sp_armlng.setBounds(716,240,133,38);
        t_sp_armlng.setBackground(new Color(217,217,217,217));
        t_sp_armlng.setForeground(new Color(246, 80, 88, 255));
        t_sp_armlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_armlng.setBorder(null);


        t_sp_armwdth = new JTextField();
        t_sp_armwdth.setBounds(66,330,133,38);
        t_sp_armwdth.setBackground(new Color(217,217,217,217));
        t_sp_armwdth.setForeground(new Color(246, 80, 88, 255));
        t_sp_armwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_armwdth.setBorder(null);

        t_sp_colrsize = new JTextField();
        t_sp_colrsize.setBounds(391,330,133,38);
        t_sp_colrsize.setBackground(new Color(217,217,217,217));
        t_sp_colrsize.setForeground(new Color(246, 80, 88, 255));
        t_sp_colrsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_colrsize.setBorder(null);

        t_sp_cufsize = new JTextField();
        t_sp_cufsize.setBounds(716,330,133,38);
        t_sp_cufsize.setBackground(new Color(217,217,217,217));
        t_sp_cufsize.setForeground(new Color(246, 80, 88, 255));
        t_sp_cufsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_cufsize.setBorder(null);

        t_sp_trouserlngth = new JTextField();
        t_sp_trouserlngth.setBounds(66,496,133,38);
        t_sp_trouserlngth.setBackground(new Color(217,217,217,217));
        t_sp_trouserlngth.setForeground(new Color(246, 80, 88, 255));
        t_sp_trouserlngth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_trouserlngth.setBorder(null);


        t_sp_manancwidth = new JTextField();
        t_sp_manancwidth.setBounds(91,496,133,38);
        t_sp_manancwidth.setBackground(new Color(217,217,217,217));
        t_sp_manancwidth.setForeground(new Color(246, 80, 88, 255));
        t_sp_manancwidth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_manancwidth.setBorder(null);



        t_sp_rance = new JTextField();
        t_sp_rance.setBounds(66,586,133,38);
        t_sp_rance.setBackground(new Color(217,217,217,217));
        t_sp_rance.setForeground(new Color(246, 80, 88, 255));
        t_sp_rance.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_rance.setBorder(null);



        t_sp_legwidth = new JTextField();
        t_sp_legwidth.setBounds(391,586,133,38);
        t_sp_legwidth.setBackground(new Color(217,217,217,217));
        t_sp_legwidth.setForeground(new Color(246, 80, 88, 255));
        t_sp_legwidth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sp_legwidth.setBorder(null);

        c_sp_back.addActionListener(this);


        this.add(t_sp_l);
        this.add(t_sp_back);
        this.add(t_sp_srtlng);
        this.add(t_sp_chstwdth);
        this.add(t_sp_armlng);
        this.add(t_sp_cufsize);
        this.add(t_sp_legwidth);
        this.add(t_sp_trouserlngth);
        this.add(t_sp_manancwidth);
        this.add(t_sp_rance);


        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    sizing(boolean tks){
        t_sk_f = new JFrame();

        this.setSize(1200,700);

        t_sk_l = new JLabel();
        t_sk_l.setIcon(new ImageIcon("CsizeKS.png"));
        t_sk_l.setSize(1200,700);

        t_sk_back = new JButton("C_SP_Back");
        t_sk_back.setFocusable(false);
        t_sk_back.setBounds(960,586,162,40);
        t_sk_back.setBorder(null);
        t_sk_back.setOpaque(false);

        t_sk_srtlng = new JTextField();
        t_sk_srtlng.setBounds(66,240,133,38);
        t_sk_srtlng.setBackground(new Color(217,217,217,217));
        t_sk_srtlng.setForeground(new Color(246, 80, 88, 255));
        t_sk_srtlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_srtlng.setBorder(null);

        t_sk_chstwdth = new JTextField();
        t_sk_chstwdth.setBounds(391,240,133,38);
        t_sk_chstwdth.setBackground(new Color(217,217,217,217));
        t_sk_chstwdth.setForeground(new Color(246, 80, 88, 255));
        t_sk_chstwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_chstwdth.setBorder(null);

        t_sk_armlng = new JTextField();
        t_sk_armlng.setBounds(716,240,133,38);
        t_sk_armlng.setBackground(new Color(217,217,217,217));
        t_sk_armlng.setForeground(new Color(246, 80, 88, 255));
        t_sk_armlng.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_armlng.setBorder(null);


        t_sk_armwdth = new JTextField();
        t_sk_armwdth.setBounds(66,330,133,38);
        t_sk_armwdth.setBackground(new Color(217,217,217,217));
        t_sk_armwdth.setForeground(new Color(246, 80, 88, 255));
        t_sk_armwdth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_armwdth.setBorder(null);

        t_sk_colrsize = new JTextField();
        t_sk_colrsize.setBounds(391,330,133,38);
        t_sk_colrsize.setBackground(new Color(217,217,217,217));
        t_sk_colrsize.setForeground(new Color(246, 80, 88, 255));
        t_sk_colrsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_colrsize.setBorder(null);

        t_sk_cufsize = new JTextField();
        t_sk_cufsize.setBounds(716,330,133,38);
        t_sk_cufsize.setBackground(new Color(217,217,217,217));
        t_sk_cufsize.setForeground(new Color(246, 80, 88, 255));
        t_sk_cufsize.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_cufsize.setBorder(null);

        t_sk_trouserlngth = new JTextField();
        t_sk_trouserlngth.setBounds(66,496,133,38);
        t_sk_trouserlngth.setBackground(new Color(217,217,217,217));
        t_sk_trouserlngth.setForeground(new Color(246, 80, 88, 255));
        t_sk_trouserlngth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_trouserlngth.setBorder(null);


        t_sk_manancwidth = new JTextField();
        t_sk_manancwidth.setBounds(91,496,133,38);
        t_sk_manancwidth.setBackground(new Color(217,217,217,217));
        t_sk_manancwidth.setForeground(new Color(246, 80, 88, 255));
        t_sk_manancwidth.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_manancwidth.setBorder(null);



        t_sk_rance = new JTextField();
        t_sk_rance.setBounds(66,586,133,38);
        t_sk_rance.setBackground(new Color(217,217,217,217));
        t_sk_rance.setForeground(new Color(246, 80, 88, 255));
        t_sk_rance.setFont(new Font("NeutraText-BookItalic", Font.PLAIN, 20));
        t_sk_rance.setBorder(null);

        c_sk_back.addActionListener(this);


        this.add(t_sk_l);
        this.add(t_sk_back);
        this.add(t_sk_srtlng);
        this.add(t_sk_chstwdth);
        this.add(t_sk_armlng);
        this.add(t_sk_cufsize);
        this.add(t_sk_trouserlngth);
        this.add(t_sk_manancwidth);
        this.add(t_sk_rance);


        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}