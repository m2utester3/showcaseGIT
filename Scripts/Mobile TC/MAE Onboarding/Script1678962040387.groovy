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

Mobile.startExistingApplication('com.maybank2u.life')

Mobile.takeScreenshot()

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Agree'), 0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Agree'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Hello'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Hello'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Login to Maybank2u'), 
    0)

not_run: Mobile.setText(findTestObject('MAE Onboarding/android.widget.EditText'), 'mosajgohar1', 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.tap(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - cap'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Its Mine'), 0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Its Mine'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Enter your password'), 
    0)

not_run: Mobile.setText(findTestObject('Object Repository/MAE Onboarding/android.widget.EditText (1)'), findTestData('DevOps').getValue(
        2, 1), 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Create your PIN for the app'), 
    0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.ImageView'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Confirm your 6-digit PIN'), 
    0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.ImageView'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Set Up Later'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Set Up Later'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Verify Number'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Proceed'), 0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Proceed'), 0)

not_run: WebUI.delay(20)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.ImageView'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.EditText - Enter your name'), 0)

not_run: Mobile.setText(findTestObject('Object Repository/MAE Onboarding/android.widget.EditText - Enter your name'), 'Mayesha', 
    0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Introducing Wallet'), 
    0)

not_run: Mobile.tap(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip (1)'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Set Up Successful'), 
    0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Done'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Mayesha'), 0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Total Balance'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Savings Account-i'), 
    0)

not_run: Mobile.takeScreenshot('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Savings Account-i'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Transfer'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Transfer'), 0)

not_run: Mobile.closeApplication()

