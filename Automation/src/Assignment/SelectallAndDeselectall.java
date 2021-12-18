package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectallAndDeselectall 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Demo6.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 Select s=new Select( mtrlistbox);
		 List<WebElement> alloption =s.getOptions();
		 int count=alloption.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++)
		 {
			 s.selectByIndex(i);
		 }
		 for(int i=count-1;i>=0;i--)
		 {
			 s.deselectByIndex(i);
		 }
	}

}
