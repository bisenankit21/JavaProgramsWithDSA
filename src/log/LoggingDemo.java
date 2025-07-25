package log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {
    private static  Logger logger = Logger.getLogger(LoggingDemo.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.WARNING); //it will only log warning and above like warning and severe related logging.
        logger.info("This is info level logging.");
        logger.log(Level.INFO, "This is info level logging.");
        logger.log(Level.WARNING, "This is warning level logging.");
        logger.log(Level.SEVERE, "This is severe level logging.");
        System.out.println("Hello using System.out.ptintln");
    }
}
