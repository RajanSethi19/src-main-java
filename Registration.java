package Amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	@FindBy(id = "ap_customer_name")
	WebElement user;
	@FindBy(id = "ap_phone_number")
	WebElement ph_no;
	@FindBy(id = "ap_password")
	WebElement pass;
	@FindBy(id = "continue")
	WebElement cont;

	public void user_name() {

		user.sendKeys("Rajan");
	}

	public void Phone_no() {

		ph_no.sendKeys("9996464204");
	}

	public void Password() {

		pass.sendKeys("Rajan@1991");
	}

	public void continue_now() {

		cont.click();
	}

	public Registration( ChromeDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
