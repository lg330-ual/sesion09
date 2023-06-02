// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TesteditartareafechavaciaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testeditartareafechavacia() {
    // Test name: test-editar-tarea-fecha-vacia
    // Step # | name | target | value
    // 1 | open | https://msdocs-core-sql-2023-ags000.azurewebsites.net/ | 
    driver.get("https://msdocs-core-sql-2023-ags000.azurewebsites.net/");
    // 2 | setWindowSize | 784x816 | 
    driver.manage().window().setSize(new Dimension(784, 816));
    // 3 | click | linkText=Create New | 
    driver.findElement(By.linkText("Create New")).click();
    // 4 | click | id=Description | 
    driver.findElement(By.id("Description")).click();
    // 5 | type | id=Description | Tarea
    driver.findElement(By.id("Description")).sendKeys("Tarea");
    // 6 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 7 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 8 | type | id=CreatedDate | 2023-06-16
    driver.findElement(By.id("CreatedDate")).sendKeys("2023-06-16");
    // 9 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 10 | click | linkText=Edit | 
    driver.findElement(By.linkText("Edit")).click();
    // 11 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 12 | type | id=CreatedDate | null
    driver.findElement(By.id("CreatedDate")).sendKeys("null");
    // 13 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 14 | mouseOver | css=.btn | 
    {
      WebElement element = driver.findElement(By.cssSelector(".btn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 15 | mouseOut | css=.btn | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 16 | click | css=.col-md-4 | 
    driver.findElement(By.cssSelector(".col-md-4")).click();
    // 17 | assertText | id=CreatedDate-error | The Created Date field is required.
    assertThat(driver.findElement(By.id("CreatedDate-error")).getText(), is("The Created Date field is required."));
  }
}