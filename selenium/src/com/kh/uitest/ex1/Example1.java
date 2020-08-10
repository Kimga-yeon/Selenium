package com.kh.uitest.ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) {
		// Selenium : UI 자동화 테스트 도구 
		
		// UI 테스트 방법
		// 1) 정적(수동) 테스트
		//		- 좁은 범위에 대해 많은 인력과 시간을 소비함.
		// 2) 동적(자동) 테스트
		// 		- 넓은 범위에 대해 소수의 인력과 적은 시간을 소비함.
		
		// ***** 크롬을 이용한 UI자동화 테스트 진행 시 필수 작성 코드
		// -> 크롬 드라이버 위치 지정 코드 작성 
		System.setProperty("webdriver.chrome.driver", 
						   "C:\\dev\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 크롬 브라우저가 테스트 모드로 열리게 됨.
		
		// 브라우저 주소 작성 
		driver.get("https://naver.com");
		
		// driver.close();
		// close()는 테스트가 정상적으로 끝난다는 것을 의미
		// 원래는 반드시 테스트 코드 마지막에 필수로 작성해야 되지만 
		// 결과를 눈으로 직접 확인하기 위해 수업중에는 주석 처리 해둘 것.
		
		
		
		
		
	}
}
