package stepDefinations;

import com.base.Base;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class stepDefination extends Base {

	HomePage hp;
	LoginPage lp;

	public stepDefination() {
		super();
	}

	/*
	 * @Before public void setup() throws InterruptedException {
	 * System.out.println("in browser"); Initialization("chrome"); }
	 */

	@Given("Initilize the browser with chrome")
	public void initilize_the_browser_with_chrome() {

		hp = new HomePage();
		lp = new LoginPage();

		System.out.println("Initilize the browser with chrome");
	}

	@When("Navigate to {string} Site")
	public void navigate_to_site(String string) {

		getDriver().get(prop.getProperty("url"));

	}

	@And("user on the Login Page")
	public void user_on_the_login_page() {

		hp.loginCancleButton();
		hp.validatePageTitle();
		System.out.println(hp.validatePageTitle());

		System.out.println("user on the Login Page");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {

		lp.loginClick();

	}

	@And("^user enters (.+) and (.+) and logs in$")
	public void user_enters_user1_and_password1_and_logs_in(String userName, String password) {

		lp.validateLoginFunction(userName, password);

		System.out.println(userName + "and = " + password);
	}

	@And("user click {string} button")
	public void user_click_button(String string) throws InterruptedException {
		
		lp.loginButton();
		System.out.println("user click {string} button");
		
		
	}

	@Then("user should see {string}")
	public void user_should_see(String string) {

		System.out.println("user should see {string}");
	}
}
