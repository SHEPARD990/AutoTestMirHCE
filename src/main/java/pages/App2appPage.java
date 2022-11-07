package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import utils.PropertyReader;

import java.io.IOException;
import java.io.PrintWriter;

public class App2appPage extends BasePage{
    public App2appPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "action_bar")
    MobileElement action_barApp2app;
    @AndroidFindBy(id = "cardTokenizationStatusText")
    MobileElement cardTokenizationStatusText;
    @AndroidFindBy(id = "useCustomDataSwitch")
    MobileElement app2appTogleSwitch;
    @AndroidFindBy(id = "encryptedCardProfile")
    MobileElement encryptedCardProfile;
    @AndroidFindBy(id = "enrollCardButton")
    MobileElement enrollCardButton;
    @AndroidFindBy(id = "enrollmentReference")
    MobileElement enrollmentReference;
    @AndroidFindBy(id = "tncTimestamp")
    MobileElement tncTimestamp;
    @AndroidFindBy(id = "tncReference")
    MobileElement tncReference;
    @AndroidFindBy(id = "confirmCardTokenizationButton")
    MobileElement confirmCardTokenizationButton;

    public String getTitleaction_barApp2app(){
        System.out.println("getTitleaction_barApp2app");
        return getAttribute(action_barApp2app.findElement(By.className("android.widget.TextView")),"text");
    }
    public String checkBackButtonEnable(){
        System.out.println("checkBackButtonEnable");
        return getAttribute(action_barApp2app.findElement(By.className("android.widget.ImageButton")),"content-desc");
    }
    public boolean checkapp2appTogleSwitch(){
        System.out.println("checkapp2appTogleSwitch");
        return app2appTogleSwitch.isDisplayed();
    }
    public boolean checkencryptedCardProfile(){
        System.out.println("checkencryptedCardProfile");
        return encryptedCardProfile.isDisplayed();
    }
    public boolean checkenrollCardButton(){
        System.out.println("checkenrollCardButton");
        return enrollCardButton.isDisplayed();
    }
    public boolean checkenrollmentReference(){
        System.out.println("checkenrollmentReference");
        return enrollmentReference.isDisplayed();
    }
    public boolean checktncTimestamp(){
        System.out.println("checktncTimestamp");
        return tncTimestamp.isDisplayed();
    }
    public boolean checktncReference(){
        System.out.println("checktncReference");
        return tncReference.isDisplayed();
    }
    public boolean checkconfirmCardTokenizationButton(){
        System.out.println("checkconfirmCardTokenizationButton");
        return confirmCardTokenizationButton.isDisplayed();
    }

    public void clickapp2appTogleSwitch() {
        System.out.println("clickapp2appTogleSwitch");
        click(app2appTogleSwitch);
    }
    public String getapp2appTogleSwitchChecked(){
        System.out.println("getapp2appTogleSwitchChecked");
        return getAttribute(app2appTogleSwitch,"checked");
    }
    public String checkencryptedCardProfileEnable(){
        System.out.println("checkencryptedCardProfileEnable");
        return getAttribute(encryptedCardProfile,"enabled");
    }
    public String checkenrollmentReferenceEnable(){
        System.out.println("checkenrollmentReferenceEnable");
        return getAttribute(enrollmentReference,"enabled");
    }
    public String checktncTimestampEnable(){
        System.out.println("checktncTimestampEnable");
        return getAttribute(tncTimestamp,"enabled");
    }
    public String checktncReferenceEnable(){
        System.out.println("checktncReferenceEnable");
        return getAttribute(tncReference,"enabled");
    }
    public void clickenrollCardButton() {
        System.out.println("clickenrollCardButton");
        click(enrollCardButton);
    }
    public void clickconfirmCardTokenizationButton() {
        System.out.println("clickconfirmCardTokenizationButton");
        click(confirmCardTokenizationButton);
    }
    public String getcardTokenizationStatusText(){
        System.out.println("getcardTokenizationStatusText");
        return getAttribute(cardTokenizationStatusText,"text");
    }
    public void setencryptedCardProfile(String text){
        System.out.println("setencryptedCardProfile");
        encryptedCardProfile.findElement(By.className("android.widget.EditText")).clear();
        sendText(encryptedCardProfile.findElement(By.className("android.widget.EditText")), text);
    }
    public void setenrollmentReference(String text){
        System.out.println("setenrollmentReference");
        enrollmentReference.findElement(By.className("android.widget.EditText")).clear();
        sendText(enrollmentReference.findElement(By.className("android.widget.EditText")), text);
    }
    public void settncTimestamp(String text){
        System.out.println("checktncTimestamp");
        tncTimestamp.findElement(By.className("android.widget.EditText")).clear();
        sendText(tncTimestamp.findElement(By.className("android.widget.EditText")), text);
    }
    public void settncReference(String text){
        System.out.println("settncReference");
        tncReference.findElement(By.className("android.widget.EditText")).clear();
        sendText(tncReference.findElement(By.className("android.widget.EditText")), text);
    }
    public String getencryptedCardProfile(){
        System.out.println("getencryptedCardProfile");
        return getAttribute(encryptedCardProfile.findElement(By.className("android.widget.EditText")),"text");
    }
    public String getenrollmentReference(){
        System.out.println("getenrollmentReference");
        return getAttribute(enrollmentReference.findElement(By.className("android.widget.EditText")),"text");
    }
    public String gettncTimestamp(){
        System.out.println("gettncTimestamp");
        return getAttribute(tncTimestamp.findElement(By.className("android.widget.EditText")),"text");
    }
    public String gettncReference(){
        System.out.println("gettncReference");
        return getAttribute(tncReference.findElement(By.className("android.widget.EditText")),"text");
    }
    public void clickBackApp2appButton(){
        System.out.println("clickBackRegistrationButton");
        click((action_barApp2app.findElement(By.className("android.widget.ImageButton"))));
    }
    public boolean checkApp2appLog() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"ENROLL_CARD\",\"methodType\":\"Invoke\"");
        System.out.println("Регистрация намерения токенизации = " + check);
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"CONFIRM_CARD_TOKENIZATION\",\"methodType\":\"Invoke\",\"parameters\":{\"enrollmentReference\"");
        System.out.println("Подтверждение выпуска токена = " + check);
        return check;
    }
    public boolean checkApp2appLogEnrollErr() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"ENROLL_CARD\",\"methodType\":\"Error\"");
        System.out.println("Ошибка при регистрация намерения токенизации = " + check);
        return check;
    }
    public boolean checkApp2appLogConfirmErr() throws IOException, InterruptedException {
        PrintWriter clearWriter = new PrintWriter(PropertyReader.getThisProperty("LogSource"));
        clearWriter.print("");
        clearWriter.close();
        boolean check = false;
        getLog();
        check = checkLog(PropertyReader.getThisProperty("LogSource"),"\"methodName\":\"CONFIRM_CARD_TOKENIZATION\",\"methodType\":\"Error\"");
        System.out.println("Ошибка при подтверждение выпуска токена = " + check);
        return check;
    }
}
