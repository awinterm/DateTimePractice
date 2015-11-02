/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author andre_000
 */
public class NewDateUtilities2 {
      
    private static NewDateUtilities2 instance;
    
  public static NewDateUtilities2 getInstance() {
        if (instance == null) {
            instance = new NewDateUtilities2();
        }

        return instance;
    }
  
  
  /**
   * This Method takes in a LocalDate object and a format, it then returns that date object in the format you provided.
   * @param date a LocalDate object
   * @param dateFormat The format you want that date object to convert to as a String.
   * @return String of a LocalDate object.
   */
    public String dateToString(LocalDate date, String dateFormat) throws IllegalArgumentException{
        if (date == null || dateFormat == ""){
           throw new IllegalArgumentException();
        }
        
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
    public String dateTimeToString2(LocalDateTime date, String dateFormat) throws IllegalArgumentException{
          if (date == null || dateFormat == ""){
           throw new IllegalArgumentException();
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        String formattedDateTime = date.format(formatter);
        return formattedDateTime;
    }
    
    /**
     * This Method takes a sting and a format string and creates a LocalDate Object.
     * @param string the date you are creating
     * @param dateFormat the format of the string you are providing.
     * @return 
     * @throws IllegalArgumentException if the length of the strings do not match.
     */
    
    public LocalDate stringToLocalDate(String string, String dateFormat) throws IllegalArgumentException{
            if (string.length() != dateFormat.length()){
            throw new IllegalArgumentException();
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate thisDate = LocalDate.parse(string, formatter);
        return thisDate;
    }
    
    public LocalDateTime stringToLocalDateTime(String string, String dateFormat) throws IllegalArgumentException {
        if (string.length() != dateFormat.length()){
            throw new IllegalArgumentException();
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
     * @throws IllegalArgumentException if the length of the strings do not match.
     */
     
    /**
     * This Method takes two strings of dates and a format of those two strings, it then
 converts the strings into LocalDateTime objects and finds the difference in days between them.
     * @param date1 String of first Date
     * @param date2 String of Second Date
     * @param dateFormat the format of your strings.
     * @return the difference in Days.
     * @throws IllegalArgumentException
     */
    public long diffBetweenTwoLocalDateTimes(String date1, String date2, String dateFormat) throws IllegalArgumentException{
        if( date1.length() != dateFormat.length() || date2.length() != dateFormat.length()){
            throw new IllegalArgumentException();
        }
        
        LocalDateTime thisDate = stringToLocalDateTime(date1, dateFormat);
        LocalDateTime thisDate2 = stringToLocalDateTime(date2, dateFormat);
        
         // grr
      
        Duration diff = Duration.between(thisDate, thisDate2);
        long days = (diff.toDays());
        return days;
    }
}
