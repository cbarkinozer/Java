package com.mycompany.mathandphysics;
import java.util.Scanner;

public class Vector { //3d vector
    private String name;
    private int i;
    private int j;
    private int k;
    
    public Vector(String name){
        this.name=name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter" + name +"'s i,j, and k values: ");
        this.i= scanner.nextInt();
        System.out.println("i: "+i);
        this.j=scanner.nextInt();
        System.out.println("j: "+j);
        this.k=scanner.nextInt();
        System.out.println("k: "+k);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    
    
    
    
}
