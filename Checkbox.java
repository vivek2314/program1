import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) 
	
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
		
		
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
		
		

		WebElement ele = driver.findElement(By.xpath("//label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg']"));
		ele.click();
		
		if(ele.isEnabled())
		{
			System.out.println(ele);
		}

}
}
