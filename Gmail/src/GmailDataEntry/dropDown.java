package GmailDataEntry;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Chrome\\chromedriver.exe");
		WebDriver Dr = new ChromeDriver();
		Dr.get("http://smartbytes.v-logics.com/ocart/index.php?route=account/register");
		Dr.manage().window().maximize();
		// Enter Value in Test Box

		Dr.findElement(By.name("firstname")).sendKeys("Prasanna");
		Dr.findElement(By.name("lastname")).sendKeys("Deva");
		Dr.findElement(By.name("email")).sendKeys("d.prasanna@gmail.com");
		Dr.findElement(By.name("telephone")).sendKeys("7815261887");
		Dr.findElement(By.name("address_1")).sendKeys("Iswaryajayam Flats");
		Dr.findElement(By.name("city")).sendKeys("Chennai");
		Dr.findElement(By.name("password")).sendKeys("Nagercoil1");
		Dr.findElement(By.name("confirm")).sendKeys("Nagercoil1");

		// Select value from Drop Down

		WebElement CountryName = Dr.findElement(By.name("country_id"));
		Select Country = new Select(CountryName);
		Country.selectByVisibleText("India");

		Dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement StateName = Dr.findElement(By.name("zone_id"));
		Select state = new Select(StateName);
		state.selectByVisibleText("Tamil Nadu");

		// Select Radio Button

		List<WebElement> SubscribeRadio = Dr.findElements(By.name("newsletter"));
		SubscribeRadio.get(0).click();
		Dr.findElement(By.name("agree")).click();

		// Click Button

		Dr.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/input[2]")).click();

	}

}
