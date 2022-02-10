
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
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                copy("bruh1.mp3");
            }
        });
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                copy("bruh2.mp3");
            }
        });
        Thread thread3 = new Thread(new Runnable(){
            @Override
            public void run(){
                copy("bruh3.mp3");
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch(InterruptedException ex){
            System.out.println("The thread is interrupted...");
        }
        long end = System.currentTimeMillis();
        System.out.println("It took "+(end-start)/1000+" seconds to copy...");
    }
}
