package com.scratch.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;

public class Way2Auto {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();

		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");

		List<WebElement> Country = driver.findElements(By.name("country"));

	//	Select select = new Select(Country);

		//List<WebElement> option = select.getAllSelectedOptions();
		
		for(int i = 0 ; i < Country.size();i++) {
			
			System.out.println(Country.get(i).getText());
			
			//option.get(i).getText();
		}
		
		driver.quit();

	}

}
