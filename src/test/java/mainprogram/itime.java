package mainprogram;

import attributes.mainpage;
import attributes.methods;
import logon.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class itime {
    @Test

    public static void main(String args[]) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\IdeaProjects\\automation\\chromedriver.exe");
        WebDriver q = new ChromeDriver();
        q.manage().window().maximize();
        q.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
methods.url(q);
        String exp = "My HCL";
        PageFactory.initElements(q, login.class);
        login.login1.sendKeys("karan.kumar@hcl.com");
        login.password1.sendKeys("@Anamika2912");

       /* login.login(q).sendKeys("karan.kumar@hcl.com");
        login.password(q).sendKeys("@Anamika2912");*/
        while (true) {
            login.clk(q).click();
            Thread.sleep(10000);
            if (q.getTitle().equalsIgnoreCase(exp)) {
                break;
            }

        }
        mainpage.it(q).sendKeys("itime");
        Thread.sleep(3000);
        Robot iti =new Robot();
        iti.keyPress(KeyEvent.VK_DOWN);
        iti.keyPress(KeyEvent.VK_ENTER);
        iti.keyRelease(KeyEvent.VK_DOWN);
        iti.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        Robot r1 = new Robot();
        Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect1= new Rectangle(sc_size);
        BufferedImage source = r1.createScreenCapture(rect1);
        File desti = new File("I:\\screen2.jpg");
        ImageIO.write(source,"jpg", desti);
    }
}
