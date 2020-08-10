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
        
        // iframe 내부에 있는 요소는 검색이 불가능함
        //  -> iframe은 별도의 페이지를 한 화면의 보여주는 것이기 때문에
        //     결과적으로는 다른 페이지
        
        // iframe 내부에 있는 요소를 찾는 방법
        // WebDriver.switchTo().frame("프레임명")
        //  -> 지정한 프레임으로 제어 포커스를 옮겨라
        driver.switchTo().frame("subIframe");
        
        WebElement inputId = driver.findElement(By.id("id"));
        WebElement inputPw = driver.findElement(By.id("password"));
        
        inputId.sendKeys("test");
        inputPw.sendKeys("test");
        
        // 로그인 동작을 진행하는 방법
        // 1) 로그인 버튼 요소를 선택해서 클릭하는 방법
        // String sel = "#container > fieldset > ul > li:nth-child(3) > button";
        // WebElement loginBtn = driver.findElement(By.cssSelector(sel));
        
        // 태그명
//        WebElement loginBtn = driver.findElement(By.tagName("button"));
//        loginBtn.click();
        
        
        // 2) 자바스크립트 함수 fnLogin()을 호출
        
        // ** JavaScriptExecutor 
        // JavaScriptExecutor는 selenium 코드를 작성할 때
        // Javascript 코드를 실행할 수 있게 해주는 interface
        // + jQuery도 사용 가능
        
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        
        // 로그인 버튼에 있는 함수 호출
        exe.executeScript("fnLogin()");
        
        // iframe내의 h1태그들을 모두 얻어옴
        List<WebElement> h1List = driver.findElements(By.tagName("h1"));
        
        // for-each문을 이용하여 모두 console에 출력
        for(WebElement el : h1List) {
            // 현재 접근중인 요소의 내용
            System.out.print(el.getText());
        }
        
        // 프레임 포커스를 다시 부모프레임(브라우저)로 전환
        driver.switchTo().parentFrame();
        
        // 부모 프레임에 있는 모든 p태그 요소를 얻어와 내용 출력
        List<WebElement> pList = driver.findElements(By.tagName("p"));
        
        for(WebElement el : pList) {
            System.out.println(el.getText());
        }
    }

}