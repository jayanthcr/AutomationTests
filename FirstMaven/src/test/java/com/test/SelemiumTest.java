package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelemiumTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://uitestingplayground.com/dynamictable");
		driver.navigate().refresh(); // first refresh

	}

}
