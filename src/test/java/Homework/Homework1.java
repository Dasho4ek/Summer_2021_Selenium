package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Homework 1");

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get ("https://www.facebook.com/");




    }


}
