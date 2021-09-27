package LoginTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import Login.A_App;

public class A_test
{
  
     @Test(description = "Valid Test")
     public void validLoginTest() 
     {
	    A_App ap = new A_App();
	    boolean status = ap.userLogin("userdemo", "password");
	    AssertJUnit.assertTrue(status);
     }
  
     @Test(description = "Invalid Test")
     public void invalidLoginTest() 
     {
	    A_App ap = new A_App();
	    boolean status = ap.userLogin("userdemo", "password123");
	    AssertJUnit.assertFalse(status);
     }
}
