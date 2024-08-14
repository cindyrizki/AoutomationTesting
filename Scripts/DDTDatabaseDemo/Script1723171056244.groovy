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

//memanggil data files
TestData data = findTestData('Data Files/DDTDatabase')

//Hitung Jumlah baris
int hitungBaris = data.getRowNumbers()

//Looping
for (int i = 1; i <= hitungBaris.toInteger(); i++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.url1)

    WebUI.delay(5)

    'Start Page'
    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

    WebUI.delay(5)

    'Menu Toogle'
    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Page_CURA Healthcare Service/a_Login'))

    WebUI.delay(5)

    'Halaman Login'
    WebUI.takeScreenshot()

    WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), data.getValue(
            'username', i))

    WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), data.getValue(
            'password', i))

    WebUI.delay(5)

    'Username & Password terisi'
    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

    WebUI.delay(5)

    'Halaman Home'
    WebUI.takeFullPageScreenshot()

    WebUI.closeBrowser()
}

