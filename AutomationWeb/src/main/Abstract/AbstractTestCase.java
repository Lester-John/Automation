package Abstract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.PropertyHelper;

import org.junit.*;
public class AbstractTestCase {
	protected WebDriver driver;
	
	@Before
	public void ttBefore()
	{

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(PropertyHelper.ReadProperty("inputdata", "base.url"));
        driver.manage().window().maximize();
	}
	
	@After
	public void ttAfter()
	{
		driver.close();
		
	}
}
