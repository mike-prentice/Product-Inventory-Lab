package io;

import services.SneakerService;
import services.WhiskeyService;

import java.io.IOException;
import java.util.Scanner;

public class Console {
    private static int newQty;
    private static String sneaker = "";
    private static String whiskey = "";
    static Scanner scanner = new Scanner(System.in);
    static int selection;
    public static int toDelete;
    public static String confirm = "";

    public Console(){};


    public static void printWelcome() {
        System.out.println("" +
                "***************************************************\n" +
                "***                                             ***\n" +
                "***   Welcome to the Whiskey and Sneaker Shop   ***\n" +
                "***                                             ***\n" +
                "***************************************************\n" +
                "\n" + "\n");
    }

    public static Integer sneakerChoice() {
        System.out.println("Please make a selection....\n" +
                "1. List sneakers\n" +
                "2. Add sneakers to inventory\n" +
                "3. Update model inventory\n" +
                "4. Delete sneaker\n" +
                "5. Exit");
        selection = scanner.nextInt();
        return selection;
    }

    public static Integer whiskeyChoice() {
        System.out.println("Please make a selection....\n" +
                "1. List whiskey inventory\n" +
                "2. Add whiskey to inventory\n" +
                "3. Change bottle inventory\n" +
                "4. Delete whiskey\n" +
                 "5. Get the whiskey ratings for our inventory\n" +
                 "6. Exit");
        selection = scanner.nextInt();
        return selection;
    }

    public static Integer productChoice() {
        System.out.println("What type of product are you interested in?\n" +
                "1. Sneakers\n" +
                "2. Whiskey\n" +
                "3. Exit");
        selection = scanner.nextInt();
        return selection;
    }

    public static Integer chooseToDelete() {
        System.out.println("Enter id to delete");
        toDelete = scanner.nextInt();
        if (toDelete > SneakerService.inventory.size()){
            System.out.println("That index doesn't exist, try again...");
            System.out.println("Enter id to delete");
            toDelete = scanner.nextInt();
        }
        System.out.println("Are you sure you want to delete " + SneakerService.inventory.get(toDelete).getName()
                + "? \n Yes or NO");
        confirm = scanner.next();
        return toDelete;
    }

    public static void createSneaker() throws IOException {
        scanner.nextLine();
        System.out.println("Enter Sneaker Name");
        String name = scanner.nextLine();
        System.out.println("Enter Sneaker Brand");
        String brand = scanner.nextLine();
        System.out.println("Enter Sneaker Sport");
        String sport = scanner.nextLine();
        System.out.println("Enter Sneaker Size");
        int size = scanner.nextInt();
        System.out.println("Enter Sneaker Quantity");
        int qty = scanner.nextInt();
        System.out.println("Enter Sneaker Price");
        float price = scanner.nextFloat();
        SneakerService.create(name, brand, sport, size, qty, price);

    }

    public static void setNewQty(){
        scanner.nextLine();
        System.out.println("Enter model of sneaker");
        sneaker = scanner.nextLine();
        System.out.println("Enter new quantity");
        newQty = scanner.nextInt();
        SneakerService.setQty(sneaker, newQty);
    }


    public static void createWhisky() {
        scanner.nextLine();
        System.out.println("Enter Whiskey Name");
        String name = scanner.nextLine();
        System.out.println("Enter Whiskey Type");
        String type = scanner.nextLine();
        System.out.println("Enter Whiskey Size");
        int size = scanner.nextInt();
        System.out.println("Enter Whiskey Price");
        float price = scanner.nextFloat();
        System.out.println("Enter Whiskey Rating");
        int rating = scanner.nextInt();
        System.out.println("Enter Amount of Inventory");
        int qty = scanner.nextInt();
        WhiskeyService.createWhiskey(name, type, size, price, rating, qty);

    }


    public static Integer chooseToDeleteWhiskey() {
        System.out.println("Enter id to delete");
        toDelete = scanner.nextInt();
        if (toDelete > WhiskeyService.inventory.size()){
            System.out.println("That index doesn't exist, try again...");
            System.out.println("Enter id to delete");
            toDelete = scanner.nextInt();
        }
        System.out.println("Are you sure you want to delete " + WhiskeyService.inventory.get(toDelete).getName()
                + "? \n Yes or NO");
        confirm = scanner.next();
        return toDelete;
    }

    public static void setNewWhiskeyQty(){
        scanner.nextLine();
        System.out.println("Enter product name");
        sneaker = scanner.nextLine();
        System.out.println("Enter new quantity");
        newQty = scanner.nextInt();
        WhiskeyService.setQty(whiskey, newQty);
    }
}
