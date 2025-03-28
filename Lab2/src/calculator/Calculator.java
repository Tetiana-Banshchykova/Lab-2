package calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(getClass().getName());

    

    public void calc(){
        int numberA;
        int numberB;
        int choice = 0;

        while (true) {
            logger.info("1. Multiplication");
            logger.info("2. Sum");
            logger.info("3. Subtraction");
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
                logger.info("You have chosen multiplication");
                while (true) {
                    logger.info("Please, enter the first number.");
        
                    if (scanner.hasNextInt()) {
                        numberA = scanner.nextInt();
                        break;
                    } else {
                        logger.info("Invalid input. Please enter a number between 1 and 3.");
                        scanner.next(); 
                    }
                }

                while (true) {
                    logger.info("Please, enter the second number.");
        
                    if (scanner.hasNextInt()) {
                        numberB = scanner.nextInt();
                        break;
                    } else {
                        logger.info("Invalid input. Please enter a number between 1 and 3.");
                        scanner.next(); 
                    }
                }

                logger.info("The " + numberA + " * " + numberB + "is " + (numberA * numberB));
                break;
            case 2:
                logger.info("You have chosen sum");
            while (true) {
                logger.info("Please, enter the first number.");
    
                if (scanner.hasNextInt()) {
                    numberA = scanner.nextInt();
                    break;
                } else {
                    logger.info("Invalid input. Please enter a number between 1 and 3.");
                    scanner.next(); 
                }
            }

            while (true) {
                logger.info("Please, enter the second number.");
    
                if (scanner.hasNextInt()) {
                    numberB = scanner.nextInt();
                    break;
                } else {
                    logger.info("Invalid input. Please enter a number between 1 and 3.");
                    scanner.next(); 
                }
            }

            logger.info("The " + numberA + " * " + numberB + "is " + (numberA + numberB));
                break;
            case 3:
            logger.info("You have chosen substraction");
            while (true) {
                logger.info("Please, enter the first number.");
    
                if (scanner.hasNextInt()) {
                    numberA = scanner.nextInt();
                    break;
                } else {
                    logger.info("Invalid input. Please enter a number between 1 and 3.");
                    scanner.next(); 
                }
            }

            while (true) {
                logger.info("Please, enter the second number.");
    
                if (scanner.hasNextInt()) {
                    numberB = scanner.nextInt();
                    break;
                } else {
                    logger.info("Invalid input. Please enter a number between 1 and 3.");
                    scanner.next(); 
                }
            }

            logger.info("The " + numberA + " * " + numberB + "is " + (numberA - numberB));
                break;
        }
    }
}
