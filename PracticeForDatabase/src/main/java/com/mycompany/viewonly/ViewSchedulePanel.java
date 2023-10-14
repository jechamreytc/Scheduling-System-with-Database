/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viewonly;

import com.mycompany.practicefordatabase.AdminPanel;
import java.util.*;
public class ViewSchedulePanel {
    static int counter = 1;
    public static void viewonly(){
        Scanner input = new Scanner(System.in);
        String [] grades = {"Grade 7", "Grade 8", "Grade 9", "Grade 10","Back"};
        
        
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Choose Grade");
            for(String grade : grades){
                System.out.println("["+counter+"]"+grade);
                counter++;
            }
            counter = 1;
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            if(choice.equals("1")){
                Grade7ViewOnly.g7viewonly();
            }
            else if(choice.equals("2")){
                Grade8ViewOnly.g8viewonly();
            }
            else if(choice.equals("3")){
                Grade9ViewOnly.g9viewonly();
            }
            else if(choice.equals("4")){
                Grade10ViewOnly.g10viewonly();
            }
            else if(choice.equals("5")){
                AdminPanel.admin();
            }
            else{
                System.out.println("Not in the Option");
                repeat = true;
            }
            
        }
    }
}
