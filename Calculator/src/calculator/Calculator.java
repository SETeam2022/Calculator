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
    
    private static final String opBinarie[]= {"tan","=","sin","cos","arctan"};
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calcolatrice cal = new Calcolatrice();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val1 = "";
        String op = "";
        String val2 = "";
        String res = "";

        System.out.print("\nCALCOLATRICE POLACCA\n");

        while (true) {
            try {
                
                System.out.print("\nInserisci operazione: ");
                op = br.readLine();
                boolean op2=false;
                for(String x : opBinarie) if(x.equalsIgnoreCase(op)) op2=true;
                
                if (op2){
                    System.out.print("\nInserisci unico operando: ");
                    val1 = br.readLine();
                    res = cal.parse(op, val1);
                } else {
                    System.out.print("\nInserisci operando 1: ");
                    val1 = br.readLine();
                    System.out.print("\nInserisci operando 2: ");
                    val2 = br.readLine();
                    res = cal.parse(op, val1, val2);
                }
                System.out.println("Risultato: "+res);
                /*
            System.out.print("\nInserisci operazione: ");
            op = br.readLine();
            if(op.equalsIgnoreCase("=")) res = cal.parse(val1, op);
            else{
            System.out.print("\nInserisci operando 2: ");
            val2= br.readLine();
            res =cal.parse(val1, op, val2);
            }
            System.out.println("Risultato: "+res);
                 */

            } catch (IOException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
// System.out.println("\nOperando 1: " + val1 + "\nOperazione: "+op + "\nOperando 2: "+val2);


