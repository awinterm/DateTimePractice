/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author andre_000
 */
public class FirstDateTime {
    public static void main(String[] args) {
        Calendar date2 = Calendar.getInstance();
        date2.set(2952, Calendar.SEPTEMBER, 23);
        date2.add(Calendar.MONTH, -5);
        
        
        Date date1 = date2.getTime();
        System.out.println(date1.toString());
        SimpleDateFormat sdf = 
                new SimpleDateFormat("MMM d, yyyy");
       
        Date date3 = new Date();
        
        long diff = Math.abs(date1.getTime() - date3.getTime());
        long mintues = diff/1000/60;
        
        
        boolean isAfter = date3.after(date1);
        System.out.println("date3 is after date1:" + isAfter);
        
        String fDate = sdf.format(date1);
        System.out.println(fDate);
        
        String date3String = "Jul 11, 1999";
        try{
           date1 = sdf.parse(date3String);
        }catch(ParseException e) {
            System.out.println("SOUT CANT PARSE DATE STRING");
        }
        System.out.println(date1);
    }
}
