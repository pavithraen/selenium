import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Pavithra");
		driver.findElement(By.name("description")).sendKeys("Company software");
		
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd_industry = new Select(industry);
		dd_industry.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd_ownership = new Select(ownership);
		dd_ownership.selectByVisibleText("S-Corporation");
		
		WebElement sourceId = driver.findElement(By.id("dataSourceId"));
		Select dd_sourceId  = new Select(sourceId);
		dd_sourceId.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select dd_mc = new Select(marketingCampaign);
		dd_mc.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd_state = new Select(state);
		dd_state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		


	}

}