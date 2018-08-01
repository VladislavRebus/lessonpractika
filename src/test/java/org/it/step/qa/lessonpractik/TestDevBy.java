package org.it.step.qa.lessonpractik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestDevBy {
    WebDriver webDriver;

    @BeforeClass
    public void initDriver() {
        System.out.println("Тестируем в Chrome");
        System.setProperty("webdriver.chrome.driver", "Z:\\QA 1-31018\\RebusVV\\lessonpractik\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @BeforeMethod
    public void openUrl() {
        webDriver.get("https://dev.by/registration");
    }

    @Test
    public void searchRegistration() {
        String searchKey = "VasyaPupkinson";
        String searchKey1 = "nezowoox@gmail.com";
        String searchKey2 = "qwerty12345";
        WebElement element = webDriver.findElement(By.id("user_username"));
        System.out.println("Вводим " + searchKey);
        element.sendKeys(searchKey);
        WebElement element1 = webDriver.findElement(By.id("user_email"));
        System.out.println("Вводим " + searchKey1);
        element1.sendKeys(searchKey1);
        WebElement element2 = webDriver.findElement(By.id("user_password"));
        System.out.println("Вводим " + searchKey2);
        element2.sendKeys(searchKey2);
        WebElement element3 = webDriver.findElement(By.id("user_password_confirmation"));
        System.out.println("Вводим " + searchKey2);
        element3.sendKeys(searchKey2);
        WebElement element4 = webDriver.findElement(By.id("user_agreement"));
        System.out.println("Ставим согласен");
        element4.click();
        WebElement element5 = webDriver.findElement(By.name("commit"));
        System.out.println("Жмем регистрация");
        element5.click();
        //Assert.assertTrue(webDriver.findElement(By.id("wob_loc")).isDisplayed());

    }

    @Test
    public void proverkaVvodaParolyaPodtverjdenia()  {
        String searchKey = "VasyaPupkins";
        String searchKey1 = "nezowoox@gmail.com";
        String searchKey2 = "qwerty12345";
        String searchKey3 = "qwerty12346";
        WebElement element = webDriver.findElement(By.id("user_username"));
        System.out.println("Вводим " + searchKey);
        element.sendKeys(searchKey);
        WebElement element1 = webDriver.findElement(By.id("user_email"));
        System.out.println("Вводим " + searchKey1);
        element1.sendKeys(searchKey1);
        WebElement element2 = webDriver.findElement(By.id("user_password"));
        System.out.println("Вводим " + searchKey2);
        element2.sendKeys(searchKey2);
        WebElement element3 = webDriver.findElement(By.id("user_password_confirmation"));
        System.out.println("Вводим " + searchKey2);
        element3.sendKeys(searchKey3);
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/div/div/div[1]/div[1]")).isDisplayed());
    }
    @Test
    public void proverkaVvodaImeni() {
        String searchKey = "admin";
        String searchKey1 = "nezowooxrty@gmail.com";
        String searchKey2 = "qwerty12345";
        WebElement element = webDriver.findElement(By.id("user_username"));
        System.out.println("Вводим " + searchKey);
        element.sendKeys(searchKey);
        WebElement element1 = webDriver.findElement(By.id("user_email"));
        System.out.println("Вводим " + searchKey1);
        element1.sendKeys(searchKey1);
        WebElement element2 = webDriver.findElement(By.id("user_password"));
        System.out.println("Вводим " + searchKey2);
        element2.sendKeys(searchKey2);
        WebElement element3 = webDriver.findElement(By.id("user_password_confirmation"));
        System.out.println("Вводим " + searchKey2);
        element3.sendKeys(searchKey2);
        WebElement element4 = webDriver.findElement(By.id("user_agreement"));
        System.out.println("Ставим согласен");
        element4.click();
        WebElement element5 = webDriver.findElement(By.name("commit"));
        System.out.println("Жмем регистрация");
        element5.click();
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div/div/div/ul/li")).isDisplayed());
    }
    @Test
    public void proverkaVvodaImeiuni() {
        WebElement element5 = webDriver.findElement(By.name("commit"));
        System.out.println("Жмем регистрация");
        element5.click();
        /*Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/div/div/div/div[1]")).isDisplayed());     //'ЭТО МОЙ ВАРИАНТ
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/div/div/div/div/div[1]")).isDisplayed());
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"new_user\"]/div[6]/div/div/div[1]/div[1]")).isDisplayed());
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"new_user\"]/div[6]/div/div/div[2]/div[1]")).isDisplayed());
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"new_user\"]/div[10]/div/div/span/div/div[1]")).isDisplayed());
*/
        List<WebElement> elements = webDriver.findElements(By.cssSelector(".formErrorContent"));   //'ЭТО ВАРИАНТ ПРЕПОДАВАТЕЛЯ , БОЛЕЕ КОРОТКИЙ И ИЗЯЩНИЙ И ЕМКОЙ ПО КОДУ
        Assert.assertEquals(elements.size(),5,"Ожидаемое количество");
    }
    /*@AfterClass
    public void clouseDriver() {
        webDriver.close();
    }*/
}
