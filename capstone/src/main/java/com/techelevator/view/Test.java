package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
       File file= new File("vendingmachine.csv");
       Scanner sc =new Scanner(file);

       while(sc.hasNextLine()){
           String lines = sc.nextLine();
           System.out.println(lines);
       }


    }
}
