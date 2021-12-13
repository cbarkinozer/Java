/*
-UNFINISHED-
Level: MEDIUM?
Given two fully implemented classes, Point and Line. Read through the given code to understand their implementations.
Implement the class LineList which implements the interface LineListInterface in order to perform some operations on a list of lines.
Interface LineListInterface consists of:
Attribute: "Vector<Line>list_of_lines" which stores a list of lines.
Constructor: With parameter Vector<Line> to initialize the list_of_lines attribute.
Method: 'Line getLineWithMaxLength()' which returns the first longest line from the list of lines.
Method: 'Vector<Line> getLinesStratingFromPoint(Point p)' which returns the list of all the lines starting from the given point p.
*/

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Point{
    private double x;
    private double y;
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    
    public static double distance(Point p1, Point p2){
        double distance = Math.sqrt(
            Math.pow(p2.getY()-p1.getY(),2)+
            Math.pow(p2.getX()-p1.getX(),2)
            );
            
            return distance;
    }
    
    public String toString(){return "("+this.x+","+this.y+")";}
}
class Line{
    private Point start= new Point(0,0);
    private Point end= new Point(0,0);
    
    Line(Point start, Point end){
        this.start=start;
        this.end=end;
    }
    public Point getStart(){return start;}
    public Point getEnd(){return end;}
    
    public void setStart(Point start){this.start= start;}
    public void setEnd(Point end){this.end= end;}
    
    public double getLineLength(){return Point.distance(start,end);}
    
    public String toString(){return "Start:"+this.start+"End:"+this.end;}
    
}


interface ListOfLines{
    public Vector<Line> getLinesFromStartingPoint(Point p);
    public Line getLineWithMaxLength();
    public Vector<Line> list_of_lines=null;
}


class LineList implements ListOfLines{
    public void LineList(){
    //Code here
    }
}

class Main {
 
    public static void main(String[] args){
        
        
    }
}
