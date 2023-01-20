import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.greeting();
        controller.createArrayList();
        Filter filter = new Filter(controller.getFilterNumber());

    }
}
