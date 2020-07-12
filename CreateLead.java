package TestSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CreateLead {
	
	public ChromeDriver driver;
    
	
	@Given("Open the chrome browser and load the URL")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Given("Enter the username as (.*) and password as (.*)")
	public void setCreds(String username, String password) {
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);

	}
	
	@Given("Click the Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();		

	}
	
	@Given("Click the CRMSFA link")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	@Given("Click the Leads tab")
	public void clickLead() {
		driver.findElementByLinkText("Leads").click();

	}
	
	@Given("Click the Create Lead link")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();

	}
	
	@Given("Enter the company name as (.*)")
	public void enterCName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@Given("Enter the first name as (.*)")
	public void enterFName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);

	}
	
	@Given("Enter the last name as (.*)")
	public void enterLName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

	}
	
	@When("Click the Create Lead button")
	public void submitLead() {
		driver.findElementByName("submitButton").click();

	}
	
	@Then("Verify Lead is created with Lead ID")
	public void leadCreated() {
		System.out.println("Lead Created Successfully");
		driver.close();
	}
	
	@Given("Click the Find Leads tab")
	public void findLeadTab() {
		driver.findElementByLinkText("Find Leads").click();

	}
	
	@Given("Click the Phone tab")
	public void phoneTab() {
		driver.findElementByXPath("//span[text()='Phone']").click();

	}
    
	@Given("Enter the phone number as 9876543230")
	public void passPhoneNo() {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9876543230");
	}
	
	@Given("Click on Find Leads")
	public void findLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}
	
	@Given("Click on first record")
	public void firstRecord() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

	}
	
	@When("Click on Delete button")
	public void deleteRecord() {
		driver.findElementByLinkText("Delete").click();

	}
	
	@Then("Lead deleted successfull")
	public void result() {
		System.out.println("Lead Deleted Successfull");
		driver.close();

	}
	
	@Given("Click on Edit button")
	public void editButton() {
		driver.findElementByLinkText("Edit").click();

	}
	
	@Given("Update Company Name")
	public void updateCName() {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("HGJGHJ");

	}
	
	@When("Click on Submit")
	public void updateLead() {
		driver.findElementByName("submitButton").click();

	}
	
	@Then("Lead updated successfull")
	public void leadUpdate() {
		System.out.println("Lead Updated Successfull");
		driver.close();

	}
	
	@Given("Click on Duplicate button")
	public void duplicateButton() {
		driver.findElementByLinkText("Duplicate Lead").click();

	}
	
	@When("Click on Submit button")
	public void submitButton() {
		driver.findElementByName("submitButton").click();

	}
	
	@Then("Duplicate Lead created successfull")
	public void duplicateLead() {
		System.out.println("Duplicate Lead created successfull");
		driver.close();

	}
	
	@Given("Click on Merge Lead tab")
	public void mergeLead() {
		driver.findElementByLinkText("Merge Leads").click();
	}
	
	@Given("Click on From Lead icon")
	public void fromLead() {
		driver.findElementByXPath("//img[@alt='Lookup']").click();

	}
	
	@Given("Enter first name as gopi and click on find lead and Select the first from record")
	public void firstLead() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("gopi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(allhandles.get(0));

	}
	
	@Given("Click on To Lead icon")
	public void toLead() {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

	}
	@Given("Enter first name as keerthivyas and click on find lead and Select the first to record")
	public void firstToLead() throws InterruptedException {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("keerthivyas");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(allhandles2.get(0));

	}
	
	@Given("click on Merge button")
	public void clickLeadMerge() {
		driver.findElementByXPath("//a[text()='Merge']").click();

	}
	
	@When("Accept the alert to merge lead")
	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}
	
	@Then("Lead Merge successfull")
	public void leadMerge() {
		System.out.println("Merge Lead Successfull");
		driver.close();

	}
	
	
}
