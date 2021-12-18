package Class_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColoroFLink 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		System.out.println(color);
		driver.close();

	}

}
