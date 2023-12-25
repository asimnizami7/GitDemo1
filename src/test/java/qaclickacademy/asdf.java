package qaclickacademy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class asdf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		/*WebDriverManager.chromiumdriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notificatins");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();*/
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("asimnizami7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Asimnizami@321");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		String name = driver.findElement(By.xpath("//span[contains(text(),'Syed Asim Nizami')]")).getText();
		System.out.println(name);
		//driver.close();
		
		System.out.println("i have loged in sucessfully in FB page");
		System.out.println("correct login person name is showing");
		System.out.println("Syed Asim Nizami is the name");
		System.out.println("this is ok");
		
		
		
		
		
		
		

	}

}
