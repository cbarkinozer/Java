
package com.mycompany.mp3copier;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    private static ArrayList<Integer> content = new ArrayList<>();
    public static void readFile(){
        try{
            FileInputStream in = new FileInputStream("bruh.mp3");
            int read;
            while((read=in.read())!=-1){
                content.add(read);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void copy(String fileName){
        try {
            FileOutputStream out = new FileOutputStream(fileName);
            for(int value: content){
                out.write(value);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        readFile();
        long start = System.currentTimeMillis();
        copy("bruh2.mp3");
        long end = System.currentTimeMillis();
        System.out.println("It took "+(end-start)/1000+" seconds to copy...");
    }
}
