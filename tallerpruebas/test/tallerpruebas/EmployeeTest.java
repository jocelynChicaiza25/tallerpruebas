/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static tallerpruebas.EmployeeType.Manager;
import static tallerpruebas.EmployeeType.Supervisor;
import static tallerpruebas.EmployeeType.Worker;

/**
 *
 * @author PC-4
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of cs method, of class Employee.
     */
    
    //test para employee worker con USD
    @Test
    public void testCsWorker() {
        System.out.println("cs");
        Employee instance = new Employee(400,"USD",10,Worker);
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        
    }
    //test para employee worker diferente de USD
     @Test
    public void testCsWorker2() {
        System.out.println("cs");
        Employee instance = new Employee(400,"E",10,Worker);
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        
    }
    
      //test para employee Supervisor con USD
    @Test
    public void testCsSupervisor() {
        System.out.println("cs");
        Employee instance = new Employee(400,"USD",10,Supervisor);
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        
    }
    //test para employee Supervisor diferente de USD
     @Test
    public void testCsSupervisor2() {
        System.out.println("cs");
        Employee instance = new Employee(400,"E",10,Supervisor);
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        
    }
      //test para employee Manager con USD
    @Test
    public void testCsManager() {
        System.out.println("cs");
        Employee instance = new Employee(400,"USD",10,Manager);
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        
    }
    //test para employee Manager diferente de USD
     @Test
    public void testCsManager2() {
        System.out.println("cs");
        Employee instance = new Employee(400,"E",10,Manager);
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    
    
    //test calculate bonus para employee Worker  USD
    @Test
    public void testCalculateYearBonusWorker() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400,"USD",10,Worker);;
        float expResult = 386.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        
    }
     
    //test calculate bonus para employee Worker diferente de USD
      @Test
    public void testCalculateYearBonusWorker2() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400,"E",10,Worker);
        float expResult = 386.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
    }
    
    //test calculate bonus para employee Supervisor con  USD
    @Test
    public void testCalculateYearBonusSupervisor() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400,"USD",10,Supervisor);
        float expResult = 593.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        
    }
     
    //test calculate bonus para employee Worker diferente de USD
    @Test
    public void testCalculateYearBonusSupervisor2() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400,"E",10,Supervisor);;
        float expResult = 573.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
    }
    
    //test calculate bonus para employee Manager con  USD
    @Test
    public void testCalculateYearBonusManager() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400,"USD",10,Manager);
        float expResult = 786.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        
    }
     
    //test calculate bonus para employee Manager diferente de USD
    @Test
    public void testCalculateYearBonusManager2() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400,"E",10,Manager);
        float expResult = 766.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
    }
    
    
  
}
