package com.kh.uitest.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_id {
	public static void main(String[] args) {
		
		// UI 테스트 -> 브라우저를 이용해 테스트 진행 
		// 브라우저란? HTML 코드를 해석해서 보여주는 프로그램
		// HTML 요소에는 id 속성이 존재함
		// id 속성을 이용하여 원하는 요소를 찾아서 제어
		
		// ***** 크롬드라이버 위치 지정(필수)
		System.setProperty("webdriver.chrome.driver", 
							"C:\\dev\\selenium\\chromedriver.exe");
		
		// WebDriver객체 생성 == 브라우저 Open + webDriver에게 브라우저 제어권 부여
		WebDriver driver = new ChromeDriver();
		
		// 브라우저 첫 이동 주소 작성
		driver.get("https://naver.com");
		
		// 네이버 검색창에 "KH정보교육원"을 입력하여 검색버튼 클릭
		
		// 요소의 아이디를 이용하여 특정 요소를 찾는 방법 
		// WebDriver.findElement(By.id("아이디 속성값"));
		//	--> 위 메소드 수행 시 HTML 요소가 반환됨.
		
		// 네이버 검색창 아이디 : query
		WebElement inputSearch = driver.findElement(By.id("query"));
		
		System.out.println("inputSearch : " + inputSearch);
		
		// 찾은 검색창 요소에 검색하고자 하는 값을 전달
		inputSearch.sendKeys("KH정보교육원");
		
		// 검색 버튼 찾기
		// 네이버 검색 버튼 아이디 : search_btn
		WebElement searchBtn = driver.findElement(By.id("search_btn"));
		
		// 검색버튼 클릭하기
		searchBtn.click();
		
		// driver.close();
		
	}
}
