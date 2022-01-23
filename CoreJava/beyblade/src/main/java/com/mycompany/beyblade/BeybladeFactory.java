/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beyblade;

/**
 *
 * @author barkin
 */
public class BeybladeFactory {
    public Beyblade produceBeyblade(String beybladeType){
        if(beybladeType.equals("Dragon")){
            return new Dragon("Takao", 800, 500, 300,"Blue Dragon", "Talking with The Blue Dragon");
        }else if(beybladeType.equals("Dranza")){
            return new Dranza("Kai", 600, 300, 500,"Sacred Red Phoenix");
        }else if(beybladeType.equals("Drayga")){
            return new Drayga("Rei", 800, 600, 250,"White Tiger");
        }else if(beybladeType.equals("Draciel")){
            return new Draciel("Max", 400, 800, 400,"Dark Turtle");
        }else{
            return null;
        }
    
    }
}
