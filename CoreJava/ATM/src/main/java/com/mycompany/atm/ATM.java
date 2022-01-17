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
                +"To exit press: q";
        System.out.println(operations);
        System.out.println("***********************************************");
        
        while(true){
            System.out.println("Select operation: ");
            String operation = scanner.nextLine();
            if(operation.equals("q")){
                System.out.println("Leaving the application...");
                break; //no need to return because no operation after while
            }else if(operation.equals("1")){
                System.out.println("Balance: "+account.getBalance());
            }else if(operation.equals("2")){
                System.out.println("Enter the amount you want to deposit: ");
                int amount=scanner.nextInt();
                scanner.nextLine(); //Incase user enters more than an integer
                account.depositMoney(amount);
            }else if(operation.equals("3")){
                System.out.println("Enter the amount you want to withdraw: ");
                int amount=scanner.nextInt();
                scanner.nextLine(); //Incase user enters more than an integer
                account.withdrawMoney(amount);
            }else{
                System.out.println("Please enter a valid input");
            }
   
        }

    }

}
