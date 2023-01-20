import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public boolean log(String msg) {                                            //изменил void на boolean
        System.out.println("[" + (LocalDateTime.now()).format(DateTimeFormatter.ofPattern("d.MM.uuuu\tHH:mm:ss")) + " " + num++ + "] " + msg);
        return true;                                                                        //needs to complete
    }
}
