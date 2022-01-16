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
public class Login {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;
        System.out.println("Please enter the username: ");
        userName= scanner.nextLine();
        System.out.println("Please enter the password: ");
        password= scanner.nextLine();
        
        if(account.getAccountName().equals(userName)&& account.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
        
    }
}
