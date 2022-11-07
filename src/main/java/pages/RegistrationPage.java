package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.springframework.util.Assert;
import utils.PropertyReader;

import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationPage extends BasePage{
    public RegistrationPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    @AndroidFindBy(id = "action_bar")
    MobileElement action_barRegistration;
    @AndroidFindBy(accessibility = "Перейти вверх")
    MobileElement backButtonRegistration;
    @AndroidFindBy(id = "useCustomDataSwitch")
    MobileElement toggleSwitchRegistration;
    @AndroidFindBy(id = "registrationStatusText")
    MobileElement registrationStatusText;
    @AndroidFindBy(id = "prepareRegistrationButton")
    MobileElement prepareRegistrationButton;
    @AndroidFindBy(id = "registrationButton")
    MobileElement registrationButton;
    @AndroidFindBy(id = "finishRegistrationButton")
    MobileElement finishRegistrationButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*tokenRequestorIdInput.*\"))")
    MobileElement tokenRequestorIdInput;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*partnerIdInput.*\"))")
    MobileElement partnerIdInput;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*instanceIdInput.*\"))")
    MobileElement instanceIdInput;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*sdkCryptoInput.*\"))")
    MobileElement sdkCryptoInput;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*nspkCryptoInput.*\"))")
    MobileElement nspkCryptoInput;
    public boolean checkaction_barRegistration() {
        System.out.println("checkaction_barRegistration");
        return action_barRegistration.isDisplayed();
    }
    public String getaction_barRegistration(){
        System.out.println("getaction_barRegistration");
        return getAttribute(action_barRegistration.findElement(By.className("android.widget.TextView")),"text");
    }
    public boolean checkbackButtonRegistration(){
        System.out.println("checkbackButtonRegistration");
        return backButtonRegistration.isDisplayed();
    }
    public boolean checktoggleSwitchRegistration(){
        System.out.println("checktoggleSwitchRegistration");
        return toggleSwitchRegistration.isDisplayed();
    }
    public boolean checkregistrationStatusText(){
        System.out.println("checkregistrationStatusText");
        return registrationStatusText.isDisplayed();
    }
    public String getregistrationStatusText() throws InterruptedException {
        System.out.println("getregistrationStatusText");
        String status = getAttribute(registrationStatusText,"text");
        while (status.equals("Выполняется")) {
            //Thread.sleep(2000);
            status = getAttribute(registrationStatusText,"text");
        }
        return status;
    }
    public boolean checkprepareRegistrationButton(){
        System.out.println("checkprepareRegistrationButton");
        return prepareRegistrationButton.isDisplayed();
    }
    public boolean checkregistrationButton(){
        System.out.println("checkregistrationButton");
        return registrationButton.isDisplayed();
    }
    public boolean checkfinishRegistrationButton(){
        System.out.println("checkfinishRegistrationButton");
        return finishRegistrationButton.isDisplayed();
    }
    public boolean checktokenRequestorIdInput(){
        System.out.println("checktokenRequestorIdInput");
        return tokenRequestorIdInput.isDisplayed();
    }
    public boolean checkpartnerIdInput(){
        System.out.println("checkpartnerIdInput");
        return partnerIdInput.isDisplayed();
    }
    public boolean checkinstanceIdInput(){
        System.out.println("checkinstanceIdInput");
        return instanceIdInput.isDisplayed();
    }
    public boolean checksdkCryptoInput(){
        System.out.println("checksdkCryptoInput");
        return sdkCryptoInput.isDisplayed();
    }
    public boolean checknspkCryptoInput(){
        System.out.println("checknspkCryptoInput");
        return nspkCryptoInput.isDisplayed();
    }
    public String checktoggleSwitchRegistrationChecked(){
        System.out.println("checktoggleSwitchRegistrationChecked");
        return getAttribute(toggleSwitchRegistration,"checked");
    }
    public String checktokenRequestorIdInputEnable(){
        System.out.println("checktokenRequestorIdInputEnable");
        return getAttribute(tokenRequestorIdInput,"enabled");
    }
    public String checkpartnerIdInputEnable(){
        System.out.println("checkpartnerIdInputEnable");
        return getAttribute(partnerIdInput,"enabled");
    }
    public String checkinstanceIdInputEnable(){
        System.out.println("checkinstanceIdInputEnable");
        return getAttribute(instanceIdInput,"enabled");
    }
    public String checksdkCryptoInputEnable(){
        System.out.println("checksdkCryptoInputEnable");
        return getAttribute(sdkCryptoInput,"enabled");
    }
    public String checknspkCryptoInputEnable(){
        System.out.println("checknspkCryptoInputEnable");
        return getAttribute(nspkCryptoInput,"enabled");
    }
    public void clicktoggleSwitchRegistration(){
        System.out.println("clicktoggleSwitchRegistration");
        click(toggleSwitchRegistration);
    }
    public void clickprepareRegistrationButton(){
        System.out.println("clickprepareRegistrationButton");
        click(prepareRegistrationButton);
    }
    public void clickregistrationButton(){
        System.out.println("clickregistrationButton");
        click(registrationButton);
    }
    public void clickfinishRegistrationButton(){
        System.out.println("clickfinishRegistrationButton");
        click(finishRegistrationButton);
    }
    public void settokenRequestorIdInput(String text){
        System.out.println("setpartnerField");
        tokenRequestorIdInput.findElement(By.className("android.widget.EditText")).clear();
        sendText(tokenRequestorIdInput.findElement(By.className("android.widget.EditText")), text);
    }
    public void setpartnerIdInput(String text){
        System.out.println("setpartnerIdInput");
        partnerIdInput.findElement(By.className("android.widget.EditText")).clear();
        sendText(partnerIdInput.findElement(By.className("android.widget.EditText")), text);
    }

    public void setinstanceIdInput(String text){
        System.out.println("setinstanceIdInput");
        instanceIdInput.findElement(By.className("android.widget.EditText")).clear();
        sendText(instanceIdInput.findElement(By.className("android.widget.EditText")), text);
    }
    public void setsdkCryptoInput(String text){
        System.out.println("setsdkCryptoInput");
        sdkCryptoInput.findElement(By.className("android.widget.EditText")).clear();
        sendText(sdkCryptoInput.findElement(By.className("android.widget.EditText")), text);
    }
    public void setnspkCryptoInput(String text){
        System.out.println("setnspkCryptoInput");
        nspkCryptoInput.findElement(By.className("android.widget.EditText")).clear();
        sendText(nspkCryptoInput.findElement(By.className("android.widget.EditText")), text);
    }
    public String gettokenRequestorIdInput(){
        System.out.println("gettokenRequestorIdInput");
        return getAttribute(tokenRequestorIdInput.findElement(By.className("android.widget.EditText")),"text");
    }
    public String getpartnerIdInput(){
        System.out.println("getpartnerIdInput");
        return getAttribute(partnerIdInput.findElement(By.className("android.widget.EditText")),"text");
    }
    public String getinstanceIdInput(){
        System.out.println("getinstanceIdInput");
        return getAttribute(instanceIdInput.findElement(By.className("android.widget.EditText")),"text");
    }
    public String getsdkCryptoInput(){
        System.out.println("getsdkCryptoInput");
        return getAttribute(sdkCryptoInput.findElement(By.className("android.widget.EditText")),"text");
    }
    public String getnspkCryptoInput(){
        System.out.println("getnspkCryptoInput");
        return getAttribute(nspkCryptoInput.findElement(By.className("android.widget.EditText")),"text");
    }
    public void clickBackRegistrationButton(){
        System.out.println("clickBackRegistrationButton");
        click((action_barRegistration.findElement(By.className("android.widget.ImageButton"))));
    }
    public boolean checkRegLog() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        System.out.println();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"START_REGISTRATION\",\"methodType\":\"Result\"");
        System.out.println("START_REGISTRATION = " + check);
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"POST https://mir-hce-sdk-dev.ekassir.com/api/mirhcesdk/v1/tokenRequestors");
        System.out.println("REGISTRATION = " + check);
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"FINISH_REGISTRATION\",\"methodType\":\"Result\",\"result\":true");
        System.out.println("FINISH_REGISTRATION Result = " + check);
        return check;
    }
}
