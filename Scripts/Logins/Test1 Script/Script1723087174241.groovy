import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Open Browser
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

//Maxime the Window Browser
WebUI.maximizeWindow()

//Set Username
WebUI.setText(findTestObject('Object Repository/Test1/Page_OrangeHRM/input_Username_username'), 'Admin')

//Set Password
WebUI.setEncryptedText(findTestObject('Object Repository/Test1/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

//Click Button Login
WebUI.click(findTestObject('Object Repository/Test1/Page_OrangeHRM/button_Login'))

//Click button dropdown
WebUI.click(findTestObject('Object Repository/Test1/Page_OrangeHRM/i_Upgrade_oxd-icon bi-caret-down-fill oxd-u_ca92f9'))

//click button logout
WebUI.click(findTestObject('Object Repository/Test1/Page_OrangeHRM/a_Logout'))

//close browser
WebUI.closeBrowser()

