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
public class DateObjectIsNullException extends Exception {
    private static final String MSG = "Date is Null or Empty";
    
    public DateObjectIsNullException() {
        super(MSG);
    }

    public DateObjectIsNullException(String message) {
        super(MSG);
    }

    public DateObjectIsNullException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public DateObjectIsNullException(Throwable cause) {
        super(MSG);
    }
    
}
