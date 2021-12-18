package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingdoubleclick 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.linkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resources).perform();
		driver.findElement(By.linkText("Customers")).click();
		WebElement customers = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(customers).perform();
		boolean msg = driver.findElement(By.xpath(" ")).isDisplayed();
		if(msg==true)
		{
			System.out.println("HackerEarth + Vtiger CRM page is display and pass");
		}
		else
		{
			System.out.println("HackerEarth + Vtiger CRM page is not display and fail");
		}

	}

}
