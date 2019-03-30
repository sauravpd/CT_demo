package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * CTHackATAhon
 * @author saurav
 *
 */
public class CTHackATAhon extends PageObject
{
	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = ".//*[@type='submit']")
	private WebElement submitbtn;

	public CTHackATAhon(WebDriver driver) 
	{
		super(driver);
	}

	public void enterUsername(String username) 
	{
		userName.sendKeys(username);
	}

	
	public void enterPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
}
