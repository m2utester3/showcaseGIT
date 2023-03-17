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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.maybank2u.life', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip'), 0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Agree'), 0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Agree'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Hello'), 0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Hello'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Login to Maybank2u'), 0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAE Onboarding/android.widget.EditText'), 'mdmosgohar1', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - cap'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Its Mine'), 0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Its Mine'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Enter your password'), 0)

Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

