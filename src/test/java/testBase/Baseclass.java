package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	 WebDriver driver;
	 public Logger logger;

	    @BeforeClass
	    public void setup() {
	    	
	    	logger=LogManager.getLogger(this.getClass());

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://parabank.parasoft.com/parabank/");
	    }
	    public String randomeString()
	    {
	    	String generatedrandomString=RandomStringUtils.randomAlphabetic(5); 
	    	return  generatedrandomString;
	    	}
	    public String randomeNumeric()
	    {
	    	String generatedrandomNumber=RandomStringUtils.randomNumeric(10); 
	    	return  generatedrandomNumber;
	    }
	    public String randomeAlphaNumeric()
	    {
	    	String generatedrandomNumber=RandomStringUtils.randomAlphanumeric(10);
	    	String generatedrandomString=RandomStringUtils.randomAlphabetic(5); 
	    	return  (generatedrandomNumber+generatedrandomString);
	    }


	    @AfterClass
	    public void close() {
	        driver.quit();
	    }

}
