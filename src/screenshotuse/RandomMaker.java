package screenshotuse;

import java.util.Date;

import net.bytebuddy.utility.RandomString;

public class RandomMaker {

	public static void main(String[] args) 
	{
		RandomString rs = new RandomString();
		//rs.make(3);
		System.out.println(rs.make(3));
		
		Date d = new Date();
		System.out.println(d);
		
		

	}

}
