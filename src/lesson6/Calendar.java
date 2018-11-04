package lesson6;

import java.util.Scanner;

public class Calendar
{
    /**
     * Top Level Stub
    **/
    private static void printMonth( int year, int month) {
    
        printMonthTitle( year, month );
        printMonthBody( year, month );
    }
    
    /**
     * Second Level Stub - printMonthTitle
     * (Includes dummy values)
     */
    private static void printMonthTitle( int year, int month) {
        String sMonth = " ";
        switch( month ) {
            case 1: sMonth = "        January"; break;
            case 2: sMonth = "       February"; break;
            case 3: sMonth = "         March"; break;
            case 4: sMonth = "         April"; break;
            case 5: sMonth = "          May"; break;
            case 6: sMonth = "         June"; break;
            case 7: sMonth = "         July"; break;
            case 8: sMonth = "        August"; break;
            case 9: sMonth = "       September"; break;
            case 10: sMonth = "       October"; break;
            case 11: sMonth = "      November"; break;
            case 12: sMonth = "       December"; break;
        }
        //first line of calender
        System.out.println( sMonth + " " + year );
        
        //dashes
        System.out.println( "---------------------------" );
        
        // day names
        System.out.println( "Sun Mon Tue Wed Thu Fri Sat" );
    }
    
    /**
     * Second Level Stub - printMonthBody
     * (Includes dummy values)
     */
    private static void printMonthBody( int year, int month) {
        //figure out what day of the week we're starting on
        int currentDayOfWeek = getStartDay( year, month );
        
        //print out the extra spaces in front of it under each of the days
        for( int i = 1; i <= currentDayOfWeek; i++ ) {
            System.out.print( "    " ); 
        }
        //print the days sequentially
        //step 1: get total days
        int totalDays = getDaysInMonth( year, month );
        
        //step 2: print each row
        for( int day = 1; day <= totalDays; day++ ){
            printDay( day );
            currentDayOfWeek++;
            
            if( currentDayOfWeek == 7 ){
                currentDayOfWeek = 0;
                System.out.println( " " );
            }
            else if (day == totalDays ) {
                System.out.println( " " );
            }
        }
    }
    
    /**
     * Implemented Methods
     * All the methods we described go here. 
     */
    
    private static void printDay( int day ) {
        if (day < 10 ) {
            System.out.print( "  " + day + " " );
        }
        else {
            System.out.print( " " + day + " " );
        }
    }
    
    private static int getStartDay( int year, int month ) {
        int day = ( getTotalNumberOfDays (year, month) + 6 ) % 7;
        
        //Handle day being negative
        day = (day + 7) % 7;
        
        return day;
    }
    
    private static int getTotalNumberOfDays( int year, int month ) 
    {
        int days = 0;
        int currentMonth = 1;
        int currentYear = 2000;
        if (year >= 2000) {
            while( currentYear < year || currentMonth < month ){
                days += getDaysInMonth( currentYear, currentMonth );
                
                // go to the next month
                if (currentMonth < 12 ) {
                    currentMonth++;
                }
                else {
                    currentYear++;
                    currentMonth = 1;
                }
            }
        }
        else if (year < 2000 ) {
            while( currentYear > year || currentMonth > month ) {
                days -= getDaysInMonth( currentYear, currentMonth );
                
                if ( currentMonth > 1 ) {
                    currentMonth--;
                }
                else {
                    currentYear--;
                    currentMonth = 12;
                }
        }
    }
    return days;
}
    
    private static int getDaysInMonth( int year, int month ) {
    if (month == 1) return 31;
    else if (month == 2){
        if (isLeapYear(year) == true){
        return 29;
    }
    else return 28;
    }
    else if (month == 3) return 31;
    else if (month == 4) return 30;
    else if (month == 5) return 31;
    else if (month == 6) return 30;
    else if (month == 7) return 31;
    else if (month == 8) return 31;
    else if (month == 9) return 30;
    else if (month == 10) return 31;
    else if (month == 11) return 30;
    else return 31;
    
    }
    
    private static boolean isLeapYear( int year ) {
       if (year % 400 == 0) {
           return true;
        }
       if (year % 100 == 0) {
           return false;
        }
       if (year % 4 == 0) {
            return true;
       }
       return false;
    }
    
    /**
     * Client Code
     */
    public static void main( String[] args ){ 
        Scanner input = new Scanner( System.in );
        
        System.out.print ("Enter a full year: ");
        int year = input.nextInt();
        
        System.out.print ("Enter a month: ");
        int month = input.nextInt();
        
        //print out the calendar
        printMonth (year, month);
    }
}

