
package student.lab;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author andre_000
 */
public class NewDateUtilities1 {
    //Student API: students should complete this lab by one week from today:
    // Create a custom "DateUtilities" class similar to the one demonstrated 
    // by your instructor. However, yours should use the new Java 8 Date/Time API.
    // You must provide a minimum of two methods for converting Date/Time
   //  objects to formatted strings; and you must provide a minimum of two
   //  methods to convert formatted strings to Date/Time objects. And you must 
   //  provide at least one method for performing Date/Time arithmetic, such 
   //  as the number of months, days, minutes, etc., between two dates.
  //   Experimentation is crucial to your success!

  
  
  
  private static NewDateUtilities1 instance;
   
  
  public static NewDateUtilities1 getInstance() {
        if (instance == null) {
            instance = new NewDateUtilities1();
        }

        return instance;
    }
  
  
  /**
   * This Method takes in a LocalDate object and a format, it then returns that date object in the format you provided.
   * @param date a LocalDate object
   * @param dateFormat The format you want that date object to convert to as a String.
   * @return String of a LocalDate object.
   */
    public String dateToString(LocalDate date, String dateFormat){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        String formattedDate = date.format(formatter);
        return formattedDate;
    }
    
    /**
     * This Method Takes in a LocalDateTime object and a format, it then returns a string of that LocalDateTime Object 
     * in the format you provide.
     * @param date a LocalDateTime object
     * @param dateFormat a format string of your choosing.
     * @return String of a LocalDateTime object
     */
    public String dateTimeToString2(LocalDateTime date, String dateFormat){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        String formattedDateTime = date.format(formatter);
        return formattedDateTime;
    }
    
    /**
     * This Method takes a sting and a format string and creates a LocalDate Object.
     * @param string the date you are creating
     * @param dateFormat the format of the string you are providing.
     * @return 
     * @throws student.lab.DateStringAndFormatDoNotMatchException if the length of the strings do not match.
     */
    
    public LocalDate stringToLocalDate(String string, String dateFormat) throws DateStringAndFormatDoNotMatchException{
            if (string.length() != dateFormat.length()){
            throw new DateStringAndFormatDoNotMatchException();
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate thisDate = LocalDate.parse(string, formatter);
        return thisDate;
    }
    
    public LocalDateTime stringToLocalDateTime(String string, String dateFormat) throws DateStringAndFormatDoNotMatchException {
        if (string.length() != dateFormat.length()){
            throw new DateStringAndFormatDoNotMatchException();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDateTime thisDate = LocalDateTime.parse(string, formatter);
        return thisDate;
    }
    /**
     * This Method takes two strings of dates and a format of those two strings, it then
     * converts the strings into LocalDateTime objects and finds the difference in days between them.
     *  
     * @param date1 String of first Date
     * @param date2 String of Second Date
     * @param dateFormat the format of your strings.
     * @return the difference in Days.
     * @throws student.lab.DateStringAndFormatDoNotMatchException if the length of the strings do not match.
     */
     
    /**
     * This Method takes two strings of dates and a format of those two strings, it then
 converts the strings into LocalDateTime objects and finds the difference in days between them.
     * @param date1 String of first Date
     * @param date2 String of Second Date
     * @param dateFormat the format of your strings.
     * @return the difference in Days.
     * @throws student.lab.DateStringAndFormatDoNotMatchException
     */
    public long diffBetweenTwoLocalDateTimes(String date1, String date2, String dateFormat) throws DateStringAndFormatDoNotMatchException{
        if( date1.length() != dateFormat.length() || date2.length() != dateFormat.length()){
            throw new DateStringAndFormatDoNotMatchException();
        }
        
        LocalDateTime thisDate = stringToLocalDateTime(date1, dateFormat);
        LocalDateTime thisDate2 = stringToLocalDateTime(date2, dateFormat);
        
         // grr
      
        Duration diff = Duration.between(thisDate, thisDate2);
        long days = (diff.toDays());
        return days;
    }
    
    
    public static void main(String[] args){
        NewDateUtilities1 dateUtil = NewDateUtilities1.getInstance();
        LocalDate date = LocalDate.now();
        LocalDateTime date1 = LocalDateTime.now();
        
        System.out.println(dateUtil.dateToString(date, "MM-dd-yyyy"));
        System.out.println(dateUtil.dateTimeToString2(date1, "MM-dd-yyyy hh:mm"));
        //
        System.out.println(dateUtil.stringToLocalDate("06-10-2015", "MM-dd-yyyy"));
        // needs catch to run now.
        System.out.println(dateUtil.stringToLocalDateTime("11-20-1981 01:30", "MM-dd-yyyy HH:mm"));
        
        System.out.println(dateUtil.diffBetweenTwoLocalDateTimes("10-26-2015 10:00", "10-28-2015 10:00", "MM-dd-yyyy HH:mm") + " days.");
    }
    
}
