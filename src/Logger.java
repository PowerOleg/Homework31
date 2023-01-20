import java.util.List;
import java.util.Scanner;

public class Logger {
    protected List<String> arrayLog;                                            //нужен?
    protected int num = 1;
    protected static Logger logger;




    private Logger() {
    }

    public boolean log(String msg) {                                            //изменил void на boolean
        System.out.println("[" + num++ + "] " + msg);
//        logger записываетк себе строку логов.

//                line = "строка лога";                                               //1сделать как надо
//        arrayList.add(line);

return true;
    }
    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }





}
