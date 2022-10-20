/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author graanephilim
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calcolatrice cal = new Calcolatrice();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val1="";
        String op="";
        String val2="";
        String res="";
        try {
            System.out.print("\nInserisci operando 1: ");
            val1 = br.readLine();
            System.out.print("\nInserisci operazione: ");
            op = br.readLine();
            System.out.print("\nInserisci operando 2: ");
            val2= br.readLine();
            
            if(!op.equalsIgnoreCase("=")) res = cal.parse(val1, op, val2);
            else res = cal.parse(val1, op);
            System.out.println("Risultato: "+res);
        } catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // System.out.println("\nOperando 1: " + val1 + "\nOperazione: "+op + "\nOperando 2: "+val2);
        

    }
    
}
