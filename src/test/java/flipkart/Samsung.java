package flipkart;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Samsung {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				WebElement searchbar = driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']"));
				searchbar.sendKeys("Samsung Galaxy S10");
				searchbar.sendKeys(Keys.ENTER);
				Thread.sleep(1500);
				driver.findElement(By.cssSelector("div[title='SAMSUNG'] div[class='XqNaEv']")).click();
				Thread.sleep(1500);
				driver.findElement(By.cssSelector(".XqNaEv.eJE9fb")).click();
				Thread.sleep(1500);
				List<WebElement> Name_elements = driver.findElements(By.cssSelector(".KzDlHZ"));
				List<WebElement> Price_elements = driver.findElements(By.cssSelector(".Nx9bqj"));
				List<WebElement> Link_elements = driver.findElements(By.cssSelector(".CGtC98"));
				List<String> Product_Name = new ArrayList<>();
				for (WebElement element : Name_elements)
				{
					Product_Name.add(element.getText());
				}
				//System.out.println(Product_Name);
				List<String> Price = new ArrayList<>();
				for (WebElement element : Price_elements)
				{
					Price.add(element.getText());
				}
//				System.out.println(Price);
				List<String> Links = new ArrayList<>();
				for(WebElement element : Link_elements)
				{
					Links.add(element.getAttribute("href"));
				}
			//	System.out.println(Links);
				int length = Product_Name.size();
				for (int i=0;i<length;i++)
				{
					System.out.println("Product : "+Product_Name.get(i));
					System.out.println("Price   : "+Price.get(i));
					System.out.println("Link    : "+Links.get(i));
					System.out.println();
				}

	}

}
