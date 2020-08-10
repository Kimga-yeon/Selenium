package com.kh.uitest.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_id {
	public static void main(String[] args) {
		
		// UI �׽�Ʈ -> �������� �̿��� �׽�Ʈ ���� 
		// ��������? HTML �ڵ带 �ؼ��ؼ� �����ִ� ���α׷�
		// HTML ��ҿ��� id �Ӽ��� ������
		// id �Ӽ��� �̿��Ͽ� ���ϴ� ��Ҹ� ã�Ƽ� ����
		
		// ***** ũ�ҵ���̹� ��ġ ����(�ʼ�)
		System.setProperty("webdriver.chrome.driver", 
							"C:\\dev\\selenium\\chromedriver.exe");
		
		// WebDriver��ü ���� == ������ Open + webDriver���� ������ ����� �ο�
		WebDriver driver = new ChromeDriver();
		
		// ������ ù �̵� �ּ� �ۼ�
		driver.get("https://naver.com");
		
		// ���̹� �˻�â�� "KH����������"�� �Է��Ͽ� �˻���ư Ŭ��
		
		// ����� ���̵� �̿��Ͽ� Ư�� ��Ҹ� ã�� ��� 
		// WebDriver.findElement(By.id("���̵� �Ӽ���"));
		//	--> �� �޼ҵ� ���� �� HTML ��Ұ� ��ȯ��.
		
		// ���̹� �˻�â ���̵� : query
		WebElement inputSearch = driver.findElement(By.id("query"));
		
		System.out.println("inputSearch : " + inputSearch);
		
		// ã�� �˻�â ��ҿ� �˻��ϰ��� �ϴ� ���� ����
		inputSearch.sendKeys("KH����������");
		
		// �˻� ��ư ã��
		// ���̹� �˻� ��ư ���̵� : search_btn
		WebElement searchBtn = driver.findElement(By.id("search_btn"));
		
		// �˻���ư Ŭ���ϱ�
		searchBtn.click();
		
		// driver.close();
		
	}
}
