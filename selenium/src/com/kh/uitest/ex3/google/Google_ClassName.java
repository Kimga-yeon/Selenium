package com.kh.uitest.ex3.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_ClassName {
	public static void main(String[] args) {
		// ***** 크롬 드라이버 위치 지정(필수)
		System.setProperty("webdriver.chrome.driver", 
				"C:\\dev\\selenium\\chromedriver.exe");
		// 웹드라이버 객체 생성 + 브라우저 오픈 + 제어권 양도
		WebDriver driver = new ChromeDriver();
		
		// google로 이동 
		driver.get("https://google.com");
		
		// KH 정보교육원 검색 동작 만들기
		
		// 검색창 클래스 속성값을 이용하여 요소 찾기 
		WebElement inputSearch = 
				driver.findElement(By.className("gLFyf"));
		
		// findElement() : 요소 하나만 찾음. 여러개가 있을 경우 제일 첫 번째 요소 반환
		// findElements() : 해당되는 요소를 모두 찾아 List로 반환 
		
		// 검색창에 "KH정보교육원" 입력하기
		inputSearch.sendKeys("KH정보교육원");
		
		// form 태그 내부 input태그에서 엔터 입력 시 submit이 수행됨.
		
		inputSearch.submit();
		
		// driver.close();
		
		
	}
}
