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
public class CalcolatriceException extends RuntimeException {

    /**
     * Creates a new instance of <code>CalcolatriceException</code> without
     * detail message.
     */
    public CalcolatriceException() {
    }

    /**
     * Constructs an instance of <code>CalcolatriceException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CalcolatriceException(String msg) {
        super(msg);
    }
}
