package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class JCIPaySlipUtilityClass 
{
	
	static Sheet sh;
	public static String getTD(int RowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\New folder\\New folder\\eclipse\\Selenium_All_Types\\ExcelSheet\\Seleniumexcel.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		String expected=sh.getRow(RowIndex).getCell(cellIndex).getStringCellValue();
		return expected;
	}
	
	public static void TakeScreenShot(WebDriver driver, int JCISlip) throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\New folder\\New folder\\eclipse\\Selenium_All_Types\\POM_ScreenShot\\TestcaseID_"+ JCISlip+".jpg");
		
		FileHandler.copy(source, dest);
	}
	
	
}
