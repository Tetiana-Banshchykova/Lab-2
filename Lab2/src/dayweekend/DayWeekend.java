package dayweekend;

import java.util.Scanner;
import java.util.logging.Logger;
public class DayWeekend {

    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());
        
    public void ifWeekend()
    {
        logger.info("Please, enter day's number (1-7):");
        int choice = scanner.nextInt();

        if (1 < choice && choice < 6) 
        {
            logger.info("The day is a working day!");
        }
        else
        {
            logger.info("The day is weekend!");
        }
    }

}
