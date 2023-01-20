import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    protected int threshold;
    public Filter(int threshold) {
        this.threshold = threshold;
    }
    public List<Integer> filterOut(List<Integer> list) {
        List<Integer> newArrayList = list.stream().filter(n -> n < threshold).collect(Collectors.toList());
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию...");
        logger.log("Прошло фильтр " + n + " элементов из" + r +" элементов");
        logger.log("Выводим результат на экран...");
        logger.log("Отфильтрованный список: "+ n);
        return newArrayList;
    }
}
