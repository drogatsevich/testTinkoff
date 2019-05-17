package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;


public class Browsers implements IBrowser {

	WebDriver driver;

	@Override
	public void createWebDriver(BrowserType browserType) {
		DesiredCapabilities capabilities;
		switch (browserType) {
		case CHROME:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-infobars");
			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
			//capabilities.setCapability("pageLoadStrategy", "none");

			ChromeDriverService service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File( "drivers/chromedriver.exe"))
					.usingAnyFreePort().build();
			options.merge(capabilities);
			driver = new ChromeDriver(service, options);
			break;
		case EDGE:
			//TODO
		case FIREFOX:
			//TODO
		default:
			break;
		}

	}

	public WebDriver getDriver() {
		return driver;
	}

	public Browsers(BrowserType browserType) {
		createWebDriver(browserType);
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void openURL(String url) {
		driver.get("https://www.tinkoff.ru");
		driver.manage().window().maximize();
	}
	
	public void quit() {
		driver.quit();
	}

}
