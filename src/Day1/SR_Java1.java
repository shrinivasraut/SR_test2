package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SR_Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching Guru99 correction");
		driver.get("https://www.guru99.com/");
		
		driver.close();
	}

}
