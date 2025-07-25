package exception;

import java.util.logging.Logger;

public class MultipleCatchDemo {
    private static Logger logger = Logger.getLogger(MultipleCatchDemo.class.getName());

    public static void main(String[] args) {
        String input = null;
        try {
            input = "Ankit";
            input = input.toUpperCase();
            logger.info(input);
            input = input.substring(1, 10);
            logger.info(input);
        } catch (NullPointerException ex) {
            logger.severe("An null pointer exception occurred, please check data");
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
            //this pipe symbol comes after java 7, we can handle any kind of exception in a single catch block using pipe symbol.there is some restriction as well.
            logger.severe("Index out of bound exception occurred, please check data");
        } catch (Exception ex) {
            logger.severe("An exception occurred, please check data");

        }
    }
}
