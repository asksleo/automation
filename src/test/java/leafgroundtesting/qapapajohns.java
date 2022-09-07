package leafgroundtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class qapapajohns {
    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\IdeaProjects\\automation\\chromedriver.exe");
        WebDriver p = new ChromeDriver();
        p.manage().window().maximize();
        p.get("http://www.myhcl.com");
        String exp = "My HCL";
        p.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        p.findElement(By.xpath("//input[@id ='i0116']")).sendKeys("karan.kumar@hcl.com");
        p.findElement(By.xpath("//input[@id ='i0118']")).sendKeys("@Anamika2912");

        WebElement clk;
        while (true) {
        clk = p.findElement(By.xpath("//input[@id ='idSIButton9']"));
        clk.click();
        Thread.sleep(10000);
        if (p.getTitle().equalsIgnoreCase(exp)) {
            break;
        }

        }
        p.findElement(By.id("txtSearch")).sendKeys("itime");
        Thread.sleep(3000);
        Robot iti =new Robot();
        iti.keyPress(KeyEvent.VK_DOWN);
        iti.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);



    }}