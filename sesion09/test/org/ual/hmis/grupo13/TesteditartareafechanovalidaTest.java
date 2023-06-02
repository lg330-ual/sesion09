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
public class TesteditartareafechanovalidaTest {
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
  public void testeditartareafechanovalida() {
    // Test name: test-editar-tarea-fecha-no-valida
    // Step # | name | target | value
    // 1 | open | https://msdocs-core-sql-2023-ags000.azurewebsites.net/ | 
    driver.get("https://msdocs-core-sql-2023-ags000.azurewebsites.net/");
    // 2 | setWindowSize | 945x1012 | 
    driver.manage().window().setSize(new Dimension(945, 1012));
    // 3 | click | linkText=Create New | 
    driver.findElement(By.linkText("Create New")).click();
    // 4 | click | id=Description | 
    driver.findElement(By.id("Description")).click();
    // 5 | type | id=Description | Grabar canción
    driver.findElement(By.id("Description")).sendKeys("Grabar canción");
    // 6 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 7 | type | id=CreatedDate | 2023-06-13
    driver.findElement(By.id("CreatedDate")).sendKeys("2023-06-13");
    // 8 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 9 | click | linkText=Edit | 
    driver.findElement(By.linkText("Edit")).click();
    // 10 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 11 | type | id=CreatedDate | 2023-06-01
    driver.findElement(By.id("CreatedDate")).sendKeys("2023-06-01");
    // 12 | type | id=CreatedDate | 2023-01-01
    driver.findElement(By.id("CreatedDate")).sendKeys("2023-01-01");
    // 13 | type | id=CreatedDate | 0001-01-01
    driver.findElement(By.id("CreatedDate")).sendKeys("0001-01-01");
    // 14 | type | id=CreatedDate | 0012-01-01
    driver.findElement(By.id("CreatedDate")).sendKeys("0012-01-01");
    // 15 | type | id=CreatedDate | 0123-01-01
    driver.findElement(By.id("CreatedDate")).sendKeys("0123-01-01");
    // 16 | type | id=CreatedDate | 1234-01-01
    driver.findElement(By.id("CreatedDate")).sendKeys("1234-01-01");
    // 17 | type | id=CreatedDate | 12345-01-01
    driver.findElement(By.id("CreatedDate")).sendKeys("12345-01-01");
    // 18 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 19 | click | css=.form-group:nth-child(3) | 
    driver.findElement(By.cssSelector(".form-group:nth-child(3)")).click();
    // 20 | assertElementPresent | css=.form-group:nth-child(3) | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".form-group:nth-child(3)"));
      assert(elements.size() > 0);
    }
  }
}