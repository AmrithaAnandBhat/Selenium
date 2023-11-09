package edureka;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();//launches Chrome browser
		//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);		
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://amazon.com");
		driver.navigate().to("https://amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		//driver.manage().window().minimize();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Amazon.in"))
		{
			System.out.println("Title Matches");
		}
		else 
			System.out.println("Title not matches");
		
		//Locate a web element by clicking
		String tagname=" ";
		tagname = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).getText();
       System.out.println(tagname);       
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
        driver.findElement(By.linkText("Clothing, Shoes, Jewelry & Watches")).click();
       
  
		 //Hover through the drop down and locate and click an element
		 WebElement Women = driver.findElement(By.linkText("Women"));
		 Actions action1 = new Actions(driver);
		 action1.moveToElement(Women);
		 action1.click();
		 action1.perform();
		 Thread.sleep(1000);
		 
		 
		driver.findElement(By.xpath("//*[@id=\"sobe_d_b_4_3\"]/a")).click();
		//driver.findElement(By.linkText("Dresses")).click();
		 WebElement Dresses = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/ul/li[2]/span/span/div/a/div[1]/div"));
		 Actions action3 = new Actions(driver);
		 action3.moveToElement(Dresses);
		 action3.perform();
		 driver.findElement(By.linkText("Casual")).click();
		 
		 //Type in search button and click search
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Amazon Essentials");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Thread.sleep(3000);
		 
		 
		 //Scroll  down until item is visible, move to and then click on the web element
		 WebElement Element  = driver.findElement(By.linkText("Women's Sleeveless Woven Shift Dress"));
		 Actions action4 = new Actions(driver);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", Element);
		  action4.moveToElement(Element);
		  action4.click(Element);
			 action4.perform();
			 Thread.sleep(3000);

		 
			 
			 driver.findElement(By.xpath("//*[@id=\"dropdown_selected_size_name\"]/span/span/span")).click();
			 driver.findElement(By.linkText("X-Small")).click();
			 driver.findElement(By.xpath("//*[@id=\"a-autoid-10-announce\"]/div/div[1]/img")).click();
			 Thread.sleep(3000);
			 //add to cart
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click(); 
			 
			 
			 
			 
			 
			 
			 driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
			 driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("512-221-6391");
		     driver.findElement(By.id("continue")).click();
	
      
   /*    //Shift the tab control
		     java.util.Set<String> handles = driver.getWindowHandles();//stores all the currently open tabs in a collection set	
		     String winHandle1 = driver.getWindowHandle();//gets current window-current open tab
		     handles.remove (winHandle1);//removed  current window from the collection set containing all the open tabs.
		     String  winHandle2 = " ";
		     String  winHandle=handles.iterator().next();//parse the current open tabs/ windows one by one iteratively
		     if (winHandle != winHandle1)//if currently open tab  is not same as the next tab from collection set then
		     {
		    	 winHandle2=winHandle;//assign the next tab  in collection set(to which control is to be moved) to new variable 
		    	 driver.switchTo().window(winHandle2);
		    	 System.out.println(winHandle2);
		     }
		     
		     Thread.sleep(3000);*/
		     
		     
		/*     // Scroll web page till end using java script function
		     JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		         Thread.sleep(3000);*/
		         	  
		    driver.get("https://demo.automationtesting.in/Frames.html");
		    driver.manage().window().maximize();
		    WebElement frame =driver.findElement(By.id("singleframe"));
			driver.switchTo().frame(frame); 
		WebElement textBox = driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]"));
		textBox.sendKeys("Hey");
		
		driver.quit();
		driver.close();
		     
		     
		     	
	}

}
