package com.kh.uitest.ex4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://naver.com");

		List<WebElement> btns = driver.findElements(By.xpath("//*[@id=\"account\"]/a"));

		if(btns.size() == 1) {
			btns.get(0).click();
		}else {
		}      


		// 아이디, 비밀번호 입력 요소 id를 이용해서 얻어오기
		WebElement inputid = driver.findElement(By.id("id"));
		WebElement inputPwd = driver.findElement(By.id("pw"));

		inputid.sendKeys("test");
		inputPwd.sendKeys("123");

		// 로그인 버튼 요소를 id를 이용해서 얻어오기
		WebElement btn = driver.findElement(By.id("log.login"));

		// 로그인 버튼 클릭
		btn.click();

		// Thread.sleep()
		// 현재 작업중인 스레드를 일정 시간 멈추는 메소드

		String id = "test";
		String pw = "1234";

		for(int i=0; i<id.length(); i++) {
			inputid.sendKeys(id.charAt(i) + ""); // 한 글자씩 입력
			try {
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}


		}
		for(int i=0; i<pw.length(); i++) {
			inputPwd.sendKeys(pw.charAt(i) + ""); // 한 글자씩 입력
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// driver.close();

	}

}