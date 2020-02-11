package new_package;

import java.awt.Dimension;

public class New_class 
{
	public static <WebElement> void main(String[] args) 
	{
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024,768));
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//target location
		WebElement Exp_Sal=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		
		
		/*
		 * Note:--> By creation of object for TouchActions, We can
		 * 			access mouse,keyboard,touch interaction methods.
		 */
		
		/*
		 *  Single tap action analogs mouse left click option at webpage
		 *  => Enable touch actions on automation browser
		 */
		new TouchActions(driver).singleTap(Exp_Sal).perform();
		
		
	}


}
