import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию...");
        List<Integer> newArrayList = list.stream().filter(n -> n > threshold).collect(Collectors.toList());
        list.stream().filter(n -> n > threshold).forEach(n -> logger.log("Элемент " + n + " проходит"));
        list.stream().filter(n -> n < threshold).forEach(n -> logger.log("Элемент " + n + " не проходит"));
        logger.log("Прошло фильтр " + list.stream().filter(n -> n > threshold).count() + " элементов из " + list.size() +
                " элементов");
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        newArrayList.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();
        return newArrayList;
    }
}
