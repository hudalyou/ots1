package hudalyou;

import hudalyou.Tools.TutbyPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void controlMail() throws Exception {
        driver.get("http://tut.by");

        TutbyPage tutbyPage = new TutbyPage(driver);

        TutbyPage resultPage = tutbyPage
                .selectInput()
                .setLogin("iivnv")
                .setPassword("iii555III")
                .selectEnter();

       String result= tutbyPage.checktMail();
       // System.out.println(result);
       Assert.assertTrue(result != null);
    }
@AfterMethod
public void tearDownBrowser() {
    driver.quit();
}
}
