/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facultypanel;
import com.mycompany.practicefordatabase.*;
import java.sql.*;
import java.util.*;
public class Request {
    static int counter = 1;
    public static void req(){
        Scanner input = new Scanner(System.in);
        String [] g7database = {"tb_g7generosity", "tb_g7honesty"};
        String [] grade7 = {"7 - GENEROSITY", "7 - HONESTY"};
        for(String grades : grade7){
            System.out.println("["+counter+"]"+grades);
            counter++;
        }
        counter = 1;
        System.out.println("Enter here: ");
        String section = input.nextLine();
        int sectionToInt = Integer.parseInt(section);
        int sectionToIntMinus = sectionToInt - 1;
        
        //System.out.println("Enter your name: ");
        //String name = input.nextLine();
        
        System.out.println(sectionToIntMinus);
        System.out.println("Enter ID: ");
        int id = input.nextInt();
        try (Connection connection = DatabaseUtil.conn()) {
            String checkQuery = "SELECT * FROM "+ g7database[sectionToIntMinus] +" WHERE monday IS NOT NULL AND sched_id = ?";
            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);

            //checkStatement.setInt(1, id);
            checkStatement.setInt(1, id);
            
            ResultSet resultSet = checkStatement.executeQuery();

            if(resultSet.next()){
                System.out.println("This Schedule is Already Taken");
            }
            else{
                System.out.println("Successfully Requested");
            }
                    
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
