/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alewi
 */
public class CalcolatriceTest {
    
    private static final double DELTA = 1e-15;
    Calcolatrice a;
    
    public CalcolatriceTest() {
        
        }
  
    @Before
    public void fixture(){
        a = new Calcolatrice();
    }
    
    @Test
    public void testSum() {

        assertEquals(7, a.sum(4,3),DELTA); // entrambi i numeri positivi
        assertEquals(-7, a.sum(-4,-3),DELTA); // entrambi i numeri negativi
        assertEquals(1, a.sum(4,-3),DELTA); // il primo maggiore in modulo
        assertEquals(-1, a.sum(3,-4),DELTA); // il secondo maggiore in modulo
        assertEquals(4, a.sum(4,0),DELTA); // uno degli operandi è 0
        // to do -> uno degli operandi è al confine di rappresentazione
        //
    }
    
        @Test
    public void testDifference() {

        assertEquals(1, a.difference(4,3),DELTA); // entrambi i numeri positivi
        assertEquals(-1, a.difference(-4,-3),DELTA); // entrambi i numeri negativi
        assertEquals(7, a.difference(4,-3),DELTA); // il primo maggiore in modulo
        assertEquals(7, a.difference(3,-4),DELTA); // il secondo maggiore in modulo
        assertEquals(4, a.difference(4,0),DELTA); // uno degli operandi è 0
        // to do -> uno degli operandi è al confine di rappresentazione
        //
    }
    
 
    
    
}
