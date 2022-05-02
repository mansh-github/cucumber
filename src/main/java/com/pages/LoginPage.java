package com.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.commonactions.Commonactions;
import com.pages.HomePage;
import com.utility.ExcelLibrary;
import com.utility.Log;

public class LoginPage extends Base {

	ExcelLibrary excelDetails = new ExcelLibrary();

	Commonactions actions;
	// Web Elements

	@FindBy(css = "[class='_1_3w1N']")
	WebElement login;

	@FindBy(css = "[class='_2IX_2- VJZDxU']")
	WebElement loginId;

	@FindBy(css = "[class='_2IX_2- _3mctLh VJZDxU']")
	WebElement loginPassword;

	@FindBy(css = "[class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginButton;

	@FindBy(xpath = "//div[@class='IiD88i _351hSN undefined'] //span[@class='_2YULOR']/span")
	WebElement errorMessage;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);

	}

	public String validatePageTitle() {
		return getDriver().getTitle();
	}

	public void loginClick() {

		Commonactions.waitForElement(getDriver(), login);
		Commonactions.click(getDriver(), login);
	}

	public void loginButton() throws InterruptedException {

		// login button
		Commonactions.waitForElement(getDriver(), loginButton);
		Commonactions.click(getDriver(), loginButton);
		
		/*
		 * Thread.sleep(2000L);
		 * 
		 * if(errorMessage!=null) { String message = errorMessage.getText();
		 * assertFalse(true); System.out.println("error message = " + message); }else {
		 * 
		 * System.err.println("error message is null"); }
		 */

	}

	public HomePage validateLoginFunction(String userName, String passWord) {

		//// login id
		String UserLoginId = excelDetails.getCellData("FlipkartInput", 4, 2);
		Commonactions.waitForElement(getDriver(), loginId);
		//Commonactions.type(loginId, UserLoginId);
		Commonactions.type(loginId, userName);

		// login pass
		String password = excelDetails.getCellData("FlipkartInput", 5, 2);
		Commonactions.waitForElement(getDriver(), loginPassword);
		//Commonactions.type(loginPassword, password);
		Commonactions.type(loginPassword, passWord);

		return new HomePage();
	}

}
