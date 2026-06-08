package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends Baseclass{


    @Test
    public void verify_registration() {
    	logger.info("**********starting testcase");
    	try
    	{
        HomePage hp = new HomePage(driver);
        hp.clickRegister();
        logger.info("**********starting testcase***************");

        AccountRegistration reg = new AccountRegistration(driver);
        logger.info("**********customer details***************");

        reg.setFirstName(randomeString().toUpperCase());
        reg.setLastName(randomeString().toUpperCase());
        reg.setAddress("Pune");
        reg.setCity("Pune");
        reg.setState("Maharashtra");
        reg.setZipCode("411001");
        reg.setPhone(randomeNumeric());
        reg.setSSN("123456");

        String username = "maya" + System.currentTimeMillis();
        reg.setUsername(username);
        String password=randomeAlphaNumeric();

        reg.setPassword(password);
        reg.setConfirmPassword(password);

        reg.clickRegister();
    	}catch(Exception e)
    	{
    		logger.error("Tets faioed");
    		Assert.fail();
    	}
    }
    
   
}