package Login;

import java.io.FileInputStream;
import java.util.Properties;

public class A_App
{
  public boolean userLogin(String userName,String password) 
  {
	  Properties prop = new Properties();
	  
	try 
	{
		prop.load(new FileInputStream("src/main/resources/credentials.property"));
	}  
	catch(Exception E) 
	{
		System.out.println("Error with File Reading");
	}
	
	// Data coming from property file 
   String un = prop.getProperty("user");
   String pwd = prop.getProperty(password);
   
   if(userName.equals(un) && password.equals(pwd))
	   return true;
   else 
	   return false;
   
   
  }
}
