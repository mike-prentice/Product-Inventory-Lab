import io.Console;
import services.SneakerService;
import services.WhiskeyService;

import java.io.IOException;

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

    public App() {}

    public static void main(String[] args) throws IOException {
        App app = new App();
        //SneakerService.saveData();
        SneakerService.loadData();
        app.init();

    }

    public void init() throws IOException {
        while (exit != true) {
            Console.printWelcome();
            selection = Console.productChoice();
            //
            if (selection == 1) {
                selection = c.sneakerChoice();
                switch (selection) {
                    case 1:
                        ss.findAll();
                        break;
                    case 2:
                        c.createSneaker();
                        SneakerService.saveData();
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
                }
            } else if (selection == 2){
                selection = c.whiskeyChoice();
                switch (selection) {
                    case 1:
                        ws.findAll();
                        break;
                    case 2:
                        c.createWhisky();
                        break;
                    case 3:
                        c.setNewWhiskeyQty();
                        break;
                    case 4:
                        c.chooseToDeleteWhiskey();
                        if (c.confirm.equalsIgnoreCase("yes")) {
                            ws.deleteWhiskey(c.toDelete);
                            System.out.println("Deleted");
                        }
                        break;
                    case 5:
                        ws.getRatings();
                }
            } else if (selection == 3){
                exit = true;
                SneakerService.saveData();
            }
        }
    }
}


