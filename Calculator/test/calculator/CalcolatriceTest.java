/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculator;

import org.junit.*;
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

    }
    
    @Test
    public void testDifference() {

        assertEquals(1, a.difference(4,3),DELTA); // entrambi i numeri positivi
        assertEquals(-1, a.difference(-4,-3),DELTA); // entrambi i numeri negativi
        assertEquals(7, a.difference(4,-3),DELTA); // il primo maggiore in modulo
        assertEquals(7, a.difference(3,-4),DELTA); // il secondo maggiore in modulo
        assertEquals(4, a.difference(4,0),DELTA); // uno degli operandi è 0

    }
    
    @Test
    public void testProduct() {

        assertEquals(12, a.product(4,3),DELTA); // entrambi i numeri positivi
        assertEquals(12, a.product(-4,-3),DELTA); // entrambi i numeri negativi
        assertEquals(-12, a.product(4,-3),DELTA); // il primo maggiore in modulo
        assertEquals(-12, a.product(3,-4),DELTA); // il secondo maggiore in modulo
        assertEquals(0, a.product(4,0),DELTA); // uno degli operandi è 
    }
    
    @Test
    public void testRatio() {

        assertEquals(2, a.ratio(8,4),DELTA); // entrambi i numeri positivi
        assertEquals(2, a.ratio(-8,-4),DELTA); // entrambi i numeri negativi
        assertEquals(-2, a.ratio(8,-4),DELTA); // il primo maggiore in modulo
        assertEquals(-0.5, a.ratio(4,-8),DELTA); // il secondo maggiore in modulo
        assertEquals(0, a.ratio(0,4),DELTA); // uno degli operandi è 0
    }
    
    @Test(expected=ZeroDivisionException.class)
    public void testRatio2(){
        a.ratio(3, 0);
    }
    
    @Test
    public void testParse(){
        assertTrue(a.parse("c", "1", "2").equalsIgnoreCase("Operatore non supportato"));
        assertTrue(a.parse("+", "1", "2").equalsIgnoreCase("3.0"));
        assertTrue(a.parse("-", "1", "2").equalsIgnoreCase("-1.0"));
        assertTrue(a.parse("*", "1", "2").equalsIgnoreCase("2.0"));
        assertTrue(a.parse("/", "8", "2").equalsIgnoreCase("4.0"));
    }
    
    @Test
    public void testGetAns(){
        double b = a.sum(4,3);
        assertEquals(a.getAns(), b, 0);
        b = a.difference(4,3);
        assertEquals(a.getAns(), b, 0);
        b = a.product(4,3);
        assertEquals(a.getAns(), b, 0);
        b = a.ratio(4,3);
        assertEquals(a.getAns(), b, 0);
    }  
    
    @Test
    public void testSin(){
        double b = Math.sin(30);
        assertEquals(b, a.sin(30), 0);
    }
    
    @Test
    public void testCos(){
        double b = Math.cos(30);
        assertEquals(b, a.cos(30), 0);
    }
   
    @Test
    public void testTan(){
        double b = Math.tan(90);
        assertEquals(b, a.tan(90), 0);
    }
    
    @Test
    public void testArctan(){
        double b = 1/Math.tan(90);
        assertEquals(b, a.arctan(90), 0);
    }
    
}
