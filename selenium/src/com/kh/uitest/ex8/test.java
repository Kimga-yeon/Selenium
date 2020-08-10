package com.kh.uitest.ex8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"c:/dev/selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.iei.or.kr/login/login.kh");
		
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		
		WebElement inputId = driver.findElement(By.id("id"));
		WebElement inputpassword = driver.findElement(By.id("password"));
		
		inputId.sendKeys("ailce2301");
		inputpassword.sendKeys("rkdus3941");
		
		exe.executeScript("fnLogin()");
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("KH정보교육원 - 수강생 평가"));
		
		exe.executeScript("javascript:location.href='/login/currBoard.kh'");
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("KH정보교육원 - 우리반 게시판"));
		
		
		exe.executeScript("fnWriteForm()");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("title")));
		
		WebElement inputTitle = driver.findElement(By.id("title"));
		inputTitle.sendKeys("밥");
		
		driver.switchTo().frame("tx_canvas_wysiwyg");
		
		List<WebElement> textArea = driver.findElements(By.className("tx-content-container"));
		
		if(textArea.size() == 1) {
			textArea.get(0).sendKeys("글 작성");
		}
		
		driver.switchTo().parentFrame();
		
	
		
		exe.executeScript("fnRegister()");
		
		driver.switchTo().alert().accept();
		
		System.out.println("Test 정상 종료");
		
		
	}
}
