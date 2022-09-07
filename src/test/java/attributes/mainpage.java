package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainpage {
    public static WebElement it(WebDriver q)
    {
        return q.findElement(By.id("txtSearch"));
    }

}
