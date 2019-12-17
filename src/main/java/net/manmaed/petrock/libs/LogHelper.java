package net.manmaed.petrock.libs;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by manmaed on 16/06/2019.
 */
public class LogHelper {

    public static final Logger loggin = LogManager.getLogger(Reference.MOD_ID);

    private static void log(Level loglevel, Object object) {
        loggin.log(loglevel, "[" + loglevel + "]:" + String.valueOf(object));
    }

    public static void info(Object object) {
        log(Level.INFO, object);
    }

    public static void fatal(Object object) {
        log(Level.FATAL, object);
    }
}
