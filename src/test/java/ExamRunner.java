import org.testng.annotations.Test;

public class ExamRunner extends Setup {
@Test
public void Login(){
    driver.get("https://demoqa.com/");
    LoginPage loginPage=new LoginPage(driver);
    loginPage.dologin("parvej@madina.co","madina@123");
}











}
