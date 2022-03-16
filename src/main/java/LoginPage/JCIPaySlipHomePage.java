package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JCIPaySlipHomePage
{
	@FindBy(xpath=("//span[@id='ctl00_lbEmpName']"))private WebElement UI;
	
	public JCIPaySlipHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyUI()
	{	
		String expected = UI.getText();
		return expected;
	}
	
	
	
//	public void verifyUI(String expectedUI)
//	{
//		String actualUI=UI.getText();
//		System.out.println("expectedUI :"+" "+expectedUI);
//		System.out.println("actualUI :"+" "+actualUI);
//		if(actualUI.equals(expectedUI))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//	}

}
