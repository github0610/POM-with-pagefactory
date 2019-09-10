package POM.QAM.Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	@Test
	public void add()
	{
		System.out.println("This is Addition");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void Sub()
	{
		System.out.println("This is Substraction");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	@Test
	public void Multi()
	{
		System.out.println("This is Multiplication");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b);
	}
	@Test
	public void Div()
	{
		System.out.println("This is Division");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}

}
