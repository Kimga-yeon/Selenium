package com.kh.uitest.ex7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoardWriteExam {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"c:/dev/selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// 명시적 대기 
		// - 명시적 대기 명령으로 조금 더 상세하게 
		//   특정 요소가 특정 상태가 되는것을 
		//   감지할 때 까지 대기시키는 명령어
		
		// 명시적 대기 명령으로 삼을 수 있는 조건
		// 1. 특정 요소가 클릭이 가능할 때 까지 대기.
		// 2. 페이지 제목이 특정 문자열이 될 때 까지  대기.
		// 3. alert창이 뜰 때까지 대기 
		
		// 명시적 대기 시 사용 할 객체 선언 및 생성
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// -> 명시적 대기가 설정된 경우 driver 객체를 10초간 대기시켜라 
		
		// 타겟 사이트 주소 작성
		driver.get("http://aclass.xyz:8081/Selenium/exam3/loginInput.html");
		
		// 자바 스크립트 호출을 위한 객체 선언
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		
		// 로그인 페이지 - 로그인 하기 
		WebElement inputId = driver.findElement(By.id("id"));
		WebElement inputPassword = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
					
		inputId.sendKeys("test");
		inputPassword.sendKeys("test");
		
		// 로그인 방법
		// 1) 로그인 버튼 클릭
//		loginBtn.click();
		
		// 2) fnLogin() 함수 호출
		exe.executeScript("fnLogin()");
		
		// **명시적 대기
		// 웹 페이지 제목이 "훈련생도 평가"라고 표시될 때 까지 명시적 대기 
		wait.until(ExpectedConditions.titleContains("훈련생도 평가"));
		
		
		// 자바스크립트 코드를 이용해서 "훈련생도 평가" 버튼 클릭하기 
		exe.executeScript("javascript:location.href='currBoard.html'");
		
		
		// 웹 페이지 제목이 "우리반 게시판" 이라고 표시 될 때 까지 명시적 대기 
		wait.until(ExpectedConditions.titleContains("우리반 게시판"));
		
		// 게시판 글쓰기 시작 버튼 클릭시 수행되는 함수 호출 
		exe.executeScript("fnWriteForm()");
		
		
		// ** 명시적 대기
		// title이라는 id 속성 값을 가진 요소가 표시될 떄까지 대기
		wait.until(ExpectedConditions.elementToBeClickable(By.id("title")));
		
		
		WebElement inputTitle = driver.findElement(By.id("title"));
		inputTitle.sendKeys("글제목 - 안녕하세요?");
		
		// 태그의 name이 iframeMsg 인 iframe 태그로 포커스 이동
		driver.switchTo().frame("iframeMsg");
		
		List<WebElement> textArea = driver.findElements(By.className("areaMsg"));
		
		if(textArea.size() == 1) {
			textArea.get(0).sendKeys("iframe내부에 글 작성 중");
			
		}
		
		// driver의 포커스를 부모 프레임으로 이동
		driver.switchTo().parentFrame();
		
		// 회원 가입 버튼이 있는 함수 호출
		exe.executeScript("fnRegister()");
		
		// alert 창 닫기
		driver.switchTo().alert().accept();
		
		System.out.println("Test 정상 종료");
		
		//driver.close();
		
		
				
	}
}
