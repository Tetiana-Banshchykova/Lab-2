package numbers;

import java.util.Scanner;
import java.util.logging.Logger;

public class Numbers {

    String[] classes = {"Programming", "Electronics", "Measurement", "Signals"};

    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());

    public void classCounter() {
        int classNumber;

        while (true) {
            logger.info("Enter the class number (1-4):");

            if (!scanner.hasNextInt()) {
                logger.info("Input variable is not an integer. Try again.");
                scanner.next();
                continue;
            }

            classNumber = scanner.nextInt();

            if (classNumber >= 1 && classNumber <= 4) {
                break;
            } else {
                logger.info("Invalid class number. Enter a number between 1 and 4.");
            }
        }

        logger.info("Success! You selected: " + classes[classNumber - 1]);
    }
}
