package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;
import generic.Utility;

public class Login extends Basepage


{
@FindBy(xpath="//span[text()='Rings ']")
private WebElement rings_btn;

@FindBy(xpath="//span[text()='Gold Purity']")
private WebElement goldoptions;


public Login(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}


/*public void naviGateToMenue(String menutype , String subCatagray , String options) {
		Actions a = new Actions(driver);
		String x = "//a[text()='"+subCatagray+"' and contains(@href,'"+menutype+"')]/../../following-sibling::li/a[text()='"+options+"']";

		a.moveToElement(driver.findElement(By.linkText(menutype.toUpperCase()))).perform();
		driver.findElement(By.xpath(x)).click();
*/

public void verify(String title1)
{
	verifytitle(title1);
}

public void ring()
{
	rings_btn.click();
}

public void gold_options()
{
	Utility.action(driver, goldoptions);
}


}
