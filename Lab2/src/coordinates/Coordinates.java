package coordinates;

import java.util.Scanner;
import java.util.logging.Logger;

public class Coordinates {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());

    public void enterCoordinates()
    {
        logger.info("Enter the x:");
        int x = scanner.nextInt();

        if ((x <= -10 && x >= -99) || (x >= 10 && x <= 99)) {
            logger.info("Your number is two-digit");

            if (x % 2 == 0) {
                logger.info("Your number is even");
            }
            else{
                logger.info("Your number is NOT even");
            }
        }
        else{
            logger.info("Your number is NOT two-digit");
        }

        double result;

        if (x < 0) {
            result = Math.pow(x, 2) + 3;
        }
        else if (0 <= x && x <= 5) {
            result = 6 * Math.sqrt(x);
        }
        else {
            result = -x + 9d;
        }

        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Your result is %.2f", result));
            logger.info(String.format("Your coordinates are %d, %.2f", x, result));
        }
        
    }
}
