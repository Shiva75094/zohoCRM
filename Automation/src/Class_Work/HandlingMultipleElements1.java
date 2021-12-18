package Class_Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements1
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("file:///C:/Users/Admin/Desktop/Demo5.html");
       List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
       int count = allLinks.size();
       System.out.println(count);
       WebElement Link = allLinks.get(0);
       String text = Link.getText();
       System.out.println(text);
       driver.close();
       
	}

}
