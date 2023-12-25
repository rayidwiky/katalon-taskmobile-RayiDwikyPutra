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

String userDirectory = System.getProperty('user.dir')

String filePath = userDirectory + '\\Apk_file\\Solodroid_E-CommerceApp Demo_3.2.0.apk'

Mobile.startApplication(filePath, true)

Mobile.tap(findTestObject('Homepage/btn_Search'), 0)

Mobile.tap(findTestObject('Homepage/edit_search'), 0)

Mobile.sendKeys(findTestObject('Homepage/edit_search'), 'Samsung')

Mobile.hideKeyboard()

//'Get displayed message on the dialog'
def messageitem = Mobile.getText(findTestObject('Search/item_samsung'), 10)
Mobile.comment(messageitem)
//'Verify if displayed message is correct'
Mobile.verifyEqual(messageitem, 'Samsung Galaxy S10 - Black')



