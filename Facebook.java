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
		driver.findElement(By.name("reg_email__")).sendKeys("sanathrajssr2000@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("SANATH@123");
		
		
		WebElement date = driver.findElement(By.id("day"));
		Select d1= new Select(date);
		d1.selectByValue("9");
		WebElement month = driver.findElement(By.id("month"));
		Select d2 = new Select(month);
		d2.selectByValue("3");
		WebElement year = driver.findElement(By.id("year"));
		Select d3 = new Select(year);
		d3.selectByValue("2000");
		

	}

}
