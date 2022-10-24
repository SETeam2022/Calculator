/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.lang.Math;
import java.util.HashMap;
import java.util.regex.Pattern;

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
        setAns(Math.sin(a));
        return Math.sin(a);
    }
    
    double cos(double a){
        setAns(Math.cos(a));
        return Math.cos(a);
    }
    
    double tan(double a){
        setAns(Math.tan(a));
        return Math.tan(a);
    }
    
    double arctan(double a){
        setAns(1/Math.tan(a));
        return 1/Math.tan(a);
    }

    double getAns() {
        return (this.ans);
    }
    
    double getM(){
        return (this.M);
    }
    
    void setAns(double ans) {
        this.ans = ans;
    }
    
    void updateM(double increment){
        this.M += increment;
    }
    
    private Double parseVal(String val){
        if(val.equalsIgnoreCase("ans")) return ans;
        if(val.equalsIgnoreCase("m")) return M;
        if(Pattern.matches("^\\d+$",val)) return Double.valueOf(val);
        return null;
    }
    
    public String parse(String op, String val1, String val2) {
        
        if ((parseVal(val1)) == null || (parseVal(val2)) == null){
            return "Valore non supportato";
        }else{
        Double a = parseVal(val1);
        Double b = parseVal(val2);
        
        switch(op){
            case "+":
                return Double.toString(sum(a, b));
            case "-":
                return Double.toString(difference(a, b));
            case "/":
                return Double.toString(ratio(a, b));
            case "*":
                return Double.toString(product(a, b));   
        }
        
        return "Operatore non supportato";
        }
    }

    public String parse(String op, String val1) {
        
        if(parseVal(val1) == null){
            return "Valore non supportato!";
        }
        else{
            Double a = parseVal(val1);
        
        switch (op) {
            case "=":
                return Double.toString(a);
            case "sin":
                return Double.toString(sin(a));
            case "cos":
                return Double.toString(cos(a));
            case "tan":
                return Double.toString(tan(a));
            case "arctan":
                return Double.toString(arctan(a));
            case "M+":
                updateM(a);
                return Double.toString(M);
            case "M-":
                updateM(-a);
                return Double.toString(M);
        }
        
        return "Operatore non supportato";
        }
    }
    
    public void parse(String op){
        M=0;
        // ToDo: init all variables in memory
        // ex.
    }

}
