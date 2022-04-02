import io.Console;
import services.SneakerService;

public class App {

    private SneakerService sneakerService = new SneakerService();


    public static void main(String[] args){
        App app = new App();
        app.init();


    }

    public void init(){
        Console.printWelcome();
    }
}
