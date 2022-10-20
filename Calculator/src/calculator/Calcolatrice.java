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
    
    double sum(double a, double b){
        return (a+b);
    }
    
    double difference(double a, double b){
        return a-b;
    }
    
    double product(double a, double b){
        return a*b;
    }
    
    double ratio(double a,double b)throws ZeroDivisionException{
        if (b == 0){
            throw new ZeroDivisionException();
        }
        else{
            return a/b;
        }
    }

    void setAns(double ans) {
        this.ans = ans;
    }
    
    String showAns(){
        return Double.toString(this.ans);
    }
    
    
    
    
    public String parse(String val1, String op , String val2){
        
        Double a = Double.parseDouble(val1);
        Double b = Double.parseDouble(val2);
        
        if(op.equals("+")){
            setAns(sum(a,b));
            return Double.toString(sum(a,b));
        }
        
        if(op.equals("-")){
            setAns(difference(a,b));
            return Double.toString(difference(a,b));
        }
        
        if(op.equals("/")){
            setAns(ratio(a,b));
            return Double.toString(ratio(a,b));
        }
        
        if(op.equals("*")){
            setAns(product(a,b));
            return Double.toString(product(a,b));
        }
        return "Operando non supportato";
    }
    
    public String parse(String val1, String op){
        
        if((op.equals("=")) && (val1.equalsIgnoreCase(val1))){
            return showAns();
        }
        else{
            return "Operatore non supportato";
        }
    }
    
    
}
