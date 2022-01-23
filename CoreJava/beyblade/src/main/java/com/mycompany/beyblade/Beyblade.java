/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author barkin
 */
public class Beyblade {
    private String beyblader;
    private int attack;
    private int defense;
    private int rotationSpeed;

    public Beyblade(String beyblader, int attack, int defense, int rotationSpeed) {
        this.beyblader = beyblader;
        this.attack = attack;
        this.defense = defense;
        this.rotationSpeed = rotationSpeed;
    }

    public String getBeyblader() {
        return this.beyblader;
    }

    public void setBeyblader(String beyblader) {
        this.beyblader = beyblader;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getRotationSpeed() {
        return this.rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }
    
    public void attack(){
        System.out.println(this.beyblader+" is attacking with "+
                " attack: "+this.attack+" defense: "+this.defense+
                " rotation speed: "+ this.rotationSpeed);
    }
    
    public void bitBeastAppears(){
        System.out.println("This beyblade has no bit-beast");
    }
    
    public void showInfo(){
        System.out.println("Beyblader: "+this.beyblader);
        System.out.println("Attack: "+this.attack);
        System.out.println("Defense: "+this.defense);
        System.out.println("Rotation speed: "+this.rotationSpeed);
    }
    
    
}
