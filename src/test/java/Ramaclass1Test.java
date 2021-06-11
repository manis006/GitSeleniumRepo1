import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ramaclass1Test {
	WebDriver driver;
	
	@BeforeTest
	public void urlopen()
	{
		System.out.println("SriramaSitarama");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagam\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
	}
	
  @Test
  public void setup() {
	  
	  WebElement gsearch= driver.findElement(By.name("q"));
	  gsearch.sendKeys("java");
	  gsearch.sendKeys(Keys.ENTER);
	  
	  
  }
    @AfterTest 
    public void closeurl()
    {
    	
    	driver.quit();
    }
  
}
