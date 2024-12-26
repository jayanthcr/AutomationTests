package Drivers;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class test {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://blazedemo.com/");
			driver.manage().window().maximize();
			
			WebElement departure_city=driver.findElement(By.xpath("//select[@name='fromPort']"));
			Select select_departure_city=new Select(departure_city);
			select_departure_city.selectByValue("Boston");
			
			WebElement destination_city=driver.findElement(By.xpath("//select[@name='toPort']"));
			Select select_destination_city=new Select(destination_city);
			select_destination_city.selectByValue("Dublin");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(5000);
			
			int rows=driver.findElements(By.xpath("//table//tbody//tr")).size();
			System.out.println("number of rows is :"+rows );
			
			int cols=driver.findElements(By.xpath("//table//tr")).size();
			System.out.println("number of cols is :"+cols );
			
			
			ArrayList ls=new ArrayList();
			List<WebElement> Pricelist=driver.findElements(By.xpath("//table//tbody//td[6]"));
			for(WebElement priz:Pricelist) 
			{
				System.out.println(priz.getText());
				ls.add(priz.getText());
			}
			Collections.sort(ls);
			System.out.println(ls);
			for(int i=0;i<ls.size();i++)
			{
				if(ls.get(0).equals(Pricelist.get(i).getText()))
				{
					i++;
					driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]/input[1]")).click();
				}
			}

		}

}
