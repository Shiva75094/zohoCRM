package Class_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadpopupAbsulatepath
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Naukri.html");
		Thread.sleep(4000);
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Automation\\data\\resume.docx");

	}

}
