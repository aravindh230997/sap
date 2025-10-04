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

public class sapCopy {

	public static void main(String[] args) throws InterruptedException {

		String un = "subasree.84@wipro.com";
		String pw = "Krishna@22";
		String mail = "sathish.kakumudi@wipro.com,\r\n"
				+ "karthikeyan.gopinathan1@wipro.com,\r\n"
				+ "kiran.kailash@wipro.com,\r\n"
				+ "mohammed.suhail@wipro.com,\r\n"
				+ "kummari.kavitha@wipro.com,\r\n"
				+ "chintha.chandu@wipro.com,\r\n"
				+ "daniel.dossantos@wipro.com,\r\n"
				+ "rutujabandu.phepale@wipro.com,\r\n"
				+ "sunitha.n@wipro.com,\r\n"
				+ "sreedhar.neelam@wipro.com,\r\n"
				+ "nitin.paricharak@wipro.com,\r\n"
				+ "vijayalakshmi.polineni@wipro.com,\r\n"
				+ "rishwanth.s@wipro.com,\r\n"
				+ "arun.singh46@wipro.com,\r\n"
				+ "romal.kumar@wipro.com,\r\n"
				+ "jayachandra.manchinilla@wipro.com,\r\n"
				+ "vishal.adhikari@wipro.com,\r\n"
				+ "r.priya@wipro.com,\r\n"
				+ "nadim.nizami@wipro.com,\r\n"
				+ "jyothiswaroop.narsing1@wipro.com,\r\n"
				+ "ranjeet.mohite@wipro.com,\r\n"
				+ "ramakrishna.pathi@wipro.com,\r\n"
				+ "veerasatyasuryaveeravenkata.lakshmi@wipro.com,\r\n"
				+ "rubeshkumar.gajapathy@wipro.com,\r\n"
				+ "raghav.sharma7@wipro.com,\r\n"
				+ "harsh.sharma7@wipro.com,\r\n"
				+ "komal.kasabe@wipro.com,\r\n"
				+ "mohammed.shatti@wipro.com,\r\n"
				+ "sureshkumar.ch@wipro.com,\r\n"
				+ "jatin.sain@wipro.com,\r\n"
				+ "vikranth.dhubakula@wipro.com,\r\n"
				+ "uttamraj.sah@wipro.com,\r\n"
				+ "kalyanrakesh.pala@wipro.com,\r\n"
				+ "disha.jain2@wipro.com,\r\n"
				+ "prasad.deshpande@wipro.com,\r\n"
				+ "ashok.vullipayala@wipro.com,\r\n"
				+ "yaragani.supriya@wipro.com,\r\n"
				+ "olha.bermes@wipro.com,\r\n"
				+ "lalam.sushma@wipro.com,\r\n"
				+ "raja.rao@wipro.com,\r\n"
				+ "vikasprakash.jadhav@wipro.com,\r\n"
				+ "kavipriya.p14@wipro.com,\r\n"
				+ "thirumurugaraj.natarajan@wipro.com,\r\n"
				+ "shilajit.sarkar@wipro.com,\r\n"
				+ "rabnawaz.ahmad@wipro.com,\r\n"
				+ "manjunath.chikkanagi@wipro.com,\r\n"
				+ "sainitheesha.cherukuri@wipro.com,\r\n"
				+ "naina.chahare@wipro.com,\r\n"
				+ "arunkumar.sarangapani@wipro.com,\r\n"
				+ "akshay.thumbare@wipro.com,\r\n"
				+ "mohammed.sayeed2@wipro.com,\r\n"
				+ "akhil.bolisetty@wipro.com,\r\n"
				+ "supraja.kamalapuram@wipro.com,\r\n"
				+ "vaibhav.jain1@wipro.com,\r\n"
				+ "abhishek.yadav8@wipro.com,\r\n"
				+ "sahil.suman@wipro.com,\r\n"
				+ "deepthi.adapa@wipro.com,\r\n"
				+ "machavarapulakshmisaii.prasanna@wipro.com,\r\n"
				+ "shivanshu.shekhar@wipro.com,\r\n"
				+ "ragavendran.kanagaraj2@wipro.com,\r\n"
				+ "soumya.c46@wipro.com,\r\n"
				+ "shivani.kosta@wipro.com,\r\n"
				+ "santhosh.sangu@wipro.com,\r\n"
				+ "parnandivh.gurunadhasarma@wipro.com,\r\n"
				+ "saket.pandey@wipro.com,\r\n"
				+ "sharanabasavappa.patil@wipro.com,\r\n"
				+ "arturo.gonzalez2@wipro.com,\r\n"
				+ "goddu.thanuja@wipro.com,\r\n"
				+ "piyush.kumar7@wipro.com,\r\n"
				+ "venkatasairaghava.modala@wipro.com,\r\n"
				+ "architha.odnala@wipro.com,\r\n"
				+ "sarvottam.tomar1@wipro.com,\r\n"
				+ "saurav.kumar30@wipro.com,\r\n"
				+ "raquel.finol@wipro.com,\r\n"
				+ "rajasekhar.reddy2@wipro.com,\r\n"
				+ "durgesh.jha@wipro.com,\r\n"
				+ "shaik.sofiya@wipro.com,\r\n"
				+ "bollam.mohith@wipro.com,\r\n"
				+ "arun.deshmukhmath@wipro.com,\r\n"
				+ "avinashbhausaheb.jadhav@wipro.com,\r\n"
				+ "boya.saraswathi@wipro.com,\r\n"
				+ "sandhyalavenkatasai.harshini@wipro.com,\r\n"
				+ "yogeshjayram.mohan@wipro.com,\r\n"
				+ "nagaraja.geriga2@wipro.com,\r\n"
				+ "pravallika.kola@wipro.com,\r\n"
				+ "saimanikanta.01@wipro.com,\r\n"
				+ "suneel.kumar26@wipro.com,\r\n"
				+ "umesh.kumar3@wipro.com,\r\n"
				+ "purushothaman.nagarajan@wipro.com,\r\n"
				+ "syed.saifuddin@wipro.com,\r\n"
				+ "sindhura.kilaru@wipro.com,\r\n"
				+ "manish.singh14@wipro.com,\r\n"
				+ "sunitha.nimmala@wipro.com,\r\n"
				+ "naveena.m@wipro.com,\r\n"
				+ "r.schrier@wipro.com,\r\n"
				+ "parvase.mohammad@wipro.com,\r\n"
				+ "sampath.puligilla@wipro.com,\r\n"
				+ "vaishnavianant.vyawahare@wipro.com,\r\n"
				+ "jaswanth.s@wipro.com,\r\n"
				+ "katumala.harshitha@wipro.com,\r\n"
				+ "shireesha.gunja@wipro.com,\r\n"
				+ "sonalisiddharth.desai@wipro.com,\r\n"
				+ "dudekulasameer.01@wipro.com,\r\n"
				+ "sai.padigireddy@wipro.com,\r\n"
				+ "gaurang.dayal@wipro.com,\r\n"
				+ "pratiksha.jedar@wipro.com,\r\n"
				+ "mahalakshmi.s2@wipro.com,\r\n"
				+ "sudhiranjan.pani@wipro.com,\r\n"
				+ "nagavenkata.dontula@wipro.com,\r\n"
				+ "gulabnandkumar.shukla@wipro.com,\r\n"
				+ "mohit.mehrotra@wipro.com,\r\n"
				+ "ramesh.addagiri@wipro.com,\r\n"
				+ "praveen.k@wipro.com,\r\n"
				+ "swetha.rachamallu@wipro.com,\r\n"
				+ "jyoshna.krishnamsetty@wipro.com,\r\n"
				+ "mallikarjun.huchannavar@wipro.com,\r\n"
				+ "tuhin.paul@wipro.com,\r\n"
				+ "preksha.wali@wipro.com,\r\n"
				+ "gavvala.kumar1@wipro.com,\r\n"
				+ "pushpa.doddamani@wipro.com,\r\n"
				+ "ashok.vaid1@wipro.com,\r\n"
				+ "paolo.dilonardo@wipro.com,\r\n"
				+ "malik.rashid@wipro.com,\r\n"
				+ "ivo.capasso@wipro.com,\r\n"
				+ "rebecca.keaton@wipro.com,\r\n"
				+ "myana.gopikrishna@wipro.com,\r\n"
				+ "roli.srivastava2@wipro.com,\r\n"
				+ "vishwas.uniyal@wipro.com,\r\n"
				+ "aditya.daphale@wipro.com,\r\n"
				+ "charles.santos2@wipro.com,\r\n"
				+ "vimala.pitehaimuthu@wipro.com,\r\n"
				+ "james.gladwin@wipro.com,\r\n"
				+ "raveendra.nakka@wipro.com,\r\n"
				+ "ganesh.bugatha@wipro.com,\r\n"
				+ "syed.syed4@wipro.com,\r\n"
				+ "dushyant.suryavanshi@wipro.com,\r\n"
				+ "claudia.taconelli@wipro.com,\r\n"
				+ "bondada.sai@wipro.com,\r\n"
				+ "vasantha.reddy1@wipro.com,\r\n"
				+ "pranay.kaligatla@wipro.com,\r\n"
				+ "supriyo.bose1@wipro.com,\r\n"
				+ "sachith.k@wipro.com,\r\n"
				+ "sirikonda.sairam@wipro.com,\r\n"
				+ "nimisha.suresh@wipro.com,\r\n"
				+ "balasubramanian.murugesan1@wipro.com,\r\n"
				+ "ravindra.tank@wipro.com,\r\n"
				+ "divya.ramaiah@wipro.com,\r\n"
				+ "prakash.gotmare@wipro.com,\r\n"
				+ "prasanna.shivalingaiah1@wipro.com,";

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