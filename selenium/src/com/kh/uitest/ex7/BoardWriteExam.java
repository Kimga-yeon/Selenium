package com.kh.uitest.ex7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoardWriteExam {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"c:/dev/selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// ����� ��� 
		// - ����� ��� ������� ���� �� ���ϰ� 
		//   Ư�� ��Ұ� Ư�� ���°� �Ǵ°��� 
		//   ������ �� ���� ����Ű�� ��ɾ�
		
		// ����� ��� ������� ���� �� �ִ� ����
		// 1. Ư�� ��Ұ� Ŭ���� ������ �� ���� ���.
		// 2. ������ ������ Ư�� ���ڿ��� �� �� ����  ���.
		// 3. alertâ�� �� ������ ��� 
		
		// ����� ��� �� ��� �� ��ü ���� �� ����
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// -> ����� ��Ⱑ ������ ��� driver ��ü�� 10�ʰ� �����Ѷ� 
		
		// Ÿ�� ����Ʈ �ּ� �ۼ�
		driver.get("http://aclass.xyz:8081/Selenium/exam3/loginInput.html");
		
		// �ڹ� ��ũ��Ʈ ȣ���� ���� ��ü ����
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		
		// �α��� ������ - �α��� �ϱ� 
		WebElement inputId = driver.findElement(By.id("id"));
		WebElement inputPassword = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
					
		inputId.sendKeys("test");
		inputPassword.sendKeys("test");
		
		// �α��� ���
		// 1) �α��� ��ư Ŭ��
//		loginBtn.click();
		
		// 2) fnLogin() �Լ� ȣ��
		exe.executeScript("fnLogin()");
		
		// **����� ���
		// �� ������ ������ "�Ʒû��� ��"��� ǥ�õ� �� ���� ����� ��� 
		wait.until(ExpectedConditions.titleContains("�Ʒû��� ��"));
		
		
		// �ڹٽ�ũ��Ʈ �ڵ带 �̿��ؼ� "�Ʒû��� ��" ��ư Ŭ���ϱ� 
		exe.executeScript("javascript:location.href='currBoard.html'");
		
		
		// �� ������ ������ "�츮�� �Խ���" �̶�� ǥ�� �� �� ���� ����� ��� 
		wait.until(ExpectedConditions.titleContains("�츮�� �Խ���"));
		
		// �Խ��� �۾��� ���� ��ư Ŭ���� ����Ǵ� �Լ� ȣ�� 
		exe.executeScript("fnWriteForm()");
		
		
		// ** ����� ���
		// title�̶�� id �Ӽ� ���� ���� ��Ұ� ǥ�õ� ������ ���
		wait.until(ExpectedConditions.elementToBeClickable(By.id("title")));
		
		
		WebElement inputTitle = driver.findElement(By.id("title"));
		inputTitle.sendKeys("������ - �ȳ��ϼ���?");
		
		// �±��� name�� iframeMsg �� iframe �±׷� ��Ŀ�� �̵�
		driver.switchTo().frame("iframeMsg");
		
		List<WebElement> textArea = driver.findElements(By.className("areaMsg"));
		
		if(textArea.size() == 1) {
			textArea.get(0).sendKeys("iframe���ο� �� �ۼ� ��");
			
		}
		
		// driver�� ��Ŀ���� �θ� ���������� �̵�
		driver.switchTo().parentFrame();
		
		// ȸ�� ���� ��ư�� �ִ� �Լ� ȣ��
		exe.executeScript("fnRegister()");
		
		// alert â �ݱ�
		driver.switchTo().alert().accept();
		
		System.out.println("Test ���� ����");
		
		//driver.close();
		
		
				
	}
}
