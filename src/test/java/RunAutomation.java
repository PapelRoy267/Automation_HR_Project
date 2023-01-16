import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RunAutomation extends Setup {


    @Test(priority = 1)
    public void doLogin() {
        driver.get("https://opensource-demo.orangehrmlive.com");
        List<WebElement> login = driver.findElements(By.className("oxd-input"));
        login.get(0).sendKeys("Admin");
        login.get(1).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();


    }

    @Test(priority = 2)
    public void PIM() throws InterruptedException {
        List<WebElement> input = driver.findElements(By.className("oxd-main-menu-item-wrapper"));
        input.get(1).click();
        Thread.sleep(2000);
        List<WebElement> addButton = driver.findElements(By.className("oxd-button"));
        addButton.get(2).click();
    }


    @Test(priority = 3)
    public void EmployeeName() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> input = driver.findElements(By.className("oxd-input"));
        input.get(1).sendKeys("Papel");
        input.get(2).sendKeys("Chandra");
        input.get(3).sendKeys("Roy");
        List<WebElement> Toggle = driver.findElements(By.className("oxd-switch-input"));
        Toggle.get(0).click();
        Thread.sleep(2000);

        List<WebElement> UserNamePass = driver.findElements(By.className("oxd-input"));
        UserNamePass.get(5).sendKeys("papelroyshanto10");
        UserNamePass.get(6).sendKeys("Ibos@123");
        UserNamePass.get(7).sendKeys("Ibos@123");

        Thread.sleep(2000);

        List<WebElement> Save = driver.findElements(By.className("oxd-button"));
        Save.get(1).click();


        List<WebElement> leveltxt = driver.findElements(By.className("oxd-text"));
        String UserName_Actual = leveltxt.get(12).getText();
        String UserName_Expected = "papel Chandra Roy";
        Assert.assertEquals(UserName_Actual, UserName_Expected);
        String UserInfo_Actual = leveltxt.get(13).getText();
        String UserInfo_Expected = "Personal Details";
        Assert.assertEquals(UserInfo_Actual, UserInfo_Expected);
        Thread.sleep(2000);

        List<WebElement> txt = driver.findElements(By.className("oxd-main-menu-item-wrapper"));
        txt.get(1).click();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void SearchButton() throws InterruptedException {


        List<WebElement> txt = driver.findElements(By.className("oxd-main-menu-item-wrapper"));
        txt.get(1).click();
        Thread.sleep(2000);

        List<WebElement> SearchButton = driver.findElements(By.tagName("input"));
        SearchButton.get(1).sendKeys("Papel Chandra Roy");
        Thread.sleep(2000);
        List<WebElement> click = driver.findElements(By.className("oxd-button"));
        click.get(1).click();
        Thread.sleep(2000);




    }

 @Test(priority = 5)
    public void Assert() throws InterruptedException {

        List<WebElement> txtLebel = driver.findElements(By.className("oxd-text--span"));
        String actualResult = txtLebel.get(11).getText();
        String expectedResult = "(1) Record Found";
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(2000);


    }
}

















































