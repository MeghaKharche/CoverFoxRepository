package setPositionAndSetDimensionUse;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		//How to Change window Position Using selenium
		
		//show which position that window is in
		//i get window position  using getSize() & store in one ref. variable the type of point
		//the return type of getPosition() is Point
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println(defaultposition); //(10,10)
	
		//i change window position so, i use point setPosition() method
		
		//1st we create point object and pass parameter i.e (x,y) window position
		
		//when we change the Position of window so, we need to create Point object and pass parameter
		//i.e (X, y) co-ordinets using setPosition() we have to set Position of window
		Point p = new Point(280, 100);
		Thread.sleep(1000);
		
		//use setPosition()
		driver.manage().window().setPosition(p);
	}

}
