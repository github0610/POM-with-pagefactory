package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class AdditionalOptionPage extends TestBase {
	ViewCartPage viewcartpage;
@FindBy(id="edit-attr-view-cart")
WebElement viewcart;
public AdditionalOptionPage()
{
	PageFactory.initElements(driver, this);
}
public ViewCartPage clickonviewcart()
{
	//driver.switchTo().frame("additional-popup-iframe");
	viewcart.click();
	return viewcartpage;
}
}
