package com.kh.uitest.ex5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\selenium\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://aclass.xyz:8081/Selenium/exam1/iframeTest.html");
        
        // iframe ���ο� �ִ� ��Ҵ� �˻��� �Ұ�����
        //  -> iframe�� ������ �������� �� ȭ���� �����ִ� ���̱� ������
        //     ��������δ� �ٸ� ������
        
        // iframe ���ο� �ִ� ��Ҹ� ã�� ���
        // WebDriver.switchTo().frame("�����Ӹ�")
        //  -> ������ ���������� ���� ��Ŀ���� �Űܶ�
        driver.switchTo().frame("subIframe");
        
        WebElement inputId = driver.findElement(By.id("id"));
        WebElement inputPw = driver.findElement(By.id("password"));
        
        inputId.sendKeys("test");
        inputPw.sendKeys("test");
        
        // �α��� ������ �����ϴ� ���
        // 1) �α��� ��ư ��Ҹ� �����ؼ� Ŭ���ϴ� ���
        // String sel = "#container > fieldset > ul > li:nth-child(3) > button";
        // WebElement loginBtn = driver.findElement(By.cssSelector(sel));
        
        // �±׸�
//        WebElement loginBtn = driver.findElement(By.tagName("button"));
//        loginBtn.click();
        
        
        // 2) �ڹٽ�ũ��Ʈ �Լ� fnLogin()�� ȣ��
        
        // ** JavaScriptExecutor 
        // JavaScriptExecutor�� selenium �ڵ带 �ۼ��� ��
        // Javascript �ڵ带 ������ �� �ְ� ���ִ� interface
        // + jQuery�� ��� ����
        
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        
        // �α��� ��ư�� �ִ� �Լ� ȣ��
        exe.executeScript("fnLogin()");
        
        // iframe���� h1�±׵��� ��� ����
        List<WebElement> h1List = driver.findElements(By.tagName("h1"));
        
        // for-each���� �̿��Ͽ� ��� console�� ���
        for(WebElement el : h1List) {
            // ���� �������� ����� ����
            System.out.print(el.getText());
        }
        
        // ������ ��Ŀ���� �ٽ� �θ�������(������)�� ��ȯ
        driver.switchTo().parentFrame();
        
        // �θ� �����ӿ� �ִ� ��� p�±� ��Ҹ� ���� ���� ���
        List<WebElement> pList = driver.findElements(By.tagName("p"));
        
        for(WebElement el : pList) {
            System.out.println(el.getText());
        }
    }

}