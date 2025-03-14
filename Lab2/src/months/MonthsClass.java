package months;

import java.util.Scanner;
import java.util.logging.Logger;
public class MonthsClass {
    
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());

    public void monthsLength()
    {
        logger.info("Enter month's number (1-12):");
        scanner.nextInt();

        if (scanner.nextInt() %2 == 0) 
        {
            logger.info("This month has 30 days.");
        }
        else if (scanner.nextInt() == 2)
        {
            logger.info("This month is special. It has 28 days.");
        }
        else
        {
            logger.info("This month has 31 days.");
        }
    }

    public void seasonChecker()
    {
        logger.info("Enter month's number (1-12):");
        scanner.nextInt();

        switch (scanner.nextInt()) {
            case 12, 1, 2:
                logger.info("It's Winter!");
                break;

            case 3, 4, 5:
                logger.info("It's Spring!");
                break;

            case 6, 7, 8:
                logger.info("It's Summer!");
                break;
        
            case 9, 10, 11:
                logger.info("It's Autumn!");
                break;

            default:
                logger.info("You've written wrong number. Try again.");
                break;
        }
    }
}
