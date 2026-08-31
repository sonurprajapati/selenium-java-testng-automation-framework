import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class test {

    @Test
    public void verifyTitle() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://webdriveruniversity.com/index.html");

        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertTrue(
            title.contains("WebDriverUniversity"),
            "Title does not contain QubeHealth"
        );

        // driver.findElements(By.xpath("//*[contains(text(), 'CONTACT US')]")).get(0).click();
        // driver.findElement(By.id("contact-us")).click();

        // String originalWindow = driver.getWindowHandle();
        // WebElement contactUs = driver.findElement(By.id("contact-us"));
        // new Actions(driver)
        // .scrollToElement(contactUs)
        // .click(contactUs)
        // .perform();
        // for (String window : driver.getWindowHandles()) {
        //     if (!window.equals(originalWindow)) {
        //         driver.switchTo().window(window);
        //         break;
        //     }
        // }
        // driver.findElements(By.className("feedback-input")).get(0).sendKeys("Sonua");
        // driver.findElement(By.name("last_name")).sendKeys("Prajap");
        // driver.findElements(By.tagName("input")).get(2).sendKeys("sonurprajapa@gmailc.ocm");
        // driver.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("Hello World");
        // Thread.sleep(2000);
        // // driver.findElement(By.xpath("//input[@type='reset']")).click();
        // driver.findElement(By.cssSelector("input[type='submit']")).click();
        // driver.findElement(By.xpath("//*[contains(text(), '← Back to Homepage')]")).click();
        // Thread.sleep(2000);
        // driver.close();
        // driver.switchTo().window(originalWindow);

        // String originalWindow = driver.getWindowHandle();
        // WebElement contactUs = driver.findElement(By.id("to-do-list"));
        // new Actions(driver)
        // .scrollToElement(contactUs)
        // .click(contactUs)
        // .perform();
        // for (String window : driver.getWindowHandles()) {
        //     if (!window.equals(originalWindow)) {
        //         driver.switchTo().window(window);
        //         break;
        //     }
        // }
        // Thread.sleep(1000);
        // driver.findElement(By.xpath("//input[@placeholder='Add new todo']")).sendKeys("Hello Note", Keys.ENTER);
        // Thread.sleep(1000);
        // WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Hello Note')]"));
        // Actions ac = new Actions(driver);
        // ac.moveToElement(element).perform();
        // driver.findElement(By.xpath("//*[contains(text(), 'Hello Note')]")).click();
        // List<WebElement> del =  driver.findElements(By.xpath("//li/span/i"));
        // Thread.sleep(1000);
        // del.get(del.size() - 1).click();
        // Thread.sleep(1000);
        // List<WebElement> todoList = driver.findElements(By.xpath("//li"));
        // todoList.get(todoList.size()-1).click();
        // Thread.sleep(1000);

        // String originalWindow = driver.getWindowHandle();
        // WebElement contactUs = driver.findElement(By.xpath("//*[contains(text(), 'FILE UPLOAD')]"));
        // new Actions(driver)
        // .scrollToElement(contactUs)
        // .click(contactUs)
        // .perform();
        // for (String window : driver.getWindowHandles()) {
        //     if (!window.equals(originalWindow)) {
        //         driver.switchTo().window(window);
        //         break;
        //     }
        // }
        // Thread.sleep(2000);
        // File helo = new File("assets/Hello World.txt");
        // driver.findElement(By.id("myFile")).sendKeys(helo.getAbsolutePath());
        // driver.findElement(By.cssSelector("input[type='submit']")).click();
        // driver.switchTo().alert().dismiss();      
        
        String originalWindow = driver.getWindowHandle();
        WebElement contactUs = driver.findElement(By.id("actions"));
        new Actions(driver)
        .scrollToElement(contactUs)
        .click(contactUs)
        .perform();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        Thread.sleep(1000);
        WebElement dr1 = driver.findElement(By.xpath("//*[contains(text(), 'DRAG ME TO MY TARGET!')]"));
        WebElement dr2 = driver.findElement(By.xpath("//*[contains(text(), 'DROP HERE!')]"));
        new Actions(driver).dragAndDrop(dr1, dr2).perform();
        Thread.sleep(1000);

        WebElement dblClick = driver.findElement(By.xpath("//div[@id='double-click']"));
        new Actions(driver).doubleClick(dblClick).perform();
        Thread.sleep(1000);

        WebElement clkHold = driver.findElement(By.cssSelector("div[id='click-box']"));
        new Actions(driver).clickAndHold(clkHold).pause(Duration.ofSeconds(4)).release().perform();

        WebElement hover = driver.findElement(By.xpath("//*[contains(text(), 'Hover Over Me First!')]"));
        new Actions(driver).moveToElement(hover).perform();


        Thread.sleep(2000);
        driver.quit();
    }
}