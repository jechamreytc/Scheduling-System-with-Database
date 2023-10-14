/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viewonly;
import com.mycompany.practicefordatabase.*;
import java.util.*;
import java.sql.*;
public class Grade9ViewOnly {
    static int counter = 1;
    public static void g9viewonly(){
        Scanner input = new Scanner(System.in);
        String [] section9 = {"9 - MODESTY","9 - FORTITUDE","9 - COURAGE","9 - COMPASSION","9 - PERSEVERANCE","Back"};
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Choose Section");
            for(String sections : section9){
                System.out.println("["+counter+"]"+sections);
                counter++;
            }
            counter = 1;
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            if(choice.equals("1")){
                try (Connection connection = DatabaseUtil.conn()){
                    if (connection != null) {
                        String viewQuery = "SELECT * FROM tb_g9modesty";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           MODESTY                                                                   |");
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
                        String viewQuery = "SELECT * FROM tb_g9fortitude";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           FORTITUDE                                                                 |");
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
                        String viewQuery = "SELECT * FROM tb_g9courage";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           COURAGE                                                                   |");
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
                        String viewQuery = "SELECT * FROM tb_g9compassion";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           COMPASSION                                                                |");
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
                        String viewQuery = "SELECT * FROM tb_g9perseverance";
                        PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                          | This schedules are intended for the Following |                                          |");
                        System.out.println("|                                          | 6:45-7:10   | ROSARY                          |                                          |");
                        System.out.println("|                                          | 7:10-7:30   | FLAG CEREMONY/MORNING PRAISE    |                                          |");
                        System.out.println("|                                          | 10:30-10:50 | RECESS                          |                                          |");
                        System.out.println("|                                          | 12:00-1:00  | LUNCH BREAK                     |                                          |");
                        System.out.println("+------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
                        System.out.println("|                                                           PERSEVERANCE                                                              |");
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
}
