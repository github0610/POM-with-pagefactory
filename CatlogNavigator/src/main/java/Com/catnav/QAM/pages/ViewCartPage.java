package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class ViewCartPage extends TestBase {
	ShippingBillingPage shippingbillingpage;
@FindBy (xpath = "//span[@class='ui-button-text'][contains(text(),'Proceed to Checkout')]")
WebElement proceedtocheckout;
public ViewCartPage()
{
	PageFactory.initElements(driver, this);
}
public ShippingBillingPage clickonproceedtocheckout()
{
	proceedtocheckout.click();
	return shippingbillingpage;
}
}
