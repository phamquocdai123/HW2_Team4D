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

WebUI.click(findTestObject('Page_Spectrum/button_Join Spectrum (8)'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub (9)'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (10)'), 'vippergod123')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (8)'), 'H38+k1rEsJfjpteHEU8cYQ==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit (6)'))

WebUI.click(findTestObject('Object Repository/Page_asda community/img_Profile_style__Avatar-sc-1lxh6l2-8 jDmiKU'))

WebUI.click(findTestObject('Object Repository/Page_asda community/a_Post_style__InboxLinkWrapper-q7eler-1 iENQxs'))

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_No messages yet_style__Input-yy8ipz-4__input'), 
    'd')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_d'), 'da')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_da'), 'd')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_d'), 'dá')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_d_1'), 'd')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_d'), '')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_No messages yet_style__Input-yy8ipz-4__input'), 
    'đ')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_'), 'đá')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea__1'), 'đáq')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_q'), 'đáqư')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_q_1'), 'đáqưe')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_qe'), 'đáqư')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_q_2'), 'đáqưê')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_q_3'), 'đáqưêq')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_qq'), 'đáqưêqư')

WebUI.setText(findTestObject('Object Repository/Page_qqewqeasdas  asda/textarea_qq_1'), 'đáqưêqưe')

WebUI.click(findTestObject('Object Repository/Page_qqewqeasdas  asda/button_Send'))

