package pom_ele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_ele {
	

	
	@FindBy (xpath="//input[@id='email']")
	private WebElement email;

	
	
	public login_ele(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void email_enter() {
		email.sendKeys("mohini1497@gmail.com");
	}
	
	

	
}
