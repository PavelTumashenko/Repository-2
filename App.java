package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public boolean searchValeryKharlamov()
    {
    	String exePath = "D:\\Selenium Web Driver\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    WebDriver driver = new ChromeDriver();

	    driver.get("http://www.mail.ru");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebElement search = driver.findElement(By.xpath("//input[@class=\"input search__input i-no-right-radius\"]"));
	    search.sendKeys("Валерий Харламов");
	    search.click();
	    
	    WebElement button = driver.findElement(By.xpath("//input[@class=\"btn btn_orange search__btn i-no-left-radius\"]"));
	    button.click();
	    
	    WebElement Name = driver.findElement(By.xpath("//div[@class=\"icard-info__ttl \"]"));
	    return Name.isDisplayed();
    }

}