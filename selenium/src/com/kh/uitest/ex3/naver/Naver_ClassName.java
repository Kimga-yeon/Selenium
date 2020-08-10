package com.kh.uitest.ex3.naver;

import java.util.List;

import javax.xml.xpath.XPathExpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naver_ClassName {	
	public static void main(String[] args) {
		/* 
		 * xpath : W3C�� ǥ������ XML������ ������ ���� ��θ� �����ϴ� ��������
		 * 		   Path ���� ������ ������ ����Ͽ� �׸��� ��ġ�ϰ� 
		 * 		     ó���ϴ� ����� �����.
		 * XML(eXtensible Markup Language)
		 * 
		 * 
		 * */
		
		// Ŭ���� �Ӽ��� �̿��Ͽ� ���̹� �α��� ȭ������ �̵� 
		
		// ũ�� ����̹� ��ġ ����
		System.setProperty("webdriver.chrome.driver", 
				"C:\\dev\\selenium\\chromedriver.exe");
		
		// ������̹� ��ü ����
		WebDriver driver = new ChromeDriver();
		
		// ���̹��� �̵�
		driver.get("https://naver.com");
		
		
		List<WebElement> btns 
			= driver.findElements(By.xpath("//*[@id=\"account\"]/a"));
		// xpath(�����) : *[@id="account"]/a
		// full xpath(������) : /html/body/div[2]/div[3]/div[3]/div/div[2]/a
		
		
		
		
		// Ŭ���� �̸����� ���� ��Ұ� � ���� Ȯ�� 
		System.out.println(btns.size());
		
		if(btns.size() == 1) {  //���� ��Ұ� �ϳ��� ���
			btns.get(0).click();
		}else {
			// �˻� �۾� ���� �� �˸��� ���� ���� 
			
		}
		/*
		// ��Ұ� �ϳ� ���̶� 0�� �ε��� ��Ҹ� Ŭ���ϸ��
		btns.get(0).click();
		
		// driver.close();
		*/
		
		
		
	}
}
