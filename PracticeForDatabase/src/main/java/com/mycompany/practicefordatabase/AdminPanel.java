/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicefordatabase;

import com.mycompany.viewonly.ViewSchedulePanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.*;
public class AdminPanel {
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
    public static void admin(){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("| Welcome to Admin Portal |");
            System.out.println("1. Add Faculty Schedule");
            System.out.println("2. Add Faculty Account");
            System.out.println("3. View Schedule");
            System.out.println("4. Check for Request");
            System.out.println("5. Edit Schedule");
            System.out.println("6. Remove Request(Time/Subject/Day)");
            System.out.println("7. View Archive/s");
            System.out.println("8. Exit");
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            
            if(choice.equals("1")){
                AddingPanel.adding();
                repeat = false;
            }
            else if(choice.equals("2")){
                Register.registeration();
            }
            else if(choice.equals("3")){
                //ViewSchedulePanel.viewonly();
                ViewSchedulePanel.viewonly();
            }
            else if(choice.equals("4")){
                ViewAllRequest.ViewAllRequest();
            }
            else if(choice.equals("5")){
                EditingPanel.edit();
            }
            else if(choice.equals("6")){
                RemovePanel.remove();                
            }
            else if(choice.equals("7")){
                ViewArchive.viewArchive();
            }
            else if(choice.equals("8")){
                PracticeForDatabase.login();
            }
            else{
                System.out.println("Not in the Choices");
                repeat = true;
            }
        }
    }
}
