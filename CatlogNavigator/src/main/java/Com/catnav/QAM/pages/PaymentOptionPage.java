package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class PaymentOptionPage extends TestBase {
	@FindBy(id="ecomm-billing-same")
	WebElement billingaddress;
	@FindBy(xpath="//li[2]//input[1]")
	WebElement paymentoption;
	@FindBy(xpath="//input[@id='ecomm-accept-terms']")
	WebElement Accepttermandcondition;
	@FindBy(xpath="//button[@id='ecom-step3-btnsubmit']")
	WebElement ReviewandSubmitorder;
	ReviewOrderPage revieworderpage;
	public PaymentOptionPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void SelectBillingAddress()
	{
		billingaddress.click();
	}
	public ReviewOrderPage paymentmethod()
	{
		paymentoption.click();
		Accepttermandcondition.click();
		ReviewandSubmitorder.click();
		return revieworderpage;
	}
}