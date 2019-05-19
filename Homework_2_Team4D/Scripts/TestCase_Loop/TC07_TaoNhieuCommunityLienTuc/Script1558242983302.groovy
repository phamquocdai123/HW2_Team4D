import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

KeywordLogger log = new KeywordLogger()

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up (12)'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub (12)'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login (14)'), 'phamquocdai123@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password (14)'), 'VwbLLUm8XHB7PkWQjcmfFg==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit (13)'))

for (def i:(0..3)){
	
	WebUI.click(findTestObject('Page_4DTeamawd community/a_plusCreate a community'))
	
	//String name = i.toString()
	WebUI.setText(findTestObject('Object Repository/Page_New community/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy (2)'),
		"1")
	
	WebUI.setText(findTestObject('Object Repository/Page_New community/textarea_Describe it in 140 characters or less_style__StyledTextArea-sc-17zryot-3 hSQZHk (2)'),
		'1')
	
	WebUI.setText(findTestObject('Object Repository/Page_New community/textarea_1 (1)'), '12')
	
	WebUI.setText(findTestObject('Object Repository/Page_New community/textarea_12'), '121')
	
	WebUI.setText(findTestObject('Object Repository/Page_New community/textarea_121'), '1211')
	
	WebUI.click(findTestObject('Page_New community/div_checkboxI have read the Spectrum Code of Conduct and agree to enforce it in my community'))
	
	WebUI.click(findTestObject('Object Repository/Page_New community/button_Create Community  Continue (2)'))
	
	WebUI.click(findTestObject('Object Repository/Page_New community/button_Skip this step (2)'))
	
	WebUI.click(findTestObject('Object Repository/Page_New community/button_Go to my community (2)'))
	
	
}





