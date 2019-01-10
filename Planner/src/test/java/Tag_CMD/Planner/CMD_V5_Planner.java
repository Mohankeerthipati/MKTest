package Tag_CMD.Planner;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CMD_V5_Planner extends Rootclass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/mohan.keerthipati/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://github.com");
		driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("keerthipatimohanraj1579@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9493566467@aA");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Asserts.check(true, title);
		/*driver.findElement(By.xpath("//span[@class='dropdown-caret']")).click();
		driver.findElement(
				By.xpath("//button[@class='dropdown-item dropdown-signout'][@type='submit'][@role='menuitem']"))
				.click();
		driver.quit();*/

	}
}
