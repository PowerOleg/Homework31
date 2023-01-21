import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.greeting();
        List<Integer> list = controller.createArrayList();
        controller.dataForFilter();
        Filter filter = new Filter(controller.getFilterNumber());
        if (controller.getFilterNumber() > 0) {
            filter.filterOut(list);
        } else {
            System.out.println("Фильтрация отменена");
        }
        Logger.getInstance().log("Завершаем программу");
    }
}
