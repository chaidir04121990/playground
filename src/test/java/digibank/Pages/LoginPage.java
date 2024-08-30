package digibank.Pages;
import digibank.BaseTest;
import digibank.StepDef.LoginStep;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BaseTest{
    By btn_sudah = By.id("com.dbs.id.dbsdigibank:id/btn_login");
    By btn_skip = By.id("com.dbs.id.dbsdigibank:id/btn_skip");
    By permission1 = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By permissionloc = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By acceptPermission = By.id("com.dbs.id.dbsdigibank:id/accept_permissions");
    By notif = By.id("com.android.permissioncontroller:id/permission_message");
    By logo = By.id("com.dbs.id.dbsdigibank:id/img_logo");

    public void clickSKIP(){
        System.out.println("Apps is Launched");
        wait.until(ExpectedConditions.presenceOfElementLocated(btn_skip));
        driver.findElement(btn_skip).isDisplayed();
        String skipbutton = driver.findElement(btn_skip).getText();
        System.out.println(skipbutton);
        Assert.assertEquals(skipbutton,"SKIP");
        driver.findElement(btn_skip).click();
        System.out.println("SKIP is clicked");
        wait.until(ExpectedConditions.presenceOfElementLocated(permission1));
        driver.findElement(permission1).isDisplayed();
        driver.findElement(permission1).click();
        System.out.println("Allow is clicked");
        wait.until(ExpectedConditions.presenceOfElementLocated(permissionloc));
        driver.findElement(permissionloc).isDisplayed();
        driver.findElement(permissionloc).click();
        System.out.println("Allow location is clicked");
        wait.until(ExpectedConditions.presenceOfElementLocated(acceptPermission));
        driver.findElement(acceptPermission).isDisplayed();
        driver.findElement(acceptPermission).click();
        System.out.println("Agree is clicked");
        wait.until(ExpectedConditions.presenceOfElementLocated(permission1));
        driver.findElement(permission1).isDisplayed();
        driver.findElement(permission1).click();
        System.out.println("Allow permission is clicked");
        wait.until(ExpectedConditions.presenceOfElementLocated(notif));
        driver.findElement(notif).isDisplayed();
        wait.until(ExpectedConditions.presenceOfElementLocated(permission1));
        driver.findElement(permission1).isDisplayed();
        driver.findElement(permission1).click();
        System.out.println("Allow notification is clicked");
        wait.until(ExpectedConditions.presenceOfElementLocated(logo));
        driver.findElement(logo).isDisplayed();
        System.out.println("Logo is displayed");
    }
}
