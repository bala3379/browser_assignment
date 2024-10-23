package assignment2;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Browsertest {
	WebDriver driver;
	@Parameters("browser")
	@Test
public void browser(String browser) throws MalformedURLException, InterruptedException, URISyntaxException
{
if (browser.equalsIgnoreCase("chrome"))
  {
     DesiredCapabilities dc =new DesiredCapabilities();
     dc.setPlatform(Platform.LINUX); dc.setBrowserName("chrome");
     driver = new RemoteWebDriver((new URI("http://localhost:4444")).toURL(), dc);
     System.out.println("Connected with Chrome Browser");
  }
 if (browser.equalsIgnoreCase("firefox"))
  {
	 DesiredCapabilities dc =new DesiredCapabilities();
	 dc.setPlatform(Platform.LINUX); dc.setBrowserName("firefox");
     driver = new RemoteWebDriver((new URI("http://localhost:4444")).toURL(), dc);
     System.out.println("Connected  with Firefox Browser");
  }
 if (browser.equalsIgnoreCase("MicrosoftEdge"))
  {
	 DesiredCapabilities dc =new DesiredCapabilities();
	 dc.setPlatform(Platform.LINUX); dc.setBrowserName("MicrosoftEdge");
     driver = new RemoteWebDriver((new URI("http://localhost:4444")).toURL(), dc);
     System.out.println("Connected with Edge Browser");
   }
     System.out.println("Remote driver is connected successfully");
     driver.get ("https://www.amazon.in");
     System.out.println("Application opened successfully");
     Thread.sleep(15000);
     System.out.println(driver.getTitle());
     driver.quit();
  }
  }