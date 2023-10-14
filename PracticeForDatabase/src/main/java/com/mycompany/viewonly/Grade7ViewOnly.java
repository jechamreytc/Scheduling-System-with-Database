/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viewonly;

import com.mycompany.practicefordatabase.*;
import java.sql.*;
import java.util.*;
public class Grade7ViewOnly {
    static int counter = 1;
    public static void g7viewonly(){
        Scanner input = new Scanner(System.in);
        //String [] grade7Database = {"tb_g7generosity","tb_g7honesty","tb_g7obedience","tb_g7service","tb_g7simplicity"};
        String [] section7 = {"7 - GENEROSITY","7 - HONESTY","7 - SERVICE","7 - SIMPLICITY","7 - OBEDIENCE","Back"};
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Choose Section");
            for(String sections : section7){
                System.out.println("["+counter+"]"+sections);
                counter++;
            }
            counter = 1;
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            if(choice.equals("1")){
                try (Connection connection = DatabaseUtil.conn()){
                    if (connection != null) {
                        String viewQuery = "SELECT * FROM tb_g7generosity";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("|                                          | null        | AVAILABLE                       |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           GENEROSITY                                                                |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|       Time       |         Monday       |       Tuesday        |      Wednesday       |       Thursday       |      Friday          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        
                        while (resultSet.next()) {
                            //int id = resultSet.getInt("id");
                            String time = resultSet.getString("sched_time");
                            String monday = resultSet.getString("monday");
                            String tuesday = resultSet.getString("tuesday");
                            String wednesday = resultSet.getString("wednesday");
                            String thursday = resultSet.getString("thursday");
                            String friday = resultSet.getString("friday");

                            printTableRow(time, monday, tuesday, wednesday, thursday, friday);
                            System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        }
                    }
                    boolean backReap = true;
                    while(backReap){
                        System.out.println("[1] Back to Grades Panel");
                        System.out.println("[2] Back");
                        System.out.println("Enter here: ");
                        String choice1 = input.nextLine();
                        if(choice1.equals("1")){
                            ViewSchedulePanel.viewonly();
                        }
                        else if(choice1.equals("2")){
                            backReap = false;
                            repeat = true;
                        }
                        else{
                            System.out.println("Not in the Option");
                            repeat = false;
                        }
                    }
                }
                catch (SQLException e){
                    e.printStackTrace();
                    break;
                }
            }
            else if(choice.equals("2")){
                try (Connection connection = DatabaseUtil.conn()){
                    if (connection != null) {
                        String viewQuery = "SELECT * FROM tb_g7honesty";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           HONESTY                                                                   |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|       Time       |         Monday       |       Tuesday        |      Wednesday       |       Thursday       |      Friday          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        
                        while (resultSet.next()) {
                            //int id = resultSet.getInt("id");
                            String time = resultSet.getString("sched_time");
                            String monday = resultSet.getString("monday");
                            String tuesday = resultSet.getString("tuesday");
                            String wednesday = resultSet.getString("wednesday");
                            String thursday = resultSet.getString("thursday");
                            String friday = resultSet.getString("friday");

                            printTableRow(time, monday, tuesday, wednesday, thursday, friday);
                            System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        }
                    }
                    boolean backReap = true;
                    while(backReap){
                        System.out.println("[1] Back to Grades Panel");
                        System.out.println("[2] Back");
                        System.out.println("Enter here: ");
                        String choice1 = input.nextLine();
                        if(choice1.equals("1")){
                            ViewSchedulePanel.viewonly();
                        }
                        else if(choice1.equals("2")){
                            backReap = false;
                            repeat = true;
                        }
                        else{
                            System.out.println("Not in the Option");
                            repeat = false;
                        }
                    }
                }
                catch (SQLException e){
                    e.printStackTrace();
                    break;
                }
            }
            else if(choice.equals("3")){
                try (Connection connection = DatabaseUtil.conn()){
                    if (connection != null) {
                        String viewQuery = "SELECT * FROM tb_g7obedience";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           OBEDIENCE                                                                 |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|       Time       |         Monday       |       Tuesday        |      Wednesday       |       Thursday       |      Friday          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        
                        while (resultSet.next()) {
                            //int id = resultSet.getInt("id");
                            String time = resultSet.getString("sched_time");
                            String monday = resultSet.getString("monday");
                            String tuesday = resultSet.getString("tuesday");
                            String wednesday = resultSet.getString("wednesday");
                            String thursday = resultSet.getString("thursday");
                            String friday = resultSet.getString("friday");

                            printTableRow(time, monday, tuesday, wednesday, thursday, friday);
                            System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        }
                    }
                    boolean backReap = true;
                    while(backReap){
                        System.out.println("[1] Back to Grades Panel");
                        System.out.println("[2] Back");
                        System.out.println("Enter here: ");
                        String choice1 = input.nextLine();
                        if(choice1.equals("1")){
                            ViewSchedulePanel.viewonly();
                        }
                        else if(choice1.equals("2")){
                            backReap = false;
                            repeat = true;
                        }
                        else{
                            System.out.println("Not in the Option");
                            repeat = false;
                        }
                    }
                }
                catch (SQLException e){
                    e.printStackTrace();
                    break;
                }
            }
            else if(choice.equals("4")){
                try (Connection connection = DatabaseUtil.conn()){
                    if (connection != null) {
                        String viewQuery = "SELECT * FROM tb_g7service";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           SERVICE                                                                   |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|       Time       |         Monday       |       Tuesday        |      Wednesday       |       Thursday       |      Friday          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        
                        while (resultSet.next()) {
                            //int id = resultSet.getInt("id");
                            String time = resultSet.getString("sched_time");
                            String monday = resultSet.getString("monday");
                            String tuesday = resultSet.getString("tuesday");
                            String wednesday = resultSet.getString("wednesday");
                            String thursday = resultSet.getString("thursday");
                            String friday = resultSet.getString("friday");

                            printTableRow(time, monday, tuesday, wednesday, thursday, friday);
                            System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        }
                    }
                    boolean backReap = true;
                    while(backReap){
                        System.out.println("[1] Back to Grades Panel");
                        System.out.println("[2] Back");
                        System.out.println("Enter here: ");
                        String choice1 = input.nextLine();
                        if(choice1.equals("1")){
                            ViewSchedulePanel.viewonly();
                        }
                        else if(choice1.equals("2")){
                            backReap = false;
                            repeat = true;
                        }
                        else{
                            System.out.println("Not in the Option");
                            repeat = false;
                        }
                    }
                }
                catch (SQLException e){
                    e.printStackTrace();
                    break;
                }
            }
            else if(choice.equals("5")){
                try (Connection connection = DatabaseUtil.conn()){
                    if (connection != null) {
                        String viewQuery = "SELECT * FROM tb_g7simplicity";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           SIMPLICITY                                                                |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|       Time       |         Monday       |       Tuesday        |      Wednesday       |       Thursday       |      Friday          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        
                        while (resultSet.next()) {
                            //int id = resultSet.getInt("id");
                            String time = resultSet.getString("sched_time");
                            String monday = resultSet.getString("monday");
                            String tuesday = resultSet.getString("tuesday");
                            String wednesday = resultSet.getString("wednesday");
                            String thursday = resultSet.getString("thursday");
                            String friday = resultSet.getString("friday");

                            printTableRow(time, monday, tuesday, wednesday, thursday, friday);
                            System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        }
                    }
                    boolean backReap = true;
                    while(backReap){
                        System.out.println("[1] Back to Grades Panel");
                        System.out.println("[2] Back");
                        System.out.println("Enter here: ");
                        String choice1 = input.nextLine();
                        if(choice1.equals("1")){
                            ViewSchedulePanel.viewonly();
                        }
                        else if(choice1.equals("2")){
                            backReap = false;
                            repeat = true;
                        }
                        else{
                            System.out.println("Not in the Option");
                            repeat = false;
                        }
                    }
                }
                catch (SQLException e){
                    e.printStackTrace();
                    break;
                }
            }
            else if(choice.equals("6")){
                ViewSchedulePanel.viewonly();
                break;
            }
            else{
                System.out.println("Not in the Option");
            }
        }
    }
    private static void printTableRow(String time, String monday,String tuesday, String wednesday, String thursday, String friday) {
        String row = String.format("| %-16s | %-20s | %-20s | %-20s | %-20s | %-20s |", time, monday,tuesday,wednesday,thursday,friday);
        System.out.println(row);
    }
    private static void printTableRow2(String time, String breaks){
        String row2 = String.format("| %-16s | %-20s ", time,breaks);
        System.out.println(row2);
    }
}
