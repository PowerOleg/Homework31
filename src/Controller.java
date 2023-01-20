import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    protected final Scanner scanner = new Scanner(System.in);
    int arraySize;
    int arrayNumberLimiter;
    int threshold;
    private Logger logger;

    public Controller() {
        this.logger = Logger.getInstance();
    }

    public void greeting() {
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Добрый день, пожалуйста введите размер списка(N) и верхнюю границу для значений в списке(M).");
        System.out.println("Введите через пробел в формате \"N M\" ниже.");
        System.out.print(">>");
        String inputSizeAndNumberLimiter = scanner.nextLine();
        String[] s = inputSizeAndNumberLimiter.split(" ");
        arraySize = Integer.parseInt(s[0]);                                             //обработать исключения
        arrayNumberLimiter = Integer.parseInt(s[1]);                                //обработать исключения
    }

    public void dataForFilter() {
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Пожалуйста введите верхнюю границу для элементов списка, ниже которой элементы следует пропустить.");
        System.out.print(">>");
        threshold = Integer.parseInt(scanner.nextLine());                   //обработать исключения
    }

    public List<Integer> createArrayList() {
        logger.log("Создаём и наполняем список");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            arrayList.add((int) (Math.random() * arrayNumberLimiter));
        }
        System.out.print("Вот случайный список: ");
        arrayList.forEach(n -> System.out.print(" " + n + " "));
        System.out.println();
        return arrayList;
    }

    public int getFilterNumber() {
        return threshold;
    }
}

