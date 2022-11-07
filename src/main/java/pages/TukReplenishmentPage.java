package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import utils.PropertyReader;

import java.io.IOException;
import java.io.PrintWriter;

public class TukReplenishmentPage extends BasePage{
    public TukReplenishmentPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    @AndroidFindBy(id = "action_bar")
    MobileElement action_barTUK;
    @AndroidFindBy(id = "useCustomDataSwitch")
    MobileElement toggleSwitchTUK;
    @AndroidFindBy(id = "updateTuksButton")
    MobileElement updateTuksButton;
    @AndroidFindBy(id = "tokenStatusSpinnerText")
    MobileElement tokenStatusSpinnerText;
    @AndroidFindBy(id = "tokenStatusSpinner")
    MobileElement tokenStatusSpinner;
    @AndroidFindBy(id = "updateTokenStatusButton")
    MobileElement updateTokenStatusButton;
    @AndroidFindBy(id = "tokenStatusText")
    MobileElement tokenStatusText;
    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[1]")
    MobileElement tokenStatusPending;
    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[2]")
    MobileElement tokenStatusActive;
    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[3]")
    MobileElement tokenStatusSuspended;
    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[4]")
    MobileElement tokenStatusDisposed;

    public String getaction_barTUK(){
        System.out.println("getaction_barTUK");
        return getAttribute(action_barTUK.findElement(By.className("android.widget.TextView")),"text");
    }
    public String checkBackButtonTUK(){
        System.out.println("checkBackButtonTUK");
        return getAttribute(action_barTUK.findElement(By.className("android.widget.ImageButton")),"content-desc");
    }
    public boolean checkaction_barTUK(){
        System.out.println("checkaction_barTUK");
        return action_barTUK.isDisplayed();
    }
    public boolean checktoggleSwitchTUK(){
        System.out.println("checktoggleSwitchTUK");
        return toggleSwitchTUK.isDisplayed();
    }
    public boolean checkupdateTuksButton(){
        System.out.println("checkupdateTuksButton");
        return updateTuksButton.isDisplayed();
    }
    public boolean checktokenStatusSpinnerText(){
        System.out.println("checktokenStatusSpinnerText");
        return tokenStatusSpinnerText.isDisplayed();
    }
    public boolean checktokenStatusSpinner(){
        System.out.println("checktokenStatusSpinner");
        return tokenStatusSpinner.isDisplayed();
    }
    public boolean checkupdateTokenStatusButton(){
        System.out.println("checkupdateTokenStatusButton");
        return updateTokenStatusButton.isDisplayed();
    }
    public boolean checktokenStatusText(){
        System.out.println("checktokenStatusText");
        return tokenStatusText.isDisplayed();
    }
    public void clickupdateTuksButton(){
        System.out.println("clickupdateTuksButton");
        click(updateTuksButton);
    }
    public void clickupdateTokenStatusButton(){
        System.out.println("clickupdateTokenStatusButton");
        click(updateTokenStatusButton);
    }
    public void clicktokenStatusSpinner(){
        System.out.println("clickupdateTokenStatusButton");
        click(tokenStatusSpinner);
    }
    public void clicktokenStatusActive(){
        System.out.println("clicktokenStatusActive");
        click(tokenStatusActive);
    }
    public boolean checkTUKLog() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        System.out.println();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"REPLENISH_TUKS\",\"methodType\":\"Result\",\"result\"");
        System.out.println("Пополнить TUKs = " + check);
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"CHANGE_TOKEN_STATUS\",\"methodType\":\"Invoke\",\"parameters\"");
        System.out.println("Изменить статус токена = " + check);
        return check;
    }
}
