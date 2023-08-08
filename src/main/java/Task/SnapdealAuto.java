package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealAuto {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.manage().window() .maximize();
        driver.get("http://www.snapdeal.com");
        

            driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")).click();
            
            driver.findElement(By.xpath("//a[normalize-space()='login']")).click();

            driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("ajaya73635@gmail.com");
            
            driver.findElement(By.xpath("//*[@id=\"checkUser\"]")).click();
            
            System.out.println("Enetr the OTP manually");
            
            Thread.sleep(30000);
            
            driver.findElement(By.xpath("//*[@id=\"loginUsingOtp\"]")).click();
            
            WebElement verificationMessage = driver.findElement(By.xpath("//div[contains(text(),'Logged in successfully')]"));
            
            if (verificationMessage.isDisplayed()) {
                System.out.println("Login Verification Successful!");
            } 
            else {
                System.out.println("Login Verification Failed!");
            }
            
    }
}