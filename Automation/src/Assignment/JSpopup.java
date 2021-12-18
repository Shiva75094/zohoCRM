package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSpopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text=a.getText();
		a.dismiss();
		
		boolean msg = driver.findElement(By.id("demo")).isDisplayed();
		if(msg==true)
		{
			System.out.println("You Pressed Cancel is display");
		}
		else
		{
			System.out.println("You Pressed Cancel is not display");
		}
		driver.close();
	}
}