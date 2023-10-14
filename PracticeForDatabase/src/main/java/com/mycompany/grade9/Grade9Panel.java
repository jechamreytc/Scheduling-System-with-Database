/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grade9;

import com.mycompany.practicefordatabase.*;
import java.util.*;
public class Grade9Panel {
    static int counter = 1;
    public static void g9(){
        Scanner input = new Scanner(System.in);
        String [] section9 = {"9 - MODESTY","9 - FORTITUDE","9 - COURAGE","9 - COMPASSION","9 - PERSEVERANCE","Back"};
        
        
        System.out.println("Please Choose Section");
        for(String sectiong9 : section9){
            System.out.println("["+counter+"] "+sectiong9);
            counter++;
        }
        counter = 1;
        System.out.println("Enter here");
        String choice = input.nextLine();
        
        boolean repeat = true;
        while(repeat){
            if(choice.equals("1")){
                Grade9Modesty.Grade9Modesty();
            }
            else if(choice.equals("2")){
                Grade9Fortitude.Grade9Fortitude();
            }
            else if(choice.equals("3")){
                Grade9Courage.Grade9Courage();
            }
            else if(choice.equals("4")){
                Grade9Compassion.Grade9Compassion();
            }
            else if(choice.equals("5")){
                Grade9Perseverance.Grade9Perseverance();
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
