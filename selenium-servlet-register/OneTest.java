package com.example.servlet.selenium_servlet_register1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();  //import chrome
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
