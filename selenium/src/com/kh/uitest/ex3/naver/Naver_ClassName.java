package com.kh.uitest.ex3.naver;

import java.util.List;

import javax.xml.xpath.XPathExpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naver_ClassName {	
	public static void main(String[] args) {
		/* 
		 * xpath : W3C의 표준으로 XML문서의 구조를 통해 경로를 지정하는 구문으로
		 * 		   Path 위에 지정한 구문을 사용하여 항목을 배치하고 
		 * 		     처리하는 방법을 기술함.
		 * XML(eXtensible Markup Language)
		 * 
		 * 
		 * */
		
		// 클래스 속성을 이용하여 네이버 로그인 화면으로 이동 
		
		// 크롬 드라이버 위치 지정
		System.setProperty("webdriver.chrome.driver", 
				"C:\\dev\\selenium\\chromedriver.exe");
		
		// 웹드라이버 객체 생성
		WebDriver driver = new ChromeDriver();
		
		// 네이버로 이동
		driver.get("https://naver.com");
		
		
		List<WebElement> btns 
			= driver.findElements(By.xpath("//*[@id=\"account\"]/a"));
		// xpath(상대경로) : *[@id="account"]/a
		// full xpath(절대경로) : /html/body/div[2]/div[3]/div[3]/div/div[2]/a
		
		
		
		
		// 클래스 이름으로 얻어온 요소가 몇개 인지 확인 
		System.out.println(btns.size());
		
		if(btns.size() == 1) {  //얻어온 요소가 하나일 경우
			btns.get(0).click();
		}else {
			// 검사 작업 진행 후 알맞은 내용 선택 
			
		}
		/*
		// 요소가 하나 뿐이라서 0번 인덱스 요소를 클릭하면됨
		btns.get(0).click();
		
		// driver.close();
		*/
		
		
		
	}
}
