package Amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Amazon {
	
	//step 1
		ChromeDriver driver;
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement continue_button;
		@FindBy(id="ap_password")
		WebElement password;;
		
		@FindBy(id="signInSubmit")
		WebElement signin_button;
	 //step 2	
		public void un()
		{
			username.sendKeys("9996464204");
		}
		public void cnt()
		{
			continue_button.click();
		}
		public void pwd()
		{
			                                                                                                                                          password.sendKeys("Rajan@1991");
		}
		public void signin()
		{
			signin_button.click();
		}
		//step 3
		public Login_Amazon(ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
