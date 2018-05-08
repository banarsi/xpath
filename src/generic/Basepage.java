package generic;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage 


{
	
	public WebDriver driver;
public Basepage(WebDriver driver)
{
	this.driver=driver;
}


public void verifytitle(String acttitle)
{
	String exptitle=driver.getTitle();
	Assert.assertEquals(acttitle,exptitle);
	Reporter.log("title is matching", true);
}
}
