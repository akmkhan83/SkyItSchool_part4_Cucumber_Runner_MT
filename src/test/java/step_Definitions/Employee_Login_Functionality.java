package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Login_Functionality extends Base {

@Given("I am in landing page")
public void i_am_in_landing_page() {
    getUrl("http://it.microtechlimited.com/index.html");
}

@When("I click on Login menu")
public void i_click_on_login_menu() {
	click(By.xpath("//a[@href='elogin.php']"));
	
}

@Then("Enter User Id as {string}")
public void enter_user_id_as(String string) {
	sendKeys(By.xpath("//input[@name='mailuid']"), "testpilot@gmail.com");

}

@Then("Enter Password as {string}")
public void enter_password_as(String string) {
	sendKeys(By.xpath("//input[@name='pwd']"), "1234");

}

@Then("I click on Login Button")
public void i_click_on_login_button() {
	click(By.xpath("//input[@type='submit']"));

}

@Then("Verify I am in my Home Page")
public void verify_i_am_in_my_home_page() {
	String s= getText(By.xpath("//h2[text()='Welcome Test ']"));
	System.out.println(s);
	assertEquals("Welcome Test", s);
}
	
}
