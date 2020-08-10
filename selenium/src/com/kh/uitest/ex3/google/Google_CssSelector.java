package com.kh.uitest.ex3.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_CssSelector {
	public static void main(String[] args) {
		// ***** 크롬 드라이버 위치 지정(필수)
		System.setProperty("webdriver.chrome.driver", 
				"C:\\dev\\selenium\\chromedriver.exe");
		// 웹드라이버 객체 생성 + 브라우저 오픈 + 제어권 양도
		WebDriver driver = new ChromeDriver();
		
		// google로 이동 
		driver.get("https://google.com");
		
		// KH 정보교육원 검색 동작 만들기
		
		// 검색창을 css selector(선택자)를 이용하여 찾기 
		// # . > (띄어쓰기) 와 같이 css선택자를 이용하여 요소 찾기
		String sel = ".gLFyf.gsfi";
		
		
		WebElement inputSearch 
		 	= driver.findElement(By.cssSelector(sel));
		
		inputSearch.sendKeys("KH정보교육원");
		inputSearch.submit();
		
		// driver.close();
	
		
	}
}
