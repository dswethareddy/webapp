package loginnew;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class login1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("something", true);
        ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.merge(capabilities);
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver 2");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.get("http://qa.mapprr.com/");
	    //driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@id='login_btn']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567890");
	    
	}
 
}
