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
    
    private double sum(double a, double b){
        return (a+b);
    }
    
    private double difference(double a, double b){
        return a-b;
    }
    
    private double product(double a, double b){
        return a*b;
    }
    
    private double ratio(double a,double b)throws CalcolatriceException{
        if (b == 0){
            throw new CalcolatriceException();
        }
        else{
            return a/b;
        }
    }
    
    
    
    
    
}
