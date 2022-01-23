/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author barkin
 */
public class Draciel extends Beyblade {
    private String bitBeast;
    
    public Draciel(String beyblader, int attack, int defense, int rotationSpeed,String bitBeast) {
        super(beyblader, attack, defense, rotationSpeed);
        this.bitBeast=bitBeast;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("BitBeast :"+ bitBeast); 
    }

    @Override
    public void bitBeastAppears() {
        System.out.println(getBeyblader()+" reveals the "+bitBeast);
        System.out.println(getBeyblader()+" defenses with Castle Defense");
    }
    
}
