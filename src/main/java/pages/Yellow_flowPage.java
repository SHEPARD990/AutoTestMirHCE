package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.springframework.util.Assert;
import utils.PropertyReader;

import java.io.IOException;
import java.io.PrintWriter;

public class Yellow_flowPage extends BasePage{
    public Yellow_flowPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*action_bar.*\"))")
    MobileElement action_barYellow_flow;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*useCustomDataSwitch.*\"))")
    MobileElement Yellow_flowTogleSwitch;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*tokenizationStatusText.*\"))")
    MobileElement tokenizationStatusText;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*cardPanLayout.*\"))")
    MobileElement cardPanLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*cardExpirationDateLayout.*\"))")
    MobileElement cardExpirationDateLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*cardSecretCodeLayout.*\"))")
    MobileElement cardSecretCodeLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*enterCardEntryTypeSpinner.*\"))")
    MobileElement enterCardEntryTypeSpinner;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*enrollCardButton.*\"))")
    MobileElement enrollCardButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*enrollmentReferenceLayout.*\"))")
    MobileElement enrollmentReferenceLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*tncTimestampLayout.*\"))")
    MobileElement tncTimestampLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*tncReferenceLayout.*\"))")
    MobileElement tncReferenceLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*confirmCardTokenizationButton.*\"))")
    MobileElement confirmCardTokenizationButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*enterActivationModeSpinner.*\"))")
    MobileElement enterActivationModeSpinner;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*tokenReferenceLayout.*\"))")
    MobileElement tokenReferenceLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*activationMethodReferenceLayout.*\"))")
    MobileElement activationMethodReferenceLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*confirmChooseTokenActivationMethodButton.*\"))")
    MobileElement confirmChooseTokenActivationMethodButton;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*verificationCodeLayout.*\"))")
    MobileElement verificationCodeLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*activeTokenReferenceLayout.*\"))")
    MobileElement activeTokenReferenceLayout;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*activateToken.*\"))")
    MobileElement activateToken;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*encryptedCardProfileLayout.*\"))")
    MobileElement encryptedCardProfileLayout;
    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[1]")
    MobileElement CardProfileMAN;
    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[2]")
    MobileElement CardProfileOCR;
    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[3]")
    MobileElement CardProfileCOF;

    public boolean checkaction_barYellow_flow() {
        System.out.println("checkaction_barYellow_flow");
        return action_barYellow_flow.isDisplayed();
    }
    public String getaction_barYellow_flow(){
        System.out.println("getaction_barYellow_flow");
        return getAttribute(action_barYellow_flow.findElement(By.className("android.widget.TextView")),"text");
    }
    public String checkBackButtonEnable(){
        System.out.println("checkBackButtonEnable");
        return getAttribute(action_barYellow_flow.findElement(By.className("android.widget.ImageButton")),"content-desc");
    }
    public boolean checkYellow_flowTogleSwitch() {
        System.out.println("checkYellow_flowTogleSwitch");
        return Yellow_flowTogleSwitch.isDisplayed();
    }
    public boolean checktokenizationStatusText() {
        System.out.println("checktokenizationStatusText");
        return tokenizationStatusText.isDisplayed();
    }
    public String gettokenizationStatusText(){
        System.out.println("gettokenizationStatusText");
        return getAttribute(tokenizationStatusText,"text");
    }
    public boolean checkcardPanLayout() {
        System.out.println("checkcardPanLayout");
        return cardPanLayout.isDisplayed();
    }
    public boolean checkcardExpirationDateLayout() {
        System.out.println("checkcardExpirationDateLayout");
        return cardExpirationDateLayout.isDisplayed();
    }
    public boolean checkcardSecretCodeLayout() {
        System.out.println("checkcardSecretCodeLayout");
        return cardSecretCodeLayout.isDisplayed();
    }
    public boolean checkenterCardEntryTypeSpinner() {
        System.out.println("checkenterCardEntryTypeSpinner");
        return enterCardEntryTypeSpinner.isDisplayed();
    }
    public void clickenterCardEntryTypeSpinner(){
        System.out.println("clickconfirmChooseTokenActivationMethodButton");
        click(enterCardEntryTypeSpinner);
    }
    public void chooseMAN(){
        System.out.println("chooseMAN");
        CardProfileMAN.clear();
        click(CardProfileMAN);
    }
    public void chooseOCR(){
        System.out.println("chooseOCR");
        CardProfileOCR.clear();
        click(CardProfileOCR);
    }
    public void chooseCOF(){
        System.out.println("chooseCOF");
        CardProfileCOF.clear();
        click(CardProfileCOF);
    }
    public boolean checkenrollCardButton() {
        System.out.println("checkenrollCardButton");
        return enrollCardButton.isDisplayed();
    }
    public boolean checkenrollmentReferenceLayout() {
        System.out.println("checkenrollmentReferenceLayout");
        return enrollmentReferenceLayout.isDisplayed();
    }
    public boolean checktncTimestampLayout() {
        System.out.println("checktncTimestampLayout");
        return tncTimestampLayout.isDisplayed();
    }
    public boolean checktncReferenceLayout() {
        System.out.println("checktncReferenceLayout");
        return tncReferenceLayout.isDisplayed();
    }
    public boolean checkconfirmCardTokenizationButton() {
        System.out.println("checkconfirmCardTokenizationButton");
        return confirmCardTokenizationButton.isDisplayed();
    }
    public boolean checkenterActivationModeSpinner() {
        System.out.println("checkenterActivationModeSpinner");
        return enterActivationModeSpinner.isDisplayed();
    }
    public boolean checktokenReferenceLayout() {
        System.out.println("checktokenReferenceLayout");
        return tokenReferenceLayout.isDisplayed();
    }
    public boolean checkactivationMethodReferenceLayout() {
        System.out.println("checkactivationMethodReferenceLayout");
        return activationMethodReferenceLayout.isDisplayed();
    }
    public boolean checkconfirmChooseTokenActivationMethodButton() {
        System.out.println("checkconfirmChooseTokenActivationMethodButton");
        return confirmChooseTokenActivationMethodButton.isDisplayed();
    }
    public boolean checkverificationCodeLayout() {
        System.out.println("checkverificationCodeLayout");
        return verificationCodeLayout.isDisplayed();
    }
    public void setverificationCodeLayout(String text){
        System.out.println("setverificationCodeLayout");
        verificationCodeLayout.findElement(By.className("android.widget.EditText")).clear();
        sendText(verificationCodeLayout.findElement(By.className("android.widget.EditText")), text);
    }
    public String getverificationCodeLayout(){
        System.out.println("getverificationCodeLayout");
        return getAttribute(verificationCodeLayout.findElement(By.className("android.widget.EditText")),"text");
    }
    public void setencryptedCardProfileLayout(String text){
        System.out.println("setverificationCodeLayout");
        encryptedCardProfileLayout.findElement(By.className("android.widget.EditText")).clear();
        sendText(encryptedCardProfileLayout.findElement(By.className("android.widget.EditText")), text);
    }
    public String getencryptedCardProfileLayout(){
        System.out.println("getverificationCodeLayout");
        return getAttribute(encryptedCardProfileLayout.findElement(By.className("android.widget.EditText")),"text");
    }
    public boolean checkactiveTokenReferenceLayout() {
        System.out.println("checkactiveTokenReferenceLayout");
        return activeTokenReferenceLayout.isDisplayed();
    }
    public boolean checkactivateToken() {
        System.out.println("checkactivateToken");
        return activateToken.isDisplayed();
    }
    public void setcardPanLayout(String text){
        System.out.println("setcardPanLayout");
        cardPanLayout.findElement(By.className("android.widget.EditText")).clear();
        sendText(cardPanLayout.findElement(By.className("android.widget.EditText")), text);
    }
    public String getcardPanLayout(){
        System.out.println("getcardPanLayout");
        return getAttribute(cardPanLayout.findElement(By.className("android.widget.EditText")),"text");
    }
    public void setcardExpirationDateLayout(String text){
        System.out.println("setcardExpirationDateLayout");
        cardExpirationDateLayout.findElement(By.className("android.widget.EditText")).clear();
        sendText(cardExpirationDateLayout.findElement(By.className("android.widget.EditText")), text);
    }
    public String getcardExpirationDateLayout(){
        System.out.println("getcardExpirationDateLayout");
        return getAttribute(cardExpirationDateLayout.findElement(By.className("android.widget.EditText")),"text");
    }
    public void setcardSecretCodeLayout(String text){
        System.out.println("setcardSecretCodeLayout");
        cardSecretCodeLayout.findElement(By.className("android.widget.EditText")).clear();
        sendText(cardSecretCodeLayout.findElement(By.className("android.widget.EditText")), text);
    }
    public String getcardSecretCodeLayout(){
        System.out.println("getcardSecretCodeLayout");
        return getAttribute(cardSecretCodeLayout.findElement(By.className("android.widget.EditText")),"text");
    }
    public void clickenrollCardButton(){
        System.out.println("clickenrollCardButton");
        click(enrollCardButton);
    }
    public void clickconfirmCardTokenizationButton(){
        System.out.println("clickconfirmCardTokenizationButton");
        click(confirmCardTokenizationButton);
    }
    public void clickconfirmChooseTokenActivationMethodButton(){
        System.out.println("clickconfirmChooseTokenActivationMethodButton");
        click(confirmChooseTokenActivationMethodButton);
    }
    public void clickactivateToken(){
        System.out.println("clickactivateToken");
        click(activateToken);
    }
    public void clickYellow_flowTogleSwitch(){
        System.out.println("clickYellow_flowTogleSwitch");
        click(Yellow_flowTogleSwitch);
    }
    public boolean checkYellow_flowLog() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        System.out.println();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"ENROLL_CARD\",\"methodType\":\"Result\",\"result\"");
        System.out.println("Регистрация намерения токенизации = " + check);
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"CONFIRM_CARD_TOKENIZATION\",\"methodType\":\"Result\",\"result\"");
        System.out.println("\"Подтверждение выпуска токена\" = " + check);
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"ACTIVATE_CARD_TOKEN\",\"methodType\":\"Result\"");
        System.out.println("Подтвердить выбор способа активации токена = " + check);
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"CHECK_VERIFICATION_CODE\",\"methodType\":\"Result\",\"result\"");
        System.out.println("Активировать токен = " + check);
        return check;
    }
}
