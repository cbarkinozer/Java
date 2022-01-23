/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;
import java.util.*;
/**
 *
 * @author barkin
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Beyblade Game");
        System.out.println("To exit, enter q");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Select the beyblade you want to produce:");
            
            System.out.println("Dranza, Drayga, Draciel, Dragon");
            String operation = scanner.nextLine();
            if(operation.equals("q")){
                System.out.println("Exiting the program");
                return;
            }else{
                BeybladeFactory beybladeFactory = new BeybladeFactory();
                Beyblade beyblade = beybladeFactory.produceBeyblade(operation);
                
                if(beyblade==null){
                    System.out.println("Please enter a valid bayblade");
                }else{
                    beyblade.showInfo();
                    beyblade.attack();
                    beyblade.bitBeastAppears();
                }
                
            }
        }
    }
}
