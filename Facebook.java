package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sanath");
		driver.findElement(By.name("lastname")).sendKeys("raj");
		driver.findElement(By.name("reg_email_")).sendKeys("sanathrajssr2000@gmail.com");
		driver.findElement(By.id("password step input")).sendKeys("SANATH@123");
		WebElement date = driver.findElement(By.id("day"));
		Select day = new Select(date);
		day.selectByVisibleText("09");
		driver.findElement(By.name("Month")).sendKeys("MARCH");
		driver.findElement(By.name("YEAR")).sendKeys("2000");
		

	}

}
