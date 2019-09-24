package one;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitContactForm {
	
	// Evam Website Contact Form Automation
	
	public static void main(String[] args) {
        
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "https://evam.com/";
        
        // STEP 1 - launch Firefox and  Visit EVAM Website
        driver.get(baseUrl);
        
        
        // Step 2 - Go to Contact tab
        
        //Find Contact Link (HTML Element) with the help of xPath and then perform click operation to open the contact page
        
        driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/div/div/nav/div/ul/li[3]/a/span")).click();
        
        
        // Step 3-  Copy all EVAM office addresses and paste them into the Message field of the form by pressing enter between each of them to make it easy to read.
        
        // 1) Find out Span (HTML Element)t with xpath and get USA office address with getText method and finally store the text into a string variable called AddressUSA 
        
        String   AddressUSA = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[1]/div/div[2]/p[2]/span")).getText();
        
        
        // 2) Find the Message Text Area Element and then send the USA address value to Message with the help of sendkeys() method 
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(AddressUSA);
        
        
        // 3)  Finally to introduce a new line by replicating/impersonating the ENTER button I use Keys.ENTER in sendKeys() method 
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(Keys.ENTER);
        		
        
        // 1) Find out Span (HTML Element) with xpath and get Netherland office address with getText() method and finally store the text into a string variable called AddressNetherland 
        
        String   AddressNetherland = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[2]/div/div[2]/p[2]/span")).getText();
        
        
        // 2) Find the Message Text Area Element and then send the Netherland address value to Message with the help of sendkeys() method 
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(AddressNetherland);
        
        
        // 3)  Finally to introduce a new line by replicating/impersonating the ENTER button I use Keys.ENTER in sendKeys() method 
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(Keys.ENTER);
       
        
     // 1) Find out Span (HTML Element) with xpath and get Netherland office address with getText() method and finally store the text into a string variable called AddressNetherland
        String   AddressTurkey = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[1]/div/div[3]/div/div/div[2]/p[2]/span")).getText();
        
     // 2) Find the Message Text Area Element and then send the Netherland address value to Message with the help of sendkeys() method 
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(AddressTurkey);
     
        // 3)  Finally to introduce a new line by replicating/impersonating the ENTER button I use Keys.ENTER in sendKeys() method  
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(Keys.ENTER);
        
        
     // 1) Find out Span (HTML Element) with xpath and get Netherland office address with getText() method and finally store the text into a string variable called AddressNetherland
        String   AddressRussia = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[2]/div/div[4]/p[2]/span")).getText();
        
     // 2) Find the Message Text Area Element and then send the Netherland address value to Message with the help of sendkeys() method 
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(AddressRussia);
       
     // 3)  Finally to introduce a new line by replicating/impersonating the ENTER button I use Keys.ENTER in sendKeys() method 
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[3]/div/span/textarea")).sendKeys(Keys.ENTER);
        
     // Step 4 - Fill out Name, Email, Phone and Company Information
        
     // First of all find HTML Elements one by one for (Name, Email, Phone and Company) and then use sendKeys() method to send the values in the text fields    
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[1]/div[1]/span/input")).sendKeys("Test User1");
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[1]/div[2]/span/input")).sendKeys("test1@yopmail.com");
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[2]/div[1]/span/input")).sendKeys("06987452");
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[2]/div[2]/span/input")).sendKeys("Company");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.err.println("There was some error in Thread.sleep()");
		}
        
      // Step 5 - Find Span (HTML Element) with xpath for send button and then use to click() to submit the form
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div/div[10]/div[1]/div/div[3]/div/div/form/div[2]/div[4]/div[2]/input")).click();
        
        
        //close Firefox
        driver.close();
       
    }
	
	
	

}
