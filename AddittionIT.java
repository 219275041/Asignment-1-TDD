/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculate1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author sonwabiso moni
 */
public class AddittionIT {
    
    public AddittionIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class Addittion.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        double number1 = 0.0;
        double number2 = 0.0;
        double expResult = 0.0;
        double result = Addittion.sum(number1, number2);
        assertEquals(expResult, result, 0.0);
       
    }
    @Test
    public void objectEquality(double number1,double number2){
    assertEquals(number1,number2) ;   
    }
   @Test
   public void testIdentity(double number1,double number2){
       assertSame(number1,number2);
   }
    @Test 
    public void TestFailling(){
        fail("failed");
    }
    
    @Test
    @Disabled()
    public void disablingTest(){
        
    }
    
    @Test
    public void timeOutExceededTest(){
        
    }
}
