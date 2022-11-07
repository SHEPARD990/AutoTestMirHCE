package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class BasePage {
    AndroidDriver driver;
    PropertyReader propertyReader;
    public static final long WAIT = 15;

    Logger log1 = Logger.getLogger("SBPay's logs");
    public BasePage(AndroidDriver androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        driver = androidDriver;
        propertyReader = new PropertyReader();
    }
    public void waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForPresence(By locator){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
//        public void waitForVisibility(String element){
//        WebDriverWait wait = new WebDriverWait(driver, WAIT);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
//    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }

    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }
    public void getLog() throws IOException {
        DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH-mm-ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        Logger log = Logger.getLogger("SBPay's logs");
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


    public void sendText(MobileElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }
    public void checkElement(By locator) {
        waitForPresence(locator);
    }

    public String getAttribute(MobileElement element, String attribute){
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }
}

