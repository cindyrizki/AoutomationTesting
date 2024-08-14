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

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url3)
"Halaman HomePage"
WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('MetrodataAcademy/Page_Metrodata Academy Regist/a_Daftar'))
"Halaman Registrasi"
WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.setText(findTestObject('MetrodataAcademy/Page_Metrodata Academy Regist/input__name'), 'Cindy Amalya')

WebUI.delay(5)

WebUI.setText(findTestObject('MetrodataAcademy/Page_Metrodata Academy Regist/input__email'), 'cindy.amalya@mii.co.id')

WebUI.delay(5)

WebUI.setText(findTestObject('MetrodataAcademy/Page_Metrodata Academy Regist/input__password'), '13l14c03M@')

WebUI.delay(5)

WebUI.setText(findTestObject('MetrodataAcademy/Page_Metrodata Academy Regist/input__confirmPassword'), '13l14c03M@')

WebUI.delay(5)

WebUI.check(findTestObject('MetrodataAcademy/Page_Metrodata Academy Regist/input__termsCondition'))

WebUI.delay(5)
"Halaman Regist Terisi"
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('MetrodataAcademy/Page_Metrodata Academy Regist/button_Daftar'))

WebUI.delay(15)

WebUI.closeBrowser()

