package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class LoginPage extends TestBase {
//Page factory
@FindBy(id="plpSignInLink")
WebElement signinLink;
@FindBy(xpath="//input[@id='UserName']")
WebElement UserName;
@FindBy(xpath="//input[@id='Password']")
WebElement password;
@FindBy(xpath="//input[@id='plpPCATLogin']")
WebElement SignInButton;
//Initialising the login page object
public LoginPage() {
	PageFactory.initElements(driver, this);
}
public boolean SinInLinkPresent()
{
	return signinLink.isDisplayed();
}
public LoginPage ClickOnSignIn()
{
	signinLink.click();
	return new LoginPage();
}
public HomePage ValidateLogin(String un,String pwd)
{
	UserName.sendKeys(un);
	password.sendKeys(pwd);
	SignInButton.click();
	return new HomePage();
}
public String LoginPageTitle()
{
	String title = driver.getTitle();
	return title;
}
}
