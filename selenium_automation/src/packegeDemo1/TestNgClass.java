package packegeDemo1;

import org.testng.annotations.Test;

public class TestNgClass {
	
	
	
	@Test(priority = 1)
	public void car()
	{
		System.out.println("car is install and run");
	}
	
	@Test(priority =3)
	public void bmw()
	{
		System.out.println("car is bmw and run");
	}
	@Test(priority = 2)
	public void audi()
	{
		System.out.println("car is audi and run");
	}
	@Test(priority = 1)
	public void honda()
	{
		System.out.println("car is honda and run");
	}

}
