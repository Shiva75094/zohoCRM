package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeNaukri 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID ')]")).sendKeys("shivkumartpcb@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shiva@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

}
