/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicefordatabase;

import java.util.*;
import java.sql.*;
public class ViewArchive {
    public static void viewArchive(){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("View Archive");
            System.out.println("[1] Time");
            System.out.println("[2] Subject");
            System.out.println("[3] Day");
            System.out.println("[4] Back");
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            
            if(choice.equals("1")){
                try(Connection connection = DatabaseUtil.conn()){
                    String viewTimeArchive = "SELECT * FROM tb_archive_time;";
                    PreparedStatement viewStatement = connection.prepareStatement(viewTimeArchive);
                    
                    ResultSet resultSet = viewStatement.executeQuery();
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    System.out.println("|                                                           REQUEST ARCHIVE TIME LIST                                                           |");
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    System.out.println("|       First Name       |         Last Name       |       Old Time        |      New Time        |                 Reason Message              |");
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    while(resultSet.next()){
                        String fname = resultSet.getString("req_fname");
                        String lname = resultSet.getString("req_lname");
                        String oldtime = resultSet.getString("req_oldtime");
                        String newtime = resultSet.getString("req_newtime");
                        String reqMsg = resultSet.getString("req_reasonmsg");

                        printTableRow(fname,lname,oldtime,newtime,reqMsg);
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else if(choice.equals("2")){
                try(Connection connection = DatabaseUtil.conn()){
                    String viewTimeArchive = "SELECT * FROM tb_archive_subject;";
                    PreparedStatement viewStatement = connection.prepareStatement(viewTimeArchive);
                    
                    ResultSet resultSet = viewStatement.executeQuery();
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    System.out.println("|                                                        REQUEST ARCHIVE SUBJECT LIST                                                           |");
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    System.out.println("|       First Name       |         Last Name       |       Old Subject     |      New Subject     |                 Reason Message              |");
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    while(resultSet.next()){
                        String fname = resultSet.getString("req_fname");
                        String lname = resultSet.getString("req_lname");
                        String oldtime = resultSet.getString("req_oldsubject");
                        String newtime = resultSet.getString("req_newsubject");
                        String reqMsg = resultSet.getString("req_reasonmsg");

                        printTableRow(fname,lname,oldtime,newtime,reqMsg);
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else if(choice.equals("3")){
                try(Connection connection = DatabaseUtil.conn()){
                    String viewTimeArchive = "SELECT * FROM tb_archive_day;";
                    PreparedStatement viewStatement = connection.prepareStatement(viewTimeArchive);
                    
                    ResultSet resultSet = viewStatement.executeQuery();
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    System.out.println("|                                                           REQUEST ARCHIVE DAY LIST                                                            |");
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    System.out.println("|       First Name       |         Last Name       |       Old Day         |      New Day         |                 Reason Message              |");
                    System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                    while(resultSet.next()){
                        String fname = resultSet.getString("req_fname");
                        String lname = resultSet.getString("req_lname");
                        String oldtime = resultSet.getString("req_oldday");
                        String newtime = resultSet.getString("req_newday");
                        String reqMsg = resultSet.getString("req_reasonmsg");

                        printTableRow(fname,lname,oldtime,newtime,reqMsg);
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else if(choice.equals("4")){
                AdminPanel.admin();
                repeat = false;
            }
            else{
                System.out.println("Not in the Option");
                repeat = true;
            }
        }
    }
    private static void printTableRow(String fname, String lname,String old, String new_req, String reqMsg) {
        String row = String.format("| %-22s | %-23s | %-21s | %-20s | %-30s           |", fname,lname,old,new_req,reqMsg);
        System.out.println(row);
    }
}
