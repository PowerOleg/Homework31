import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    public void greeting() {
        System.out.println("Добрый день, пожалуйста введите размер списка(N) и максимальное значение для цифры в списке(M).");
        System.out.println("Введите в формате \"N M\" ниже.");
        System.out.print(">>");
        String inputSizeAndNumberLimiter = scanner.nextLine();
        String[] s = inputSizeAndNumberLimiter.split(" ");


    }


    public void askForFilter() {
        System.out.println("Теперь введите число-верхнюю границу для элементов списка, ниже которой элементы следует пропустить.");
        System.out.print(">>");
        String inputFilterNumber = scanner.nextLine();
    }
}
