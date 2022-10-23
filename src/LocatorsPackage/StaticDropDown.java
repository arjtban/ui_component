package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/arijit/Documents/SELENIUMJAVA/driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_form.asp");
		WebElement elm=driver.findElement(By.id("country"));
		Select dropdown=new Select(elm);
		System.out.println(dropdown.getFirstSelectedOption());
		dropdown.selectByVisibleText("Canada");

	}

}
