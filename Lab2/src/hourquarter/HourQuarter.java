package hourquarter;

import java.util.Scanner;
import java.util.logging.Logger;

public class HourQuarter {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());

    int min;

    public void hourDecider()
    {
        while (true) {
            logger.info("Enter number from 0 to 59: ");

            if (scanner.hasNextInt()) {
                min = scanner.nextInt();

                if (min >= 0 && min <= 59) { 
                    break; 
                } else {
                    logger.info("The choice must be in range from 0 to 59. Please, try again.");
                }
            } else {
                logger.info("Invalid input. Please enter a number between 0 and 59.");
                scanner.next(); 
            }
        }

        if (min >= 0 && min <= 15) {
            logger.info("The number is located in first quarter.");
        }
        else if (min >= 16 && min <= 30) {
            logger.info("The number is located in second quarter.");
        }
        else if (min >= 31 && min <= 45) {
            logger.info("The number is located in third quarter.");
        }
        else if (min >= 46 && min <= 59) {
            logger.info("The number is located in fourth quarter.");
        }
    }
}
