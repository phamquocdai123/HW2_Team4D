import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.maximizeWindow()

KeywordLogger log = new KeywordLogger()
WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up (6)'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub (6)'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (8)'), 'phamquocdai123@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (8)'), 'VwbLLUm8XHB7PkWQjcmfFg==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit (7)'))

WebUI.click(findTestObject('Object Repository/Page_Spectrum community/svg_explore'))

WebUI.click(findTestObject('Object Repository/Page_Explore/svg_notification'))

