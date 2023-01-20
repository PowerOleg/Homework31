import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.greeting();
        Filter filter = new Filter(controller.getFilterNumber());
        filter.filterOut(controller.createArrayList());

    }
}
