package WeekDay2ndweekworkout;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadinLeaf {

	public static void main(String[] args) throws InterruptedException {
		
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
      
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gokul");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
	   
		
		String title1 = driver.getTitle();
	    System.out.println("Edit title= "+ title1);
	    
	    Assert.assertEquals(title1, "View Lead | opentaps CRM");
	    
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
	    
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Unisoft");
        
	    driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	    
	    String CompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    String Uni = new String ();
	    if (CompanyName.contains(Uni)) {
	    	System.out.println("CompanyName Match");
			
		} else {
System.out.println("CompanyName not Match");
		}
	    
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
	}

}
