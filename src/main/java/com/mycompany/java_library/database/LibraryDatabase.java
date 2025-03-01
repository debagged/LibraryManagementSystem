/*
Your account number is: 1156224

Your new database is now ready to use.

To connect to your database use these details;

Host: sql12.freesqldatabase.com
Database name: sql12760486
Database user: sql12760486
Database password: jI9XVI7NbD
Port number: 3306
jdbc:mysql://sql12.freesqldatabase.com:3306/sql12760486?zeroDateTimeBehavior=CONVERT_TO_NULL
*/



package com.mycompany.java_library.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryDatabase {

    public static void main(String[] args) {
        // Corrected URL, username, and password
        String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12760486?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "sql12760486";
        String password = "jI9XVI7NbD";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            Statement command = connection.createStatement();
//            ResultSet result = command.executeQuery("Select * from students_info");
//            
//            while(result.next()){
//                String name = result.getString("first_name");
//                System.out.println(name);
//            }
//            
            System.out.println("Connected");
            
        } catch (SQLException e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
    }
}

