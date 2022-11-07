package tests;

import org.openqa.selenium.SessionNotCreatedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class TukReplenishmentTest extends BaseTest{
    @Test(priority = 1)
    public void TukReplenishmentCheckElements() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            TukReplenishmentPage tukReplenishmentPage = pageMan.getTukReplenishmentPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clicktukReplenishmentButton();

            Assert.assertEquals(tukReplenishmentPage.getaction_barTUK(), "Управление ключами (TUK)");
            Assert.assertEquals(tukReplenishmentPage.checkBackButtonTUK(), "Перейти вверх");
            Assert.assertTrue(tukReplenishmentPage.checkaction_barTUK());
            Assert.assertTrue(tukReplenishmentPage.checktoggleSwitchTUK());
            Assert.assertTrue(tukReplenishmentPage.checkupdateTuksButton());
            Assert.assertTrue(tukReplenishmentPage.checktokenStatusSpinnerText());
            Assert.assertTrue(tukReplenishmentPage.checktokenStatusSpinner());
            Assert.assertTrue(tukReplenishmentPage.checkupdateTokenStatusButton());
            Assert.assertTrue(tukReplenishmentPage.checktokenStatusText());
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority = 2)
    public void TukReplenishmentPositive() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            App2appPage app2appPage = pageMan.getApp2appPage();
            TukReplenishmentPage tukReplenishmentPage = pageMan.getTukReplenishmentPage();
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
            Thread.sleep(2000);
            Assert.assertEquals(app2appPage.getcardTokenizationStatusText(), "Получить профиль токена");
            app2appPage.clickBackApp2appButton();

            dashboardPage.clicktukReplenishmentButton();

            tukReplenishmentPage.clickupdateTuksButton();
            tukReplenishmentPage.clicktokenStatusSpinner();
            tukReplenishmentPage.clicktokenStatusActive();
            tukReplenishmentPage.clickupdateTokenStatusButton();

            tukReplenishmentPage.checkTUKLog();
        } catch (SessionNotCreatedException e) {
            System.out.println("SessionNotCreatedException");
        }
    }
}
