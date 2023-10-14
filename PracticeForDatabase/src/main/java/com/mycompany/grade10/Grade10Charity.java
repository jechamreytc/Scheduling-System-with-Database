/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grade10;
import com.mycompany.practicefordatabase.DatabaseUtil;
import java.sql.*;
import java.util.*;
public class Grade10Charity {
    static int counter = 1;
    public static void Grade10Charity(){
        Scanner input = new Scanner(System.in);
        String [] day = {"monday","tuesday","wednesday","thursday","friday","Back"};
        String [] time = {"7:30-8:30","8:30-9:30","9:30-10:30","10:50-11:50","1:00-2:00","2:00-3:00","3:00-4:00","Back"};
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Select Day");
            for(String days : day){
                System.out.println("["+counter+"] "+days);
                counter++;
            }
            counter = 1;
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            
            if(choice.equals("1")){
                System.out.println("Select Time");
                for(String times : time){
                    System.out.println("["+counter+"] "+times);
                    counter++;
                }
                counter = 1;
                System.out.println("Enter here: ");
                int timeChoice = input.nextInt();
                //int timeChoiceminus = timeChoice - 1;
                
                input.nextLine();
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Subject Handle: ");
                String subject = input.nextLine();
                String nameSubject = name+"("+subject+")";
                
                try (Connection connection = DatabaseUtil.conn()) {
                    String updateQuery = "UPDATE tb_g10charity SET monday = ? WHERE monday = ? AND sched_id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

                    preparedStatement.setString(1, nameSubject);
                    preparedStatement.setString(2, "");
                    preparedStatement.setInt(3, timeChoice);

                    int rowsUpdated = preparedStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        System.out.println("Schedule Added Succesfully");
                    } else {
                        System.out.println("Schedule is not Available");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if(choice.equals("2")){
                System.out.println("Select Time");
                for(String times : time){
                    System.out.println("["+counter+"] "+times);
                    counter++;
                }
                counter = 1;
                System.out.println("Enter here: ");
                int timeChoice = input.nextInt();
                //int timeChoiceminus = timeChoice - 1;
                
                input.nextLine();
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Subject Handle: ");
                String subject = input.nextLine();
                String nameSubject = name+"("+subject+")";
                
                try (Connection connection = DatabaseUtil.conn()) {
                    String updateQuery = "UPDATE tb_g10charity SET tuesday = ? WHERE tuesday = ? AND sched_id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

                    preparedStatement.setString(1, nameSubject);
                    preparedStatement.setString(2, "");
                    preparedStatement.setInt(3, timeChoice);

                    int rowsUpdated = preparedStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        System.out.println("Schedule Added Succesfully");
                    } else {
                        System.out.println("Schedule is not Available");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if(choice.equals("3")){
                System.out.println("Select Time");
                for(String times : time){
                    System.out.println("["+counter+"] "+times);
                    counter++;
                }
                counter = 1;
                System.out.println("Enter here: ");
                int timeChoice = input.nextInt();
                //int timeChoiceminus = timeChoice - 1;
                
                input.nextLine();
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Subject Handle: ");
                String subject = input.nextLine();
                String nameSubject = name+"("+subject+")";
                
                try (Connection connection = DatabaseUtil.conn()) {
                    String updateQuery = "UPDATE tb_g10charity SET wednesday = ? WHERE wednesday = ? AND sched_id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

                    preparedStatement.setString(1, nameSubject);
                    preparedStatement.setString(2, "");
                    preparedStatement.setInt(3, timeChoice);

                    int rowsUpdated = preparedStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        System.out.println("Schedule Added Succesfully");
                    } else {
                        System.out.println("Schedule is not Available");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if(choice.equals("4")){
                System.out.println("Select Time");
                for(String times : time){
                    System.out.println("["+counter+"] "+times);
                    counter++;
                }
                counter = 1;
                System.out.println("Enter here: ");
                int timeChoice = input.nextInt();
                //int timeChoiceminus = timeChoice - 1;
                
                input.nextLine();
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Subject Handle: ");
                String subject = input.nextLine();
                String nameSubject = name+"("+subject+")";
                
                try (Connection connection = DatabaseUtil.conn()) {
                    String updateQuery = "UPDATE tb_g10charity SET thursday = ? WHERE thursday = ? AND sched_id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

                    preparedStatement.setString(1, nameSubject);
                    preparedStatement.setString(2, "");
                    preparedStatement.setInt(3, timeChoice);

                    int rowsUpdated = preparedStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        System.out.println("Schedule Added Succesfully");
                    } else {
                        System.out.println("Schedule is not Available");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if(choice.equals("5")){
                System.out.println("Select Time");
                for(String times : time){
                    System.out.println("["+counter+"] "+times);
                    counter++;
                }
                counter = 1;
                System.out.println("Enter here: ");
                int timeChoice = input.nextInt();
                //int timeChoiceminus = timeChoice - 1;
                
                input.nextLine();
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Subject Handle: ");
                String subject = input.nextLine();
                String nameSubject = name+"("+subject+")";
                
                try (Connection connection = DatabaseUtil.conn()) {
                    String updateQuery = "UPDATE tb_g10charity SET friday = ? WHERE friday = ? AND sched_id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

                    preparedStatement.setString(1, nameSubject);
                    preparedStatement.setString(2, "");
                    preparedStatement.setInt(3, timeChoice);

                    int rowsUpdated = preparedStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        System.out.println("Schedule Added Succesfully");
                    } else {
                        System.out.println("Schedule is not Available");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if(choice.equals("6")){
                Grade10Panel.g10();
            }
            else{
                System.out.println("Not in the Option");
                repeat = true;
            }
        }
    }
}
