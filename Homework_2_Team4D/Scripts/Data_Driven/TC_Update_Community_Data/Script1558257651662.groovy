import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Spectrum/button_Join Spectrum'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 'vippergod123')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 'H38+k1rEsJfjpteHEU8cYQ==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Page_Spectrum community/img_Profile_style__Avatar-sc-1lxh6l2-8 jDmiKU'))

WebUI.click(findTestObject('Object Repository/Page_123213 community/button_Settings'))

WebUI.setText(findTestObject('Object Repository/Page_123213 settings/textarea_123213123213'), Bio)

WebUI.click(findTestObject('Object Repository/Page_123213 settings/button_Save'))

