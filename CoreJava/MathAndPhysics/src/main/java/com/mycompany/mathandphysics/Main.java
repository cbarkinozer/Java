
package com.mycompany.mathandphysics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Math and Physics Program");
        String operations="""
                          1.Area of the circle
                           2.Perimeter of the triangle
                           3.Vectors dot product
                           To quit: q""";
        
        while(true){
            System.out.println(operations);
            System.out.println("Select operation:");
            String operation= scanner.nextLine();
            
            if(operation.equals("q")){
                System.out.println("Quitting the program");
                return;
            }else if(operation.equals("1")){
                System.out.println("Enter r: ");
                int r= scanner.nextInt();
                Problem.Mathematic.circleArea(r);
            }else if(operation.equals("2")){
                System.out.println("Enter the 1. side of the triangle: ");
                int side1=scanner.nextInt();
                System.out.println("Enter the 2. side of the triangle: ");
                int side2=scanner.nextInt();
                System.out.println("Enter the 3. side of the triangle: ");
                int side3=scanner.nextInt();
                Problem.Mathematic.trianglePerimeter(side1, side2, side3);
            }else if(operation.equals("3")){
                Vector vector1= new Vector("Vector1");
                Vector vector2= new Vector("Vector2");
                Problem.Physics.vectorDotProduct(vector1, vector2);
            }else{
                System.out.println("Please enter a valid input");
            }
            
        }
        
        
        
    }
}
