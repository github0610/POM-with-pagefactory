package Com.catnav.QAM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.catnav.QAM.base.TestBase;

public class HomePage extends TestBase {
	CategoryResultPage CategoryResultPage;
//page factory OR(Object Repository)
	@FindBy(xpath="//div[@id=\"plp-thumbs\"]/div[2]/div[1]/h2")
	WebElement productlink;
	@FindBy(name="searchText")
	WebElement KeywordSearchEditBox;
	@FindBy(id="search")
	WebElement KeywordSearchIcon;
	//Initialising the Homepage object
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	public void DoKeywordSearch()
	{
		KeywordSearchEditBox.sendKeys("item");
		KeywordSearchIcon.click();
	}
	public CategoryResultPage clickOnProductCategory()
	{
		productlink.click();
		return CategoryResultPage;		
	}
}
