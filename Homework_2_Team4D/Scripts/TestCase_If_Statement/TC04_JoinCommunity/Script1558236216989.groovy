import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

KeywordLogger log = new KeywordLogger()

WebUI.navigateToUrl('http://localhost:3000/explore')

boolean check = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Explore/button_Join community (1)'), 5, 
    FailureHandling.OPTIONAL)

if (check == true) {
    WebUI.click(findTestObject('Object Repository/Page_Explore/button_Join community (1)'))

    boolean check2 = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Explore/span_Sign in with GitHub (1)'), 
        5, FailureHandling.OPTIONAL)

    if (check2 == true) {
        WebUI.click(findTestObject('Object Repository/Page_Explore/span_Sign in with GitHub (1)'))
		WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (3) (1)'), 'phamquocdai123@gmail.com')
		
			WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (3) (1)'), 'VwbLLUm8XHB7PkWQjcmfFg==')
		
			WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit (3)'))
			
			boolean check3 =  WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Explore/button_Leave community'),5,FailureHandling.OPTIONAL)
		
			if(check3 == true){
				log.logInfo("Test join vào 1 community thành công")
			}
			else{
				log.logInfo("Test join vào 1 community không thành công")
			}
    }
    
    
}


