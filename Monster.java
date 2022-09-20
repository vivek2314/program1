import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Monster {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		 
		   JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		   Thread.sleep(3000);
		   js.executeScript("scroll(0, -250);");
		 
		   // FILE UPLOADING USING SENDKEYS ....
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   
		   
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:/Users/Shree/Desktop/Vivek Kumar Resume.docx"); //Uploading the file using sendKeys
		   
		   Thread.sleep(3000);
		   System.out.println("File is Uploaded Successfully");
		   //js.executeScript("window.scrollBy(0,-250)");
		   
		 
	}

}
