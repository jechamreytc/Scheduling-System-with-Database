/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grade8;
import com.mycompany.practicefordatabase.*;
import java.util.*;
public class Grade8Panel {
    static int counter = 1;
    public static void g8(){
        Scanner input = new Scanner(System.in);
        String [] section8 = {"8 - HUMILITY","8 - PRODUCE","8 - JUSTICE","8 - WISDOM","8 - MERCY","Back"};
        
        
        System.out.println("Please Choose Section");
        for(String sectiong8 : section8){
            System.out.println("["+counter+"] "+sectiong8);
            counter++;
        }
        counter = 1;
        System.out.println("Enter here");
        String choice = input.nextLine();
        
        boolean repeat = true;
        while(repeat){
            if(choice.equals("1")){
                Grade8Humility.Grade8Humility();
            }
            else if(choice.equals("2")){
                Grade8Produce.Grade8Produce();
            }
            else if(choice.equals("3")){
                Grade8Justice.Grade8Justice();
            }
            else if(choice.equals("4")){
                Grade8Wisdom.Grade8Wisdom();
            }
            else if(choice.equals("5")){
                Grade8Mercy.Grade8Mercy();
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
