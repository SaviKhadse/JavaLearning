package opportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase19 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("savi@enexus.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ZXasqw1$");
		
		WebElement login= driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(2000);
		
		WebElement opportunity = driver.findElement(By.xpath("//a[text()='Opportunities']"));
		opportunity.click();
		
		WebElement quartsumm = driver.findElement(By.xpath("//option[text()='Current and Next FQ']"));
		quartsumm.click();
		
		WebElement include = driver.findElement(By.xpath("//option[text()='All Opportunities']"));
		include.click();
		
		WebElement runrep = driver.findElement(By.xpath("//input[@value='Run Report']"));
		runrep.click();
		
		
	}
	
}
