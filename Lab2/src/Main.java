import calculator.Calculator;
import coordinates.Coordinates;
import dayweekend.DayWeekend;
import greetingsystem.GreetingSystem;
import hourquarter.HourQuarter;
import months.MonthsClass;
import numbers.Numbers;

public class Main {

    public static void main(String[] args) {
        Coordinates task = new Coordinates();
        DayWeekend task2 = new DayWeekend();
        GreetingSystem task3 = new GreetingSystem();
        HourQuarter task4 = new HourQuarter();
        MonthsClass task5 = new MonthsClass();
        Numbers task6 = new Numbers();
        Calculator task7 = new Calculator();

        task.enterCoordinates();
        task2.ifWeekend();
        task3.systemLogin();
        task4.hourDecider();
        task5.monthsLength();
        task5.seasonChecker();
        task6.classCounter();
        task7.calc();
        
    }
    
}
