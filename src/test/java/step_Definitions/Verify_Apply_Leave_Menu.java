package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verify_Apply_Leave_Menu extends Base {
	@Given("I am on Landing Page")
	public void i_am_on_landing_page() {
		getUrl("http://it.microtechlimited.com");
	}
	@Then("I click on Loging bar")
	public void i_click_on_loging_bar() {
		click(By.xpath("//a[@href='elogin.php']"));

	}

	@Then("I Enter user Id as {string}")
	public void i_enter_user_id_as(String string) {
		sendKeys(By.xpath("//input[@name='mailuid']"), "testpilot@gmail.com");

	}

	@Then("I Enter Password as {int}")
	public void i_enter_password_as(Integer int1) {
		sendKeys(By.xpath("//input[@name='pwd']"), "1234");

	}

	@Then("I Click On Loging Button")
	public void i_click_on_loging_button() {
		click(By.xpath("//input[@type='submit']"));

	}

	@Then("T click On Apply Leave Menu bar")
	public void t_click_on_apply_leave_menu_bar() {
		click(By.xpath("//a[text()='Apply Leave']"));

	}

	@Then("I put The Reason anr Duration")
	public void i_put_the_reason_anr_duration() throws InterruptedException {
		sendKeys(By.xpath("//input[@placeholder='Reason']"), "FEVER");
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Reason']") ) );
		boolean result = driver.findElement( By.xpath("//input[@placeholder='Reason']") ).isDisplayed();
		System.out.println(result);

		sendKeys(By.xpath("//input[@name='start']"), "o1/24/2023");
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='start']") ) );
       

		sendKeys(By.xpath("//input[@name='end']"), "02/02/2023");
		Thread.sleep(3000);
		click(By.xpath("//button"));
	}

	@Then("I verify the Leave Reason\\(Last Click Asserton)")
	public void i_verify_the_leave_reason_last_click_asserton() {
		String s = getText(By.xpath("//tbody/tr[last()]/td[text()='FEVER']"));
		assertEquals("FEVER", s);
	}
}
