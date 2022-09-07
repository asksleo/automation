package leafgroundtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Array;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class irctc {
    public static void main(String args[]) throws InterruptedException {
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");



    System.setProperty("webdriver.chrome.driver","chromedriver.exe");



        WebDriver q = new ChromeDriver(o);
        q.manage().window().maximize();
        q.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        q.get("https://www.irctc.co.in/nget/train-search");


        q.findElement(By.id("messageDialogClose")).click();
        q.findElement(By.cssSelector("img[style='position: absolute; right: 98px; width: 16px; top: -2px; display: block;']")).click();
        q.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
        q.findElement(By.cssSelector("img[src='https://cdn.nlpcaptcha.in/cdn_images/cubebox/cross.png']")).click();

}}
