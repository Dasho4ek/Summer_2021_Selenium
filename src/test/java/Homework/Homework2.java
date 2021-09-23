package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework2 {

    @Test
    public void getTitle() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.facebook.com/");

        String pageTitle = driver.getTitle();
        System.out.println("Page title-" + pageTitle);
        driver.quit();
    }

        @Test
     public void getURL(){
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https:www.facebook.com/");

            String url= "https:www.facebook.com/";
            driver.navigate().to(url);
            driver.quit();

        }









}
