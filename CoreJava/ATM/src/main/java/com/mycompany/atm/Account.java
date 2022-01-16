/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;
/**
 *
 * @author barkin
 */
public class Account {
    private String accountName;
    private String password;
    private int balance;
    
    
    public Account(String accountName,String password,int balance){
        this.accountName=accountName;
        this.password=password;
        this.balance=balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void depositMoney(int amount){
        this.balance+=amount;
        System.out.println("New balance: "+this.balance);
    }
    public void withdrawMoney(int amount){
        if(this.balance-amount<0){
            System.out.println("You do not have enough amount");
        }else{
            this.balance-=amount;
            System.out.println("New balance: "+this.balance);
        }
        
    }
    
    
    
}
