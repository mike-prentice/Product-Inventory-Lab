import io.Console;
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

    public App() {}

    public static void main(String[] args) {
        App app = new App();
        app.init();
    }

    public void init() {
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
            } else {
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
                            ws.deleteWhiskey(toDelete);
                            System.out.println("Deleted");
                        }
                        break;

                    case 5:
                        exit = true;
                }
            }
        }
    }
}


