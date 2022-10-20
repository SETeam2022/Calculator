/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author bvs
 */
public class ZeroDivisionException extends CalcolatriceException {

    /**
     * Creates a new instance of <code>ZeroDivisionException</code> without
     * detail message.
     */
    public ZeroDivisionException() {
    }

    /**
     * Constructs an instance of <code>ZeroDivisionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ZeroDivisionException(String msg) {
        super(msg);
    }
}
