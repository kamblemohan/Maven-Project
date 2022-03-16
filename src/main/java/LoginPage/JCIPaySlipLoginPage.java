package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JCIPaySlipLoginPage 
{

	@FindBy(xpath=("//input[@type='text']"))private WebElement UN;
	@FindBy(xpath=("//input[@type='password']"))private WebElement PWD;
	@FindBy(xpath=("//input[@type='submit']"))private WebElement LoginBtn;
	
	public JCIPaySlipLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void inpEnterUN(String UserName)
	{
	   UN.sendKeys(UserName);
	}
	public void inpEnterPWD(String Password)
	{
		PWD.sendKeys(Password);
	}
	public void ClickSubmitBtn()
	{
		LoginBtn.click();
	}
	
}
