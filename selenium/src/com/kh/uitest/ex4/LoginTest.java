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


		// ���̵�, ��й�ȣ �Է� ��� id�� �̿��ؼ� ������
		WebElement inputid = driver.findElement(By.id("id"));
		WebElement inputPwd = driver.findElement(By.id("pw"));

		inputid.sendKeys("test");
		inputPwd.sendKeys("123");

		// �α��� ��ư ��Ҹ� id�� �̿��ؼ� ������
		WebElement btn = driver.findElement(By.id("log.login"));

		// �α��� ��ư Ŭ��
		btn.click();

		// Thread.sleep()
		// ���� �۾����� �����带 ���� �ð� ���ߴ� �޼ҵ�

		String id = "test";
		String pw = "1234";

		for(int i=0; i<id.length(); i++) {
			inputid.sendKeys(id.charAt(i) + ""); // �� ���ھ� �Է�
			try {
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}


		}
		for(int i=0; i<pw.length(); i++) {
			inputPwd.sendKeys(pw.charAt(i) + ""); // �� ���ھ� �Է�
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// driver.close();

	}

}