package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory implements VendingMachineMethods {

 File dataFile = new File("vendingmachine.csv");

 private static List<Items> allItems = new ArrayList<>();


 public void stockInventory() throws FileNotFoundException{
  try(Scanner in = new Scanner(dataFile)){
   while(in.hasNextLine()){
    String line = in.nextLine();
    String[] lineSplitting = line.split("\\|");

    Items availableItems = new Items(lineSplitting[0], lineSplitting[1],Double.parseDouble(lineSplitting[2]));
    allItems.add(availableItems);

   // All chip items print
    //All candy items print ""
    //All drink items print
    //All gum items print

    if(lineSplitting[3].equals("Candy")){
     System.out.println("Munch Munch, Yum!");
    }else if(lineSplitting[3].equals("Chip")){
     System.out.println("Crunch Crunch, Yum!");
    }else if(lineSplitting[3].equals("Drink")){
     System.out.println("Glug Glug, Yum!");
    }else if(lineSplitting[3].equals("Gum")){
     System.out.println("Chew Chew, Yum!");
    }
   }
  }
 }

 public static List<Items> getAllItems() {
  return allItems;
 }

 @Override
 public void displayInConcole() {
  for(Items listOfItems: allItems{
   System.out.println("  ");

  }
 }
}



