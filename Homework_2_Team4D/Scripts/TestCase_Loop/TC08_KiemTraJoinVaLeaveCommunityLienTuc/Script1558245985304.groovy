import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')


WebUI.maximizeWindow()

KeywordLogger log = new KeywordLogger()

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up (10)'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub (10)'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (12)'), 'phamquocdai123@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (12)'), 'VwbLLUm8XHB7PkWQjcmfFg==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit (11)'))

int check  =0;
for(def i : (0..4)){
	check++;
	WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Leave community'))
	
	WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Leave Community (1)'))
	
	
	WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Join community'))
	
}

if(check == 5){
	log.logInfo("Kiem tra join và leave community nhiều lần liên tục thành công!")
}
else{
	log.logInfo("Kiem tra join và leave community nhiều lần liên tục thất bại!")
	
}


