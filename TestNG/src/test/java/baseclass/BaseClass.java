package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmodel.WikiPushpa;

public class BaseClass {
	public static WebDriver driver;
	@Test(priority =0)
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		PageFactory.initElements(driver,WikiPushpa.class);
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	}
	@Test(priority =1)
	public void CheckReleaseDate() {
		String releaseDate1 = WikiPushpa.getReleaseDate().getText();
		System.out.println(releaseDate1);
		Assert.assertEquals("17 December 2021", releaseDate1);
	}
	@Test(priority =2)
	public void CheckCountryName() {
		String countryName1 = WikiPushpa.getCountryName().getText();
		System.out.println(countryName1);
		Assert.assertEquals("India", countryName1);
	}
	@Test(priority =3)
	public void closeBrowser() {
		driver.close();
	}
}
