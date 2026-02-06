package com.example.selenium_demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RadioTest {
	@Test
	public void radioTest(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/selenium-demo/radiobutton.html");
		List<WebElement> radios=driver.findElements(By.name("gender"));
		for(WebElement radio:radios) {
			if(radio.getAttribute("value").equals("Male")) {
				radio.click();
				break;
			}
		}
		driver.findElement(By.id("submit")).click();
		Assertions.assertTrue(driver.getPageSource().contains("Male"));
		driver.quit();
	}
}
