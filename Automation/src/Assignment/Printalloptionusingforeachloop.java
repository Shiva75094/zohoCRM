package Assignment;

import java.util.List;

import org.omg.CORBA.Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printalloptionusingforeachloop 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Demo6.html");
		WebElement mtralloptions = driver.findElement(By.id("mtr"));
		Select s=new Select(mtralloptions);
		List<WebElement> palloption = s.getOptions();
		int count = palloption.size();
		System.out.println(count);
		for(WebElement i:palloption)
		{
			String text =i.getText();
			System.out.println(text);
		}
		driver.close();

	}

}
