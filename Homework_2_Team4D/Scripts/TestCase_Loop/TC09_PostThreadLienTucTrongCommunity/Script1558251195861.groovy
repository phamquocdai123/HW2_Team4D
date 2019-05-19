import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')



WebUI.maximizeWindow()

KeywordLogger log = new KeywordLogger()

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up (13)'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub (13)'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (15)'), 'phamquocdai123@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (15)'), 'VwbLLUm8XHB7PkWQjcmfFg==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit (14)'))

WebUI.click(findTestObject('Page_4DTeamawd community/a_exploreExplore (1)'))

WebUI.click(findTestObject('Object Repository/Page_Explore/h1_Spectrum'))


WebUI.click(findTestObject('Object Repository/Page_Spectrum community/div_Info_sc-bxivhb beCRxj'))

WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/input_Info_sc-gzVnrw lbskuL'), '12121243')

WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_1'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_12'), '121')

WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_121'), '1213')

WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_1213'), '12132')

WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Post'))
boolean check22 = WebUI.verifyAlertPresent(10)

if(check22 == true){
	
}
else{
	WebUI.click(findTestObject('Object Repository/Page_12121243  Spectrum/span_view-close'))
	
	
}

//
//WebUI.click(findTestObject('Object Repository/Page_Spectrum community/div_Info_sc-bxivhb beCRxj'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/input_Info_sc-gzVnrw lbskuL'), 'sefse')
//
//WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea'), 's')
//
//WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_s'), 'se')
//
//WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Post'))
//
//WebUI.click(findTestObject('Object Repository/Page_sefse  Spectrum/span_view-close'))
//
