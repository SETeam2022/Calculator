/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.lang.Math;

/**
 *
 * @author bvs
 */
public class Calcolatrice {
    
    public String parse(String val1, String op , String val2){
        
        Double a = Double.parseDouble(val1);
        Double b = Double.parseDouble(val2);
        
        if(op.equals("+")){
            return Double.toString(sum(a,b));
        }
        
        if(op.equals("-")){
            return Double.toString(difference(a,b));
        }
        
        if(op.equals("/")){
            return Double.toString(ratio(a,b));
        }
        
        if(op.equals("*")){
            return Double.toString(product(a,b));
        }
    }
    
    
}
