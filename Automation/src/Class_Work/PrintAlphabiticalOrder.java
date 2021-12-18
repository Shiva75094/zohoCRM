package Class_Work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabiticalOrder 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Demo6.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		ArrayList<String>a1=new ArrayList<>();
		for(WebElement option:alloptions)
		{
			String text = option.getText();
			a1.add(text);
		}
		Collections.sort(a1);
		for(String txt:a1)
		{
			System.out.println(txt);
		}
		driver.close();
	}
}
