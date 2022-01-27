
package com.mycompany.mathandphysics;

public class Problem {
    public static class Mathematic{
        public static void circleArea(int r){
            System.out.println("The circle's area: "+ (Math.PI*Math.pow(r, 2)));
        }
        public static void trianglePerimeter(int side1,int side2, int side3){
            System.out.println("The perimeter of the triangle: "+side2+side2+side3);
        }
    }
    public static class Physics{
        public static void vectorDotProduct(Vector vector1, Vector vector2){
            int dotProduct=vector1.getI()*vector2.getI()+vector1.getJ()*vector2.getJ()+vector1.getK()*vector2.getK();
            System.out.println("The dot product of"+vector1.getName()+"and"+vector2.getName()+": "+dotProduct);
        }
    }
}
