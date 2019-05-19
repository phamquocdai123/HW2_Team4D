import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/')

KeywordLogger log = new KeywordLogger()

boolean checkButtonPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Spectrum/button_Log in or sign up')
	, 10,FailureHandling.OPTIONAL)
if(checkButtonPresent == true){
	WebUI.click(findTestObject('Object Repository/Page_Spectrum/button_Log in or sign up'))
	log.logInfo("Tìm thấy button Login để đăng nhập vào hệ thống")
	
}
else{
	log.logInfo("Không thể tìm thấy button Login để đăng nhập vào hệ thống")

}



