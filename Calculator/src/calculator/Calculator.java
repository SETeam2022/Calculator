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
    
    private static final String opUnarie[]= {"CM"};
    private static final String opBinarie[]= {"tan","=","sin","cos","arctan","M+","M-"};
    private static final String opTernarie[]= {"+","-","/","*"};
   
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
        int op2 = 0;

        System.out.print("\nCALCOLATRICE POLACCA\n");

        while (true) {
            try {
                
                System.out.print("\nInserisci operazione: ");
                op = br.readLine();
                
                // call function
                op2 = initOp2(op);
                
                switch(op2){
                    
                    case 0:
                        System.out.println("Operazione non supportata!");
                        break;
                    case 1:
                        cal.parse(op);
                        System.out.println("Ho inizializzato la memoria!");
                        break;
                    case 2:
                        System.out.print("\nInserisci unico operando: ");
                        val1 = br.readLine();
                        res = cal.parse(op, val1);
                        System.out.println("Risultato: "+res);
                        break;
                    case 3:
                        System.out.print("\nInserisci operando 1: ");
                        val1 = br.readLine();
                        System.out.print("\nInserisci operando 2: ");
                        val2 = br.readLine();
                        res = cal.parse(op, val1, val2);
                        System.out.println("Risultato: "+res);
                        break;   
           
                }

            } catch (IOException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private static int initOp2(String op) {
        for (String i : opUnarie){ if (i.equalsIgnoreCase(op)) {return 1;} }
        for (String i : opBinarie){ if (i.equalsIgnoreCase(op)) {return 2;} }
        for (String i : opTernarie){ if (i.equalsIgnoreCase(op)) {return 3;} }
        return 0; 
    }
}


