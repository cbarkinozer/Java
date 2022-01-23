/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author barkin
 */
public class Dragon extends Beyblade {
    private String bitBeast;
    private String hiddenSkill;
    
    public Dragon(String beyblader, int attack, int defense, int rotationSpeed,String bitBeast,String hiddenSkill) {
        super(beyblader, attack, defense, rotationSpeed);
        this.hiddenSkill=hiddenSkill;
        this.bitBeast=bitBeast;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("BitBeast : "+ bitBeast);
        System.out.println("Hidden skill: "+hiddenSkill);
    }

    @Override
    public void bitBeastAppears() {
        System.out.println(getBeyblader()+" reveals the "+bitBeast);
        System.out.println(getBeyblader()+" attacks with Ghost Tornado");
    }
    
    
    
}
