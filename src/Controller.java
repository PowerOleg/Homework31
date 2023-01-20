import java.util.List;
import java.util.Scanner;

public class Controller {
    protected final Scanner scanner = new Scanner(System.in);
    protected List<Integer> arrayList;
    int arraySize;
    int arrayNumberLimiter;
    int filterNumber;


    public void greeting() {
        System.out.println("Добрый день, пожалуйста введите размер списка(N) и максимальное значение для цифры в списке(M).");
        System.out.println("Введите в формате \"N M\" ниже.");
        System.out.print(">>");
        String inputSizeAndNumberLimiter = scanner.nextLine();
        String[] s = inputSizeAndNumberLimiter.split(" ");
        arraySize = Integer.parseInt(s[0]);                                             //обработать исключения
        arrayNumberLimiter = Integer.parseInt(s[1]);                                //обработать исключения

        System.out.println("Теперь введите число-верхнюю границу для элементов списка, ниже которой элементы следует пропустить.");
        System.out.print(">>");
        filterNumber = Integer.parseInt(scanner.nextLine());                   //обработать исключения
    }

    public boolean createArrayList() {
        int line;
        for (int i = 0; i < arraySize; i++) {
            arrayList.add((int) (Math.random() * arrayNumberLimiter));              //рандом включительно верхней границы
        }
        return true;                                                                    //needs to complete
    }

    public int getFilterNumber() {
        return filterNumber;
    }
}

