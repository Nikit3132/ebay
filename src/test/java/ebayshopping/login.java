package ebayshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.name("_nkw")).sendKeys("mobile");
		Thread.sleep(2000);
	
		driver.findElement(By.id("gh-btn")).click();
		
		//driver.close();
		  
	}

}
