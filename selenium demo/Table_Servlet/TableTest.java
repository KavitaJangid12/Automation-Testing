package com.example.selenium_demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTest {
	@Test
	public void tableTest(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/selenium-demo/table.html");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='empTable']//tr"));
		System.out.println(rows.size());
		int rowsize = rows.size()-1;
		Assertions.assertEquals(3, rowsize);
		driver.quit();
	}
}
