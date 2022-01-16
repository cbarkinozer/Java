/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;
import java.util.*;
/**
 *
 * @author barkin
 */
public class ATM {
    public void run(Account account){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Bank...");
        System.out.println("***********************************************");
        System.out.println("User login");
        System.out.println("***********************************************");
        int chances=3;
        while(true){
            if(login.login(account)){
                System.out.println("Successfully logined...");
                break;
            }else{
                System.out.println("Login failed...");
                chances--;
                System.out.println("There are "+chances+" chances left...");
            }
            if(chances==0){
                System.out.println("You are out of chances...");
                return; //exists method
            }
            
        }
        System.out.println("***********************************************");
        String operations ="1.Show balance:\n"
                +"2.Deposit Money:\n"
                +"3.Withdraw Money:\n"
                +"To exit press: 4";
        System.out.println(operations);
        System.out.println("***********************************************");
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
