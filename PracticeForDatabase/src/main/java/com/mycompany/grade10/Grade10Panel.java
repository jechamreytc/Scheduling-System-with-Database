/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grade10;

import com.mycompany.practicefordatabase.*;
import java.util.*;
public class Grade10Panel {
    static int counter = 1;
    public static void g10(){
        Scanner input = new Scanner(System.in);
        String [] section10 = {"10 - HOPE","10 - FAITH","10 - LOYALTY","10 - CHARITY","Back"};
        
        
        System.out.println("Please Choose Section");
        for(String sectiong10 : section10){
            System.out.println("["+counter+"] "+sectiong10);
            counter++;
        }
        counter = 1;
        System.out.println("Enter here");
        String choice = input.nextLine();
        
        boolean repeat = true;
        while(repeat){
            if(choice.equals("1")){
                Grade10Hope.Grade10Hope();
            }
            else if(choice.equals("2")){
                Grade10Faith.Grade10Faith();
            }
            else if(choice.equals("3")){
                Grade10Loyalty.Grade10Loyalty();
            }
            else if(choice.equals("4")){
                Grade10Charity.Grade10Charity();
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
