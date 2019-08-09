package hudalyou.Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TutbyPage {

    private WebDriver driver;

    public TutbyPage(WebDriver dreiver){
       this.driver=dreiver;}

    private By input= By.xpath("//*[@id='authorize']/div/a");
    private By log= By.xpath("//*[@id='authorize']/div/div/div/form/div[2]/div/input");
    private By paswd= By.xpath("//*[@id='authorize']/div/div/div/form/div[3]/div/input");
    private By entr= By.xpath("//*[@id='authorize']/div/div/div/form/div[4]/input");
    private By nme= By.xpath("//*[@id='authorize']/div/a/span[1]");
    private By mil= By.xpath("//*[@id='authorize']/div/div/div/div/ul/li[2]/a");
    private By cnt= By.xpath("//*[@id='authorize']/div/div/div/div/ul/li[2]/span");

    public TutbyPage selectInput() {
        Util.find(driver, input).click();
        return this;
    }
    public TutbyPage setLogin(String origin) {
        WebElement setLog = Util.find(driver, log);
        setLog.sendKeys(origin);
        Util.shortWait(driver);
        return this;
    }
        public TutbyPage setPassword(String origin) {
        WebElement setPaswrd = Util.find(driver, paswd);
        setPaswrd.sendKeys(origin);
        return this;
    }
       public TutbyPage selectEnter (){
       Util.find(driver, entr).click();
       return this;
    }

    public String checktMail () {
        Util.shortWait(driver);
        Util.find(driver, nme).click();
        Util.shortWait(driver);

        System.out.print("Входящая " + Util.find(driver, mil).getText());
        System.out.println(". Новых писем: " + Util.find(driver, cnt).getText());
        WebElement count=driver.findElement(cnt);
        return (count.getText()) ;
    }

}
