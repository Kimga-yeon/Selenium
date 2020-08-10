package com.kh.uitest.ex3.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_ClassName {
	public static void main(String[] args) {
		// ***** ũ�� ����̹� ��ġ ����(�ʼ�)
		System.setProperty("webdriver.chrome.driver", 
				"C:\\dev\\selenium\\chromedriver.exe");
		// ������̹� ��ü ���� + ������ ���� + ����� �絵
		WebDriver driver = new ChromeDriver();
		
		// google�� �̵� 
		driver.get("https://google.com");
		
		// KH ���������� �˻� ���� �����
		
		// �˻�â Ŭ���� �Ӽ����� �̿��Ͽ� ��� ã�� 
		WebElement inputSearch = 
				driver.findElement(By.className("gLFyf"));
		
		// findElement() : ��� �ϳ��� ã��. �������� ���� ��� ���� ù ��° ��� ��ȯ
		// findElements() : �ش�Ǵ� ��Ҹ� ��� ã�� List�� ��ȯ 
		
		// �˻�â�� "KH����������" �Է��ϱ�
		inputSearch.sendKeys("KH����������");
		
		// form �±� ���� input�±׿��� ���� �Է� �� submit�� �����.
		
		inputSearch.submit();
		
		// driver.close();
		
		
	}
}
