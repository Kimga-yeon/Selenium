package com.kh.uitest.ex6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {
	public static void main(String[] args) {
		
		// 크롬드라이버 위치 지정
		System.setProperty("webdriver.chrome.driver",
							"c:/dev/selenium/chromedriver.exe");
		
		
		// webDriver객체 생성
		WebDriver driver = new ChromeDriver();
		
		
		
		// 타겟 사이트 주소 지정 
		driver.get("http://aclass.xyz:8081/Selenium/exam2/formTest.html");
		
		// 자바 스크립트 코드 호출을 위한 객체 생성
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		
		// 각 input 태그 요소를 얻어오기(id)
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement passwd1 = driver.findElement(By.id("passwd1"));
		WebElement passwd2 = driver.findElement(By.id("passwd2"));
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement tel = driver.findElement(By.id("tel"));
		WebElement birthYear = driver.findElement(By.id("birthYear"));
		
		//radio, checkbox를 name속성을 이용하여 얻어오기
		// -> 같은 name 속성의 요소가 여러 개 존재 -> List로 반환
		List<WebElement> schoolList = driver.findElements(By.name("school"));
		List<WebElement> interestList = driver.findElements(By.name("interest"));
		
		// 얻어온 요소에 원하는 값 전달 
		userId.sendKeys("User01");
		passwd1.sendKeys("asdf1234!");
		passwd2.sendKeys("asdf1234!");
		name.sendKeys("홍길동");
		email.sendKeys("honggd@kh.or.kr");
		tel.sendKeys("01012345678");
		birthYear.sendKeys("2000");
		
		schoolList.get(2).click(); //대졸
		interestList.get(0).click(); //자바
		interestList.get(1).click(); //오라클
		
		exe.executeScript("goSubmit()");
		
//		driver.close();
		
		
	}
}
