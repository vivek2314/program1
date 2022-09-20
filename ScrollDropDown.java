import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDropDown {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
		
		Thread.sleep(2000);
		
		
		
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		
		event.executeScript("document.querySelector(\".hsw_autocomplePopup.autoSuggestPlugin\").scrollTop=(500)");
	

	}

}
