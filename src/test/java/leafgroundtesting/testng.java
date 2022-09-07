package leafgroundtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import javax.swing.*;
import java.awt.*;
import java.util.List;


class testng {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\karan\\IdeaProjects\\automation\\chromedriver.exe");
        WebDriver p =new ChromeDriver();

                p.get("http://www.leafground.com/pages/Dropdown.html");
        Thread.sleep(1000);
                WebElement drop1 = p.findElement(By.id("dropdown1"));
        Select odrop = new Select(drop1);
        odrop.selectByIndex(1);
        Thread.sleep(1000);
        WebElement drop2 = p.findElement(By.name("dropdown2"));
        Select odrop1 = new Select(drop2);
        odrop1.selectByVisibleText("Selenium");
        Thread.sleep(1000);
        WebElement drop3 = p.findElement(By.name("dropdown3"));
        Select odrop2 = new Select(drop3);
        odrop2.selectByValue("2");
        Thread.sleep(1000);
        WebElement drop4 =  p.findElement(By.xpath("//*[@class ='dropdown']"));
        Select odrop3 = new Select(drop3);
        List<WebElement> count =  odrop3.getOptions();
        System.out.println("size of get option is " + count.size());
        Thread.sleep(1000);
        p.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select")).sendKeys("s");
        Thread.sleep(1000);
        List<WebElement> drop5 = p.findElements(By.xpath("//options[@value='0']"));
        int y = drop5.size();
        for(int i =0;i<y;i++)
        {
            drop5.get(i).click();
        break;
        }
              System.out.println("size of element is"+ y);
































    }
}
