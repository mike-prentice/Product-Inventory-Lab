package io;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);
    static int selection;
    static int toDelete;

    public static void printWelcome() {
        System.out.println("" +
                "***************************************************\n" +
                "***                                             ***\n" +
                "***   Welcome to the Whiskey and Sneaker Shop   ***\n" +
                "***                                             ***\n" +
                "***************************************************\n");
    }
public static Integer sneakerChoice(){
    System.out.println("Please make a selection....\n" +
            "1. List Sneakers\n" +
            "2. Update Sneakers\n" +
            "3. Delete Sneakers\n" +
            "4. Get Ratings\n" +
            "5. Exit");
    selection = scanner.nextInt();
    return selection;
}

    public static Integer whiskeyChoice(){
        System.out.println("Please make a selection....\n" +
                "1. List Whiskey\n" +
                "2. Update Whiskey\n" +
                "3. Delete Whiskey\n" +
                "4. Get Ratings\n" +
                "5. Exit");
        selection = scanner.nextInt();
        return selection;
    }

public static Integer productChoice(){
        System.out.println("What type of product are you interested in?\n" +
                "1. Sneakers\n" +
                "2. Whiskey");
        selection = scanner.nextInt();
        return selection;
}
public static Integer chooseToDelete(){
    System.out.println("Enter id to delete");
    toDelete = scanner.nextInt();
    return toDelete;
}

}
