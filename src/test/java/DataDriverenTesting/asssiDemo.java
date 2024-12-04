package DataDriverenTesting;

import java.io.FileInputStream;

import javax.imageio.stream.FileCacheImageInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class asssiDemo {

	public static void main(String[] args) 
	{
		// open browser
		ChromeDriver driver = new ChromeDriver();
		//max bro
		driver.manage().window().maximize();
		//enter into page
		driver.get("https://demowebshop.tricentis.com/");
		String ac = driver.getCurrentUrl();
		if (ex.equals(ac)) 
		{
			System.out.println("im in excel page");
			driver.findElement(By.linkText("Log in"));
			Thread.sleep(2000);
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\book2.xlsx");
			Workbook wb =WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("sheet2");
			String gmail = sheet.getRow(0).getCell(0).toString();
			String password = sheet.getRow(0).getCell(1).toString();
			String gmail2 = sheet.getRow(1).getCell(1).toString();
			driver.findElement(By.id("Email")).sendKeys(Search);
			driver.findElement(By.id("Password"));
			Thread.sleep(2000);
			driver.findElement(By.xpath(gmail2));
			
		} else {

	

	}

}
