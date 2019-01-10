package Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords 
{
	
 public static WebDriver driver;
 
 public static void openbrowser()
 {
	 System.setProperty("webdriver.chrome.driver", "C:/Users/mohan.keerthipati/Desktop/chromedriver_win32/chromedriver.exe");
	 driver=new ChromeDriver();
	 
 }
 
public static void url()
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.get("https://github.com");
}


public static void login()
{
	driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
}

public static void pass_username()
{
	driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("keerthipatimohanraj1579@gmail.com");
}

public static void pass_password()
{
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9493566467@aA");
}

public static void clickon_login()
{
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

public static void clickon_profile_dropdown()
{
	driver.findElement(By.xpath("//span[@class='dropdown-caret']")).click();
}

public static void clickon_logout_button()
{
	driver.findElement(By.xpath("//button[@class='dropdown-item dropdown-signout'][@type='submit'][@role='menuitem']")).click();
}

public static void quit()
{
	 driver.quit();
}
}
