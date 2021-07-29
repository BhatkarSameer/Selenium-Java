package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Date;

public class generateLog4j {

    static Logger logger = Logger.getLogger (generateLog4j.class.getName ());

    public static void main(String[] args) {

        PropertyConfigurator.configure ("./src/main/resources/log4j.properties");

        Date today = new Date ();
        System.setProperty ("current.date", today.toString ().replace (":", "_").replace (" ", " _ "));
        System.out.println (today);

        logger.debug ("This is a debug log");
        logger.info ("This is a information log");
        logger.error ("This is a error log");
        logger.warn ("This is a warning log");

    }

}
