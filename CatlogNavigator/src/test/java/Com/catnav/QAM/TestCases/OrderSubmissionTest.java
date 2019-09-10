package Com.catnav.QAM.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.catnav.QAM.base.TestBase;
import Com.catnav.QAM.pages.AdditionalOptionPage;
import Com.catnav.QAM.pages.CategoryResultPage;
import Com.catnav.QAM.pages.HomePage;
import Com.catnav.QAM.pages.ItemDetailsPage;
import Com.catnav.QAM.pages.PaymentOptionPage;
import Com.catnav.QAM.pages.ReviewOrderPage;
import Com.catnav.QAM.pages.ShippingBillingPage;
import Com.catnav.QAM.pages.ViewCartPage;

public class OrderSubmissionTest extends TestBase {
	HomePage homepage;
	CategoryResultPage categoryresultpage;
	ItemDetailsPage itemdetailspage;
	AdditionalOptionPage additionaloptionpage;
	ViewCartPage viewcartpage;
	ShippingBillingPage shippingbillingpage;
	PaymentOptionPage paymentoptionpage;
	ReviewOrderPage revieworderpage;
	public OrderSubmissionTest()
	{
		super();
	}
@BeforeMethod
public void setup()
{
	initialization();
	homepage=new HomePage();
	categoryresultpage=new CategoryResultPage();
	itemdetailspage=new ItemDetailsPage();
	additionaloptionpage=new AdditionalOptionPage();
	viewcartpage=new ViewCartPage();
	shippingbillingpage=new ShippingBillingPage();
}
@Test
public void verifyOrdersubmission() 
{
	homepage.clickOnProductCategory();
	categoryresultpage.ClickOnItem();
	itemdetailspage.clickonaddtocart();
	additionaloptionpage.clickonviewcart();
	viewcartpage.clickonproceedtocheckout();
	shippingbillingpage.Entershippingaddress();
	shippingbillingpage.selectshipper();
	paymentoptionpage.SelectBillingAddress();
	paymentoptionpage.paymentmethod();
	revieworderpage.submitorder();
}
@AfterMethod
public void endup()
{
	//driver.quit();
}
}
