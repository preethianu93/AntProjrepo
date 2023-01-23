package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassOne {
  @Test
  public void methodOneA() {
	  System.out.println("Inside methodOneA of ClassOne");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Preethi\\eclipse-workspace\\ANTJanProj\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.google.com");
      driver.close();
  }
  
  
}
  
  
