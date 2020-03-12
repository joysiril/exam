package Basicclass;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launch {
	
	public WebDriver lanc() {
		
		String   downloadPath = System.getProperty("user.dir") + File.separator + "downloads";
		System.out.println(downloadPath);

		// setting download path directory
		Map<String, String> prefs = new HashMap<String, String>();
		prefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
	System.setProperty("Webdriver.chrome.Driver","chromedriver.exe");
	WebDriver dr=new ChromeDriver(options);
	dr.get("https://www.selenium.dev/");
	dr.manage().window().maximize();
	return dr;
	}

}
