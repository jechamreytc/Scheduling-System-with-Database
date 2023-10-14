/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicefordatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Register {
    
    public static Connection conn(){
        try{
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "admin";
            String password = "admin";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;
            
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("Error");
        }
        return null;
    }
    
    public static void registeration(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter firstname: ");
        String fname = input.nextLine();
        System.out.println("Enter lastname: ");
        String lname = input.nextLine();
        System.out.println("Enter username: ");
        String userName = input.nextLine();
        System.out.println("Enter password: ");
        String userPassword = input.nextLine();
        int max = 100000;
        int min = 999999;
        
        int randomCode = random.nextInt((max - min + 1) + min);
        
            try (Connection connection = conn()) {
                if (connection != null) {
                    String insertQuery = "INSERT INTO tb_accounts (acc_fname, acc_lname, acc_username, acc_password, acc_code) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                    preparedStatement.setString(1, fname);
                    preparedStatement.setString(2, lname);
                    preparedStatement.setString(3, userName);
                    preparedStatement.setString(4, userPassword);
                    preparedStatement.setInt(5, randomCode);

                    int rowsInserted = preparedStatement.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("Data inserted successfully.");
                    } else {
                        System.out.println("Failed to insert data.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
