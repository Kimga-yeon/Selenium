package com.kh.uitest.ex3.naver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naver_Xpath {	
	public static void main(String[] args) {
		// Ŭ���� �Ӽ��� �̿��Ͽ� ���̹� �α��� ȭ������ �̵� 
		
		// ũ�� ����̹� ��ġ ����
		System.setProperty("webdriver.chrome.driver", 
				"C:\\dev\\selenium\\chromedriver.exe");
		
		// ������̹� ��ü ����
		WebDriver driver = new ChromeDriver(); 
		
		// ���̹��� �̵�
		driver.get("https://naver.com");
		
		List<WebElement> btns = driver.findElements(By.className("link_login"));
		
		// Ŭ���� �̸����� ���� ��Ұ� � ���� Ȯ�� 
		System.out.println(btns.size());
		
		// ��Ұ� �ϳ� ���̶� 0�� �ε��� ��Ҹ� Ŭ���ϸ��
		btns.get(0).click();
		
		// driver.close();
		
		
		
		
	}
}
