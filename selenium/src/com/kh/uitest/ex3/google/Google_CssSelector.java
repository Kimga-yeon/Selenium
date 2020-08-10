package com.kh.uitest.ex3.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_CssSelector {
	public static void main(String[] args) {
		// ***** ũ�� ����̹� ��ġ ����(�ʼ�)
		System.setProperty("webdriver.chrome.driver", 
				"C:\\dev\\selenium\\chromedriver.exe");
		// ������̹� ��ü ���� + ������ ���� + ����� �絵
		WebDriver driver = new ChromeDriver();
		
		// google�� �̵� 
		driver.get("https://google.com");
		
		// KH ���������� �˻� ���� �����
		
		// �˻�â�� css selector(������)�� �̿��Ͽ� ã�� 
		// # . > (����) �� ���� css�����ڸ� �̿��Ͽ� ��� ã��
		String sel = ".gLFyf.gsfi";
		
		
		WebElement inputSearch 
		 	= driver.findElement(By.cssSelector(sel));
		
		inputSearch.sendKeys("KH����������");
		inputSearch.submit();
		
		// driver.close();
	
		
	}
}
