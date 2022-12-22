package TailorManagmentSystem;

import java.sql.*;

public class db {
    Connection conn=null;
    public String url = "jdbc:ucanaccess://TMS.accdb";
//    public static String user = "root";
//    public static String pass = "";
    public String sql;
    public String sql1;
    public String sql2;
    public String sql3;
    ResultSet rs;

//    public static Connection db_project()
//    {
//        try
//
//        {
//            String url = new String();
//            String user = new String();
//            String pass = new String();
//            url = "jdbd:mysql://localhost:3306/project";
//            user = "root";
//            pass = "";
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            Connection conn = DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null,"Connection Successful");
//            return conn;
            public boolean Clogin(String u, String p) {
            boolean n = false;
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection conn = DriverManager.getConnection(url);

                sql = "Select Username,Password From client";
                PreparedStatement statement = conn.prepareStatement(sql);
                rs = statement.executeQuery();
                while (rs.next()) {

                    String user = rs.getString("Username");
                    String pass = rs.getString("Password");

                    if (u.equals(user)) {
                        if (p.equals(pass)) {
                            n = true;
                        }

                    }
                }
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return n;

        }   public boolean tlogin(String u, String p) {
            boolean n = false;
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection conn = DriverManager.getConnection(url);

                sql = "Select Username,Password From tailor";
                PreparedStatement statement = conn.prepareStatement(sql);
                rs = statement.executeQuery();
                while (rs.next()) {

                    String user = rs.getString("Username");
                    String pass = rs.getString("Password");

                    if (u.equals(user)) {
                        if (p.equals(pass)) {
                            n = true;
                        }

                    }
                }
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return n;

        }
    public void client(String u, String p, String n) {
        try {
            conn =DriverManager.getConnection(url);

            sql1 = "INSERT INTO client (id, name, username, email) VALUES (NULL, ?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql1);
            statement.setString(1, n);
            statement.setString(2, u);

            statement.setString(3, p);


            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException r) {
            r.printStackTrace();
        }
    }
    public void tailor(String u, String n, String e,String p) {
        try {
            conn =DriverManager.getConnection(url);

            sql3 = "INSERT INTO tailor (id, name, username, email, password ) VALUES (NULL, ?,?,?,?,)";

            PreparedStatement statement = conn.prepareStatement(sql3);
            statement.setString(1, n);
            statement.setString(2, u);

            statement.setString(3, e);
            statement.setString(3, p);


            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException r) {
            r.printStackTrace();
        }
    }

        }



