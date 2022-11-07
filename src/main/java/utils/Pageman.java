package utils;

import io.appium.java_client.android.AndroidDriver;
import pages.*;

public class Pageman {

    public static AndroidDriver driver;
    static DashboardPage dashboardPage;
    static RegistrationPage registrationPage;
    static App2appPage app2appPage;
    static Yellow_flowPage yellow_flowPage;
    static TukReplenishmentPage tukReplenishmentPage;
    public void initPages(AndroidDriver driver){
        dashboardPage = new DashboardPage(driver);
        registrationPage = new RegistrationPage(driver);
        app2appPage = new App2appPage(driver);
        yellow_flowPage = new Yellow_flowPage(driver);
        tukReplenishmentPage = new TukReplenishmentPage(driver);
    }
    public static DashboardPage getDashboardPage(){
        return dashboardPage;
    }
    public static RegistrationPage getRegistrationPage(){
        return registrationPage;
    }
    public static App2appPage getApp2appPage(){
        return app2appPage;
    }
    public static Yellow_flowPage getYellow_flowPage(){
        return yellow_flowPage;
    }
    public static TukReplenishmentPage getTukReplenishmentPage(){
        return tukReplenishmentPage;
    }
}


