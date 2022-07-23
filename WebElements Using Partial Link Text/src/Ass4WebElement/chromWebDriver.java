package Ass4WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromWebDriver {
	
	public WebDriver driver;

  @Test
  public void chrom() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\"
						+ "chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();

		// Navigate to a website
		driver.navigate().to("https://www.codingdojo.com/");

		// Mazimize current window
		driver.manage().window().maximize();

		// define the web element to find it
		WebElement partialLinkTextMethod = driver.findElement(By.partialLinkText("Onsite"));
		partialLinkTextMethod.click();
  }
}
