/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.lang.Math;
import java.util.HashMap;

/**
 *
 * @author bvs
 */
public class Calcolatrice {

    private double ans;
    private double M;
    private HashMap<String, Double> Memory;

    public Calcolatrice() {
        this.ans = 0;
        this.M = 0;
        this.Memory = new HashMap<String, Double>();
    }

    double sum(double a, double b) {
        setAns(a + b);
        return (a + b);
    }

    double difference(double a, double b) {
        setAns(a - b);
        return a - b;
    }

    double product(double a, double b) {
        setAns(a * b);
        return a * b;
    }

    double ratio(double a, double b) throws ZeroDivisionException {
        if (b == 0) {
            throw new ZeroDivisionException();
        } else {
            setAns(a / b);
            return a / b;
        }
    }
    
    double sin(double a){
        return Math.sin(a);
    }
    
    double cos(double a){
        return Math.cos(a);
    }
    
    double tan(double a){
        return Math.tan(a);
    }
    
    double arctan(double a){
        return 1/Math.tan(a);
    }

    void setAns(double ans) {
        this.ans = ans;
    }

    double showAns() {
        return (this.ans);
    }

    public String parse(String op, String val1, String val2) {
        Double a, b;

        if (val1.equalsIgnoreCase("ans")) {
            a = ans;
        } else {
            a = Double.parseDouble(val1);
        }

        if (val2.equalsIgnoreCase("ans")) {
            b = ans;
        } else {
            b = Double.parseDouble(val2);
        }

        if (op.equals("+")) {
            setAns(sum(a, b));
            return Double.toString(sum(a, b));
        }

        if (op.equals("-")) {
            setAns(difference(a, b));
            return Double.toString(difference(a, b));
        }

        if (op.equals("/")) {
            setAns(ratio(a, b));
            return Double.toString(ratio(a, b));
        }

        if (op.equals("*")) {
            setAns(product(a, b));
            return Double.toString(product(a, b));
        }
        return "Operatore non supportato";
    }

    public String parse(String op, String val1) {

        if ((op.equals("=")) && (val1.equalsIgnoreCase("ans"))) {
            
            return Double.toString(showAns());
            
        } else if (op.equals("sin")){
            
            return Double.toString(sin(Double.parseDouble(val1)));
            
        } else if (op.equals("cos")){
            
            return Double.toString(cos(Double.parseDouble(val1)));
            
        } else if (op.equals("tan")){
            
            return Double.toString(tan(Double.parseDouble(val1)));
            
        } else if (op.equals("arctan")){
            
            return Double.toString(arctan(Double.parseDouble(val1)));
            
        } else {
            
            return "Operatore non supportato";
        }
    }

}
