package logon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
    @FindBy(id ="i0116")
    public static WebElement login1;

    @FindBy(id ="i0118")
    public static WebElement password1;
   /* public static WebElement login ( WebDriver q)
    {
        return q.findElement(By.xpath("//input[@id ='i0116']"));
    }

    // public static WebElement password ( WebDriver q)
    // {
    //    return q.findElement(By.xpath("//input[@id ='i0118']"));
    //
    // }*/
    public static WebElement clk(WebDriver q)
    {

            return q.findElement(By.xpath("//input[@id ='idSIButton9']"));
    }
}
