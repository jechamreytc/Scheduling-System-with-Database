/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicefordatabase;

import java.sql.*;
import java.util.*;
public class ViewAllRequest {
    public static void ViewAllRequest(){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("[1] View Time Request");
            System.out.println("[2] View Subject Request");
            System.out.println("[3] View Day Request");
            System.out.println("[4] Back");
            System.out.println("Enter here: ");
            String choice = input.nextLine();

            if(choice.equals("1")){
                try(Connection connection = DatabaseUtil.conn()){
                    if(connection != null){
                        String viewTime = "SELECT * FROM tb_reqtime";
                        PreparedStatement viewStatement = connection.prepareStatement(viewTime);

                        ResultSet resultSet = viewStatement.executeQuery();
                        
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           REQUEST TIME LIST                                                                   |");
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
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else if(choice.equals("2")){
                try(Connection connection = DatabaseUtil.conn()){
                    if(connection != null){
                        String viewTime = "SELECT * FROM tb_reqsubject";
                        PreparedStatement viewStatement = connection.prepareStatement(viewTime);

                        ResultSet resultSet = viewStatement.executeQuery();
                        
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           REQUEST SUBJECT LIST                                                                |");
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|       First Name       |         Last Name       |       Old Subject     |      New Subject     |                 Reason Message              |");
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        while(resultSet.next()){
                            String fname = resultSet.getString("req_fname");
                            String lname = resultSet.getString("req_lname");
                            String oldsubject = resultSet.getString("req_oldsubject");
                            String newsubject = resultSet.getString("req_newsubject");
                            String reqMsg = resultSet.getString("req_reasonmsg");
                            
                            printTableRow(fname,lname,oldsubject,newsubject,reqMsg);
                            System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        }
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else if(choice.endsWith("3")){
                try(Connection connection = DatabaseUtil.conn()){
                    if(connection != null){
                        String viewTime = "SELECT * FROM tb_reqday";
                        PreparedStatement viewStatement = connection.prepareStatement(viewTime);

                        ResultSet resultSet = viewStatement.executeQuery();
                        
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           REQUEST DAY LIST                                                                    |");
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|       First Name       |         Last Name       |       Old Day         |      New Day         |                 Reason Message              |");
                        System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        while(resultSet.next()){
                            String fname = resultSet.getString("req_fname");
                            String lname = resultSet.getString("req_lname");
                            String oldday = resultSet.getString("req_oldday");
                            String newday = resultSet.getString("req_newday");
                            String reqMesg = resultSet.getString("req_reasonmsg");
                            
                            printTableRow(fname,lname,oldday,newday,reqMesg);
                            System.out.println("+------------------------+-------------------------+-----------------------+----------------------+----------------------+----------------------+");
                        }
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
    private static void printTableRow(String fname, String lname,String old, String new_req, String reqMsg) {
        String row = String.format("| %-22s | %-23s | %-21s | %-20s | %-30s           |", fname,lname,old,new_req,reqMsg);
        System.out.println(row);
    }
}
