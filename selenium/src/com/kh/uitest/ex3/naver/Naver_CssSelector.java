package com.kh.uitest.ex3.naver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naver_CssSelector {	
	public static void main(String[] args) {
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
	
		
		
		List<WebElement> btn = driver.findElements(By.className("link_login"));
		
		// 클래스 이름으로 얻어온 요소가 몇개 인지 확인 
		System.out.println(btns.size());
		
		// 요소가 하나 뿐이라서 0번 인덱스 요소를 클릭하면됨
		btns.get(0).click();
		
		
		
		// 아이디, 비밀번호 입력 요소 id를 이용해서 얻어오기
		WebElement inputId = driver.findElement(By.id("id"));
		WebElement inputPw = driver.findElement(By.id("pw"));
		
		// 아이디, 비밀번호값 전달
		inputId.sendKeys("test");
		inputPw.sendKeys("1234");
		
		// 
		// driver.close();
		
	}
}
