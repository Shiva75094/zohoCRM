package Class_Work;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadpopupRelativepath 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Naukri.html");
		File f=new File("./data/resume.docx");
		String absolutepath = f.getAbsolutePath();
		Thread.sleep(4000);
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
        driver.close();
	}


}
