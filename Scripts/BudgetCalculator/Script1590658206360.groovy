import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://budgetsapp101-sandbox.mxapps.io/')

WebUI.click(findTestObject('Page_Budget Calculator - Homepage/img_Budget_link'))

WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_Budget description'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_Budget description'), 'Training Budget')

WebUI.doubleClick(findTestObject('Page_Budget Calculator - Homepage/input_Total budget'))

WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_Total budget'), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_Total budget'), '20')

for (def index : (0..4)) {
    WebUI.doubleClick(findTestObject('Page_Budget Calculator - Homepage/input_Start date'))

    WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_Start date'), Keys.chord(Keys.DELETE))
}

WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_Start date'), '1/1/2020')

for (def index : (0..4)) {
    WebUI.doubleClick(findTestObject('Page_Budget Calculator - Homepage/input_End date'))

    WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_End date'), Keys.chord(Keys.DELETE))
}

WebUI.sendKeys(findTestObject('Page_Budget Calculator - Homepage/input_End date'), '12/31/2020')

WebUI.click(findTestObject('Page_Budget Calculator - Homepage/button_Create budget'))

WebUI.waitForElementVisible(findTestObject('Page_Budget Calculator - Homepage/text_Opex'), 0)

WebUI.waitForElementVisible(findTestObject('Page_Budget Calculator - Homepage/text_Capex'), 0)

