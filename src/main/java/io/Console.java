package io;

import services.SneakerService;

import java.util.Scanner;

public class Console {
    private static int newQty;
    private static String sneaker = "";
    static Scanner scanner = new Scanner(System.in);
    static int selection;
    static int toDelete;
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
                "1. List Sneakers\n" +
                "2. Add Sneakers to Inventory\n" +
                "3. Update Model Inventory\n" +
                "4. Delete Sneaker\n" +
                "5. Exit");
        selection = scanner.nextInt();
        return selection;
    }

    public static Integer whiskeyChoice() {
        System.out.println("Please make a selection....\n" +
                "1. List Whiskey\n" +
                "2. Update Whiskey\n" +
                "3. Delete Whiskey\n" +
                "4. Get Ratings\n" +
                "5. Exit");
        selection = scanner.nextInt();
        return selection;
    }

    public static Integer productChoice() {
        System.out.println("What type of product are you interested in?\n" +
                "1. Sneakers\n\n" +
                "2. Whiskey");
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

    public static void createSneaker() {
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

}
