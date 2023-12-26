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

Mobile.tap(findTestObject('Homepage/Item_Samsung'), 0)

Mobile.tap(findTestObject('Desc_Product/Btn_addCart'), 0)

Mobile.setText(findTestObject('Desc_Product/Edt_NmbrOrder'), '1', 0)

Mobile.tap(findTestObject('Desc_Product/Btn_Add'), 0)

Mobile.tap(findTestObject('Desc_Product/btn_Back'), 0)

Mobile.tap(findTestObject('Homepage/Item_AppleWatch'), 0)

Mobile.tap(findTestObject('Desc_Product/Btn_addCart'), 0)

Mobile.setText(findTestObject('Desc_Product/Edt_NmbrOrder'), '1', 0)

Mobile.tap(findTestObject('Desc_Product/Btn_Add'), 0)

Mobile.tap(findTestObject('Desc_Product/btn_Back'), 0)

Mobile.tap(findTestObject('Homepage/Item_MiniDigital'), 0)

Mobile.tap(findTestObject('Desc_Product/Btn_addCart'), 0)

Mobile.setText(findTestObject('Desc_Product/Edt_NmbrOrder'), '1', 0)

Mobile.tap(findTestObject('Desc_Product/Btn_Add'), 0)

Mobile.tap(findTestObject('Desc_Product/Btn_Cart'), 0)

/*
//'Get displayed message on the dialog'
def Harga1 = Mobile.getText(findTestObject('Shopping_Cart/Lbl_Price_ApWatch'), 10)

Mobile.comment(Harga1)

//'Get displayed message on the dialog'
def Harga2 = Mobile.getText(findTestObject('Shopping_Cart/Lbl_Price_Samsung'), 10)

Mobile.comment(Harga2)

//'Get displayed message on the dialog'
def Harga3 = Mobile.getText(findTestObject('Shopping_Cart/Lbl_Price_Radio'), 10)

Mobile.comment(Harga3)

// Mengonversi dan menjumlahkan harga
def totalHarga = [Harga1, Harga2, Harga3].collect({ 
            ((it.replaceAll('[^\\d]', '')) as Integer)
    }).sum()

//'Print total harga'
Mobile.comment("Total Harga: $totalHarga")

// total harga * 110%
def totalHargaAfterTAX = Math.round((totalHarga * 1.1) as int)
Mobile.comment("Total Harga after Tax: $totalHargaAfterTAX")
*/
//diambil dari ui - total harga
def TotalPlusTax = Mobile.getText(findTestObject('Shopping_Cart/Lbl_TotalPrice'), 10)

Mobile.comment("Total Harga dan Tax: $TotalPlusTax")

//'Verify harga setelah pajak sama total harga'
Mobile.verifyEqual(TotalPlusTax, 'Total : 1.450 USD')

Mobile.tap(findTestObject('CheckOut/Btn_CheckOut'), 0)

Mobile.tap(findTestObject('CheckOut/Inpt_Name'), 0)

Mobile.setText(findTestObject('CheckOut/Inpt_Name'), 'Rayi', 0)

Mobile.tap(findTestObject('CheckOut/Inpt_Mail'), 0)

Mobile.setText(findTestObject('CheckOut/Inpt_Mail'), 'rayii@gmail.com', 0)

Mobile.tap(findTestObject('CheckOut/Inpt_Phone'), 0)

Mobile.setText(findTestObject('CheckOut/Inpt_Phone'), '0856666667', 0)

Mobile.tap(findTestObject('CheckOut/Inpt Addrs'), 0)

Mobile.setText(findTestObject('CheckOut/Inpt Addrs'), 'jalan pondok indah', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CheckOut/Btn_ProcessCheckOut'), 0)

Mobile.tap(findTestObject('CheckOut/Btn_YES'), 0)

WebUI.delay(20)

def OrderSuccess = Mobile.getText(findTestObject('CheckOut/Txt_Congrats'), 10)

Mobile.comment(OrderSuccess)

Mobile.verifyEqual(OrderSuccess, 'Congratulation')

Mobile.tap(findTestObject('CheckOut/btn_OK'), 0)

