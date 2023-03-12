package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KAVIORG");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaviyarasan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaliaperumal");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kavi");
		driver.findElement(By.name("departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a sample description added");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavi.arasan99@gail.com");
		
		WebElement sourcedrop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sel = new Select(sourcedrop);
		
		sel.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is a Important note added");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
