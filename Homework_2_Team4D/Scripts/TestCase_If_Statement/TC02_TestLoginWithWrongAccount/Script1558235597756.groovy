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

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'),
	'phamquocdai123@gmail.yes')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_password'),
	'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))


boolean check = WebUI.verifyElementPresent(findTestObject('Page_Sign in to GitHub  GitHub/div_Incorrect username or password (1)')
	, 10,FailureHandling.OPTIONAL)
if(check == true){
	log.logInfo("Check testcase login với account sai đã thành công.")
	
}
else{
	log.logInfo("Check testcase login với account sai không thành công vì không có thông báo người dùng nhập sai tài khoản!")
}

