import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	@Given("User Navigate to web shop demo")
	def User_want_to_web_shop_demo() {
		WebUI.openBrowser("https://demowebshop.tricentis.com")
		WebUI.click(findTestObject('Object Repository/Page_WebDemo/Page_Demo Web Shop. Login/a_Log in'))
	}

	@When("User click login button")
	def User_click_login_button() {
	WebUI.click(findTestObject('Object Repository/Page_WebDemo/Page_Demo Web Shop. Login/a_Log in'))
	}
	
	@And("User Input email (.*) and password (.*)")
	def User_input_email_and_password(String email, String password) {
	WebUI.sendKeys(findTestObject('Object Repository/Page_WebDemo/Page_Demo Web Shop. Login/input_Email_Email'), email)
	WebUI.sendKeys(findTestObject('Object Repository/Page_WebDemo/Page_Demo Web Shop. Login/input_Password_Password'), password)
	}	
	
//	@And("User Input password (.*)")
//	def User_input_password() {
//	WebUI.sendKeys(findTestObject('Object Repository/Page_WebDemo/Page_Demo Web Shop. Login/input_Password_Password'), "wahid123")
//	}

	@Then("User click login")
	def User_click_login() {
	WebUI.click(findTestObject('Object Repository/Page_WebDemo/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))
	WebUI.closeBrowser()
	}
}