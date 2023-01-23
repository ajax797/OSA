package practice;

import org.testng.annotations.Test;

public class Create_Test
{
	@Test(groups = "smoke")
	public void create()
	{
		System.out.println("created");
		String b = System.getProperty("browser");
		System.out.println(b);
	}
	@Test(groups = "regression")
	public void edited()
	{
		System.out.println("edited");
	}
}
