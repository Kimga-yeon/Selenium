package com.kh.uitest.ex7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoardWriteExam2 {
	public static void main(String[] args) {
		// 크롬드라이버 위치 지정
		System.setProperty("webdriver.chrome.driver",
				"c:/dev/selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		// 묵시적(암시적) 대기 
		// - 웹 드라이버가 발생시키는 예외들에 대하여
		//   일정 시간동안 재시도하며 대기시키는 명령 
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://aclass.xyz:8081/Selenium/exam3/loginInput.html");
		
		WebElement inputId = driver.findElement(By.id("id"));
		WebElement inputpassword = driver.findElement(By.id("password"));
		
		inputId.sendKeys("test");
		inputpassword.sendKeys("test");
	
		// 취소 버튼 얻어와 클릭
		WebElement resetBtn = driver.findElement(By.id("resetBtn"));
		resetBtn.click();
		
		
	
	}
	
}
