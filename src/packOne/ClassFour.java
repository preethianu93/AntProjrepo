package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassFour {
	@Test
	public void methodFourA() {
		 System.out.println("Inside methodFourA of ClassFour");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Preethi\\eclipse-workspace\\ANTJanProj\\drivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://www.yahoo.com");
	     driver.close();
	}

}
