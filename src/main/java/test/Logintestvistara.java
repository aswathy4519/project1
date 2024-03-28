package test;



import org.testng.annotations.Test;

import base.Basevistara;
import page.Loginvistara;
import utility.Excelhandlevistara;

public class Logintestvistara extends Basevistara 
   {
	
	@Test
	public void logincredentials() throws Exception
	{
		
	
    Loginvistara ob=new Loginvistara(driver);
	
	String excel="C:\\Users\\DELL\\Desktop\\Book1.xlsx";
	String sheet="Sheet1";
	int rowcount=Excelhandlevistara.getrowcount(excel, sheet);
	
	for (int i=1;i<=rowcount;i++)
	{
		String email=Excelhandlevistara.getcellvalue(excel, sheet, i, 0);
		System.out.println("email = "+email);
		String password=Excelhandlevistara.getcellvalue(excel,sheet,i,1);
		System.out.println("password = "+password);
		
		ob.setvalues(email, password);
		ob.login();
		
		String expected="https://www.airvistara.com/in/en/club-vistara/my-account";
		String actual=driver.getCurrentUrl();
		
		if (actual.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		ob.clear();
		
}	

}
}

