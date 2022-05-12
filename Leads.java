package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SANATH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAJ");
		WebElement dropdown1= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select d1=new Select(dropdown1);
		d1.selectByVisibleText("Employee");
		WebElement dropdown2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select d2= new Select(dropdown2);
		d2.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/03/2000");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("300");
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select d3 = new Select(dropdown3);
		d3.selectByIndex(3);
		WebElement dropdown4= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select d4=new Select(dropdown4);
		d4.selectByValue("OWN_SCORP");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9566972144");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sanathrajssr2000@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SANATH RAJ");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("PERUGOPANAPALLI VILL&POST");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("BARUGUR T.K");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("KRISHNAGIRI");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635104");
		WebElement dropdown5= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select d5= new Select(dropdown5);
		d5.selectByValue("IND");
		WebElement dropdown6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select d6 = new Select(dropdown6);
		d6.selectByValue("IN-TN");
		driver.findElement(By.className("smallSubmit")).click();
		String Title1=driver.getTitle();
		System.out.println(Title1);
		String firstname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname);
		
		
				

	}

}
