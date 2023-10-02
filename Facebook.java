import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	ChromeDriver driver =new ChromeDriver();
	public void loadUrl() {
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void credentials() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("pavithra");
		driver.findElement(By.name("lastname")).sendKeys("Venkat");
		driver.findElement(By.name("reg_email__")).sendKeys("pavithraengg.28@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pavithraengg.28@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("142204");
	}
	public void dob() {
		//day
				WebElement day = driver.findElement(By.id("day"));
				Select dd_day = new Select(day);
				dd_day.selectByIndex(21);
				
				//month
				WebElement month = driver.findElement(By.id("month"));
				Select dd_month = new Select(month);
				dd_month.selectByVisibleText("Jun");
				//year
				WebElement year = driver.findElement(By.id("year"));
				Select dd_year = new Select(year);
				dd_year.selectByValue("2000");
	}
	public void gender() {
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
	}
	public void submit() {
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.partialLinkText("No, Create New Account")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facebook fb = new Facebook();
		fb.loadUrl();
		fb.credentials();
		fb.dob();
		fb.gender();
		fb.submit();

}}
