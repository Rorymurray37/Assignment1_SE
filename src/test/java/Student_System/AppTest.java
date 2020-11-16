package Student_System;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void runtest()
    {
        Student stu1 = new Student("Rory","17/04/2000",20,1739511);
         String username = "Rory20";
         String username1 = stu1.getUsername();
         
         assertEquals(username,username1);
         assertTrue(username.equals(username1));
    }
}
