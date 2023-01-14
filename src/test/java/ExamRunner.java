import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ExamRunner extends Setup {
@Test(priority = 1)
public void Login(){
    driver.get("https://demoqa.com/");
    LoginPage loginPage=new LoginPage(driver);
    //loginPage.dologin("parvej@madina.co","madina@123");
}

@Test(priority = 2)
public  void coverpage (){


    List<WebElement> txtLabel= driver.findElements(By.tagName("img"));
    String welcomeMessage_Actual= txtLabel.get(1).getText();
    String welcomeMessage_Expected="toolsqa";
   // Assert.assertEquals(welcomeMessage_Actual,welcomeMessage_Expected)


}












}
