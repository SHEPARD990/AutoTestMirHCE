package tests;

import org.openqa.selenium.SessionNotCreatedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.App2appPage;
import pages.DashboardPage;
import pages.RegistrationPage;
import utils.PropertyReader;

import java.io.IOException;

public class App2appTest extends BaseTest {
    @Test(priority = 1)
    public void App2appCheckElements() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            App2appPage app2appPage = pageMan.getApp2appPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickappToAppButton();
            Assert.assertEquals(app2appPage.getTitleaction_barApp2app(), "Токенизация карты клиента банка");
            Assert.assertEquals(app2appPage.checkBackButtonEnable(), "Перейти вверх");
            Assert.assertTrue(app2appPage.checkapp2appTogleSwitch());
            Assert.assertTrue(app2appPage.checkencryptedCardProfile());
            Assert.assertTrue(app2appPage.checkenrollCardButton());
            Assert.assertTrue(app2appPage.checkenrollmentReference());
            Assert.assertTrue(app2appPage.checktncTimestamp());
            Assert.assertTrue(app2appPage.checktncReference());
            Assert.assertTrue(app2appPage.checkconfirmCardTokenizationButton());
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }

    @Test(priority = 2)
    public void App2apptoggleSwitch() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            App2appPage app2appPage = pageMan.getApp2appPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickappToAppButton();

            Assert.assertEquals(app2appPage.getapp2appTogleSwitchChecked(), "true");
            Assert.assertEquals(app2appPage.checkencryptedCardProfileEnable(), "false");
            Assert.assertEquals(app2appPage.checkenrollmentReferenceEnable(), "false");
            Assert.assertEquals(app2appPage.checktncTimestampEnable(), "false");
            Assert.assertEquals(app2appPage.checktncReferenceEnable(), "false");

            app2appPage.clickapp2appTogleSwitch();

            Assert.assertEquals(app2appPage.getapp2appTogleSwitchChecked(), "false");
            Assert.assertEquals(app2appPage.checkencryptedCardProfileEnable(), "true");
            Assert.assertEquals(app2appPage.checkenrollmentReferenceEnable(), "true");
            Assert.assertEquals(app2appPage.checktncTimestampEnable(), "true");
            Assert.assertEquals(app2appPage.checktncReferenceEnable(), "true");
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }

    @Test(priority = 3)
    public void App2appPositive() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            App2appPage app2appPage = pageMan.getApp2appPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();


            registrationPage.clickprepareRegistrationButton();
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Можно завершить регистрацию");
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Регистрация завершена");
            registrationPage.clickBackRegistrationButton();

            dashboardPage.clickappToAppButton();

            Assert.assertEquals(app2appPage.getcardTokenizationStatusText(), "Регистрация намерения токенизации");
            app2appPage.clickenrollCardButton();
            Assert.assertEquals(app2appPage.getcardTokenizationStatusText(), "Подтверждение выпуска токена");
            app2appPage.clickconfirmCardTokenizationButton();
            Thread.sleep(5000);
            Assert.assertEquals(app2appPage.getcardTokenizationStatusText(), "Получить профиль токена");

            Assert.assertTrue(app2appPage.checkApp2appLog());
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }

    @Test(priority = 4)
    public void App2appCustomData() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            App2appPage app2appPage = pageMan.getApp2appPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();

            registrationPage.clickprepareRegistrationButton();
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Можно завершить регистрацию");
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Регистрация завершена");
            registrationPage.clickBackRegistrationButton();

            dashboardPage.clickappToAppButton();

            app2appPage.clickapp2appTogleSwitch();
            app2appPage.setencryptedCardProfile("1");
            app2appPage.setenrollmentReference("2");
            app2appPage.settncTimestamp("3");
            app2appPage.settncReference("4");

            Assert.assertEquals(app2appPage.getencryptedCardProfile(),PropertyReader.getThisProperty("encryptedCardProfile"));
            Assert.assertEquals(app2appPage.getenrollmentReference(),PropertyReader.getThisProperty("enrollmentReference"));
            Assert.assertEquals(app2appPage.gettncTimestamp(),PropertyReader.getThisProperty("tncTimestamp"));
            Assert.assertEquals(app2appPage.gettncReference(),PropertyReader.getThisProperty("tncReference"));
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority = 5)
    public void App2appErrEnroll() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            App2appPage app2appPage = pageMan.getApp2appPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();


            registrationPage.clickprepareRegistrationButton();
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Можно завершить регистрацию");
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Регистрация завершена");
            registrationPage.clickBackRegistrationButton();

            dashboardPage.clickappToAppButton();

            app2appPage.clickapp2appTogleSwitch();

            app2appPage.setencryptedCardProfile("1");

            Assert.assertEquals(app2appPage.getcardTokenizationStatusText(), "Регистрация намерения токенизации");
            app2appPage.clickenrollCardButton();
            Thread.sleep(5000);
            Assert.assertTrue(app2appPage.checkApp2appLogEnrollErr());
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority = 6)
    public void App2appErrConfirm() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            App2appPage app2appPage = pageMan.getApp2appPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();


            registrationPage.clickprepareRegistrationButton();
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Можно завершить регистрацию");
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(), "Регистрация завершена");
            registrationPage.clickBackRegistrationButton();

            dashboardPage.clickappToAppButton();

            app2appPage.clickapp2appTogleSwitch();

            Assert.assertEquals(app2appPage.getcardTokenizationStatusText(), "Регистрация намерения токенизации");
            app2appPage.clickenrollCardButton();
            Assert.assertEquals(app2appPage.getcardTokenizationStatusText(), "Подтверждение выпуска токена");
            app2appPage.setenrollmentReference("1");
            app2appPage.clickconfirmCardTokenizationButton();
            Thread.sleep(5000);
            Assert.assertTrue(app2appPage.checkApp2appLogConfirmErr());
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
}