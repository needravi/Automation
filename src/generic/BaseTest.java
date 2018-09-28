package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(Result.class)

public abstract class BaseTest implements IAutoConst {
	
	public WebDriver driver;
	
	public String url=Utility.getPropertyValue(CONFIG_PATH,"URL");
	
	String ITO=Utility.getPropertyValue(CONFIG_PATH, "ITO");
	public long duration=Long.parseLong(ITO);
	
		static {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		}

		@Parameters({"ip","browser"})
		
	@BeforeMethod 
		public void openApp(@Optional("localhost")String ip,@Optional("chrome")String browser) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		driver.get(url);

	}
		
	@AfterMethod
	public void closeApp(ITestResult result) {
		String name = result.getName();
		int status = result.getStatus();
		if(status == 2) {
			Reporter.log(name,true);
			Utility.getphoto(driver, PHOTO_PATH);
		}
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
	
}
