package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import pom.actions.*;
public class google {

	public WebDriver driver=SeleniumDriver.getDriver();
	// SeleniumDriver obj=new SeleniumDriver();
	public WebElement element;
	
	GoogleHomePageActions GoogleHomePageActions1=new GoogleHomePageActions();
	
	@Given("Open the Chrome and launch the Google page")
	public void open_Google() throws InterruptedException
	{
		
		String URL="https://www.google.com";
		System.out.println("Open Google URL :");
		SeleniumDriver.openURL(URL);
		Thread.sleep(1000);
		
		SeleniumHelper.waitForPageToLoad();
		GoogleHomePageActions1.search_text("Parag GIT Code");
		/*
		element=driver.findElement(By.name("q"));
		boolean elepresent=SeleniumHelper.IsElementPresent(element);
		if(elepresent)
		{
			System.out.println("Page Open Sussessfully");
		}
		else
		{
			System.out.println("Element not found");
		}
		Thread.sleep(1000);
		//WebElement element=driver.findElement(By.name("q"));
		*/
			    
		
	}


	@When("^Enter the Search text and click search button$")
	public void enter_the_Search_text_and_click_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement element=driver.findElement(By.name("q"));
		//element.sendKeys("Parag GIT Code");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//*[@name='btnK'][1]")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[1]")).click();
		SeleniumHelper.waitForPageToLoad();
		GoogleHomePageActions1.submit_search();
		
	}

	@Then("^Searched page should be opend$")
	public void searched_page_should_be_opend() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}




}
