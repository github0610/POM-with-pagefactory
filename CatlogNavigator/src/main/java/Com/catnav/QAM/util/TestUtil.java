package Com.catnav.QAM.util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import Com.catnav.QAM.base.TestBase;

public class TestUtil extends TestBase {
public static int IMPLICIT_WAIT=20;
public static int PAGELOAD_WAIT=20;
public static void selectCountry(String countryName)
{
Select sel = new Select(driver.findElement(By.id("ecomm-ship-country")));
	sel.selectByVisibleText(countryName);
}
public static void selectState(String stateName)
{
Select sel = new Select(driver.findElement(By.id("ecomm-ship-state")));
	sel.selectByVisibleText(stateName);
}
}
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ecomm-step1-submit']/button")));
