




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ExamRunner extends Setup {
@Test(priority = 1)
public void Login() throws InterruptedException {
    driver.get("https://opensource-demo.orangehrmlive.com/");

    Thread.sleep(2000);

    LoginPage loginPage=new LoginPage(driver);
    loginPage.dologin("Admin","admin123");
    driver.findElement(By.tagName("a")).click(); //Click PM
    driver.findElement(By.tagName("button")).click();//Add Click
    driver.findElement(By.className("oxd-input oxd-input--active orangehrm-firstname")).sendKeys("Papel"); //Frist Name
    driver.findElement(By.className("oxd-input oxd-input--active orangehrm-lastname")).sendKeys("Chandra");//Last Name
    driver.findElement(By.tagName("span")).click(); //Toggel click
    driver.findElement(By.tagName("input")).sendKeys("papel"); //Username
    List<WebElement> password= driver.findElements(By.className("type=password"));//Password
    password.get(0).click();
    List<WebElement> Confirmpassword= driver.findElements(By.className("type=password"));//ConfirmPassword
    Confirmpassword.get(1).click();
    List<WebElement> Save= driver.findElements(By.className("type=submit"));
    Save.get(0).click();//Save

    List<WebElement> txtLabel= driver.findElements(By.tagName("h6"));
    String welcomeMessage_Actual= txtLabel.get(0).getText();
    String welcomeMessage_Expected="PIM";
    Assert.assertEquals(welcomeMessage_Actual,welcomeMessage_Expected);



}
@Test(priority = 2)
public void PMSearch(){

    driver.findElement(By.tagName("a")).click();
    driver.findElement(By.tagName("input")).sendKeys("papel");
    List<WebElement> Searchbutton = driver.findElements(By.className("type=submit"));//Search
    Searchbutton.get(0).click();





}












}






























