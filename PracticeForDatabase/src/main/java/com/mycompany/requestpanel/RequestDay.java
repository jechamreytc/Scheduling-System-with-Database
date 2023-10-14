/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.requestpanel;
import com.mycompany.practicefordatabase.DatabaseUtil;
import java.sql.*;
import java.util.*;
public class RequestDay {
    public static void requestDay(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Name: ");
        String fname = input.next();
        System.out.println("Enter Last Name: ");
        String lname = input.next();
        System.out.println("Enter Old Day: ");
        String oldday = input.next();
        System.out.println("Enter New Day: ");
        String newday = input.next();
        System.out.println("Enter Reason for Change Time: ");
        String reasonMsg = input.next();
        
        try (Connection connection = DatabaseUtil.conn()) {
            String check = "SELECT * FROM tb_reqday WHERE req_fname = ? AND req_lname = ? AND req_oldday = ? AND req_newday = ?";
            PreparedStatement checkDuplicate = connection.prepareStatement(check);

            checkDuplicate.setString(1, fname);
            checkDuplicate.setString(2, lname);
            checkDuplicate.setString(3, oldday);
            checkDuplicate.setString(4, newday);

            ResultSet resultSet = checkDuplicate.executeQuery();

            if (resultSet.next()) {
                System.out.println("Request Pending");
            } else {
                String addTime = "INSERT INTO tb_reqday(req_fname, req_lname, req_oldday, req_newday, req_reasonmsg) VALUES(?, ?, ?, ?, ?)";
                PreparedStatement add = connection.prepareStatement(addTime);

                add.setString(1, fname);
                add.setString(2, lname);
                add.setString(3, oldday);
                add.setString(4, newday);
                add.setString(5, reasonMsg);

                int rowsUpdated = add.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Request Sent to Admin");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
