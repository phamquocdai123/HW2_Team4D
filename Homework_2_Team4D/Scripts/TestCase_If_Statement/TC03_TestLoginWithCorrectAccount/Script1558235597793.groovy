import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')


WebUI.maximizeWindow()
KeywordLogger log = new KeywordLogger()

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (2)'), 'phamquocdai123@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (2)'), 'VwbLLUm8XHB7PkWQjcmfFg==')


WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))


boolean check = WebUI.verifyElementPresent(findTestObject('Page_Sign in to GitHub  GitHub/div_Incorrect username or password (1)')
	, 10,FailureHandling.OPTIONAL)
if(check == true){
	log.logInfo("Check testcase login với account đúng không thành công.")
	
}
else{
	log.logInfo("Check testcase login với account đúng thành công!")
}

//WebUI.click(findTestObject('Object Repository/Page_Spectrum community/img_Explore_style__Img-u3znqr-3 kJsvJN'))



