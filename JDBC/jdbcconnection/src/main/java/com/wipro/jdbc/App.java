package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
        String username = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection Established successfully");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            e.printStackTrace();
        }
    }
}
