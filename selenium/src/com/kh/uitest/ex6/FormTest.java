package com.kh.uitest.ex6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {
	public static void main(String[] args) {
		
		// ũ�ҵ���̹� ��ġ ����
		System.setProperty("webdriver.chrome.driver",
							"c:/dev/selenium/chromedriver.exe");
		
		
		// webDriver��ü ����
		WebDriver driver = new ChromeDriver();
		
		
		
		// Ÿ�� ����Ʈ �ּ� ���� 
		driver.get("http://aclass.xyz:8081/Selenium/exam2/formTest.html");
		
		// �ڹ� ��ũ��Ʈ �ڵ� ȣ���� ���� ��ü ����
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		
		// �� input �±� ��Ҹ� ������(id)
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement passwd1 = driver.findElement(By.id("passwd1"));
		WebElement passwd2 = driver.findElement(By.id("passwd2"));
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement tel = driver.findElement(By.id("tel"));
		WebElement birthYear = driver.findElement(By.id("birthYear"));
		
		//radio, checkbox�� name�Ӽ��� �̿��Ͽ� ������
		// -> ���� name �Ӽ��� ��Ұ� ���� �� ���� -> List�� ��ȯ
		List<WebElement> schoolList = driver.findElements(By.name("school"));
		List<WebElement> interestList = driver.findElements(By.name("interest"));
		
		// ���� ��ҿ� ���ϴ� �� ���� 
		userId.sendKeys("User01");
		passwd1.sendKeys("asdf1234!");
		passwd2.sendKeys("asdf1234!");
		name.sendKeys("ȫ�浿");
		email.sendKeys("honggd@kh.or.kr");
		tel.sendKeys("01012345678");
		birthYear.sendKeys("2000");
		
		schoolList.get(2).click(); //����
		interestList.get(0).click(); //�ڹ�
		interestList.get(1).click(); //����Ŭ
		
		exe.executeScript("goSubmit()");
		
//		driver.close();
		
		
	}
}
