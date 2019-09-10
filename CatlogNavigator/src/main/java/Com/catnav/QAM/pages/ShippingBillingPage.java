package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.catnav.QAM.base.TestBase;
import Com.catnav.QAM.util.TestUtil;

public class ShippingBillingPage extends TestBase{
	@FindBy(name="FirstName") 
	WebElement FirstName;
	@FindBy(name="LastName") 
	WebElement LastName;
	@FindBy(name="Address1") 
	WebElement Address;
	@FindBy(id="ecomm-ship-city") 
	WebElement city;
	@FindBy(id="ecomm-ship-zip") 
	WebElement zipcode;
	@FindBy(name="Phone") 
	WebElement phone;
	@FindBy(name="Email") 
	WebElement email;
	@FindBy(xpath="//span[contains(text(),'Calculate Shipping')]")
	WebElement calculateshipping;
	@FindBy(xpath="//fieldset[@id='ecomm-standard-options']/ul/li[1]/input[1]")
	WebElement shipperoption;
	@FindBy(xpath="//div[@id='ecomm-step1-submit']/button")
	WebElement paymentbutton;
	TestUtil testutil;
	PaymentOptionPage paymentoptionpage;
	public ShippingBillingPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void Entershippingaddress()
	{
		FirstName.sendKeys("Selenium");
		LastName.sendKeys("Webdriver");
		Address.sendKeys("ad");
		city.sendKeys("New York");
		TestUtil.selectCountry("UNITED STATES OF AMERICA");
		TestUtil.selectState("New York");
		zipcode.sendKeys("10001");
		phone.sendKeys("7896541236");
		email.sendKeys("ratnesh.k@orioninc.com");
	}
	public PaymentOptionPage selectshipper()
	{
		calculateshipping.click();
		shipperoption.click();
		WebDriverWait extwait=new WebDriverWait(driver,20);
		extwait.until(ExpectedConditions.elementToBeClickable(paymentbutton));
		paymentbutton.click();
		return paymentoptionpage;
	}
}
