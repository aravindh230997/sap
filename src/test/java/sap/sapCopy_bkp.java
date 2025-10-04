package sap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class sapCopy_bkp {

	public static void main(String[] args) throws InterruptedException {

		String un = "subasree.84@wipro.com";
		String pw = "Krishna@22";
		String mail = "Mail id here";

		WebDriver driver = new ChromeDriver();
		// driver.get("https://me.sap.com/");
		driver.get("https://me.sap.com/userscontacts/usermanagement");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		Thread.sleep(1500);

		// un
		driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys(un);
		Thread.sleep(1500);
		driver.findElement(By.className("fn-button__text")).click();
		Thread.sleep(1500);

		// pw
		driver.findElement(By.id("j_password")).sendKeys(pw);
		Thread.sleep(1500);

		// sign in
		driver.findElement(By.xpath("//*[@id='logOnFormSubmit']")).click();
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", signIn);
//		signIn.click();

		Thread.sleep(15000);

//		Thread.sleep(1500);

	//	Thread.sleep(20000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("sapUiLocalBusyIndicator")));
		Thread.sleep(10000);
		driver.switchTo().frame(0);

		String[] mailId = mail.split(",");
		int j = 0;
		for (String name : mailId) {
			driver.findElement(By.xpath("//*[contains(text(), 'Request User')]")).click();

			if (j > 0) {
				Thread.sleep(3500);
				driver.findElement(By.id("__input0-inner")).click();
				Thread.sleep(1500);
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//div[contains(@class,'sapMSLITitle') and text()='Wipro Limited']")));
				driver.findElement(By.xpath("//div[contains(@class,'sapMSLITitle') and text()='Wipro Limited']"))
						.click();

			}
			String[] names = name.split("\\."); // split by dot
			String firstName = names[0];
			String secondName = names[1].split("@")[0]; // remove @domain part
			String emailArray = name.split("@")[0];
			String dropDown = "wipro.com";

			System.out.println("First Name: " + firstName);
			System.out.println("Second Name: " + secondName);
			System.out.println("Mail ID: " + emailArray);
			System.out.println("Mail ID: " + dropDown);
			System.out.println("------------");
			Thread.sleep(3000);

			WebElement inputField = null;
			for (int i = 0; i < 60; i++) {
				try {
					inputField = driver.findElement(By.id("__input1-inner")); // or XPath
					if (inputField.isEnabled()) {
						System.out.println("wait over");
						break; // field is ready

					}
					Thread.sleep(500); // wait before trying again
				} catch (Exception e) {
					Thread.sleep(500); // if element not found yet
				}
			}
			Thread.sleep(3000);
			// enter first Name

			driver.findElement(By.id("__input1-inner")).sendKeys(firstName.trim());

			// enter last Name
			driver.findElement(By.id("__input2-inner")).sendKeys(secondName.trim());

			// enter mail first ans second name
			driver.findElement(By.id("__xmlview2--namePartOfEmail-inner")).sendKeys(emailArray.trim());
			WebElement emailField = driver.findElement(By.id("__xmlview2--namePartOfEmail-inner"));

			for (int i = 0; i < 10; i++) {
				String value = emailField.getAttribute("value").trim();
				if (!value.isEmpty()) {
					break;
				}
				try {
					Thread.sleep(500); // 0.5 sec pause before retry
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Thread.sleep(3000);
			// enter mail
			driver.findElement(By.id("__xmlview2--domainSelectorUserAdmin-arrow")).click();

			Thread.sleep(2000);

			// To get dropdown values
			driver.findElement(By.xpath("//*[contains(text(), 'wipro.com')]")).click();
			Thread.sleep(2000);

			try {

				// submit button
				driver.findElement(By.xpath("//*[contains(text(), 'Submit')]")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("//*[contains(text(), 'OK')]")).click();

			} catch (Exception e) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(), 'Cancel')]")).click();
				
			}
			Thread.sleep(5000);
			j++;
			System.out.println(j);
		}
	}

}
//  