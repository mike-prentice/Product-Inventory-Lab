package io;

public class Console {
    Scanner scanner = new Scanner();

    public static void printWelcome() {
        System.out.println("" +
                "***************************************************\n" +
                "***   Welcome to the Whiskey and Sneaker Shop   ***\n" +
                "***                                             ***\n" +
                "***                                             ***\n" +
                "***************************************************\n");
    }
public static Integer choice(){
    System.out.println("Please make a selection....\n" +
            "1. List Products\n" +
            "2. Update Products\n" +
            "3. Delete Products\n" +
            "4. Get Ratings\n" +
            "5. Exit");
}

}
