package Class_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectlistbox1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Demo6.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("v");
		Thread.sleep(1000);
		s.selectByVisibleText("dosa");
	if(s.isMultiple()==true)
		{
			s.deselectByIndex(2);
			s.deselectByValue("i");
			s.deselectByVisibleText("dosa");
		}
	

	}

}
