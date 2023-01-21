import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    protected final Scanner scanner = new Scanner(System.in);
    protected int arraySize;
    protected int arrayNumberLimiter;
    protected int threshold;
    protected Logger logger;

    public Controller() {
        this.logger = Logger.getInstance();
    }

    public void greeting() {
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Добрый день, пожалуйста введите размер списка(N) и верхнюю границу для значений в списке(M) через пробел.");
        System.out.println("К примеру: \"10 20\"");
        System.out.print(">>");
        String[] s = {};
        try {
            String inputSizeAndNumberLimiter = scanner.nextLine();
            s = inputSizeAndNumberLimiter.split(" ");
            arraySize = Integer.parseInt(s[0]);

            arrayNumberLimiter = Integer.parseInt(s[1]);
        } catch (RuntimeException e) {
            logger.log("Пользователь ввел некоректные данные, первое значние: " + s[0] + " второк значение: "
                    + s[1]);
            System.out.println("Не верный ввод");
            greeting();
        }

    }

    public void dataForFilter() {
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Пожалуйста введите верхнюю границу для элементов списка, ниже которой элементы следует пропустить.");
        System.out.print(">>");
        try {
            threshold = Integer.parseInt(scanner.nextLine());
        } catch (RuntimeException e) {
            System.out.println("Не верный ввод");
            System.out.println("Фильтр не выставлен");
            logger.log("Фильтр не выставлен. Фильтрация отменена");
        }
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

