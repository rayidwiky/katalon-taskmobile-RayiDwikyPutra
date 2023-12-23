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

Mobile.tap(findTestObject('Footer_NavBar/Nav_Profile'), 0)

Mobile.tap(findTestObject('Menu_Profile/Btn_Edit'), 0)

WebUI.comment('Replace Name')

Mobile.tap(findTestObject('Menu_User_Profile/Mn_Name'), 0)

Mobile.tap(findTestObject('Menu_User_Profile/Edit_Text'), 0)

Mobile.setText(findTestObject('Menu_User_Profile/Edit_Text'), 'Rayi', 0)

Mobile.tap(findTestObject('Menu_User_Profile/btn_OK'), 0)

WebUI.comment('Replace Mail')

Mobile.tap(findTestObject('Menu_User_Profile/Mn_Email'), 0)

Mobile.tap(findTestObject('Menu_User_Profile/Edit_Text'), 0)

Mobile.setText(findTestObject('Menu_User_Profile/Edit_Text'), 'rayii@gmail.com', 0)

Mobile.tap(findTestObject('Menu_User_Profile/btn_OK'), 0)

WebUI.comment('Replace Phone')

Mobile.tap(findTestObject('Menu_User_Profile/Mn_Phone'), 0)

Mobile.tap(findTestObject('Menu_User_Profile/Edit_Text'), 0)

Mobile.setText(findTestObject('Menu_User_Profile/Edit_Text'), '08571234567', 0)

Mobile.tap(findTestObject('Menu_User_Profile/btn_OK'), 0)

WebUI.comment('Replace Address')

Mobile.tap(findTestObject('Menu_User_Profile/Mn_Address'), 0)

Mobile.tap(findTestObject('Menu_User_Profile/Edit_Text'), 0)

Mobile.setText(findTestObject('Menu_User_Profile/Edit_Text'), 'Jl pondok indah', 0)

Mobile.tap(findTestObject('Menu_User_Profile/btn_OK'), 0)

Mobile.tap(findTestObject('Menu_User_Profile/back'), 0)

//'Get displayed message on the dialog'
def messageName = Mobile.getText(findTestObject('Menu_Profile/Lbl_Name'), 10)

//'Verify if displayed message is correct'
Mobile.verifyEqual(messageName, 'Rayi')

Mobile.comment(messageName)

//'Get displayed message on the dialog'
def messageMail = Mobile.getText(findTestObject('Menu_Profile/Lbl_Mail'), 10)

//'Verify if displayed message is correct'
Mobile.verifyEqual(messageMail, 'rayii@gmail.com')

Mobile.comment(messageMail)

//'Get displayed message on the dialog'
def messagePhone = Mobile.getText(findTestObject('Menu_Profile/Lbl_Phone'), 10)

//'Verify if displayed message is correct'
Mobile.verifyEqual(messagePhone, '08571234567')

Mobile.comment(messagePhone)

//'Get displayed message on the dialog'
def messageAdrs = Mobile.getText(findTestObject('Menu_Profile/Lbl_Address'), 10)

//'Verify if displayed message is correct'
Mobile.verifyEqual(messageAdrs, 'Jl pondok indah')

Mobile.comment(messageAdrs)

