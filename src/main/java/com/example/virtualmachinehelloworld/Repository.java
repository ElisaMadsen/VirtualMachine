package com.example.virtualmachinehelloworld;

import java.sql.*;

public class Repository {

    static Connection con;
    static Statement stmt;

    static ResultSet rs;

    public static void connectDB() {
        try {
            String url = "jdbc:mysql://20.238.83.61:3306/users";
            con = DriverManager.getConnection(url, "root", "azure123");

            System.out.println("Ok, we have a connection.");

        } catch (SQLException e) {
            System.out.println("Cannot connect to database");
            e.printStackTrace();
        }
    }

    public static String fetchName() throws SQLException {
        String printedName = "";
        stmt = con.createStatement();

        String getValues = "SELECT * from users.user";

        rs = stmt.executeQuery(getValues);

        while(rs.next())
        {
            String name= rs.getString("name");

            System.out.println("\tName = " + name);
        }
        return printedName;
    }
}
