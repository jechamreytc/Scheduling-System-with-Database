/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.requestpanel;
import com.mycompany.practicefordatabase.DatabaseUtil;
import java.util.*;
import java.sql.*;
public class RequestTime {
    public static void requestTime(){
        Scanner input = new Scanner(System.in);
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Enter First Name: ");
            String fname = input.nextLine();
            System.out.println("Enter Last Name: ");
            String lname = input.nextLine();
            System.out.println("Enter Old Time / Format(HH:MM-HH:MM): ");
            String oldtime = input.nextLine();
            System.out.println("Enter New Time / Format(HH:MM-HH:MM): ");
            String newtime = input.nextLine();
            System.out.println("Enter Reason for Change Time: ");
            String reasonMsg = input.nextLine();
            
            boolean conRepeat = true;
            while(conRepeat){
                
                System.out.println("Confirm? (y/n): ");
                String confirm = input.nextLine();
                if(confirm.equalsIgnoreCase("y")){
                    try (Connection connection = DatabaseUtil.conn()) {
                        String check = "SELECT * FROM tb_reqtime WHERE req_fname = ? AND req_lname = ? AND req_oldtime = ? AND req_newtime = ?";
                        PreparedStatement checkDuplicate = connection.prepareStatement(check);

                        checkDuplicate.setString(1, fname);
                        checkDuplicate.setString(2, lname);
                        checkDuplicate.setString(3, oldtime);
                        checkDuplicate.setString(4, newtime);

                        ResultSet resultSet = checkDuplicate.executeQuery();

                        if (resultSet.next()) {
                            System.out.println("Request Pending");
                        } else {
                            String addTime = "INSERT INTO tb_reqtime(req_fname, req_lname, req_oldtime, req_newtime, req_reasonmsg) VALUES(?, ?, ?, ?, ?)";
                            PreparedStatement add = connection.prepareStatement(addTime);

                            add.setString(1, fname);
                            add.setString(2, lname);
                            add.setString(3, oldtime);
                            add.setString(4, newtime);
                            add.setString(5, reasonMsg);

                            int rowsUpdated = add.executeUpdate();

                            if (rowsUpdated > 0) {
                                System.out.println("Request Sent to Admin");
                                repeat = false;
                                conRepeat = false;
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                else if(confirm.equalsIgnoreCase("n")){
                    repeat = true;
                }
                else{
                    System.out.println("Not in the Option");
                    repeat = false;
                    conRepeat = true;
                }
            }
        }
    }
}
