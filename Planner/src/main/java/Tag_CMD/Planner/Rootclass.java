package Tag_CMD.Planner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Rootclass
{
	WebDriver driver;
	@FindBy(name="q")
	WebElement x;
	
	public void test() throws IOException
	{
		FileInputStream fis =new FileInputStream("C:\\Users\\mohan.keerthipati\\eclipse-workspace\\Planner\\Property\\main.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("websiteurl");
		System.setProperty("webdriver.chrome.driver", "C:/Users/mohan.keerthipati/Desktop/chromedriver_win32/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		  
		driver.get(url);
		PageFactory.initElements(driver, Rootclass.class);
		x.sendKeys("Mohan");
	}
}
