/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicefordatabase;

import java.util.*;
import java.sql.*;
public class RemovePanel {
    public static void remove(){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("Type of Request to Remove");
            System.out.println("[1] Time");
            System.out.println("[2] Subject");
            System.out.println("[3] Day");
            System.out.println("[4] Back");
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            
            if(choice.equals("1")){
                System.out.println("Enter Request I.D to Remove: ");
                String remove = input.nextLine();
                int removeToInt = Integer.parseInt(remove);
                try(Connection connection = DatabaseUtil.conn()){
                    String insertTimeToArchive = "INSERT INTO tb_archive_time(req_fname, req_lname, req_oldtime, req_newtime, req_reasonmsg) " +
                    "SELECT req_fname, req_lname, req_oldtime, req_newtime, req_reasonmsg FROM tb_reqtime WHERE req_id = ?";
                    PreparedStatement archiveStatement = connection.prepareStatement(insertTimeToArchive);
                    archiveStatement.setInt(1, removeToInt);
                    archiveStatement.executeUpdate();
                    
                    String deleteFromTimeTable = "DELETE FROM tb_reqtime WHERE req_id = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteFromTimeTable);
                    deleteStatement.setInt(1, removeToInt);
                    int deleteSuccess = deleteStatement.executeUpdate();
                    
                    if(deleteSuccess > 0){
                        System.out.println("Remove Successfully");
                        repeat = false;
                    }
                    
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else if(choice.equals("2")){
                System.out.println("Enter Request I.D to Remove: ");
                String remove = input.nextLine();
                int removeToInt = Integer.parseInt(remove);
                try(Connection connection = DatabaseUtil.conn()){
                    String insertTimeToArchive = "INSERT INTO tb_archive_subject(req_fname, req_lname, req_oldsubject, req_newsubject, req_reasonmsg) " +
                    "SELECT req_fname, req_lname, req_oldsubject, req_newsubject, req_reasonmsg FROM tb_reqtime WHERE req_id = ?";
                    PreparedStatement archiveStatement = connection.prepareStatement(insertTimeToArchive);
                    archiveStatement.setInt(1, removeToInt);
                    archiveStatement.executeUpdate();
                    
                    String deleteFromTimeTable = "DELETE FROM tb_reqsubject WHERE req_id = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteFromTimeTable);
                    deleteStatement.setInt(1, removeToInt);
                    int deleteSuccess = deleteStatement.executeUpdate();
                    
                    if(deleteSuccess > 0){
                        System.out.println("Remove Successfully");
                        repeat = false;
                    }
                    
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else if(choice.equals("3")){
                System.out.println("Enter Request I.D to Remove: ");
                String remove = input.nextLine();
                int removeToInt = Integer.parseInt(remove);
                try(Connection connection = DatabaseUtil.conn()){
                    String insertTimeToArchive = "INSERT INTO tb_archive_day(req_fname, req_lname, req_oldday, req_newday, req_reasonmsg) " +
                    "SELECT req_fname, req_lname, req_oldday, req_newday, req_reasonmsg FROM tb_reqtime WHERE req_id = ?";
                    PreparedStatement archiveStatement = connection.prepareStatement(insertTimeToArchive);
                    archiveStatement.setInt(1, removeToInt);
                    archiveStatement.executeUpdate();
                    
                    String deleteFromTimeTable = "DELETE FROM tb_reqday WHERE req_id = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteFromTimeTable);
                    deleteStatement.setInt(1, removeToInt);
                    int deleteSuccess = deleteStatement.executeUpdate();
                    
                    if(deleteSuccess > 0){
                        System.out.println("Remove Successfully");
                        repeat = false;
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
}
