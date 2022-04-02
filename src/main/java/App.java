import io.Console;
import services.SneakerService;

public class App {

    private SneakerService sneakerService = new SneakerService();
    static int selection;
    static int toDelete;


    public static void main(String[] args){
        App app = new App();
        app.init();


    }

    public void init(){
        Console.printWelcome();
        Console.productChoice();
        handleSelection();
        handleSelection2();
    }

    public void handleSelection(){
switch (selection) {
    case 1:
        Console.sneakerChoice();
        break;
    case 2:
        Console.whiskeyChoice();
}
    }

    public void handleSelection2(){
        switch (selection) {
            case 1:
                SneakerService.findAll();
                break;
            case 2:
                Console.chooseToDelete();
                SneakerService.deleteSneaker(toDelete);
                break;
        }
    }
}
