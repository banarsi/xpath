package generic;

	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	
	/**
	 * 
	 * @author T.Baby Sriya
	 *
	 */
	public class Basetest implements Constant
	{
		public static WebDriver driver;
		/**
		 * Launching the browser
		 * navigate to the url: "https://in.puma.com/"
		 * @throws IOException 
		 * @throws FileNotFoundException 
		 * 
		 */
		
		public Properties prop;
		@BeforeMethod()
		public void beforeConfig() throws FileNotFoundException, IOException
		{
			
			System.setProperty(Key, Value);
			 prop=new Properties();
			prop.load(new FileInputStream("/home/tyss/Desktop/littleapp/xpathproject/Property/data.properties"));
			driver = new ChromeDriver();

			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
			
		}
		/*
		 * close the browser
		 */
		@AfterMethod()
		public void afterConfig()
		{
			driver.close();
		}

	}

