package generic;

public interface IAutoConst {
	 String CHROME_KEY="webdriver.chrome.driver"; // public static final is not mandatory
	 String CHROME_VALUE="./drivers/chromedriver.exe";

	public static final String GECKO_KEY="webdriver.gecko.driver";
	public static final String GECKO_VALUE="./drivers/FireFoxdriver.exe";
	
	String CONFIG_PATH = "./config.properties";
	String SUMMARY_PATH= "./result/Summary.xlsx";
}
