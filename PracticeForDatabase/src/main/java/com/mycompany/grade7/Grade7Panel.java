/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grade7;
import com.mycompany.practicefordatabase.*;
import java.util.*;
public class Grade7Panel {
    static int counter = 1;
    public static void g7(){
        Scanner input = new Scanner(System.in);
        String [] section7 = {"7 - GENEROSITY","7 - HONESTY","7 - SERVICE","7 - SIMPLICITY","7 - OBEDIENCE","Back"};
        
        boolean repeat = true;
        while(repeat){
            System.out.println("Please Choose Section");
            for(String sectiong7 : section7){
                System.out.println("["+counter+"] "+sectiong7);
                counter++;
            }
            counter = 1;
            System.out.println("Enter here");
            String choice = input.nextLine();
            if(choice.equals("1")){
                Grade7Generosity.Grade7Generosity();
            }
            else if(choice.equals("2")){
                Grade7Honesty.Grade7Honesty();
            }
            else if(choice.equals("3")){
                Grade7Service.Grade7Service();
            }
            else if(choice.equals("4")){
                Grade7Simplicity.Grade7Simplicity();
            }
            else if(choice.equals("5")){
                Grade7Obedience.Grade7Obedience();
            }
            else if(choice.equals("6")){
                AdminPanel.admin();
            }
            else{
                System.out.println("Not in the Option");
                repeat = true;
            }
        }
    }
}
