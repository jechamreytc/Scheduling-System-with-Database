/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facultypanel;
import com.mycompany.requestpanel.*;
import com.mycompany.practicefordatabase.PracticeForDatabase;
import com.mycompany.viewonly.ViewSchedulePanel;
import java.util.*;
public class FacultyPanel {
    static int counter = 1;
    public static void facultypanel(){
        Scanner input = new Scanner(System.in);
        //String [] grades = {"Grade 7", "Grade 8", "Grade 9", "Grade 10"};
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Select Option");
            System.out.println("[1] View Schedules");
            System.out.println("[2] Request Schedule");
            System.out.println("[3] Exit");
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            
            if(choice.equals("1")){
                ViewSchedulePanel.viewonly();
                repeat = false;
            }
            else if(choice.equals("2")){
                RequestPanel.AllRequest();
                repeat = false;
            }
            else if(choice.equals("3")){
                PracticeForDatabase.login();
                repeat = false;
            }
            else{
                System.out.println("Not in the Option");
                repeat = true;
            }
        }
    }
}
