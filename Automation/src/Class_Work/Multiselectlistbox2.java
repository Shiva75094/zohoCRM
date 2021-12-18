package Class_Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectlistbox2
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Demo6.html");
		WebElement cplistbox = driver.findElement(By.id("cp"));
		Select s=new Select(cplistbox);
		List<WebElement> salloptions = s.getAllSelectedOptions();
		int count = salloptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = salloptions.get(i).getText();
			System.out.println(text);
			
		}
		driver.close();

	}

}
