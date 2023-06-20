package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyTheCustomerOrderList extends Base {
	@Given("I an on Landing Page")
	public void i_an_on_landing_page() {
		getUrl("http://it.microtechlimited.com/index.html");
	}

	@Then("I Clicked on Login Button")
	public void i_clicked_on_login_button() {
		click(By.xpath("//a[@href=\"elogin.php\"]"));

	}

	@Then("I Clicked on Customer Login Button")
	public void i_clicked_on_customer_login_button() {
		click(By.xpath("//a[@href='clogin.php']"));

	}

	@Then("I Entered User Id as divid@gmail.com")
	public void i_entered_user_id_as_divid_gmail_com() {
		sendKeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");

	}

	@Then("I Entered Password as {int}")
	public void i_entered_password_as(Integer int1) {
		sendKeys(By.xpath("//input[@name='pwd']"), "1234");

	}

	@Then("I Clicked on Loging Button")
	public void i_clicked_on_loging_button() {
		click(By.xpath("//input[@type='submit']"));

	}

	@Then("I Clicked on Order List")
	public void i_clicked_on_order_list() {
		click(By.xpath("//a[@href='orderList.php?id=4']"));

	}

	@Then("I verify the Order List Text")
	public void i_verify_the_order_list_text() {
		String s = getText(By.id("orderList-title"));
		assertEquals("Order is List", s);
		System.out.println(s);
	}

	@Then("I Logged out from The Page")
	public void i_logged_out_from_the_page() {
		click(By.xpath("//a[@href='clogin.php']"));
	}
}
