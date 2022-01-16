/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;
/**
 *
 * @author barkin
 */
public class Main {
    public static void main(String[] args){
        
        ATM atm = new ATM();
        Account account = new Account("Cahit Barkın Özer","1234",2000);
        atm.run(account);
        System.out.println("Exiting application...");
        
    }
    
}
