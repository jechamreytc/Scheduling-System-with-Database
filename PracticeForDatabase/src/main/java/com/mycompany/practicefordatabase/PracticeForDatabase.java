/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicefordatabase;
import com.mycompany.facultypanel.FacultyPanel;
import java.sql.*;
import java.util.*;
public class PracticeForDatabase {
    
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

    public static void main(String[] args) {
        PracticeForDatabase.login();
    }
    public static void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("[1] Login");
        System.out.println("[2] Exit");
        System.out.println("Enter here: ");
        String choice = input.next();
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Please Login");
            System.out.print("Username: ");
            String username = input.next();
            System.out.print("Password: ");
            String password = input.next();
            
            if(choice.equals("1")){
                if(username.equals("Admin") && password.equals("Admin")){
                    AdminPanel.admin();
                }
                else{
                    System.out.println("Enter Code(Integer): ");
                    int code = input.nextInt();
                    try (Connection connection = conn()) {
                        if (connection != null) {
                            String selectQuery = "SELECT acc_username, acc_password, acc_code FROM tb_accounts WHERE acc_username = ? AND acc_password = ? AND acc_code = ?";
                            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                            preparedStatement.setString(1, username);
                            preparedStatement.setString(2, password);
                            preparedStatement.setInt(3, code);

                            ResultSet resultSet = preparedStatement.executeQuery();

                            if (resultSet.next()) {
                                System.out.println("Login Successfully!");
                                FacultyPanel.facultypanel();
                            }
                            else {
                                System.out.println("User not found. Please register.");
                                repeat = true;
                            }
                        }
                    }
                    catch (SQLException e) {
                    }
                }
            }
            else if(choice.equals("2")){
                System.exit(0);
            }
            else{
                System.out.println("Not in the Option");
            }
        }
    }
}
