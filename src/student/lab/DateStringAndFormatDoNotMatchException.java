/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

/**
 *
 * @author andre_000
 */
public class DateStringAndFormatDoNotMatchException extends Exception {
    private static final String MSG = "Your Format does not match your date string";
    public DateStringAndFormatDoNotMatchException() {
        super(MSG);
    }

    public DateStringAndFormatDoNotMatchException(String message) {
        super(MSG);
    }

    public DateStringAndFormatDoNotMatchException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public DateStringAndFormatDoNotMatchException(Throwable cause) {
        super(MSG);
    }
    
}
