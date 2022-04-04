import io.Console;
import models.Sneaker;
import services.SneakerService;
import services.WhiskeyService;

public class App {

    Console c;
    SneakerService ss;
    WhiskeyService ws;

    static int selection;
    static int toDelete;
    static boolean exit = false;

    public App(Console c, SneakerService ss, WhiskeyService ws) {
        this.c = c;
        this.ss = ss;
        this.ws = ws;
    }

    public App() {

    }

    public static void main(String[] args){
        App app = new App();
        app.init();


    }

    public void init(){
        while (exit != true) {
            Console.printWelcome();
            selection = Console.productChoice();
            handleSelection(selection);
            handleSelection2(selection);
        }
    }

    public void handleSelection(int input){
switch (input) {
    case 1:
         selection = c.sneakerChoice();
        break;
    case 2:
         selection = c.whiskeyChoice();
}
    }

    public void handleSelection2(int input){
        switch (input) {
            case 1:
                ss.findAll();
                break;

            case 2:
                c.createSneaker();
                break;

            case 3:
                c.setNewQty();
                break;

                case 4:
                c.chooseToDelete();
                if (c.confirm.equalsIgnoreCase("yes")) {
                    ss.deleteSneaker(toDelete);
                    System.out.println("");
                }
                break;

            case 5:
                exit = true;
        }
    }
}
