package tests;

import org.openqa.selenium.SessionNotCreatedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.RegistrationPage;
import utils.PropertyReader;

import java.io.IOException;

public class RegistrationTest extends BaseTest{
    @Test(priority=1)
    public void RegistrationCheckElements() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            backHardware();
            //driver.hideKeyboard();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getaction_barRegistration(),"Регистрация экземпляра приложения");
            Assert.assertTrue(registrationPage.checkaction_barRegistration());
            Assert.assertTrue(registrationPage.checkbackButtonRegistration());
            Assert.assertTrue(registrationPage.checktoggleSwitchRegistration());
            Assert.assertTrue(registrationPage.checkregistrationStatusText());
            Assert.assertTrue(registrationPage.checkprepareRegistrationButton());
            Assert.assertTrue(registrationPage.checkregistrationButton());
            Assert.assertTrue(registrationPage.checkfinishRegistrationButton());
            Assert.assertTrue(registrationPage.checktokenRequestorIdInput());
            Assert.assertTrue(registrationPage.checkpartnerIdInput());
            Assert.assertTrue(registrationPage.checkinstanceIdInput());
            Assert.assertTrue(registrationPage.checksdkCryptoInput());
            Assert.assertTrue(registrationPage.checknspkCryptoInput());
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=2)
    public void RegistrationtoggleSwitch() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            backHardware();
            //driver.hideKeyboard();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.checktoggleSwitchRegistrationChecked(),"true");
            Assert.assertEquals(registrationPage.checktokenRequestorIdInputEnable(),"false");
            Assert.assertEquals(registrationPage.checkpartnerIdInputEnable(),"false");
            Assert.assertEquals(registrationPage.checkinstanceIdInputEnable(),"false");
            Assert.assertEquals(registrationPage.checksdkCryptoInputEnable(),"false"); //Ложно true  разобраться почему
            Assert.assertEquals(registrationPage.checknspkCryptoInputEnable(),"false"); //Ложно true разобраться почему
            registrationPage.clicktoggleSwitchRegistration();
            Assert.assertEquals(registrationPage.checktoggleSwitchRegistrationChecked(),"false");
            Assert.assertEquals(registrationPage.checktokenRequestorIdInputEnable(),"true");
            Assert.assertEquals(registrationPage.checkpartnerIdInputEnable(),"true");
            Assert.assertEquals(registrationPage.checkinstanceIdInputEnable(),"true");
            Assert.assertEquals(registrationPage.checksdkCryptoInputEnable(),"true");
            Assert.assertEquals(registrationPage.checknspkCryptoInputEnable(),"true");
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=3)
    public void RegistrationPositive() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            backHardware();
            //driver.hideKeyboard();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(),"Требуется подготовка данных");
            registrationPage.clickprepareRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(),"Требуется регистрация");
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(),"Можно завершить регистрацию");
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(),"Регистрация завершена");
            //getLog();
            //Assert.assertTrue(checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"FINISH_REGISTRATION\",\"methodType\":\"Result\",\"result\":true"));
            Assert.assertTrue(registrationPage.checkRegLog());
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=4)
    public void RegistrationCustomData() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();

            registrationPage.clicktoggleSwitchRegistration();

            registrationPage.settokenRequestorIdInput(PropertyReader.getThisProperty("CustomPartner"));
            registrationPage.setpartnerIdInput(PropertyReader.getThisProperty("CustomUser"));
            registrationPage.setinstanceIdInput(PropertyReader.getThisProperty("SDKID"));
            registrationPage.setsdkCryptoInput(PropertyReader.getThisProperty("CryptoforNSPK"));
            registrationPage.setnspkCryptoInput(PropertyReader.getThisProperty("CryptofromNSPK"));

            Assert.assertEquals(registrationPage.gettokenRequestorIdInput(),PropertyReader.getThisProperty("CustomPartner"));
            Assert.assertEquals(registrationPage.getpartnerIdInput(),PropertyReader.getThisProperty("CustomUser"));
            Assert.assertEquals(registrationPage.getinstanceIdInput(),PropertyReader.getThisProperty("SDKID"));
            Assert.assertEquals(registrationPage.getsdkCryptoInput(),PropertyReader.getThisProperty("CryptoforNSPK"));
            Assert.assertEquals(registrationPage.getnspkCryptoInput(),PropertyReader.getThisProperty("CryptofromNSPK"));

        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=5)
    public void RegistrationPrepareError() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();

            registrationPage.clicktoggleSwitchRegistration();

            registrationPage.settokenRequestorIdInput(PropertyReader.getThisProperty("CustomPartner"));
            registrationPage.clickprepareRegistrationButton();

            Assert.assertEquals(registrationPage.getregistrationStatusText(),"Ошибка подготовки данных для регистрации");


        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=6)
    public void RegistrationError() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();

            registrationPage.clickprepareRegistrationButton();
            registrationPage.clicktoggleSwitchRegistration();
            registrationPage.settokenRequestorIdInput(PropertyReader.getThisProperty("CustomPartner"));
            registrationPage.clickregistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(),"Ошибка регистрации");


        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=7)
    public void RegistrationEndError() throws IOException, InterruptedException {
        try {
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            RegistrationPage registrationPage = pageMan.getRegistrationPage();
            backHardware();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickregistrationButton();

            registrationPage.clickprepareRegistrationButton();
            registrationPage.clickregistrationButton();
            registrationPage.clicktoggleSwitchRegistration();
            registrationPage.setnspkCryptoInput(PropertyReader.getThisProperty("CryptofromNSPK"));
            registrationPage.clickfinishRegistrationButton();
            Assert.assertEquals(registrationPage.getregistrationStatusText(),"Ошибка завершения регистрации");
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }

}
