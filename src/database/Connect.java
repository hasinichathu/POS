package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connect {

    Connection a;
    private String url;
    private String driver;
    private String uname;
    private String pword;
    private String dbname;

    public Connection Conn() {
        a = null;
        url = "jdbc:mysql://localhost:3306/";
        driver = "com.mysql.jdbc.Driver";
        uname = "root";
        pword = "";
        dbname = "posnew";
        try {
            Class.forName(driver).newInstance();
            a = DriverManager.getConnection(url + dbname, uname, pword);
            System.out.println("Connected");


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return a;
    }

    public ResultSet getQuery(String query) {
        ResultSet r = null;
        try {
            a = Conn();

            Statement s = Conn().createStatement();
            r = s.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);

            JOptionPane.showMessageDialog(null, ex);
        }
        return r;
    }

    public boolean setQuery(String query) {

        try {
            a = Conn();
         
            Statement s = Conn().createStatement();
            s.execute(query);
           
            return true; // query sucessfull
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
            return false; // query failed
        } finally {
            try {
                a.close();
                System.out.println("Connection closed");
            } catch (SQLException ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
                System.out.println(ex);
            }

        }

    }

    public int setQuery(String query, String column_name) {
        int i = 0;
        try {
            a = Conn();

            Statement stmt = Conn().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = stmt.getGeneratedKeys();
            while (res.next()) {
                System.out.println("Generated key: " + res.getInt(1));
                i = res.getInt(1);

            }
            return i;

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);

            return i;
        }

    }

     

       
}
