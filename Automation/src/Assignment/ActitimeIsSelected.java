package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeIsSelected 
{

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean check = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		
		if(check==true)
		{
			System.out.println("Check box is selected");
		}
		else
		{
			System.out.println("Check box is unselected");
		}
		driver.close();
	}

}
