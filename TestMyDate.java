/**
 * Name: Date Class
 * Author: Leah Boalich
 * Date: September 2, 2024
 * Assignemnt: Module 2 Chapter 10 Excercise 14
 * Description: This program creates a MyDate method with 3 contructors.  It then initializes two MyDate objects and prints the date they represent.
 */

import java.util.GregorianCalendar;
import java.time.Month;

//Test the MyDate class
public class TestMyDate {
    /** Main method */
    public static void main(String[] args) {
        //Create first date
        MyDate date1 = new MyDate();
        //Create second date
        MyDate date2 = new MyDate(34355555133101L);
        //Display the dates
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        
    }
}

// Define the MyDate class with 3 constructors
class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate() {
        /** Construct MyDate to equal current date */
        //Initialize gregorian calendar
        GregorianCalendar currentDate = new GregorianCalendar();
        //Utilizee calendar getter methods to set attributes
        this.year = currentDate.get(GregorianCalendar.YEAR);
        this.month = currentDate.get(GregorianCalendar.MONTH);
        this.day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        /** Construct MyDate to equal specified elapsed time since midnight, January 1, 1970 */
        setDate(elapsedTime);
    }

    public MyDate(int newYear, int newMonth, int newDay) {
        /* Construct MyDate to equal given year, month, and day */
        this.year = newYear;
        this.month = newMonth;
        this.day = newDay;
    }

    public String toString() {
        Month monthString = Month.of(this.month + 1);
        return (monthString + " " + Integer.toString(this.day) + ", " + Integer.toString(this.year));
    }

    public int getYear() {
        /* Get the year */
        return this.year;
    }

    public int getMonth() {
        /* Get the month */
        return this.month;
    }

    public int getDay() {
        /* Get the day */
        return this.day;
    }

    public void setDate(long elapsedTime) {
        /* Set the date based on elapsed time */
        //Initialize gregorian calendar
        GregorianCalendar elapsedCalendar = new GregorianCalendar();
        //Use elapsed time to set the calendars time
        elapsedCalendar.setTimeInMillis(elapsedTime);
        //Utilize calendars getter methods to set attributes
        this.year = elapsedCalendar.get(GregorianCalendar.YEAR);
        this.month = elapsedCalendar.get(GregorianCalendar.MONTH);
        this.day = elapsedCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
