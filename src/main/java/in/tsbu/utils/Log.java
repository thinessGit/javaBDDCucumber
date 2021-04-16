package in.tsbu.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {

    public final static String ARROW_RIGHT = ">>>>>>";
    public final static String ARROW_LEFT = "<<<<<<";
    public final static String COLON = " ::: ";
    static Logger log = LogManager.getLogger(Log.class.getName());
    private static boolean flag = true;

    public  static void setLogDate() {
        if(flag) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            log.info("\n\n" + ARROW_RIGHT + "Logging on " + dtf.format(now) + ARROW_LEFT + "\n");
            flag = false;
        }
    }

    public static void info(String message) {
        log.info(message);
    }

    public static void warn(String message) {
        log.warn(message);
    }

    public static void error(String message) {
        log.error(message);
    }

    public static void fatal(String message) {
        log.fatal(message);
    }

    public static void trace(String message) {
        log.trace(message);
    }


}
