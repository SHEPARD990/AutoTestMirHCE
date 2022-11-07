package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utils.Pageman;
import utils.PropertyReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
public class BaseTest {
    public static AndroidDriver driver;
    static Pageman pageMan = new Pageman();
    public static final long WAIT = 15;


    public static void Android_Sony_setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "G3112");
        caps.setCapability("udid", "CQ30013UUV");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0.0");
        caps.setCapability("appPackage", "ru.nspk.mir.hce.sdk.demo");
        caps.setCapability("appActivity", "ru.nspk.mir.hce.sdk.demo.wallet.ui.activity.MainActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }
    public static void Android_С9_setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "M2006C3MNG");
        caps.setCapability("udid", "5HEQDYP7XKIVTSEE");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("appPackage", "ru.nspk.mir.hce.sdk.demo");
        caps.setCapability("appActivity", "ru.nspk.mir.hce.sdk.demo.wallet.ui.activity.MainActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }
    public static void Android_A12_setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy A12");
        caps.setCapability("udid", "R58R20PFXZX");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("appPackage", "ru.nspk.sbpay.develop");
        caps.setCapability("appActivity", "ru.nspk.wallet.ui.activity.InitialActivity");
        caps.setCapability("automationName", "uiautomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

    }
    public static void Android_A52_setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy A52");
        caps.setCapability("udid", "R58RB2AN44K");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("appPackage", "ru.nspk.sbpay.develop");
        caps.setCapability("appActivity", "ru.nspk.wallet.ui.activity.InitialActivity");
        caps.setCapability("automationName", "uiautomator2");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
    }


    //    public static void getLog() throws IOException {
//        DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH-mm-ss");
//        Date today = Calendar.getInstance().getTime();
//        String reportDate = df.format(today);
//        Logger log = Logger.getLogger("SBPay's logs");
//        log.info(driver.getSessionId() + ": Saving device log...");
//
//        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
//        clearWriter.print("");
//        clearWriter.close();
//
//        FileWriter writer = new FileWriter(PropertyReader.getThisProperty("LogSource"), false);
//        List<LogEntry> logEntries = driver.manage().logs().get("logcat").getAll();
//        writer.write(String.valueOf(logEntries));
//        log.info(driver.getSessionId() + ": Saving device log - Done.");
//    }
//    public static boolean checkLog(String fileName, String word) throws IOException {
//        System.out.println("Start check log");
//        return new String(Files.readAllBytes(Paths.get(fileName))).contains(word);
//    }
    public void backHardware(){
        driver.navigate().back();
    }
    public void swipeMenu(){
        AndroidTouchAction actions= new AndroidTouchAction(driver);
        actions.press(PointOption.point(340, 20))
                .waitAction()
                .moveTo(PointOption.point(-340, 1100))
                .release()
                .perform();
    }
    public void turnOfWiFiSamsung12(){
        TouchAction action= new TouchAction(driver);
        action.press(PointOption.point(192, 225)).release().perform();
        System.out.println("turnOfWiFiSamsung12");
    }
    public void turnOfWiFiSamsung52(){
        TouchAction action= new TouchAction(driver);
        action.press(PointOption.point(290, 350)).release().perform();
        System.out.println("turnOfWiFiSamsung52");
    }
    public void getLog() throws IOException {
        DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH-mm-ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        Logger log = Logger.getLogger("HCE's logs");
        log.info(driver.getSessionId() + ": Saving device log...");

        FileWriter writer = new FileWriter(PropertyReader.getThisProperty("LogSource"), true);
        List<LogEntry> logEntries = driver.manage().logs().get("logcat").getAll();
        writer.write(String.valueOf(logEntries));
        log.info(driver.getSessionId() + ": Saving device log - Done.");
    }
    public static boolean checkLog(String fileName, String word) throws IOException {
        System.out.println("Start check log");
        return new String(Files.readAllBytes(Paths.get(fileName))).contains(word);
    }
    @AfterMethod
    public static void tearDown() {
        driver.removeApp("io.appium.uiautomator2.server ");
        driver.removeApp("io.appium.uiautomator2.server.test");
        if (null != driver) {
            driver.quit();
        }
    }
}
