import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.greeting();
        List<Integer> list = controller.createArrayList();
        controller.dataForFilter();

        Filter filter = new Filter(controller.getFilterNumber());
        filter.filterOut(list);
        Logger.getInstance().log("Завершаем программу");
    }
}
