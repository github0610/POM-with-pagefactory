package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class ItemDetailsPage extends TestBase {
	AdditionalOptionPage additionaloptionpage;
@FindBy(xpath="//a[contains(text(),'Add To Cart')]")
WebElement addtocart;
@FindBy(id="additional-popup-iframe")
WebElement frame;
public ItemDetailsPage()
{
	PageFactory.initElements(driver, this);
}
public AdditionalOptionPage clickonaddtocart()
{
	addtocart.click();
	return additionaloptionpage;
}
}
