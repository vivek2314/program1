import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
		driver.get("https://vilt.vinsys.live/#/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("kartik");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button")).click();
		

	    Thread.sleep(1000);
	    
	    
	    System.out.println("************************  Dasboard Page Element ****************************");
	    
	    Thread.sleep(1000);
	    
		List<WebElement> ele1 = driver.findElements(By.xpath("/html"));

		for (WebElement e1: ele1)
    {
			System.out.println(e1.getText());
   }
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Reports']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-sidebar-nav-link-content[normalize-space()='User Logs']")).click();
		
		
		Thread.sleep(1000);
	Select org = new Select(driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//select[1]")));
	org.selectByIndex(2);
	
		Thread.sleep(1000);
	    Select org1 = new Select(driver.findElement(By.xpath("//div[@class='row justify-content-md-center']//div[2]//div[1]//select[1]")));
	    org1.selectByIndex(2);
	
	
	     Thread.sleep(1000);
	
	       Select org2 = new Select(driver.findElement(By.xpath("//div[@class='col-lg-2']//select[@id='exampleFormControlSelect1']")));
	       org2.selectByIndex(2);

		
		System.out.println("**************************user logs ***********************************");
		 Thread.sleep(1000);
		    
			List<WebElement> ele2 = driver.findElements(By.xpath("/html"));

			for (WebElement e2: ele2)
	    {
				System.out.println(e2.getText());
	   }
			
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-sidebar-nav-link-content[normalize-space()='User Reports']")).click();
			
			
			
			Select org3 = new Select(driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")));
			org3.selectByVisibleText("Organization 2");
			
			System.out.println("**************************user reports ***********************************");
			 Thread.sleep(1000);
			    
				List<WebElement> ele3 = driver.findElements(By.xpath("/html"));

				for (WebElement e3: ele3)
		    {
					System.out.println(e3.getText());
		   }
			
		
}

	
	

}
