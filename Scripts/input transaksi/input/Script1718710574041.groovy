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

WebUI.navigateToUrl('http://localhost/adacamp/login-user')

WebUI.setText(findTestObject('Object Repository/Page_ADACAMP  Online/input_Email_email'), 'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ADACAMP  Online/input_Password_pass'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_ADACAMP  Online/input_Password_pass'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ADACAMP  Dashboard/a_Input Transaksi'))

WebUI.setText(findTestObject('Object Repository/Page_ADA Camp  Online/input_Nama Lengkap_namaLengkap'), 'marcel')

WebUI.setText(findTestObject('Object Repository/Page_ADA Camp  Online/input_Nomor Telepon_noTelp'), '08962662626')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ADA Camp  Online/select_--Pilih Barang--                    _760eda'), 
    'MSK22082301', true)

WebUI.setText(findTestObject('Object Repository/Page_ADA Camp  Online/input_Qty_qty'), '2')

WebUI.click(findTestObject('Object Repository/Page_ADA Camp  Online/button_Tambah Barang'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ADA Camp  Online/select_--Pilih Barang--Carrier 35 Liter (20_44ae9c'), 
    'TND08051901', true)

WebUI.setText(findTestObject('Object Repository/Page_ADA Camp  Online/input_Qty_qty_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_ADA Camp  Online/input_Lama Sewa (Hari)_lamaSewa'), '3')

WebUI.click(findTestObject('Object Repository/Page_ADA Camp  Online/button_Simpan dan Cetak Bukti Sewa'))

WebUI.closeBrowser()

