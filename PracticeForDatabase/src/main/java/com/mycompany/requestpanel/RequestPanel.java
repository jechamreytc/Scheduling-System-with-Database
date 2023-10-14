/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.requestpanel;
import com.mycompany.facultypanel.FacultyPanel;
import java.util.*;
public class RequestPanel {
    public static void AllRequest(){
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("Type of Request");
            System.out.println("[1] Change of Time");
            System.out.println("[2] Change of Subject");
            System.out.println("[3] Change of Day");
            System.out.println("[4] Back");
            System.out.println("Enter here: ");
            String choice = input.nextLine();
            
            if(choice.equals("1")){
                RequestTime.requestTime();
                repeat = false;
            }
            else if(choice.equals("2")){
                RequestSubject.requestSubject();
                repeat = false;
            }
            else if(choice.equals("3")){
                RequestDay.requestDay();
                repeat = false;
            }
            else if(choice.equals("4")){
                FacultyPanel.facultypanel();
                repeat = false;
            }
            else{
                System.out.println("Not in the Option");
                repeat = true;
            }
        }
    }
}
