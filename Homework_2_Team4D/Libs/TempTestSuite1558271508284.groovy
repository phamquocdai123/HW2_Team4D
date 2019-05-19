import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Run all test cases')

suiteProperties.put('name', 'Run all test cases')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Duy\\Desktop\\jjj\\Spectrum1\\Reports\\Run all test cases\\20190519_201148\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Run all test cases', suiteProperties, [new TestCaseBinding('Test Cases/Data_Driven/TC_Login_Github_data', 'Test Cases/Data_Driven/TC_Login_Github_data',  [ 'Username' : 'vippergod123' ,  ]), new TestCaseBinding('Test Cases/Internal__Data/TC_Join_community', 'Test Cases/Internal__Data/TC_Join_community',  null), new TestCaseBinding('Test Cases/Data_Driven/TC_Post_data', 'Test Cases/Data_Driven/TC_Post_data',  null), new TestCaseBinding('Test Cases/Data_Driven/TC_Send_message_to_user_data', 'Test Cases/Data_Driven/TC_Send_message_to_user_data',  null), new TestCaseBinding('Test Cases/Data_Driven/TC_Update_Community_Data', 'Test Cases/Data_Driven/TC_Update_Community_Data',  null), new TestCaseBinding('Test Cases/Data_Driven/TC_Update_profile_data', 'Test Cases/Data_Driven/TC_Update_profile_data',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_comment_to_post', 'Test Cases/Internal__Data/TC_comment_to_post',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Create_channel', 'Test Cases/Internal__Data/TC_Create_channel',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Delete_account', 'Test Cases/Internal__Data/TC_Delete_account',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Delete_comment', 'Test Cases/Internal__Data/TC_Delete_comment',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Download_user_info', 'Test Cases/Internal__Data/TC_Download_user_info',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Edit_Branded', 'Test Cases/Internal__Data/TC_Edit_Branded',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Enable_Disable_Chat', 'Test Cases/Internal__Data/TC_Enable_Disable_Chat',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_FAQ', 'Test Cases/Internal__Data/TC_FAQ',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Join_Channel', 'Test Cases/Internal__Data/TC_Join_Channel',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Login_google', 'Test Cases/Internal__Data/TC_Login_google',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Logout', 'Test Cases/Internal__Data/TC_Logout',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Thumbsup_post', 'Test Cases/Internal__Data/TC_Thumbsup_post',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Upload_profile_picture', 'Test Cases/Internal__Data/TC_Upload_profile_picture',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_Username', 'Test Cases/Internal__Data/TC_Username',  null), new TestCaseBinding('Test Cases/Internal__Data/TC_View_profile', 'Test Cases/Internal__Data/TC_View_profile',  null)])
