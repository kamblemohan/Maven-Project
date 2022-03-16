package Test_JCIPAYSLIP;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.JCIPaySlipBaseClass;
import Library_Files.JCIPaySlipUtilityClass;
import LoginPage.JCIPaySlipHomePage;
import LoginPage.JCIPaySlipLoginPage;


public class JCI_Main_test_class extends JCIPaySlipBaseClass 
{
	JCIPaySlipLoginPage Login;
	JCIPaySlipHomePage Home;
	int JCISlip;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		Reporter.log("---Open Browser----");
		InitializeBrowser();
		Login = new JCIPaySlipLoginPage(driver);
		Home = new JCIPaySlipHomePage(driver);
		
	}
	
	@BeforeMethod
	public void LoginPage() throws EncryptedDocumentException, IOException
	{
		JCISlip=102;
		Reporter.log("---Login page----");
		Login.inpEnterUN(JCIPaySlipUtilityClass.getTD(1, 0));
		Login.inpEnterPWD(JCIPaySlipUtilityClass.getTD(1, 2));
		Login.ClickSubmitBtn();
		Home.verifyUI();
		
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		Reporter.log("---VerifyUI----");
		String actUserID=Home.verifyUI();
		String expected=JCIPaySlipUtilityClass.getTD(1, 1);
		
		Assert.assertEquals(actUserID, expected);
		
	}
	
	@AfterMethod
	public void LogoutPage(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			JCIPaySlipUtilityClass.TakeScreenShot(driver,JCISlip);
		}
		
		Reporter.log("---Logout page----");
	
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("---quit Browser----");
		driver.quit();
	}

}
