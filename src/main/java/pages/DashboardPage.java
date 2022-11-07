package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import utils.PropertyReader;

import java.io.IOException;
import java.io.PrintWriter;

public class DashboardPage extends BasePage{
    public DashboardPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*settingsButton.*\"))")
    MobileElement settingsButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*action_bar.*\"))")
    MobileElement action_bar;
    //@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'MirHce Sdk DemoApp')])")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().textMatches(\".*MirHce Sdk DemoApp.*\"))")
    MobileElement titleDashboard;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*useCustomDataSwitch.*\"))")
    MobileElement toggleSwitch;
//    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
//            ".scrollIntoView(new UiSelector().textMatches(\".*test_partner.*\"))")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*partnerIdInput.*\"))")
    MobileElement partnerField;
//    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
//            ".scrollIntoView(new UiSelector().textMatches(\".*p1.*\"))")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*tokenRequestorIdInput.*\"))")
    MobileElement userField;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*statusText.*\"))")
    MobileElement statusText;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*initializeButton.*\"))")
    MobileElement initializeButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*disposeButton.*\"))")
    MobileElement disposeButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*clearButton.*\"))")
    MobileElement clearButton;
    //@AndroidFindBy(id="registrationButton")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*registrationButton.*\"))")
    MobileElement registrationButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*appToAppButton.*\"))")
    MobileElement appToAppButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*yellowFlowCardTokenizationButton.*\"))")
    MobileElement yellowFlowCardTokenizationButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*tukReplenishmentButton.*\"))")
    MobileElement tukReplenishmentButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*messageProcessingButton.*\"))")
    MobileElement messageProcessingButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*nfcPaymentSetupButton.*\"))")
    MobileElement nfcPaymentSetupButton;


    public boolean checksettingsButton() {
        System.out.println("checksettingsButton");
        return settingsButton.isDisplayed();
    }
    public boolean checktitleDashboard(){
        System.out.println("checkaction_bar");
        return titleDashboard.isDisplayed();
    }
    public String gettitleDashboard(){
        System.out.println("gettitleDashboard");
        return getAttribute(titleDashboard.findElement(By.className("android.widget.TextView")),"text");
    }
    public boolean checktoggleSwitch(){
        System.out.println("checktoggleSwitch");
        return toggleSwitch.isDisplayed();
    }
    public boolean checkpartnerField(){
        System.out.println("checkpartnerField");
        return partnerField.isDisplayed();
    }
    public boolean checkuserField(){
        System.out.println("checkuserField");
        return userField.isDisplayed();
    }
    public boolean checkstatusText(){
        System.out.println("checkstatusText");
        return statusText.isDisplayed();
    }
    public boolean checkinitializeButton(){
        System.out.println("checkinitializeButton");
        return initializeButton.isDisplayed();
    }
    public boolean checkdisposeButton(){
        System.out.println("checkdisposeButton");
        return disposeButton.isDisplayed();
    }
    public boolean checkclearButton(){
        System.out.println("checkclearButton");
        return clearButton.isDisplayed();
    }
    public boolean checkregistrationButton(){
        System.out.println("checkregistrationButton");
        return registrationButton.isDisplayed();
    }
    public boolean checkappToAppButton(){
        System.out.println("checkappToAppButton");
        return appToAppButton.isDisplayed();
    }
    public boolean checkyellowFlowCardTokenizationButton(){
        System.out.println("checkyellowFlowCardTokenizationButton");
        return yellowFlowCardTokenizationButton.isDisplayed();
    }
    public boolean checktukReplenishmentButton(){
        System.out.println("checktukReplenishmentButton");
        return tukReplenishmentButton.isDisplayed();
    }
    public boolean checkmessageProcessingButton(){
        System.out.println("checkmessageProcessingButton");
        return messageProcessingButton.isDisplayed();
    }
    public boolean checknfcPaymentSetupButton(){
        System.out.println("checknfcPaymentSetupButton");
        return nfcPaymentSetupButton.isDisplayed();
    }
    public void clicktoggleSwitch() {
        System.out.println("clicktoggleSwitch");
        click(toggleSwitch);
    }
    public String gettoggleSwitchtitle(){
        System.out.println("gettoggleSwitchtitle");
        return getAttribute(toggleSwitch,"text");
    }
    public String gettoggleSwitchChecked(){
        System.out.println("gettoggleSwitchEnable");
        return getAttribute(toggleSwitch,"checked");
    }
    public String gettoggleSwitchEnable(){
        System.out.println("gettoggleSwitchEnable");
        return getAttribute(partnerField,"enabled");
    }
    public String getstatusTextTitle(){
        System.out.println("getstatusTextTitle");
        return getAttribute(statusText,"text");
    }
    public void clickinitializeButton(){
        System.out.println("clickinitializeButton");
        click(initializeButton);
    }
    public void setpartnerField(String text){
        System.out.println("setpartnerField");
        partnerField.findElement(By.className("android.widget.EditText")).clear();
        sendText(partnerField.findElement(By.className("android.widget.EditText")), text);
    }
    public String getpartnerField(){
        System.out.println("getpartnerField");
        return getAttribute(partnerField.findElement(By.className("android.widget.EditText")),"text");
    }
    public void setuserField(String text){
        System.out.println("setuserField");
        userField.findElement(By.className("android.widget.EditText")).clear();
        sendText(userField.findElement(By.className("android.widget.EditText")), text);
    }
    public String getuserField(){
        System.out.println("getuserField");
        return getAttribute(userField.findElement(By.className("android.widget.EditText")),"text");
    }
    public void clickdisposeButton(){
        System.out.println("clickdisposeButton");
        click(disposeButton);
    }
    public String checksettingsButtonEnable() {
        System.out.println("checksettingsButtonEnable");
        return getAttribute(settingsButton,"enabled");
    }
    public String checktitleDashboardEnable(){
        System.out.println("checktitleDashboardEnable");
        return getAttribute(titleDashboard,"enabled");
    }
    public String checktoggleSwitchEnable(){
        System.out.println("checktoggleSwitchEnable");
        return getAttribute(toggleSwitch,"enabled");
    }
    public String checkpartnerFieldEnable(){
        System.out.println("checkpartnerFieldEnable");
        return getAttribute(partnerField,"enabled");
    }
    public String checkuserFieldEnable(){
        System.out.println("checkuserFieldEnable");
        return getAttribute(userField,"enabled");
    }
    public String checkstatusTextEnable(){
        System.out.println("checkstatusTextEnable");
        return getAttribute(statusText,"enabled");
    }
    public String checkinitializeButtonEnable(){
        System.out.println("checkinitializeButtonEnable");
        return getAttribute(initializeButton,"enabled");
    }
    public String checkdisposeButtonEnable(){
        System.out.println("checkdisposeButtonEnable");
        return getAttribute(disposeButton,"enabled");
    }
    public String checkclearButtonEnable(){
        System.out.println("checkclearButtonEnable");
        return getAttribute(clearButton,"enabled");
    }
    public String checkregistrationButtonEnable(){
        System.out.println("checkregistrationButtonEnable");
        return getAttribute(registrationButton,"enabled");
    }
    public String checkappToAppButtonEnable(){
        System.out.println("checkappToAppButtonEnable");
        return getAttribute(appToAppButton,"enabled");
    }
    public String checkyellowFlowCardTokenizationButtonEnable(){
        System.out.println("checkyellowFlowCardTokenizationButtonEnable");
        return getAttribute(yellowFlowCardTokenizationButton,"enabled");
    }
    public String checktukReplenishmentButtonEnable(){
        System.out.println("checktukReplenishmentButtonEnable");
        return getAttribute(tukReplenishmentButton,"enabled");
    }
    public String checkmessageProcessingButtonEnable(){
        System.out.println("checkmessageProcessingButtonEnable");
        return getAttribute(messageProcessingButton,"enabled");
    }
    public String checknfcPaymentSetupButtonEnable(){
        System.out.println("checknfcPaymentSetupButtonEnable");
        return getAttribute(nfcPaymentSetupButton,"enabled");
    }
    public void clickregistrationButton() {
        System.out.println("clickregistrationButton");
        click(registrationButton);
    }
    public void clickappToAppButton() {
        System.out.println("clickregistrationButton");
        click(appToAppButton);
    }
    public void clicktukReplenishmentButton() {
        System.out.println("clickregistrationButton");
        click(tukReplenishmentButton);
    }
    public void clickyellowFlowCardTokenizationButton(){
        System.out.println("clickyellowFlowCardTokenizationButton");
        click(yellowFlowCardTokenizationButton);
    }
    public boolean checkInitLog() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"INITIALIZE\",\"methodType\":\"Result\"");
        return check;
    }
    public boolean checkDisLog() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"DISPOSE\",\"methodType\":\"Result\"");
        return check;
    }
}
