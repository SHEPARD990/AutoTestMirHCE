package tests;

import org.openqa.selenium.SessionNotCreatedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.App2appPage;
import pages.DashboardPage;
import pages.RegistrationPage;
import pages.Yellow_flowPage;
import utils.PropertyReader;

import java.io.IOException;

public class Yellow_flowTest extends BaseTest{

    @Test(priority = 1)
    public void Yellow_flowCheckElements() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            Yellow_flowPage yellow_flowPage = pageMan.getYellow_flowPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickyellowFlowCardTokenizationButton();

            Assert.assertEquals(yellow_flowPage.getaction_barYellow_flow(), "Токенизация карты по Yellow Flow");
            Assert.assertEquals(yellow_flowPage.checkBackButtonEnable(), "Перейти вверх");
            Assert.assertTrue(yellow_flowPage.checkYellow_flowTogleSwitch());
            Assert.assertTrue(yellow_flowPage.checktokenizationStatusText());
            Assert.assertTrue(yellow_flowPage.checkcardPanLayout());
            Assert.assertTrue(yellow_flowPage.checkcardExpirationDateLayout());
            Assert.assertTrue(yellow_flowPage.checkcardSecretCodeLayout());
            Assert.assertTrue(yellow_flowPage.checkenterCardEntryTypeSpinner());
            Assert.assertTrue(yellow_flowPage.checkenrollCardButton());
            Assert.assertTrue(yellow_flowPage.checkenrollmentReferenceLayout());
            Assert.assertTrue(yellow_flowPage.checktncTimestampLayout());
            Assert.assertTrue(yellow_flowPage.checktncReferenceLayout());
            Assert.assertTrue(yellow_flowPage.checkconfirmCardTokenizationButton());
            Assert.assertTrue(yellow_flowPage.checkenterActivationModeSpinner());
            Assert.assertTrue(yellow_flowPage.checktokenReferenceLayout());
            Assert.assertTrue(yellow_flowPage.checkactivationMethodReferenceLayout());
            Assert.assertTrue(yellow_flowPage.checkconfirmChooseTokenActivationMethodButton());
            Assert.assertTrue(yellow_flowPage.checkverificationCodeLayout());
            Assert.assertTrue(yellow_flowPage.checkactiveTokenReferenceLayout());
            Assert.assertTrue(yellow_flowPage.checkactivateToken());
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority = 2)
    public void Yellow_flowPositiveMan() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            Yellow_flowPage yellow_flowPage = pageMan.getYellow_flowPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();


            registrationPage.clickprepareRegistrationButton();
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Можно завершить регистрацию");
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Регистрация завершена");
            registrationPage.clickBackRegistrationButton();

            dashboardPage.clickyellowFlowCardTokenizationButton();

            yellow_flowPage.clickYellow_flowTogleSwitch();

            yellow_flowPage.setcardPanLayout(PropertyReader.getThisProperty("ManPan"));
            yellow_flowPage.setcardExpirationDateLayout(PropertyReader.getThisProperty("ManMMYY"));
            yellow_flowPage.setcardSecretCodeLayout(PropertyReader.getThisProperty("ManCVP"));

            Assert.assertEquals(yellow_flowPage.getcardPanLayout(), PropertyReader.getThisProperty("ManPan"));
            Assert.assertEquals(yellow_flowPage.getcardExpirationDateLayout(), PropertyReader.getThisProperty("ManMMYY"));
            Assert.assertEquals(yellow_flowPage.getcardSecretCodeLayout(), PropertyReader.getThisProperty("ManCVP"));

            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Проверка возможности выпуска токена");
            yellow_flowPage.clickenrollCardButton();
            Thread.sleep(2000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Подтверждение выпуска токена");
            yellow_flowPage.clickconfirmCardTokenizationButton();
            Thread.sleep(1000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Активация токена");
            yellow_flowPage.clickconfirmChooseTokenActivationMethodButton();
            Thread.sleep(1000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Ввод кода активации");
            //ввод в поле verificationCodeLayout / android.widget.EditText
            yellow_flowPage.setverificationCodeLayout(PropertyReader.getThisProperty("OTP"));
            Assert.assertEquals(yellow_flowPage.getverificationCodeLayout(),PropertyReader.getThisProperty("OTP"));
            yellow_flowPage.clickactivateToken();
            Thread.sleep(2000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Выпуск токена завершен. Карта доступна для оплаты");
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority = 3)
    public void Yellow_flowPositiveCOF() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            Yellow_flowPage yellow_flowPage = pageMan.getYellow_flowPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();

            registrationPage.clickprepareRegistrationButton();
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Можно завершить регистрацию");
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Регистрация завершена");
            registrationPage.clickBackRegistrationButton();

            dashboardPage.clickyellowFlowCardTokenizationButton();

            yellow_flowPage.clickYellow_flowTogleSwitch();

            yellow_flowPage.clickenterCardEntryTypeSpinner();
            yellow_flowPage.chooseCOF();

            yellow_flowPage.setencryptedCardProfileLayout("SEKRETNOCOFCARDENCRYPTEDDATASECRETNO");
            Assert.assertEquals(yellow_flowPage.getencryptedCardProfileLayout(),"SEKRETNOCOFCARDENCRYPTEDDATASECRETNO");

            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Проверка возможности выпуска токена");
            yellow_flowPage.clickenrollCardButton();
            Thread.sleep(1000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Подтверждение выпуска токена");
            yellow_flowPage.clickconfirmCardTokenizationButton();
            Thread.sleep(1000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Активация токена");
            yellow_flowPage.clickconfirmChooseTokenActivationMethodButton();
            Thread.sleep(1000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Ввод кода активации");
            //ввод в поле verificationCodeLayout / android.widget.EditText
            yellow_flowPage.setverificationCodeLayout(PropertyReader.getThisProperty("OTP"));
            Assert.assertEquals(yellow_flowPage.getverificationCodeLayout(),PropertyReader.getThisProperty("OTP"));
            yellow_flowPage.clickactivateToken();
            Thread.sleep(1000);
            Assert.assertEquals(yellow_flowPage.gettokenizationStatusText(),"Выпуск токена завершен. Карта доступна для оплаты");
            yellow_flowPage.checkYellow_flowLog();
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
}
