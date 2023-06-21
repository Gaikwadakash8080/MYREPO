package pakage_2;

import java.util.ArrayList;


import org.testng.annotations.Test;

public class Stream_Lambda {

	
	@Test
	public void m1()
	{
		ArrayList<String> names = new ArrayList<String> ();

		names.add("Aman");
		names.add("Pratik");
		names.add("Sudarshan");
		names.add("Saurabh");
		names.add("Tushar");
		names.add("Shubham");
		names.add("Santosh");
		names.add("Saurabh");
		names.add("Ganesh");
		names.add("Ganesh");
		
		System.out.println(names.toString());
		System.out.println(names.size());
		
		
		System.out.println(names.stream().count());
		
		// sort the above list and remove duplicates 
		
		names.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
	}

}
