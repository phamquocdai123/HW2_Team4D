import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.maximizeWindow()

KeywordLogger log = new KeywordLogger()
WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up (8)'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub (8)'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (10)'), 'phamquocdai123@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (10)'), 'VwbLLUm8XHB7PkWQjcmfFg==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit (9)'))

WebUI.click(findTestObject('Page_Spectrum community/img_Explore_style__Img-u3znqr-3 kJsvJN (2)'))

WebUI.click(findTestObject('Page_12  pham-quoc-dai1/button_Settings (1)'))

WebUI.click(findTestObject('Page_My settings/button_Log out (1)'))

int check = 1;
for(def i :(0..4)){
	
	WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up (8)'))
	
	WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub (8)'))
	
	WebUI.click(findTestObject('Page_Spectrum community/img_Explore_style__Img-u3znqr-3 kJsvJN (2)'))
	
	WebUI.click(findTestObject('Page_12  pham-quoc-dai1/button_Settings (1)'))
	
	WebUI.click(findTestObject('Page_My settings/button_Log out (1)'))
	check++;
	
	
}
if(check == 5){
	log.logInfo("Kiem tra đăng nhập và đăng xuất nhiều lần liên tục thành công!")
}
else{
	log.logInfo("Kiem tra đăng nhập và đăng xuất nhiều lần liên tục thất bại!")
	
}



