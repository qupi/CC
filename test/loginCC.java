/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author quang.tran
 */
public class loginCC extends SeleneseTestBas{
   
    @Test
    public void loginCC() {
      WebDriver driver  = new FirefoxDriver();
      driver.get("http://sqa.stackexchange.com/questions/13213/how-to-configure-selenium-webdriver-with-netbeans");
      WebElement acceptAnswerLink = driver.findElement(By.id("vote-accepted-13214"));
      acceptAnswerLink.click();  
    driver.quit();
    System.out.println("execute done");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
