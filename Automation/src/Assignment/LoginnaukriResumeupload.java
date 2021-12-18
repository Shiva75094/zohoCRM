package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginnaukriResumeupload 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	    driver.findElement(By.xpath("//label[@class='label']")).sendKeys("shivkumartpcb@gmail.com");
	    driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("Shiva@123");  
	    

	}

}
