package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class WikiPushpa extends BaseClass{
	public WikiPushpa() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[@id='mw-content-text']/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")
	static WebElement ReleaseDate;

	@FindBy(xpath = "//*[@id='mw-content-text']/div[1]/table[1]/tbody/tr[14]/td")
	static WebElement CountryName;

	public static WebElement getReleaseDate() {
		return ReleaseDate;
	}

	public static WebElement getCountryName() {
		return CountryName;
	}

	

}
