package WeekDay2ndweekworkout;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();

		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("baskar4195@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(6000);

		String FirstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).getText();
		System.out.println(FirstLeadId);

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String DuplicateLead = driver.findElement(By.xpath("//span[text()='Baskar']")).getText();
		String Bas = new String();
		if (DuplicateLead.contains(Bas)) {
			System.out.println("titles match");
		} else {
			System.out.println("title not match");
		}
Thread.sleep(3000);
	 driver.close();
	}

}
/*
 * http://leaftaps.com/opentaps/control/main
 * 
 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Click on Email 9
 * Enter Email 10 Click find leads button 11 Capture name of First Resulting
 * lead 12 Click First Resulting lead 13 Click Duplicate Lead 14 Verify the
 * title as 'Duplicate Lead' 15 Click Create Lead 16 Confirm the duplicated lead
 * name is same as captured name 17 Close the browser (Do not log out)
 * 
 */