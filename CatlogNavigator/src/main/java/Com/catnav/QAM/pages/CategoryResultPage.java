package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class CategoryResultPage extends TestBase {
	ItemDetailsPage ItemDetailsPage;
	@FindBy(xpath="//tr[1]//td[1]//span[1]//a[1]")
	WebElement itemlink;
public CategoryResultPage()
{
	PageFactory.initElements(driver, this);
}

public ItemDetailsPage ClickOnItem()
{
	itemlink.click();
	return ItemDetailsPage;
}
}
