import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(findTestObject('CommunityApi/LeaveCommunity', [('cook') : '_ga=GA1.1.43446799.1558260840; _gid=GA1.1.1971247056.1558260840; _now_no_cache=1; session=eyJwYXNzcG9ydCI6eyJ1c2VyIjoie1wiY3JlYXRlZEF0XCI6XCIyMDE5LTA1LTE5VDEwOjE3OjEyLjg0OVpcIixcImRlc2NyaXB0aW9uXCI6bnVsbCxcImVtYWlsXCI6XCJ0b292YXRhYUBnbWFpbC5jb21cIixcImZiUHJvdmlkZXJJZFwiOm51bGwsXCJnaXRodWJQcm92aWRlcklkXCI6XCIzNzQ3ODkzN1wiLFwiZ2l0aHViVXNlcm5hbWVcIjpcIm1pbHVsZVwiLFwiZ29vZ2xlUHJvdmlkZXJJZFwiOm51bGwsXCJpZFwiOlwiZDY5ZjIyYmMtZmI3Yy00MzZkLWE4NDctM2IxYzIxYmRiMmNlXCIsXCJpc09ubGluZVwiOnRydWUsXCJsYXN0U2VlblwiOlwiMjAxOS0wNS0xOVQxMDoxNzoxNC4zMzBaXCIsXCJtb2RpZmllZEF0XCI6XCIyMDE5LTA1LTE5VDEwOjE4OjA3LjYyN1pcIixcIm5hbWVcIjpcIkzDqiBWw7UgSG/DoG5nIER1eVwiLFwicHJvZmlsZVBob3RvXCI6XCJodHRwczovL2F2YXRhcnMwLmdpdGh1YnVzZXJjb250ZW50LmNvbS91LzM3NDc4OTM3P3Y9NFwiLFwicHJvdmlkZXJJZFwiOm51bGwsXCJ0ZXJtc0xhc3RBY2NlcHRlZEF0XCI6XCIyMDE5LTA1LTE5VDEwOjE3OjEyLjg0OVpcIixcInVzZXJuYW1lXCI6XCJsZS12by1ob2FuZy1kdXlcIixcIndlYnNpdGVcIjpcIlwifSJ9LCJsYXN0UmVxdWVzdCI6MTU1ODI2NTc4ODcxOX0=; session.sig=jUawOirvNTc_IeJ_zmHgFwQmBY4'
            , ('comuId') : '1']))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'data.removeCommunityMember', null)

WS.verifyElementPropertyValue(response, 'errors.message', '[You\'re not a member of this community.]')

