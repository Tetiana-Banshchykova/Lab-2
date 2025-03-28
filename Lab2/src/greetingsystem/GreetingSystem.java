package greetingsystem;

import java.util.Scanner;
import java.util.logging.Logger;

public class GreetingSystem {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());

    public void systemLogin() {
        int choice = 0;
        
        while (true) {
            logger.info("1. Greetings");
            logger.info("2. Login into system");
            logger.info("3. Turn off the computer");
            logger.info("Enter your choice:");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 3) { 
                    break; 
                } else {
                    logger.info("The choice must be in range from 1 to 3. Please, try again.");
                }
            } else {
                logger.info("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); 
            }
        }

        switch (choice) {
            case 1:
                logger.info("Greetings, User!");
                break;
            case 2:
                logger.info("Login page.");
                break;
            case 3:
                logger.info("Logging off and shutting down.");
                break;
        }
    }
}
