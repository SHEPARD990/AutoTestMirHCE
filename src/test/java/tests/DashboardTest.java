package tests;

import org.openqa.selenium.SessionNotCreatedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import utils.PropertyReader;

import java.io.IOException;

public class DashboardTest extends BaseTest{
    @Test(priority=1)
    public void DashboardCheckElements() throws IOException, InterruptedException {
        try {
//            Android_A52_setUp();
//            Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            backHardware();
            driver.hideKeyboard();
            Assert.assertEquals(dashboardPage.gettitleDashboard(),"MirHce Sdk DemoApp");
            Assert.assertTrue(dashboardPage.checksettingsButton());
            Assert.assertTrue(dashboardPage.checktitleDashboard());
            Assert.assertTrue(dashboardPage.checktoggleSwitch());
            Assert.assertTrue(dashboardPage.checkpartnerField());
            Assert.assertTrue(dashboardPage.checkuserField());
            Assert.assertTrue(dashboardPage.checkstatusText());
            Assert.assertTrue(dashboardPage.checkinitializeButton());
            Assert.assertTrue(dashboardPage.checkdisposeButton());
            Assert.assertTrue(dashboardPage.checkclearButton());
            Assert.assertTrue(dashboardPage.checkregistrationButton());
            Assert.assertTrue(dashboardPage.checkappToAppButton());
            Assert.assertTrue(dashboardPage.checkyellowFlowCardTokenizationButton());
            Assert.assertTrue(dashboardPage.checktukReplenishmentButton());
            Assert.assertTrue(dashboardPage.checkmessageProcessingButton());
            Assert.assertTrue(dashboardPage.checknfcPaymentSetupButton());
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=2)
    public void DashboardtoggleSwitch() throws IOException, InterruptedException {
        try {
//            Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            backHardware();
            //driver.hideKeyboard();
//            Assert.assertEquals(registrationPage.gettoggleSwitchtitle(),PropertyReader.getThisProperty("DashboardtoggleSwitchOn"));
            Assert.assertEquals(dashboardPage.gettoggleSwitchtitle(),"Использовать параметры из коллекции");
            Assert.assertEquals(dashboardPage.gettoggleSwitchChecked(),"true");
            Assert.assertEquals(dashboardPage.checkpartnerFieldEnable(),"false");
            Assert.assertEquals(dashboardPage.checkuserFieldEnable(),"false");
            dashboardPage.clicktoggleSwitch();
//            Assert.assertEquals(registrationPage.gettoggleSwitchtitle(),PropertyReader.getThisProperty("DashboardtoggleSwitchOff"));
            Assert.assertEquals(dashboardPage.gettoggleSwitchtitle(),"Использовать параметры из коллекции");
            Assert.assertEquals(dashboardPage.gettoggleSwitchChecked(),"false");
            Assert.assertEquals(dashboardPage.checkpartnerFieldEnable(),"true");
            Assert.assertEquals(dashboardPage.checkuserFieldEnable(),"true");

        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=3)
    public void Initialize() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            backHardware();
            driver.hideKeyboard();
            //Assert.assertEquals(registrationPage.getstatusTextTitle(),PropertyReader.getThisProperty("DefaultInitializeStatus"));//Временно Изменить на Требуется инициализация
            Assert.assertEquals(dashboardPage.getstatusTextTitle(),"Требуется иницилизация");
            dashboardPage.clickinitializeButton();
//            Assert.assertEquals(registrationPage.getstatusTextTitle(),"Выполняется");
//            Thread.sleep(3000);
            //.assertEquals(registrationPage.getstatusTextTitle(),PropertyReader.getThisProperty("PositiveInitializeStatus"));
            Assert.assertEquals(dashboardPage.getstatusTextTitle(),"Инициализирован");
            Assert.assertTrue(dashboardPage.checkInitLog());

        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=4)
    public void InitializeCustomData() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            backHardware();
            driver.hideKeyboard();
            dashboardPage.clicktoggleSwitch();

            dashboardPage.setpartnerField(PropertyReader.getThisProperty("CustomPartner"));
            dashboardPage.setuserField(PropertyReader.getThisProperty("CustomUser"));
            Assert.assertEquals(dashboardPage.getpartnerField(),PropertyReader.getThisProperty("CustomPartner"));
            Assert.assertEquals(dashboardPage.getuserField(),PropertyReader.getThisProperty("CustomUser"));

//            registrationPage.setpartnerField("Partner1");
//            registrationPage.setuserField("User1");
//            Assert.assertEquals(registrationPage.getpartnerField(),"Partner1");
//            Assert.assertEquals(registrationPage.getuserField(),"User1");

        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=5)//Уточнить шаги воспроизведения
    public void InitializeError() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            backHardware();
            driver.hideKeyboard();
            dashboardPage.clickinitializeButton();
            dashboardPage.clickinitializeButton();
            Assert.assertEquals(dashboardPage.getstatusTextTitle(),"Ошибка инициализации");
//            registrationPage.clicktoggleSwitch();
//            registrationPage.setpartnerField(PropertyReader.getThisProperty("CustomPartner"));
//            registrationPage.setuserField(PropertyReader.getThisProperty("CustomUser"));
//            Assert.assertEquals(registrationPage.getpartnerField(),PropertyReader.getThisProperty("CustomPartner"));
//            Assert.assertEquals(registrationPage.getuserField(),PropertyReader.getThisProperty("CustomUser"));
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=6)//Уточнить шаги воспроизведения
    public void ReInitialize() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            backHardware();;
            driver.hideKeyboard();
            dashboardPage.clickinitializeButton();
            Assert.assertEquals(dashboardPage.getstatusTextTitle(),"Инициализирован");
            dashboardPage.clickdisposeButton();
            Assert.assertEquals(dashboardPage.getstatusTextTitle(),"Требуется иницилизация");//Изменить грамматическая ошибка!!!!
            Assert.assertTrue(dashboardPage.checkDisLog());
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
    @Test(priority=7)
    public void IsInitialize() throws IOException, InterruptedException {
        try {
            //Android_Sony_setUp();
            Android_С9_setUp();
            pageMan.initPages(driver);
            DashboardPage dashboardPage = pageMan.getDashboardPage();
            backHardware();
            //driver.hideKeyboard();
            //До инициализации
            Assert.assertEquals(dashboardPage.checksettingsButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checktitleDashboardEnable(),"true");
            Assert.assertEquals(dashboardPage.checktoggleSwitchEnable(),"true");
            Assert.assertEquals(dashboardPage.checkpartnerFieldEnable(),"false");
            Assert.assertEquals(dashboardPage.checkuserFieldEnable(),"false");
            Assert.assertEquals(dashboardPage.checkstatusTextEnable(),"true");
            Assert.assertEquals(dashboardPage.checkinitializeButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkdisposeButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkclearButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkregistrationButtonEnable(),"false");
            Assert.assertEquals(dashboardPage.checkappToAppButtonEnable(),"false");
            Assert.assertEquals(dashboardPage.checkyellowFlowCardTokenizationButtonEnable(),"false");
            Assert.assertEquals(dashboardPage.checktukReplenishmentButtonEnable(),"false");
            Assert.assertEquals(dashboardPage.checkmessageProcessingButtonEnable(),"false");
            Assert.assertEquals(dashboardPage.checknfcPaymentSetupButtonEnable(),"false");
            //После
            dashboardPage.clickinitializeButton();

            Assert.assertEquals(dashboardPage.checksettingsButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checktitleDashboardEnable(),"true");
            Assert.assertEquals(dashboardPage.checktoggleSwitchEnable(),"true");
            Assert.assertEquals(dashboardPage.checkpartnerFieldEnable(),"false");
            Assert.assertEquals(dashboardPage.checkuserFieldEnable(),"false");
            Assert.assertEquals(dashboardPage.checkstatusTextEnable(),"true");
            Assert.assertEquals(dashboardPage.checkinitializeButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkdisposeButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkclearButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkregistrationButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkappToAppButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkyellowFlowCardTokenizationButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checktukReplenishmentButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checkmessageProcessingButtonEnable(),"true");
            Assert.assertEquals(dashboardPage.checknfcPaymentSetupButtonEnable(),"true");
        }catch (SessionNotCreatedException e){
            System.out.println("SessionNotCreatedException");
        }
    }
}
