package com.kh.uitest.ex7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoardWriteExam2 {
	public static void main(String[] args) {
		// ũ�ҵ���̹� ��ġ ����
		System.setProperty("webdriver.chrome.driver",
				"c:/dev/selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		// ������(�Ͻ���) ��� 
		// - �� ����̹��� �߻���Ű�� ���ܵ鿡 ���Ͽ�
		//   ���� �ð����� ��õ��ϸ� ����Ű�� ��� 
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://aclass.xyz:8081/Selenium/exam3/loginInput.html");
		
		WebElement inputId = driver.findElement(By.id("id"));
		WebElement inputpassword = driver.findElement(By.id("password"));
		
		inputId.sendKeys("test");
		inputpassword.sendKeys("test");
	
		// ��� ��ư ���� Ŭ��
		WebElement resetBtn = driver.findElement(By.id("resetBtn"));
		resetBtn.click();
		
		
	
	}
	
}
