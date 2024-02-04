import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleLogin {
	@Test
	public void loginFb() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mohan");
		driver.findElement(By.id("pass")).sendKeys("5446f");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	@Test
	public void forgettonPassword() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
		driver.quit();
	}

}
