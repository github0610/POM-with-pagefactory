package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class ReviewOrderPage extends TestBase {
	@FindBy(xpath="//a[@class='ecomm-cart-submit ecomm-checkout-button ecomm-button ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-hover']//span[@class='ui-button-text'][contains(text(),'Submit Order')]")
	WebElement submitorder;
	ThankYouPage thankyoupage;
	public ReviewOrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	public ThankYouPage submitorder()
	{
		submitorder.click();
		return thankyoupage;
	}
}
