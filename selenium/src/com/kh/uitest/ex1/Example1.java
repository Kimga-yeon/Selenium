package com.kh.uitest.ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) {
		// Selenium : UI �ڵ�ȭ �׽�Ʈ ���� 
		
		// UI �׽�Ʈ ���
		// 1) ����(����) �׽�Ʈ
		//		- ���� ������ ���� ���� �η°� �ð��� �Һ���.
		// 2) ����(�ڵ�) �׽�Ʈ
		// 		- ���� ������ ���� �Ҽ��� �η°� ���� �ð��� �Һ���.
		
		// ***** ũ���� �̿��� UI�ڵ�ȭ �׽�Ʈ ���� �� �ʼ� �ۼ� �ڵ�
		// -> ũ�� ����̹� ��ġ ���� �ڵ� �ۼ� 
		System.setProperty("webdriver.chrome.driver", 
						   "C:\\dev\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ũ�� �������� �׽�Ʈ ���� ������ ��.
		
		// ������ �ּ� �ۼ� 
		driver.get("https://naver.com");
		
		// driver.close();
		// close()�� �׽�Ʈ�� ���������� �����ٴ� ���� �ǹ�
		// ������ �ݵ�� �׽�Ʈ �ڵ� �������� �ʼ��� �ۼ��ؾ� ������ 
		// ����� ������ ���� Ȯ���ϱ� ���� �����߿��� �ּ� ó�� �ص� ��.
		
		
		
		
		
	}
}
