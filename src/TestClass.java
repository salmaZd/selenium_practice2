import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

public class TestClass {

	public static void main(String[] args) throws IOException {

//		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		WebDriver driver = new ChromeDriver();
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
		
//		System.setProperty("webdriver.gecko.driver", "D:\\FireFox driver\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
		
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("file:///C:/Users/Lalisa/Desktop/Practice%20fies/auto%20screeshot%20test/Qa-automation-7thmar/index.html");
		
		
		List<WebElement> stud = driver.findElements(By.tagName("option"));
		
		int totalStud = stud.size();
		System.out.println("original actual number " + totalStud);
		
		int studNum = 4; //u can choose any number
		System.out.println("The number I want to remove " + studNum);
		
		
		for(int i=0; i<studNum; i++) {
			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			
		}
		
		List <WebElement> studAfter = driver.findElements(By.tagName("option"));
		
		int actualNumber = studAfter.size();
		System.out.println("The new actual " + actualNumber);
		
		int expectedItems = stud.size()-studNum;
		System.out.println("The expected " + expectedItems);
		
		Assert.assertEquals(actualNumber, expectedItems);
		
//		Date currentDate = new Date();
//		
//		String actualDate = currentDate.toString().replace(":", "-");
//
//		
//		TakesScreenshot src = ((TakesScreenshot)driver);
//		File srcFile = src.getScreenshotAs((OutputType.FILE));
//		File Dest = new File(".\\Images/"+actualDate+".png");
//		FileUtils.copyFile(srcFile,Dest);
		
		
		
	}

}
