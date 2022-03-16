package Library_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JCIPaySlipBaseClass 
{
	public WebDriver driver;
	public void InitializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\eclipse\\Selenium_All_Types\\Browsersexefiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://stmess.sahajapps.com/Default.aspx");
	}

}
