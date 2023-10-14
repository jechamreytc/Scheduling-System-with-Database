/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicefordatabase;
import com.mycompany.grade10.Grade10Panel;
import com.mycompany.grade7.*;
import com.mycompany.grade8.Grade8Panel;
import com.mycompany.grade9.Grade9Panel;
import java.util.*;
public class AddingPanel {
    static int counter = 1;
    public static void adding(){
        Scanner input = new Scanner(System.in);
        String [] grades = {"Grade 7", "Grade 8", "Grade 9", "Grade 10","Back"};
        
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Select panel");
            for(String grade : grades){
                System.out.println("["+counter+"] "+grade);
                counter++;
            }
            counter = 1;
            System.out.println("Enter here");
            String choice = input.nextLine();
            if(choice.equals("1")){
                Grade7Panel.g7();
            }
            else if(choice.equals("2")){
                Grade8Panel.g8();
            }
            else if(choice.equals("3")){
                Grade9Panel.g9();
            }
            else if(choice.equals("4")){
                Grade10Panel.g10();
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
