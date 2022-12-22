package TailorManagmentSystem;

import java.sql.*;

public class loginpan {
    public static Connection connection;
    public String url = "jdbd:mysql://localhost:3306/project";
    String user = "root";
    String pass = "";
    public static String sql1;
    public static String sql2;
    public static String sql3;
    ResultSet rs;


    public boolean clLogin(String u, String p) {
        boolean n = false;
        try {
            connection = DriverManager.getConnection(url, user, pass);
            sql1 = "Select Username,Password From client";
            PreparedStatement statement = connection.prepareStatement(sql1);
            rs = statement.executeQuery();
            while (rs.next()) {

                String user = rs.getString(2);
                String pass = rs.getString(3);

                if (user.equals(u) && pass.equals(p)) {
                    n = true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;

    }

    public boolean talLogin(String u, String p) {
        boolean r = false;
        try {
            connection = DriverManager.getConnection(url);
            sql2 = "Select * From tailor";
            PreparedStatement statement = connection.prepareStatement(sql2);
            rs = statement.executeQuery();
            while (rs.next()) {

                String user = rs.getString(2);
                String pass = rs.getString(3);

                if (user.equals(u)) {
                    r = true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;

    }
}


