package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateCustomerOrderOnOrderProduct extends Base {
	@Given("I am on Landing page")
	public void i_am_on_landing_page() {
		getUrl("http://it.microtechlimited.com");
	}

	@When("I click on Loging manu")
	public void i_click_on_loging_manu() {
		click(By.xpath("//a[@href='elogin.php']"));

	}

	@Then("I click on Customer Login Manu")
	public void i_click_on_customer_login_manu() {
		click(By.xpath("//a[text()='Customer Login']"));
	}

	@Then("I entered User Id {string}")
	public void i_entered_user_id(String string) {
		sendKeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");

	}

	@Then("I entered Entered Password as {string}")
	public void i_entered_entered_password_as(String string) {
		sendKeys(By.xpath("//input[@name='pwd']"), "1234");

	}

	@Then("i clicked on Login button")
	public void i_clicked_on_login_button() {
		click(By.xpath("//input[@type='submit']"));

	}

	@Then("i clicked on Order product")
	public void i_clicked_on_order_product() {
		click(By.xpath("//a[@href='productOrder.php?id=4']"));

	}

	@Then("i Select the product as Camera")
	public void i_select_the_product_as_camera() {
		Select se = new Select(driver.findElement(By.xpath("//select[@name='prodId']")));
		se.selectByVisibleText("Camera");
	}

	@Then("I verify the order product")
	public void i_verify_the_order_product() {
		sendKeys(By.xpath("//input[@name='ordDate']"), "1/24/2023");

		String t = getText(By.xpath("//h2[@class='title']"));
		assertEquals("Order Product", t);

	}

	@Then("I click on order product")
	public void i_click_on_order_product() {
		click(By.xpath("//button[@type='submit']"));

	}

	@Then("i click on Confirm Button")
	public void i_click_on_confirm_button() {
		click(By.xpath("//tbody/tr[last()]/td[last()]/a"));

	}

	@Then("I verify my Confirmed Order")
	public void i_verify_my_confirmed_order() {

		String s = getText(By.xpath("//tbody/tr[last()]/td[text()='Confirmed']"));
		assertEquals("Confirmed", s);
	}

	@Then("I loggedout from the site")
	public void i_loggedout_from_the_site() {
		click(By.xpath("//a[text()='Log Out']"));

	}

}
