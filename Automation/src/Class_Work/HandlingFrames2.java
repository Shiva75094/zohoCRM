package Class_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Handling%20Frames/Page1.html");
		//switch the control inside the frame using string is id.
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("b");
		WebElement frm = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("t2")).sendKeys("c");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("d");

  }
}
