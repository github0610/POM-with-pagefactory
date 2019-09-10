package Com.catnav.QAM.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.catnav.QAM.base.TestBase;
import Com.catnav.QAM.pages.HomePage;
import Com.catnav.QAM.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	LoginPageTest()
	{
		super();
	}
@BeforeMethod
public void setup()
{
	initialization();
	loginpage=new LoginPage();
}
@Test(priority=1)
public void SignInLinkPresent()
{
	Boolean flag=loginpage.SinInLinkPresent();
	Assert.assertTrue(flag);
}
@Test(dependsOnMethods="SignInLinkPresent")
public void ClickOnSignInLink()
{
	loginpage = loginpage.ClickOnSignIn();
}
@Test(priority=2)
public HomePage ValidateLogin()
{
	homepage=loginpage.ValidateLogin(prop.getProperty("un"), prop.getProperty("pwd"));
	return homepage;
	//if(Assert.assertEquals(homepage, "Login successfull"));
	//if(Assert.)
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
