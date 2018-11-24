package GmailDataEntry;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testBoxValidation {

	public static void main(String[] args) {
		String URL = "https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust";
		// Registering the Driver

		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(URL);

		// Entering Name

		driver.findElement(By.name("customerName")).sendKeys("d.prasanna");
		driver.findElement(By.name("email")).sendKeys("7815261884");
		driver.findElement(By.name("password")).sendKeys("Nagercoil1");
		
	}

}
