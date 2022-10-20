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
    
public CalcolatriceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSum() {
        Calcolatrice a = new Calcolatrice();
        assertEquals(7, a.sum(4,3),0); // entrambi i numeri positivi
        assertEquals(-7, a.sum(-4,-3),0); // entrambi i numeri negativi
        assertEquals(1, a.sum(4,-3),0); // il primo maggiore in modulo
        assertEquals(-1, a.sum(3,-4),0); // il secondo maggiore in modulo
        assertEquals(4, a.sum(4,0),0); // uno degli operandi è 0
        // to do -> uno degli operandi è al confine di rappresentazione
        //
    }
    
    
}
