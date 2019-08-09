package hudalyou;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tut {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://tut.by");
        By input= By.xpath("//*[@id='authorize']/div/a");
        By log= By.xpath("//*[@id='authorize']/div/div/div/form/div[2]/div/input");
        By paswd= By.xpath("//*[@id='authorize']/div/div/div/form/div[3]/div/input");
        By entr= By.xpath("//*[@id='authorize']/div/div/div/form/div[4]/input");

        By nme= By.xpath("//*[@id='authorize']/div/a/span[1]");
        By mil= By.xpath("//*[@id='authorize']/div/div/div/div/ul/li[2]/a");
        By cnt= By.xpath("//*[@id='authorize']/div/div/div/div/ul/li[2]/span");

        WebElement auth=driver.findElement(input);
        auth.click();
        WebElement login=driver.findElement(log);
        login.sendKeys("iivnv");
        WebElement password=driver.findElement(paswd);
        Thread.sleep(500);
        password.sendKeys("iii555III");
        WebElement enter=driver.findElement(entr);
        enter.click();

        Thread.sleep(1000);

        WebElement name=driver.findElement(nme);
        name.click();
        WebElement mail=driver.findElement(mil);
      //  mail.click();
        System.out.print("Входящая "+ mail.getText());

        WebElement count=driver.findElement(cnt);
        System.out.println(". Новых писем: "+count.getText()+" шт.");

        //  Thread.sleep(5000);
       // WebElement count=driver.findElement(cnt);
       // count.click();

        Thread.sleep(500);
        driver.quit();
    }
}
