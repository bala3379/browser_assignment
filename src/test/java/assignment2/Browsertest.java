package assignment2;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Browsertest {
	WebDriver driver;
	@Test
	@Parameters("browser")
	
public void Crossbrowser(String browser) throws MalformedURLException,InterruptedException
{
if (browser.equalsIgnoreCase("Chrome") )
  {
     ChromeOptions options=new ChromeOptions();
     driver=new RemoteWebDriver(new URL("http://localhost:4444"),options) ;
     System.out.println("Connected with Chrome Browser");
  }
if (browser.equalsIgnoreCase("Firefox") )
  {
     FirefoxOptions options=new FirefoxOptions();
     driver=new RemoteWebDriver(new URL("http://localhost:4444"),options) ;
     System.out.println("Connected  with Firefox Browser");
  }
if (browser.equalsIgnoreCase("Edge") )
  {
     EdgeOptions options=new EdgeOptions();
     driver=new RemoteWebDriver(new URL("http://localhost:4444"),options) ;
     System.out.println("Connected with Edge Browser");
   }
     Thread.sleep(5000);
     driver.get ("https://www.amazon.in");
     Thread.sleep(3000);
     System.out.println("Application opened!");
     driver.quit();
  }
  }